package task_003;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Класс УчебнаяГруппаСервис
class StudyGroupService {
    public void removeStudentByName(StudyGroup group, String studentName) {
        Iterator<Student> iterator = group.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if ((student.getFirstName() + student.getLastName()).equals(studentName)) {
                iterator.remove();
            }
        }
    }

    // Метод сортировки списка студентов по ФИО
    public void sortStudentsByFullName(List<Student> students) {
        Collections.sort(students, new StudentComparator());
    }
}