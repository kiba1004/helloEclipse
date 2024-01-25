package debugger;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a=5; int b=5;
//		
//		if ( a < b )
//			System.out.println("Hola");
//			else
//			System.out.println("Adiós");
//		
//		if ( a >= b )
//			System.out.println("Adiós");
//			else
//			System.out.println("Hola");
		

//			int notaPrueba=8; 
//			if (notaPrueba < 7) {
//			System.out.println("Suspendido");
//			}
//			else if (notaPrueba >= 9) {
//			System.out.println("Matricula de Honor");
//			}
			
//			int notaPrueba=7 ;
//			if (notaPrueba < 7) {
//			System.out.println("Suspendido");
//			System.out.println("La próxima vez, has de trabajar más");
//			}
//			else {
//			System.out.println("Estás aprobado");
//			System.out.println("Sigue así");
//			}
		
//		Scanner k = new Scanner(System.in);
//
//		System.out.println("Introduce 3 números enteros:");
//		int a = k.nextInt();
//		int b = k.nextInt();
//		int c = k.nextInt();
//
//		if (a == b) {
//			System.out.println("el repeƟdo es " + a);
//		}
//		else if (a == c) {
//			System.out.println("el repeƟdo es " + a);
//		}
//		else if (c == b) {
//			System.out.println("el repeƟdo es " + c);
//		}
		
		
//		int notaPrueba=5; int edad= 6;
//		if (notaPrueba >= 7) {
//			if (edad < 10) {
//			System.out.println("Buen trabajo");
//			} else {
//			System.out.println("Aprobado");// notaPrueba >= 7
//			//y edad >= 10
//			} }else { // nota prueba < 7
//			System.out.println("Suspendido");
//			}
		
		
		
//		Scanner k = new Scanner(System.in);
//		System.out.print("Introduce calificación: ");
//		int calificacion = k.nextInt();
//		switch (calificacion) {
//		case 10:
//		case 9:
//		case 8: System.out.println("maestro");
//		break;
//		case 7:
//		case 6: System.out.println("oficial");
//		break;
//		case 5:
//		case 4: System.out.println("aprendiz");
//		}
		
		//Intoducir 5 números enteros y mostrar el producto
		Scanner k=new Scanner(System.in);
		int producto = 1;
		int i = 0;
		do {
		System.out.println("Introduce número " + (i+1) + ":");
		int num= k.nextInt();
		producto *= num;
		i++;
		}while(i < 5);
		System.out.println("El producto es: " + producto);
		
		
		
		
	}

}
