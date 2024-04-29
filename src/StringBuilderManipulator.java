import com.sun.deploy.util.StringUtils;
import com.sun.javafx.tk.ScreenConfigurationAccessor;

import java.util.Scanner;

public class StringBuilderManipulator {

    /*
    You are optimizing code that frequently concatenates strings. Implement a StringBuilderManipulator class that demonstrates the usage of the StringBuilder class. Include the following methods:



public static String concatenateStrings(String[] strings): This method should concatenate an array of strings using a StringBuilder and return the resulting string.
public static String insertSubstring(String original, String substring, int position): This method should insert the given substring into the original string at the specified position using a StringBuilder.
Create an array of strings and demonstrate the usage of both methods.
     */
    public String concatenateStrings(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(string);
        }
        return sb.toString();
    }
    public String insertSubstring(String original, String substring, int position) {
        StringBuilder sb = new StringBuilder(original);
        sb.insert(position, substring);
        return sb.toString();
    }



}

class Source123{
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(",");
        StringBuilderManipulator manipulator = new StringBuilderManipulator();
        System.out.println(manipulator.concatenateStrings(strings));
        System.out.println(manipulator.insertSubstring("Hello World", "Java", 6));
        scanner.close();
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
}
