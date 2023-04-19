package patterns.visitor;

public class Song implements Element{
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

    public int getMinutes(){
        return 20;
    }
}
