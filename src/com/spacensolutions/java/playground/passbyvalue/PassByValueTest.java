package com.spacensolutions.java.playground.passbyvalue;

public class PassByValueTest {

    public static void main(String[] args) {

        Balloon red = new Balloon("Red");
        Balloon blue = new Balloon("Blue");

        swap(red, blue);

        System.out.println(" Red Object color : "+red.getColor());
        System.out.println(" Blue Object color : "+blue.getColor());

        foo(blue);

        System.out.println(" Blue Object color : "+blue.getColor());

    }

    public static void swap(Balloon o1, Balloon o2) {
        Balloon temp = o1;
        o1 = o2;
        o2 = temp;

       /* o1.setColor("Black");
        o2.setColor("Yellow");*/

    }

    public static void foo(Balloon balloon) {
        balloon.setColor("Red");
        balloon = new Balloon("Green");
        balloon.setColor("Blue");
    }

}
