package application;

import java.util.Locale;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Enter the number of lines: ");
		int line = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int column = sc.nextInt();

		int[][] matrix = new int[line][column];

		System.out.println("enter the values to be stored: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.print("enter:");
		int x = sc.nextInt();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (x == matrix[i][j]) {
					System.out.println("the " + matrix[i][j] + " is in the position (" + i + ", " + j + ")!");
					if (j > 0) {
						System.out.print("left: " + matrix[i][j-1]+"\n");
					}
					if(i > 0) {
						System.out.print("up: " + matrix[i-1][j]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("\nRight: " + matrix[i][j+1]);
					}
					if (i < matrix.length-1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
				}
			}
		}

		sc.close();
	}
}
