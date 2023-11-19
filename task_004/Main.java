package task_004;

public class Main {
    public static void main(String[] args) {
        // Пример использования обобщенного класса Box с разными типами данных
        Box<Integer> intBox = new Box<>(42);
        Box<String> stringBox = new Box<>("Hello, Generics!");
        Box<Double> doubleBox = new Box<>(3.14);

        // Вывод содержимого коробок
        Box.printBoxContents(intBox);
        Box.printBoxContents(stringBox);
        Box.printBoxContents(doubleBox);

        // Пример использования обобщенного класса Pair с разными типами данных
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<String, Double> pair2 = new Pair<>("Two", 2.0);

        // Вывод исходных значений пар
        System.out.println("Before swap:");
        System.out.println("Pair 1: " + pair1.getFirst() + ", " + pair1.getSecond());
        System.out.println("Pair 2: " + pair2.getFirst() + ", " + pair2.getSecond());

        // Обмен местами элементов в парах
        Pair.swapPairs(new Pair[]{pair1, pair2});

        // Вывод результатов обмена
        System.out.println("\nAfter swap:");
        System.out.println("Pair 1: " + pair1.getFirst() + ", " + pair1.getSecond());
        System.out.println("Pair 2: " + pair2.getFirst() + ", " + pair2.getSecond());
    }
}