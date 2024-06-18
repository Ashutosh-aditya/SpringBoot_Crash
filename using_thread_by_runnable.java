
class A implements Runnable {
    // for a class to be used as thread it should extend Thread class and have a run function
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Butter");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Sleep Interrupted");
            }
        }
    }

}

class B implements Runnable {
    // for a class to be used as thread it should extend Thread class and have a run function
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("fly");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Sleep Interrupted");
            }
        }
    }
}

public class using_thread_by_runnable {

    public static void main(String[] args) {
        // using_thread_by_runnable obj = new using_thread_by_runnable();
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();

        t2.start();

    }
}
