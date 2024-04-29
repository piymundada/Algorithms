import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {

    /*
    You are building a task management application and need to manage a list of tasks. Implement a TaskManager class that uses a List to store and manage tasks. Include the following methods:

public void addTask(String task): This method should add a new task to the list.
public boolean removeTask(String task): This method should remove the specified task from the list.
public List<String> getTasks(): This method should return the list of tasks.
Create an instance of the TaskManager class, add tasks, remove tasks, and retrieve the list of tasks.
     */

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Buy groceries");
        taskManager.addTask("Go to the gym");
        List<String> tasks = taskManager.getTasks();
        System.out.println("Tasks: " +tasks);
    }
    private List<String> tasks = new ArrayList<>();
    public void addTask(String task) {
        tasks.add(task);
    }

    public boolean removeTask(String task) {
        return tasks.remove(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
