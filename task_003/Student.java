package task_003;

// Класс Студент с реализацией интерфейса Comparable
class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Реализация метода compareTo для сравнения по ФИО
    @Override
    public int compareTo(Student other) {
        return (this.lastName + this.firstName).compareTo(other.lastName + other.firstName);
    }
}
