package patterns.visitor;

public class PriceVisitor implements Visitor {
    private int price;
    public int getPrice(){
        return price;
    }

    @Override
    public void visit(Book book) {
        price+= book.getPages() * 0.5;
    }

    @Override
    public void visit(Song song) {
        price+=song.getMinutes() * 1;
    }

    @Override
    public void visit(Film film) {
        price+= film.getMinutes() * 2;
    }
}
