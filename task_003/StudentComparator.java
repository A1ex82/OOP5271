package task_003;

import java.util.Comparator;

// Класс СтудентКомпаратор реализующий интерфейс Comparator
class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return (student1.getLastName() + student1.getFirstName())
                .compareTo(student2.getLastName() + student2.getFirstName());
    }
}
