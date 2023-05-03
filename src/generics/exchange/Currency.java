package generics.exchange;

public class Currency {
    private Float value;
    private String name;

    public Currency(String name, Float value){
        this.name = name;
        this.value = value;
    }

    public Float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
