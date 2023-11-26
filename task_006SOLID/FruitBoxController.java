package task_006SOLID;
// Принцип инверсии зависимостей (Dependency Inversion Principle - DIP):
// Заменим конкретные типы в методе main на их абстракции, чтобы код зависел от абстракций,
//  а не от конкретных реализаций.

// Класс для запуска программы
public class FruitBoxController {
    public static void main(String[] args) {
        // Создание коробок с фруктами
        FruitBox<Orange> orangeBox = new FruitBox<>();
        orangeBox.addFruit(new Orange(0.5));
        orangeBox.addFruit(new Orange(0.6));

        FruitBox<Orange> orangeBox2 = new FruitBox<>();
        orangeBox2.addFruit(new Orange(0.1));
        orangeBox2.addFruit(new Orange(0));

        // Вывод веса каждой коробки
        BoxPrinter.printWeight(orangeBox, "Orange Box");
        BoxPrinter.printWeight(orangeBox2, "Orange Box 2");

        // Сравнение веса коробок
        BoxPrinter.compareBoxes(orangeBox, orangeBox2);

        // Пересыпание фруктов
        FruitBox<Orange> anotherOrangeBox = new FruitBox<>();
        orangeBox.transferFruits(anotherOrangeBox);

        // Вывод веса каждой коробки после пересыпания
        BoxPrinter.printWeight(orangeBox, "Orange Box");
        BoxPrinter.printWeight(anotherOrangeBox, "Another Orange Box");
    }
}
