package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable {

    private List<String> tasks = new ArrayList<>();

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void run() {
        while (nextStep()) {
            nextStep();
        }
    }

    private boolean isTaskSizeNotZero() {
        return tasks.size() > 0;
    }

    private boolean nextStep() {
        while (isTaskSizeNotZero()) {
            List<String> tasksToRemove = new ArrayList<>();
            tasksToRemove.add(tasks.get(tasks.size() - 1));
            tasks.removeAll(tasksToRemove);
            return true;
        }
        return false;
    }
}
