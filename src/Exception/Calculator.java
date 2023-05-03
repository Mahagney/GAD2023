package Exception;

public class Calculator {
    public int calculate(int i) throws NumberNotEvenException {
        if ( i>0 ) {
            if ( i % 2 != 0) {
                throw new NumberNotEvenException();
            }
            respond();
        } else {
            throw new FatalException();
        }
        return 0;
    }

    private void respond() {
        System.out.println("response");
    }
}
