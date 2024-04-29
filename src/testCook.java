import java.util.Arrays;

public class testCook {

    /*
            Implement a Cook class that prepares a dish by performing three steps: marinating, cooking, and serving. Each step takes a certain amount of time. Implement the Cook class using multithreading to perform these steps simultaneously for multiple dishes.

    The Cook class should have the following methods:

    public Cook(int id): A constructor that initializes the cook with a unique ID.
    public void marinate(): Simulates marinating for 2 seconds.
    public void cook(): Simulates cooking for 4 seconds.
    public void serve(): Simulates serving for 1 second.
    Create 3 Cook instances and demonstrate how they work together to prepare and serve dishes.
     */
    public static void main(String[] args) throws InterruptedException {
        Cook cook = new Cook(1);
        Cook cook2 = new Cook(2);
        Cook cook3 = new Cook(3);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (Cook cook1 : Arrays.asList(cook, cook2, cook3)) {
                    try {
                        cook1.marinate();
                        cook1.cook();
                        cook1.serve();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

            }
        });

        thread.start();
        thread.join();
        System.out.println("All cooks have finished their tasks.");
    }
}
