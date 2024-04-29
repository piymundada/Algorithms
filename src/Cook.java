import java.util.Arrays;

public class Cook extends Thread{


    private final int id;

    public Cook(int id){
        this.id = id;
    }
    public void marinate() throws InterruptedException {
        System.out.println("Cook " + id + " is marinating...");
        Thread.sleep(1000);
        System.out.println("Cook " + id + " finished marinating.");
    }
    public void cook() throws InterruptedException {
        System.out.println("Cook " + id + " is cooking...");
        Thread.sleep(2000);
        System.out.println("Cook " + id + " finished cooking.");
    }
    public void serve() throws InterruptedException {
        System.out.println("Cook " + id + " is serving...");
        Thread.sleep(1000);
        System.out.println("Cook " + id + " finished serving.");
    }


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

        System.out.println("All cooks have finished their tasks.");
    }

}
