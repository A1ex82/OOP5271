package task_003;

import java.util.List;

// Класс StreamService
class StreamService {
    // Метод сортировки списка потоков по количеству групп
    public void sortStreamsByGroupCount(List<StudyStream> streams) {
        streams.sort(new StreamComparator());
    }


}
