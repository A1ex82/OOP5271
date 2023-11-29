package task_006;

// Интерфейс стратегии для операций с комплексными числами
interface ComplexOperationStrategy {
    ComplexNumber execute(ComplexNumber num1, ComplexNumber num2);
}
