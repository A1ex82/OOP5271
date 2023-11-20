package task_005;

// Класс апельсина
class Orange implements Fruit {
    private double weight;

    public Orange(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
