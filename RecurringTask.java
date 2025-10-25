import java.time.LocalDate;

public class RecurringTask extends Task {
    private int repeatIntervalDays;

    public RecurringTask(String title, String description, LocalDate dueDate,
                         TaskStatus status, TaskPriority priority,
                         int repeatIntervalDays) {
        super(title, description, dueDate, status, priority);
        this.repeatIntervalDays = repeatIntervalDays;
    }

    public int getRepeatIntervalDays() {
        return repeatIntervalDays;
    }
}

