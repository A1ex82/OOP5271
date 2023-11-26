package task_006SOLID;

// Принцип открытости/закрытости (Open/Closed Principle - OCP):
// Добавим возможность добавлять новые виды фруктов, не изменяя существующий код.
//  Для этого создадим интерфейс Fruit и наследуем все фрукты от этого интерфейса.

/**
 * Interface for fruits.
 *
 * @see Weightable
 */
interface Fruit extends Weightable {
}
