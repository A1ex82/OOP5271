package task_003;

import java.util.Iterator;
import java.util.List;

// Класс Поток с реализацией интерфейса Iterator
class Stream implements Iterator<StudyGroup> {
    private List<StudyGroup> groups;
    private int index;

    public Stream(List<StudyGroup> groups) {
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
}