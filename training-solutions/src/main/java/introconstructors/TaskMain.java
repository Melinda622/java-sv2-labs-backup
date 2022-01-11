package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("accounting", "preparing VAT declaration");

        task.start();
        task.setDuration(50);
        System.out.println(task.getDuration());

        System.out.println("Task: " + task.getTitle() + " " + "started at: " + task.getStartDateTime() + " " + "and lasted: " + task.getDuration() + " " + "minutes");
    }
}
