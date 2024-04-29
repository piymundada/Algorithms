import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    /*
    You are building a dictionary application that stores word definitions. Implement a Dictionary class that uses a Map to store word-to-definition mappings. Include the following methods:

public void addWordDefinition(String word, String definition): This method should add a new word and its definition to the map.
public String getWordDefinition(String word): This method should return the definition of the specified word from the map.
public boolean hasWord(String word): This method should return true if the map contains the specified word, otherwise false.
Create an instance of the Dictionary class, add word definitions, retrieve definitions, and check if the map has specific words.
     */

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addWordDefinition("hello", "greeting");
        dictionary.addWordDefinition("world", "planet");
        System.out.println(dictionary.getWordDefinition("hello")); // greeting
        System.out.println(dictionary.hasWord("hello")); // true
        System.out.println(dictionary.hasWord("world")); // true
        System.out.println(dictionary.hasWord("foo")); // false
    }

    Map<String, String> wordDefinitions = new HashMap<>();
    public void addWordDefinition(String word, String definition) {
        wordDefinitions.put(word, definition);
    }

    public String getWordDefinition(String word) {
        return wordDefinitions.get(word);
    }

    public boolean hasWord(String word) {
        return wordDefinitions.containsKey(word);
    }

}
