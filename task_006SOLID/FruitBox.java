package task_006SOLID;

import java.util.ArrayList;
import java.util.List;

// Обобщенный класс FruitBox
/**
 * Generic class FruitBox.
 *
 * @param <T> the type of fruit that must support weight
 */
class FruitBox<T extends Weightable> implements Weightable {
    private List<T> fruits;

    public FruitBox() {
        this.fruits = new ArrayList<>();
    }

    /**
     * Adds a fruit to the list of fruits.
     *
     * @param  fruit  the fruit to be added
     */
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    // Принцип подстановки Барбары Лисков (Liskov Substitution Principle - LSP):
    // В методе transferFruits избавимся от проверки типов, так как она может привести к нарушению LSP.
    //  Мы можем предоставить ответственность за проверку правильности операции самим объектам.
    
    /**
     * Transfers all the fruits from this fruit box to the specified destination fruit box.
     *
     * @param  destinationBox  the destination fruit box to transfer the fruits to
     * @return                 void (no return value)
     */
    public void transferFruits(FruitBox<T> destinationBox) {
        destinationBox.fruits.addAll(fruits);
        fruits.clear();
    }

    /**
     * Calculates the total weight of all the fruits.
     *
     * @return the total weight of the fruits
     */
    public double getWeight() {
        double totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }
}
