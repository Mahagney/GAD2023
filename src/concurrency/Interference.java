package concurrency;

public class Interference {
    public static int v=0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("before " + v);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("v= " +v);
                System.out.println("");
                v++;
            }
        };
        for(int i=0;i<=500;i++){
            (new Thread(runnable)).start();
        }
        Thread.sleep(100);
        System.out.println("after " + v);
    }
}
