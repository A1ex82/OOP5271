package task_003;

import java.util.ArrayList;
import java.util.List;

// Класс Контроллер
class Controller {
    public static void main(String[] args) {
        // Создаем несколько учебных групп
        StudyGroup group1 = new StudyGroup();
        StudyGroup group2 = new StudyGroup();
        StudyGroup group3 = new StudyGroup();

        // Создаем потоки и добавляем группы
        List<StudyGroup> groups1 = List.of(group1, group2);
        List<StudyGroup> groups2 = List.of(group3);

        StudyStream stream1 = new StudyStream(new ArrayList<>(groups1));
        StudyStream stream2 = new StudyStream(new ArrayList<>(groups2));

        // Создаем объект StreamService
        StreamService streamService = new StreamService();

        // Выводим состав потоков перед сортировкой
        System.out.println("Before sorting:");
        printStreamContents(stream1);
        printStreamContents(stream2);

        // Сортируем потоки по количеству групп с использованием StreamService
        List<StudyStream> streamsList = new ArrayList<>(List.of(stream1, stream2));
        streamService.sortStreamsByGroupCount(streamsList);

        // Выводим состав потоков после сортировки
        System.out.println("\nAfter sorting:");
        printStreamContents(streamsList.get(0));
        printStreamContents(streamsList.get(1));
    }

    // Вспомогательный метод для вывода содержимого потока
    private static void printStreamContents(StudyStream stream) {
        System.out.print("Stream: ");
        while (stream.hasNext()) {
            System.out.print(stream.next() + " ");
        }
        System.out.println();
    }
}
