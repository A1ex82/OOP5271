package task_004;

// Обобщенный класс Box
class Box<T> {
    private T item;

    // Конструктор класса
    public Box(T item) {
        this.item = item;
    }

    // Геттер для получения объекта из коробки
    public T getItem() {
        return item;
    }

    // Сеттер для установки объекта в коробку
    public void setItem(T item) {
        this.item = item;
    }

    // Обобщенный метод для вывода содержимого коробки
    public static <U> void printBoxContents(Box<U> box) {
        System.out.println("Box contains: " + box.getItem());
    }
}