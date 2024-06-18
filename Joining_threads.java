
class Counter {
    int value = 0;

    public synchronized void increment() {
        // synchronized helps to make sure only one thread call this function at a time
        value++;
    }
}

public class Joining_threads {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        try {
            t1.join(); // stops main till thread is completed
            t2.join(); // stops main till thread is completed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.value);
    }
}
