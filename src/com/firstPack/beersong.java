package com.firstPack;

public class beersong {
    public static void main (String[] args) {
        int x = 99;
        int y = 99;
        String word = "bottles";
        while (x >0) {
                System.out.println(x + " " + word + " of beer on the wall,");
                System.out.println(x + " " + word + " of beer!");
                System.out.println("Take one down");
                System.out.println("Pass it around");
                x = x - 1;
            if (x == 1) {
                word = "bottle";
            }
            if (x > 0) {
                System.out.println(x + " " + word + " of beer on the wall!");
                System.out.println();
            } else {
                System.out.println("No more bottles of beer on the wall,");
                System.out.println("No more bottles of beer.");
                System.out.println();
                System.out.println("Go to the store and buy some more,");
                System.out.println(y + " " + word + " of beer on the wall!");
            }
        }
    }
}
