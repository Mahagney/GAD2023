package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>( Arrays.asList(1,2,4,6,8,7,6,4,3) );
        Iterator<Integer> iterator = numbers.iterator();

        while( iterator.hasNext() ){
            Integer i = iterator.next();
            System.out.println(i);
            numbers.add(50);
        };
    }
}
