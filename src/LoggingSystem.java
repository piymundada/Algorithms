import java.util.ArrayList;
import java.util.List;

public class LoggingSystem {

    /*
    You are tasked with designing a logging system for a large e-commerce platform to track user activities and system events. Implement a LoggingSystem class that captures and logs different types of events. Include the following methods:

public void logUserActivity(String userId, String activity): This method should log user activities, associating them with the user's ID.
public void logSystemEvent(String eventDescription): This method should log system events, providing a description of the event.
public List<String> getUserActivities(String userId): This method should return a list of user activities for a given user ID.
public List<String> getSystemEvents(): This method should return a list of system events.
Create an instance of the LoggingSystem class, log user activities and system events, and retrieve the logged data for analysis.
     */

    public static void main(String[] args) {
        LoggingSystem loggingSystem = new LoggingSystem();
        loggingSystem.logUserActivity("User123", "Viewed product X");
        loggingSystem.logUserActivity("User123", "Purchased product X");
        loggingSystem.logSystemEvent("Server maintenance scheduled");
        loggingSystem.logSystemEvent("New version released");
        System.out.println("User123 Activities: " +loggingSystem.getUserActivities("User123")); // Prints ["User logged in"]
        System.out.println("System Events: " +loggingSystem.getSystemEvents()); // Prints ["System started"]
    }
    List<String> userActivities = new ArrayList<>();
    List<String> systemEvents = new ArrayList<>();
    public void logUserActivity(String userId, String activity) {
        userActivities.add(userId + ": " + activity);
    }
    public void logSystemEvent(String eventDescription) {
        systemEvents.add(eventDescription);
    }

    public List<String> getUserActivities(String userId) {
        List<String> userActivitiesForUser = new ArrayList<>();
        for (String activity : userActivities) {
            if (activity.startsWith(userId + ":")) {
                userActivitiesForUser.add(activity.substring(userId.length() + 1));
            }
        }
        return userActivitiesForUser;
    }

    public List<String> getSystemEvents() {
        return systemEvents;
    }
}
