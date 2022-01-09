package homework12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DaySchedule {



    public Map<Days, Schedule> daySchedule(Days day, Collection<String> activities) {
        Map<Days, Schedule> result = new HashMap<>();
        result.put(day, new Schedule(activities));

        return result;
    }
}
