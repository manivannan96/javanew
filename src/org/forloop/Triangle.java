package org.forloop;

public class Triangle {

	public static void main(String[] args) {
		int i = 0;
		for (i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println("  " );
		}

	}
}
