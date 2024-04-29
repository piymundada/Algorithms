import java.util.LinkedList;
import java.util.Queue;

public class TicketQueue {

    /*
    You are developing a ticket booking system that manages customer requests in a queue. Implement a TicketQueue class that uses a Queue to store and manage customer requests. Include the following methods:

public void enqueueRequest(String customerName): This method should add a new customer request to the end of the queue.
public String dequeueRequest(): This method should remove and return the customer request from the front of the queue.
public boolean hasRequests(): This method should return true if the queue has customer requests, otherwise false.
Create an instance of the TicketQueue class, enqueue customer requests, dequeue requests, and check if the queue has requests.
     */

    public static void main(String[] args) {
        TicketQueue ticketQueue = new TicketQueue();
        ticketQueue.enqueueRequest("John");
        ticketQueue.enqueueRequest("Jane");
        System.out.println(ticketQueue.dequeueRequest()); // Prints "John"
        System.out.println(ticketQueue.dequeueRequest()); // Prints "Jane"
        System.out.println(ticketQueue.hasRequests()); // Prints "false"

    }
    Queue<String> queue = new LinkedList<>();
    public void enqueueRequest(String customerName) {
        queue.offer(customerName);
    }
    public String dequeueRequest() {
        return queue.poll();
    }

    public boolean hasRequests() {
        return !queue.isEmpty();
    }
}
