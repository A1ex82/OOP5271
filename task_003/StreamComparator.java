package task_003;

import java.util.Comparator;

// Класс StreamComparator для сравнения по количеству групп в потоке
class StreamComparator implements Comparator<StudyStream> {
    @Override
    public int compare(StudyStream stream1, StudyStream stream2) {
        return Integer.compare(stream1.groups.size(), stream2.groups.size());
    }
}
