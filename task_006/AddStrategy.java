package task_006;

// Конкретные стратегии для сложения, умножения и деления комплексных чисел
class AddStrategy implements ComplexOperationStrategy {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() + num2.getReal() - num1.getImaginary();
        double imaginary = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }
}
