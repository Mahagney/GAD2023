package generics.box;

public class Box {
    private Object object;

    public void set(Object obj) {
        this.object = obj;
    }

    public Object get() {
        return object;
    }
}
