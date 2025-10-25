import java.time.LocalDate;

public class HighPriorityTask extends Task {

    public HighPriorityTask(String title, String description, LocalDate dueDate) {
      // takes task and adds todo and critical
        super(title, description, dueDate,
              TaskStatus.TODO,
              TaskPriority.CRITICAL);
    }
}
