package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    List<OnlineLesson> lessons = new ArrayList<>();

    public List<OnlineLesson> getLessons() {
        return lessons;
    }

    public void addNewLesson(OnlineLesson lesson) {

        if (lessons.isEmpty()) {
            lessons.add(lesson);
        } else if (lessons.size() == 1) {
            if (lessons.get(0).getStartTime().isAfter(lesson.getStartTime())) {
                lessons.add(0, lesson);
            } else {
                lessons.add(lesson);
            }
        } else if (lessons.size() > 1) {
            for (int i = lessons.size() - 1; i >= 0; i--) {
                if (lessons.get(i).getStartTime().isBefore(lesson.getStartTime())) {
                    lessons.add(i + 1, lesson);
                    break;
                }
            }
        }
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> result = new ArrayList<>();
        Iterator<OnlineLesson> i = lessons.iterator();
        while (i.hasNext()) {
            OnlineLesson j = i.next();
            if (j.getLessonTitle().equalsIgnoreCase(title)) {
                result.add(j);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime) {
        Iterator<OnlineLesson> i = lessons.iterator();
        while (i.hasNext()) {
            if (i.next().getStartTime().isEqual(startTime)) {
                i.remove();
            }
        }
    }
}
