package task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy h:mm a");
    protected LocalDateTime at;

    public Event(String description, LocalDateTime at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toFileString() {
        return "E" + super.toFileString() + "|" + at.toString();
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at: " + formatter.format(at) + ")";
    }
}
