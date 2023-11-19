package task_004;

// Обобщенный класс Pair
class Pair<X, Y> {
    private X first;
    private Y second;

    // Конструктор класса
    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }

    // Геттер для первого элемента пары
    public X getFirst() {
        return first;
    }

    // Сеттер для первого элемента пары
    public void setFirst(X first) {
        this.first = first;
    }

    // Геттер для второго элемента пары
    public Y getSecond() {
        return second;
    }

    // Сеттер для второго элемента пары
    public void setSecond(Y second) {
        this.second = second;
    }

    // Обобщенный метод для обмена местами элементов в паре
    public static <A, B> void swapPairs(Pair<A, B>[] pairs) {
        for (Pair<A, B> pair : pairs) {
            A temp = pair.getFirst();
            pair.setFirst((A) pair.getSecond());
            pair.setSecond((B) temp);
        }
    }
}

