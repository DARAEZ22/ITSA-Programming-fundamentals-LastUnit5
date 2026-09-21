package UNIDAD_5;

import java.util.Scanner;
//method and function are the same.
public class FuncionSumar {
	private static int sumar(int a,int b ) {
		int resultado= a+b;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Ingresa numero 1:");
		n1=sc.nextInt();
		System.out.println("Ingresa numero 2:");
		n2=sc.nextInt();
		int resultado=sumar(n1,n2);
System.out.println("La suma es: "+resultado);
sc.close();
	}

}
