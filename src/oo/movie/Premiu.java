package oo.movie;

public class Premiu {
    private String nume;
    private int an;

    public Premiu(String nume, int an){
        this.nume = nume;
        this.an = an;
    }

    @Override
    public String toString(){
        return "Premiu cu numele " + nume + " din anul " + an;
    }
}
