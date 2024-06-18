class A extends Thread {
    // for a class to be used as thread it should extend Thread class and have a run function
    public void run() {
        for (int i = 0; i < 10; i++) {
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

class B extends Thread {
    // for a class to be used as thread it should extend Thread class and have a run function
    public void run() {
        for (int i = 0; i < 10; i++) {
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

public class using_threads {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.setPriority(Thread.NORM_PRIORITY);
        obj2.setPriority(Thread.NORM_PRIORITY);
        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Sleep Interrupted");
        }
        obj2.start();

    }
}
