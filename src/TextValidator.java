import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TextValidator {

    /*
    You are developing a utility class to process user input. Implement a TextValidator class with the following methods:

public static boolean isValidEmail(String email): This method should validate if the given string is a valid email address format. Assume a valid email address has a username, followed by the "@" symbol, then a domain name, and ends with a valid top-level domain (TLD).
public static String removeDuplicateCharacters(String text): This method should remove any duplicate characters from the given string and return the modified string.
public static String replaceWords(String text, Map<String, String> wordMap): This method should replace words in the given text according to the provided word map. For example, if the word map contains "Java" → "Python", the method should replace all occurrences of "Java" with "Python" in the text.
Create an email address, a string with duplicate characters, and a text with a word map to demonstrate the usage of the methods.
     */



    public static boolean isValidEmail(String email){
        return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
    public static String removeDuplicateCharacters(String text) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();

    }
    public static String replaceWords(String text, Map<String, String> wordMap) {
        for (Map.Entry<String, String> entry : wordMap.entrySet()) {
            text = text.replaceAll(entry.getKey(), entry.getValue());
        }
        return text;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email: ");
        String input = scanner.nextLine();
        String email = input.split("email = ")[1].replaceAll("\"", "").toString();

        //String email = "john@example.com";
        String textWithDuplicates = "programming";
        String textWithWords = "I love Java";
        Map<String, String> wordMap = new HashMap<>();
        wordMap.put("Java", "Python");

        System.out.println("Is email valid: " + isValidEmail(email));
        System.out.println("Text with duplicates: " + removeDuplicateCharacters(textWithDuplicates));
        System.out.println("Text with words replaced: " + replaceWords(textWithWords, wordMap));
    }

}
