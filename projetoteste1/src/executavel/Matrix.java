package executavel;

import java.util.Iterator;

public class Matrix {
	public static void main(String[] args) {
		int notas[][] = new int[2][3];
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;

		notas[1][0] = 40;
		notas[1][1] = 30;
		notas[1][2] = 20;
		
		for (int poslinha = 0; poslinha < notas.length; poslinha++) {
			System.out.println("==========================================");
			for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++) {
				System.out.println("Valor da matrix: " + notas[poslinha][poscoluna]);
			}
		}
	}
}
