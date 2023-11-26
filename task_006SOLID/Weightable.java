package task_006SOLID;

// Принцип единственной ответственности (Single Responsibility Principle - SRP):
// Создадим интерфейс Weightable, который будут реализовывать все классы фруктов,
//  чтобы можно было получать вес любого фрукта.

// Интерфейс для объектов, у которых есть вес


/**
 * This interface represents an object that has a weight.
 */
public interface Weightable {
    /**
     * Returns the weight of the object.
     *
     * @return The weight of the object.
     */
    double getWeight();
}