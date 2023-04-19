package oo.movie;

import java.util.Arrays;

public class Actor {
    private int varsta;
    private String nume;
    private Premiu[] premii;

    public Actor(int varsta, String nume, Premiu[] premii) {
        this.varsta = varsta;
        this.nume = nume;
        this.premii = premii;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                ", premii=" + Arrays.toString(premii) +
                '}';
    }
}
