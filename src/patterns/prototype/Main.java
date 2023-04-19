package patterns.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Phone sp = new Phone(200, 30, "Samsung");
        Phone sp2 = sp.clone();
        System.out.println(sp2);
        System.out.println(sp);
    }
}
