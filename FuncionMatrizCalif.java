package UNIDAD_5;

import java.util.Scanner;

public class FuncionMatrizCalif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Cantidad de estudiantes");
		int N=sc.nextInt();
		int matriz[][]=new int[N][3];
	   capturarMatriz(sc, matriz, N);
	   ImprimirMatriz(matriz, N);
	   promedioporestudiante(matriz, N);
	   promedioReprobadosPorMateria(matriz, N);
		
	}
	public static void capturarMatriz(Scanner sc, int[][] matriz, int N) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("Matriz ["+i+"]["+j+"]+ =");
				matriz[i][j]=sc.nextInt();
			}
		}
	}
	public static void ImprimirMatriz(int[][]matriz, int N) {
		System.out.println("\nMatriz de calificaciones: ");
		for(int i=0;i<N;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void promedioporestudiante(int[][] matriz, int N) {
		System.out.println("\npromedio por estudiante");
		for(int i=0;i<N;i++) {
			int suma=0;
		    for(int j=0;j<3;j++) {
			suma+=matriz[i][j];			
		   }
		    System.out.println("Promedio estudiante "+i+" = "+(suma/3));
		}
	}
	public static void promedioReprobadosPorMateria(int[][]matriz, int N) {
		System.out.println("\npromedio y reprobados por materia:");
		for(int j=0;j<3;j++) {
			int suma=0;
			int reprobados=0;
		   for(int i=0;i<N;i++) {
			  if(matriz[i][j]<70) {
				  reprobados++;
			  }
		   }
		   System.out.println("Promedio materia "+j+" = "+(suma/N));
		   System.out.println("reprobados materia "+j+" = "+reprobados);
		   System.out.println();
		}
	}
}
