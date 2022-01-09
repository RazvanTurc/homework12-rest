package homework12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Schedule {
    private final List<String> list;

    Schedule(Collection<String> list) {
        this.list = list == null ?
                new ArrayList<>() :
                new ArrayList<>(list);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(list, schedule.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
