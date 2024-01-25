package debugger;

import java.util.*;

public class Vector_Aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k= new Scanner(System.in);
		
		
		int elementos;
		System.out.println("Introduce número de elemntos");
		elementos= k.nextInt();
		
		int[] numAleatorios= new int [elementos];
		for (int i=0 ; i<numAleatorios.length; i++) {
			numAleatorios[i]= (int) (Math.random()*100);
		}
		for (int i=0 ; i<numAleatorios.length; i++) {
			System.out.println(numAleatorios[i]);
		}
	}

}
