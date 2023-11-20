package task_003;

import java.util.Comparator;

// Класс StreamComparator для сравнения по количеству групп в потоке
class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(stream1.groups.size(), stream2.groups.size());
    }
}
