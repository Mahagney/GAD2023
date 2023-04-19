package patterns.decorator;

public class Milk extends Topping{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription(){
        return super.getDescription() + ", " + "Milk";
    }

    public Integer getPrice(){
        return super.getPrice() + 3;
    }
}
