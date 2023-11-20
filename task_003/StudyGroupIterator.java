package task_003;

import java.util.Iterator;
import java.util.List;

// Класс УчебнаяГруппаИтератор, реализующий интерфейс Iterator
class StudyGroupIterator implements Iterator<Student> {
    private List<Student> students;
    private int index;

    public StudyGroupIterator(List<Student> students) {
        this.students = students;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Student next() {
        if (hasNext()) {
            Student student = students.get(index);
            index++;
            return student;
        } else {
            throw new IndexOutOfBoundsException("No more students in the group.");
        }
    }

    @Override
    public void remove() {
        if (index > 0) {
            students.remove(index - 1);
            index--;
        } else {
            throw new IllegalStateException("remove() can only be called after next() has been called");
        }
    }
}
