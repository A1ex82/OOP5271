package task_006;

// Класс комплексных чисел
class ComplexNumber {
    private double real; // Действительная часть
    private double imaginary; // Мнимая часть

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
    

