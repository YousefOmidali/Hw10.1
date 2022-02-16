public class main {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.start();
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hello.interrupt();

    }
}
