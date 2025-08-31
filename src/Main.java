import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Hoeing", "Hoe flowers", LocalDate.of(2025, 8, 29));
        Task task2 = new Task("Cutting grass", "Cut the entire lawn", LocalDate.of(2025, 8, 20));
        GardenTask task3 = new GardenTask("Water", "Water the plants", LocalDate.of(2025, 8, 29), "Flower beds");
        GardenTask task4 = new GardenTask("Pruning", "Prune flowers", LocalDate.of(2025, 8, 29), "Pee corner");
        Task task5 = new Task("Sow", "Sow red roses", LocalDate.of(2025, 4, 1));


        TaskList<Task> taskList = new TaskList<>();

        // Add tasks
        taskList.addTask(task1);
        taskList.addTask(task2);
        taskList.addTask(task3);
        taskList.addTask(task4);
        taskList.addTask(task5);


        LocalDate today = LocalDate.of(2025, 8, 29);


        List<Task> dueToday = taskList.filterTaskToday(today);

        //System.out.println("Tasks due today:");
        //for (Task task : dueToday) {
           // System.out.println("- " + task.getTitle() + ": " + task.getDescription());

            List<Task> matchingTask = taskList.filterTasksByKeyword("flower");
            for (Task t : matchingTask) {
                System.out.println("- " + t.getTitle() + ": " + t.getDescription());
            }
        }

    }
//}