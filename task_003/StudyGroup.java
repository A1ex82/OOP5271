package task_003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Класс УчебнаяГруппа
class StudyGroup implements Iterable<Student> {
    private List<Student> students;

    public StudyGroup() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }

    @Override
    public String toString() {
        return "StudyGroup";
    }
}
