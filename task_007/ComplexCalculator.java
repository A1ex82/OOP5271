package task_006;

import java.util.logging.Level;
import java.util.logging.Logger;

// Класс калькулятора комплексных чисел
class ComplexCalculator {
    private ComplexOperationStrategy operationStrategy; // Стратегия операции
    private Logger logger; // Логгер для записи событий

    public ComplexCalculator(ComplexOperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
        this.logger = Logger.getLogger(ComplexCalculator.class.getName());
    }

    // Метод для выполнения операции с комплексными числами
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        // Вызов стратегии для выполнения операции
        ComplexNumber result = operationStrategy.execute(num1, num2);

        // Запись события в лог
        logger.log(Level.INFO, "Calculation result: {0} op {1} = {2}", new Object[]{num1, num2, result});

        // Вывод результата в консоль
        System.out.println("Calculation result: " + num1 + " op " + num2 + " = " + result);

        // Возвращаем результат
        return result;
    }
}

