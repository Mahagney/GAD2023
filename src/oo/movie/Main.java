package oo.movie;

public class Main {
    public static void gasesteStudio(Studio [] studios ){
        for(int i=0; i< studios.length;i++) {
            if(studios[i].getFilme().length > 2) {
                System.out.println(studios[i]);
            }
        }
    }

    public static void main(String[] args) {
        Premiu p1 =new Premiu("Oscar", 1990);
        Actor a1 = new Actor(30, "Actor1", new Premiu[]{p1});
//        System.out.println(a1);

        Film f1 = new Film(2022, "Avatar", new Actor[]{a1});
        Film f2 = new Film(2024, "Avatar", new Actor[]{a1});
        Film f3 = new Film(2025, "Avatar", new Actor[]{a1});

        Studio s1 = new Studio("Studio1", new Film[]{f1});
        Studio s2 = new Studio("Studio2", new Film[]{f2});
        Studio s3 = new Studio("Studio3", new Film[]{f3, f1, f2});
        Studio[] studios = new Studio[]{s1,s2,s3};

        gasesteStudio(studios);
    }
}
