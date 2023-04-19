package patterns.visitor;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List< Element> elements = new ArrayList<Element>();
        elements.add(new Book());
        elements.add(new Film());
        elements.add(new Song());

        TimeVisitor timeVisitor = new TimeVisitor();
        for(Element e: elements){
            e.accept(timeVisitor);
        }

        System.out.println("Total time: " + timeVisitor.getTime());

        PriceVisitor pv = new PriceVisitor();
        for(Element e: elements){
            e.accept(pv);
        }
        System.out.println("Total price: " + pv.getPrice());

    }
}
