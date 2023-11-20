package task_003;

import java.util.Comparator;

// import java.util.Collections;
// import java.util.Comparator;

// Класс Поток с реализацией интерфейса Iterator

import java.util.Iterator;
import java.util.List;

// Класс StudyStream с реализацией интерфейса Iterator
class StudyStream implements Iterator<StudyGroup> {
    List<StudyGroup> groups;
    private int index;

    public StudyStream(List<StudyGroup> groups) {
        this.groups = groups;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < groups.size();
    }

    @Override
    public StudyGroup next() {
        if (hasNext()) {
            StudyGroup group = groups.get(index);
            index++;
            return group;
        } else {
            throw new IndexOutOfBoundsException("No more study groups in the stream.");
        }
    }

    // Класс StreamComparator для сравнения по количеству групп в потоке
    class StreamComparator implements Comparator<StudyStream> {
        @Override
        public int compare(StudyStream stream1, StudyStream stream2) {
            return Integer.compare(stream1.groups.size(), stream2.groups.size());
        }
    }
}