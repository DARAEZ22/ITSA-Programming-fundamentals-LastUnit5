package UNIDAD_5;

import java.util.Scanner;

public class FuncionPar {
	private static boolean esPar(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa un numero: ");
		int num=sc.nextInt();
		System.out.println("Numero par: "+esPar(num));
sc.close();
	}

}
