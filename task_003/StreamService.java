package task_003;

import java.util.Collections;
import java.util.List;

// Класс ПотокСервис
class StreamService {
    // Метод сортировки списка потоков по количеству групп
    public void sortStreamsByGroupCount(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}
