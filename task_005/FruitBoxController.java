package task_005;

public class FruitBoxController {
    public static void main(String[] args) {
        // Создание коробок с фруктами
        // FruitBox<Apple> appleBox = new FruitBox<>();
        // appleBox.addFruit(new Apple(0.2));
        // appleBox.addFruit(new Apple(0.3));

        FruitBox<Orange> orangeBox = new FruitBox<>();
        orangeBox.addFruit(new Orange(0.5));
        orangeBox.addFruit(new Orange(0.6));

        FruitBox<Orange> orangeBox2 = new FruitBox<>();
        orangeBox2.addFruit(new Orange(0.5));
        orangeBox2.addFruit(new Orange(0.6));

        // Вывод веса каждой коробки
        // System.out.println("Weight of Apple Box: " + appleBox.getWeight());
        System.out.println("Weight of Orange Box: " + orangeBox.getWeight());
        System.out.println("Weight of Orange Box 2: " + orangeBox2.getWeight());

        // Сравнение веса коробок
        if (orangeBox.getWeight() == orangeBox2.getWeight()) {
            System.out.println("The boxes are equal in weight.");
        } else {
            System.out.println("The boxes are not equal in weight.");
        }

        // Пересыпание фруктов
        FruitBox<Orange> anotherOrangeBox = new FruitBox<>();
        orangeBox.transferFruits(anotherOrangeBox);

        // // Вывод веса каждой коробки после пересыпания
        System.out.println("Weight of Orange Box: " + orangeBox.getWeight());
        System.out.println("Weight of Another Orange Box: " + anotherOrangeBox.getWeight());
    }
}
