package UNIDAD_5;

import java.util.Scanner;

public class FuncionAreaPerimetroCirculo {
	public static double area(float radio) {
	double area=(radio*radio)*Math.PI;
	return area;
	}
	public static double perimetro(float radio) {
	double perimetro=2*Math.PI*radio;
	return perimetro;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa radio del circulo:");
		float radio=sc.nextFloat();
		System.out.println("El area del circulo es: "+area(radio));
         System.out.println("El perimetro del circulo es: "+perimetro(radio));
         sc.close();
	}

}
