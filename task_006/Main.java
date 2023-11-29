package task_006;

// Пример использования
public class Main {
    public static void main(String[] args) {
        // Создание комплексных чисел
        ComplexNumber complexNum1 = new ComplexNumber(2, 3);
        ComplexNumber complexNum2 = new ComplexNumber(1, 2);

        // Выполнение операций с комплексными числами
        ComplexOperationStrategy addStrategy = new AddStrategy();
        ComplexOperationStrategy multiplyStrategy = new MultiplyStrategy();
        ComplexOperationStrategy divideStrategy = new DivideStrategy();

        // Инициализация калькулятора с конкретной стратегией
        ComplexCalculator calculator = new ComplexCalculator(addStrategy);

        // Выполнение операции сложения
        ComplexNumber resultAdd = calculator.calculate(complexNum1, complexNum2);

        // Изменение стратегии на умножение
        calculator = new ComplexCalculator(multiplyStrategy);

        // Выполнение операции умножения
        ComplexNumber resultMultiply = calculator.calculate(complexNum1, complexNum2);

        // Изменение стратегии на деление
        calculator = new ComplexCalculator(divideStrategy);

        // Выполнение операции деления
        ComplexNumber resultDivide = calculator.calculate(complexNum1, complexNum2);
    }
}
