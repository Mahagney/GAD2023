package oo.inheritance;

public class Child extends Parent{

    @Override
    public void displaySecret(){
        System.out.println("This is the secret of the Child");
    }

    public void displaySecret2(){
        super.displaySecret();
        System.out.println("This is the secret 2 of the Child");
    }
}
