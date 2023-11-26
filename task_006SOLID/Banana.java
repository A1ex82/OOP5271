package task_006SOLID;

// Класс банана
class Banana implements Fruit {
    private double weight;

    public Banana(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

