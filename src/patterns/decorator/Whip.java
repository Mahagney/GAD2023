package patterns.decorator;

public class Whip extends Topping{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    public String getDescription(){
        return super.getDescription() + ", " + "White whip";
    }

    public Integer getPrice(){
        return super.getPrice() + 20;
    }
}
