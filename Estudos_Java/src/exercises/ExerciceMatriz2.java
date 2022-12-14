package exercises;

import java.util.Scanner;


public class ExerciceMatriz2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        int amount = sc.nextInt();
        System.out.print("Column: ");
        int column = sc.nextInt();
        
        int[][] matriz = new int[amount][column]; 
        for( int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Search:");
        int searchNumber = sc.nextInt();

        for( int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == searchNumber) {
                    System.out.println("Position " + i + "," + j + ":");

                    if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length - 1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length - 1) {
						System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
