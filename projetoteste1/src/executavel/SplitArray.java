package executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
		String Text = "Leno, curso java, 80, 70, 90, 89";
		String[] valoresArray = Text.split(",");
		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota: " + valoresArray[2]);
		System.out.println("Nota: " + valoresArray[3]);
		System.out.println("Nota: " + valoresArray[4]);
		System.out.println("Nota: " + valoresArray[5]);
		/* Converter um Array em uma lista */
		List<String> list = Arrays.asList(valoresArray);

		for (String valorString : list) {
			System.out.println(valorString);
			/* Converter Lista para array */

		}
		String[] conversaoArray = list.toArray(new String[6]);
		for(int pos= 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
	}
}
