import java.util.Scanner;

class StringUtils {

    /*
    You are working on a text processing application and need to manipulate strings using various string functions. Implement a StringUtils class with the following methods:

public static int countWords(String text): This method should count the number of words in the given text. Words are separated by spaces.
public static String reverseString(String text): This method should reverse the characters in the given string.
public static boolean isPalindrome(String text): This method should determine if the given text is a palindrome, ignoring spaces and case.
public static String capitalizeWords(String text): This method should capitalize the first letter of each word in the given text.
Create a string and demonstrate the usage of all the methods.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        //String text = "Hello world";
        System.out.println("Word count: " + countWords(text));
        System.out.println("Reversed string: " + reverseString(text));
        System.out.println("Is palindrome: " + isPalindrome(text));
        System.out.println("Capitalized words: " + capitalizeWords(text));
    }
    public static int countWords(String text) {
        return text.split(" ").length;
    }
    public static String reverseString(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();

    }
    public static boolean isPalindrome(String text) {
        String reversed = reverseString(text);
        return reversed.equalsIgnoreCase(text);
    }
    public static String capitalizeWords(String text) {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();

    }
}
