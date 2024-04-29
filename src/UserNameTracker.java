import java.util.HashSet;
import java.util.Set;

public class UserNameTracker {

    /*
    You are building a program to track unique usernames in an online forum. Implement a UsernameTracker class that uses a Set to store and manage unique usernames. Include the following methods:

public boolean addUsername(String username): This method should add a new username to the set if it's not already present.
public boolean removeUsername(String username): This method should remove the specified username from the set.
public Set<String> getUsernames(): This method should return the set of usernames.
Create an instance of the UsernameTracker class, add usernames, remove usernames, and retrieve the set of usernames.
     */

    public static void main(String[] args) {
        UsernameTracker usernameTracker = new UsernameTracker();
        usernameTracker.addUsername("john");
        usernameTracker.addUsername("jane");
        usernameTracker.addUsername("john");
        usernameTracker.removeUsername("jane");
        Set<String> usernames = usernameTracker.getUsernames();
        System.out.println("Usernames: " + usernames);
    }

    public static class UsernameTracker {
        private Set<String> usernames;

        public UsernameTracker() {
            this.usernames = new HashSet<>();
        }

        public boolean addUsername(String username) {
            if (usernames.contains(username)) {
                return false;
            } else {
                usernames.add(username);
                return true;
            }
        }

        public boolean removeUsername(String username) {
            return usernames.remove(username);
        }

        public Set<String> getUsernames() {
            return usernames;
        }

    }
}
