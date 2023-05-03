package generics.box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.set(233);
        Integer s = (Integer)box.get();
        System.out.println(s.floatValue());

        GenericBox genericBox = new GenericBox<Integer>();
        GenericBox<String> genericBoxString = genericBox;
        genericBox.set(2344);
        System.out.println(genericBox.get());
        genericBoxString.get().length();
    }
}
