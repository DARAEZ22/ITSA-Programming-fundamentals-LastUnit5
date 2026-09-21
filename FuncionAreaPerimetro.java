package UNIDAD_5;
// calcular el area y perimetro de un rectangulo con metodos.
import java.util.Scanner;

public class FuncionAreaPerimetro {
	public static double area(float base, float altura) {
		double area=base*altura;
		return area;
	}
	public static double perimetro(float base, float altura) {
		double perimetro=(base+altura)*2;
		return perimetro;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa base del rectangulo:");
		float base=sc.nextFloat();
		System.out.println("Ingresa altura del rectangulo:");
		float altura=sc.nextFloat();
		System.out.println("El area del rectangulo es: "+area(base,altura));
		System.out.println("El perimetro del rectangulo es: "+perimetro(base,altura));
		sc.close();
	}

}
