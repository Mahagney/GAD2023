package patterns.visitor;

public class TimeVisitor implements Visitor{
    private int time;

    public int getTime(){
        return time;
    }

    @Override
    public void visit(Book book) {
        time = time + book.getPages() * 5;
    }

    @Override
    public void visit(Song song) {
        time+= song.getMinutes();
    }

    @Override
    public void visit(Film film) {
        time+=film.getMinutes() + 10;
    }
}
