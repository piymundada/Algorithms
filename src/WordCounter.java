import java.util.Scanner;

class WordCounter {
    /*
    You are building a text analysis tool and need to implement a WordCounter class to count occurrences of specific words in a text. Implement the following methods:

public static int countWordOccurrences(String text, String word): This method should count the number of times the given word appears in the text.
public static String findLongestWord(String text): This method should find and return the longest word in the text.
public static String removeVowels(String text): This method should remove all vowels from the text and return the modified text.
Demonstrate the usage of the WordCounter class by counting word occurrences, finding the longest word, and removing vowels from a given text.

     Take  the following example as input from system input:
     text and word is comma separated in one line

     text = "Java programming is fun and challenging.", word = "Java"
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split(",");
        String text = parts[0].replaceAll("\"", "").split("text =")[1].trim();
        String word = parts[1].replaceAll("\"", "").split(" word =")[1].trim();

        System.out.println("Occurrences of "+  "\"" + "Java" + "\"" + ": " + countWordOccurrences(text, word));
        System.out.println("Longest word: " + findLongestWord(text));
        System.out.println("Text without vowels: " + removeVowels(text));

        scanner.close();


    }

    public static int countWordOccurrences(String text, String word) {
        int count = 0;
        String[] words = text.split(" ");
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }

    public static String findLongestWord(String text) {
        String longestWord = "";
        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    public static String removeVowels(String text) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (vowels.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
