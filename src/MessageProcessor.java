import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
class Source121212 {
    public static void main(String[] args) {
        MessageProcessor processor = new MessageProcessor();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String message = scanner.nextLine();
            String[] parts = message.split(":");
            processor.appendMessage(parts[0], parts[1]);

        }
        System.out.println(processor.getChatLog());
    }
}

class MessageProcessor {



    private StringBuilder chatLog = new StringBuilder();
    public void appendMessage(String sender, String message) {
        chatLog.append(sender).append(": ").append(message).append("\n");
    }
    public String getChatLog() {
        return chatLog.toString();

    }
    public void clearChatLog() {
        chatLog.setLength(0);
    }


}