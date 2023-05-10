package lambda;

public class LambdaFinal {
    private int a = 10;
    public void calculate(){
        int b = 4;
        b++;
        a++;
        Runnable r = () -> {
            System.out.println(this.a);
        };
        r.run();
    }
}
