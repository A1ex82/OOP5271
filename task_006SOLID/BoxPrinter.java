package task_006SOLID;

// Принцип единственной ответственности (Single Responsibility Principle - SRP):
// Разделим функционал вывода веса коробок и сравнения в отдельный класс BoxPrinter.
//  Это позволит каждому классу иметь только одну причину для изменения.

// Класс для вывода информации о коробке
class BoxPrinter {
    /**
     * Prints the weight of a fruit box.
     *
     * @param  box       the fruit box to get the weight from
     * @param  boxName   the name of the fruit box
     */
    public static void printWeight(FruitBox<? extends Weightable> box, String boxName) {
        System.out.println("Weight of " + boxName + ": " + ((Weightable) box).getWeight());
    }

    /**
     * Compares two fruit boxes based on their weight.
     *
     * @param  box1  the first fruit box to compare
     * @param  box2  the second fruit box to compare
     */
    public static void compareBoxes(FruitBox<? extends Weightable> box1, FruitBox<? extends Weightable> box2) {
        if (((Weightable) box1).getWeight() == ((Weightable) box2).getWeight()) {
            System.out.println("The boxes are equal in weight.");
        } else {
            System.out.println("The boxes are not equal in weight.");
        }
    }
}