package patterns.observable;

public class Main {
    public static void main(String[] args) {

        WebSite webSite = new WebSite();
        Subscriber s1 = new Subscriber("s1");
        Subscriber s2 = new Subscriber("s2");
        Subscriber s3 = new Subscriber("s3");

        webSite.subscribe(s1);
        webSite.subscribe(s2);
        webSite.subscribe(s3);

        webSite.changeProduct("New Prod");
    }
}
