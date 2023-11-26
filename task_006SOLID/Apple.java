package task_006SOLID;

// Класс яблока
class Apple implements Fruit {
    private double weight;

    public Apple(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

