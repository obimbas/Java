package poo;

import java.util.Scanner;

import java.util.Locale;

import entities.Rectangle;

public class RectanglePoo {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("width and height:");
        
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);

        sc.close();
    }
}
