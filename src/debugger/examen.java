package debugger;

import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner (System.in);

		int n, num = 0, suma = 0;
		double media;
			
			
		do {
			System.out.println("Introduce cúantos numeros:");
			n = k.nextInt();
		}while (n <= 0);
			
		for (int i = 1; i <= n; i++) {
		    System.out.println("Introduce número " + i + ":");
		    num = k.nextInt();
		    suma += num;
		}
			
		
		media = suma/(double)n;
			
		System.out.println("La media es: " + media);
		
		
	}

}
