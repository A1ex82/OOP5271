package task_005;

import java.util.ArrayList;
import java.util.List;

class FruitBox<T extends Fruit> {
    private List<T> fruits;

    public FruitBox() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void transferFruits(FruitBox<T> destinationBox) {
        // Проверяем, что типы фруктов совпадают
        if (!fruits.isEmpty() && destinationBox.fruits.isEmpty()) {
            // Пересыпаем фрукты
            destinationBox.fruits.addAll(fruits);
            fruits.clear();
        } else {
            System.out.println("Cannot transfer fruits. Types do not match or destination box is not empty.");
        }
        
    }
}
    
    