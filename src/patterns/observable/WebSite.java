package patterns.observable;

public class WebSite {
    private String product;
    private Support support = new Support();

    public void changeProduct(String product){
        this.product = product;
        support.notify(product);
    }

    public void subscribe(Subscriber s) {
        support.subscribe(s);
    }
}
