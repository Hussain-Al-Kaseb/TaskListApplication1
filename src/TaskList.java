import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList<T extends Task> implements Iterable<T> {

    private List<T> tasks = new ArrayList<>();

    // Add a task to the list
    public void addTask(T task) {
        tasks.add(task);
    }

    // Filter tasks by keyword in title or description
    public List<T> filterTasksByKeyword(String keyword) {
        return tasks.stream()
                .filter(task ->
                        task.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                                task.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList()); 
    }

    // Filter tasks that are due today
    public List<T> filterTaskToday(LocalDate today) {
        return tasks.stream()
                .filter(task -> task.getDueDate().isEqual(today))
                .collect(Collectors.toList()); // Use .toList() if you're on Java 16+
    }

    // Optional: Get all tasks
    public List<T> getAllTasks() {
        return tasks;
    }

    // Implement Iterable so we can use for-each loops
    @Override
    public Iterator<T> iterator() {
        return tasks.iterator();
    }
}




