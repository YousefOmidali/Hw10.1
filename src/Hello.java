public class Hello extends Thread{
    @Override
    public void run()
    {
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println("Hello");
                Thread.sleep(100);
            }
            Thread.sleep(2000);

        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException occur");
        }
    }
}
