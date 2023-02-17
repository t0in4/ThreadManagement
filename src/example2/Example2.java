package example2;

public class Example2 {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new HelloThread1();
        thread.start();
        System.out.println("Do something useful");
        thread.join();
        System.out.println("Do something else");
    }
}
