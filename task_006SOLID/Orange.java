package task_006SOLID;

// Класс апельсина
class Orange implements Fruit {
    private double weight;

    public Orange(double weight) {
        this.weight = weight;
    }

    /**
     * Returns the weight of the object.
     *
     * @return  the weight of the object
     */
    
    @Override
    public double getWeight() {
        return weight;
    }
}

