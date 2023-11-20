package task_002;

import java.util.LinkedList;
import java.util.Queue;

// Интерфейс для работы с очередью
interface QueueBehaviour<T> {
    void enqueue(T item);
    T dequeue();
    boolean isEmpty();
}

// Интерфейс для работы с магазином
interface MarketBehaviour<T> {
    void acceptOrder(Order<T> order);
    Order<T> fulfillOrder();
}

// Класс представляющий заказ
class Order<T> {
    private Queue<T> products;

    public Order() {
        this.products = new LinkedList<>();
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public Queue<T> getProducts() {
        return products;
    }

    public double getTotalCost() {
        // Здесь нужно реализовать логику подсчета суммы заказа
        // В предположении, что T имеет метод getCost()
        double totalCost = 0.0;
        for (T product : products) {
            // Предполагается, что у продукта есть метод getCost()
            totalCost += product.getCost();
        }
        return totalCost;
    }
}

// Пример продукта с методом getCost()
class Product {
    private double cost;

    public Product(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

// Класс Market, реализующий интерфейсы QueueBehaviour и MarketBehaviour
public class Market<T> implements QueueBehaviour<T>, MarketBehaviour<T> {
    private Queue<Order<T>> orders;

    public Market() {
        this.orders = new LinkedList<>();
    }

    @Override
    public void enqueue(T item) {
        // Реализация добавления элемента в очередь
    }

    @Override
    public T dequeue() {
        // Реализация извлечения элемента из очереди
        return null;
    }

    @Override
    public boolean isEmpty() {
        // Реализация проверки, пуста ли очередь
        return orders.isEmpty();
    }

    @Override
    public void acceptOrder(Order<T> order) {
        // Реализация принятия заказа
        orders.add(order);
    }

    @Override
    public Order<T> fulfillOrder() {
        // Реализация обработки заказа
        return orders.poll();
    }

    // Метод для обновления состояния магазина
    public void update() {
        // Реализация обновления состояния магазина
    }

    public static void main(String[] args) {
        // Пример использования
        Market<Product> market = new Market<>();
        Order<Product> order = new Order<>();
        order.addProduct(new Product(10.0));
        order.addProduct(new Product(5.0));

        market.acceptOrder(order);

        // Обновление состояния магазина
        market.update();

        // Обработка заказа
        Order<Product> fulfilledOrder = market.fulfillOrder();
        if (fulfilledOrder != null) {
            System.out.println("Total cost of fulfilled order: " + fulfilledOrder.getTotalCost());
        }
    }
}

