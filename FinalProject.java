package UNIDAD_5;

import java.util.Scanner;

public class FinalProject {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("How many orders will you enter?");
	int N=sc.nextInt();
	String[] clients=new String[N];
	String[] Dish=new String[N];
	int[] price=new int[N];
	int[] amount=new int[N];
	int resp=0,op=0;
	orders(sc,clients,Dish,price,amount,N);;
	do {
		System.out.println("""
				    *****OPTIONS*****
				1) Show all information.
				2) Add all sales together.
				3) Show the client's names. 
				4) Show who bought more orders.
				5) Show who bought the fewest orders.
				6) Show who spent the most.
				7) Show who spent the least.
				8) Log out of the program.
				""");
		System.out.println("Choose an option:");
		op=sc.nextInt();
		switch(op) {
		case 1:
			showorders(clients,Dish,price,amount,N);
		break;
		case 2:
			System.out.println("The total of all orders is: $"+sumaorders(price,amount,N));	
		break;
		case 3:
			clientsNames(clients,N);
			break;
		case 4:
			boughtMore(clients,amount,N);
			break;
		case 5:
			boughtleast(clients,amount,N);
			break;
		case 6:
			spentmoust(clients,price,amount,N);
			break;
		case 7:
			spentleast(clients,price,amount,N);
			break;
		case 8:
			System.out.println("Are you sure you want to log out?");
		break;
		}
		System.out.println("If you want to continue enter number 9, else enter number 8:");
		resp=sc.nextInt();
	}while(resp!=8);
	System.out.println("Logging out of program...");

	}
	
	
	
	
	
	
	
	
	
	
	public static void orders(Scanner sc, String[] clients,String[] Dish, int[] price, int[] amount, int N) {
		for(int i=0;i<N;i++) {
			System.out.println("""
				    *****MENU*****
				1- Hamburgers...$60
				2- Chiken...$300kg
				3- Soup...$300/500ml
				4- crab...$500p
				5- Shrimp...$300/500g
				6- octopus...$700p
				7- ramen...$130/500ml
				8- beef...$500kg
				""");
			System.out.println("Client's name:");
			clients[i]=sc.next();
			System.out.println("Enter dish name:");
			Dish[i]=sc.next();
			System.out.println("How much is it?");
			price[i]=sc.nextInt();
			System.out.println("How many will you order?");
			amount[i]=sc.nextInt();
		}
	}
	public static void showorders(String[] clients, String[] Dish,int[] price, int[] amount, int N) {
		for(int i=0;i<N;i++) {
			System.out.println("Client "+i+": "+clients[i]+"\n"+"Dish name: "+Dish[i]+"\n"+"price: "+"$"+price[i]+"\n"+"Amount ordered: "+amount[i]);
		}
	}
	public static int sumaorders(int[]price,int[]amount,int N) {
		int suma=0;
	for(int i=0;i<N;i++) {
		suma+=(price[i]*amount[i]);
	}
	return suma;
	}
	public static void clientsNames(String[] clients, int N) {
		for(int i=0;i<N;i++) {
			System.out.println("Client's name "+i+": "+clients[i]);
		}
	}
	public static void boughtMore(String[] clients, int[] amount,int N) {
		int maxamount=amount[0];
		String maxClient=clients[0];
		for(int i=0;i<N;i++) {
			if(amount[i]>maxamount) {
				maxamount=amount[i];
				maxClient=clients[i];
			}
		}
		System.out.println("the person who bought the most quantity of products is: "+maxClient+"\n"+" The person bought: "+maxamount);
	}
	public static void boughtleast(String[] clients, int[] amount, int N) {
		int leastamount=amount[0];
		String leastbought=clients[0];
		for(int i=1;i<N;i++) {
			if(amount[i]<leastamount) {
				leastamount=amount[i];
				leastbought=clients[i];
				
			}
		}
		System.out.println("the person who bought the least quantity of products is: "+leastbought+"\n"+"The person bought: "+leastamount);
	}
	public static void spentmoust(String[] clients,int[] price,int[] amount, int N) {
		int most=price[0]*amount[0];
		String clientspent=clients[0];
		for(int i=0;i<N;i++) {
			if(price[i]*amount[i]>most) {
				most=price[i]*amount[i];
				clientspent=clients[i];
				
			}
		}
		System.out.println("The person who spent the most is: "+clientspent+"\n"+"The person spent: $"+most);
	}
	public static void spentleast(String[] clients, int[] price, int[] amount, int N) {
		int least=price[0]*amount[0];
		String clientleast=clients[0];
		for(int i=1;i<N;i++) {
			if(price[i]*amount[i]<least) {
				least=price[i]*amount[i];
				clientleast=clients[i];
			}
		}
		System.out.println("The person who spent the least is: "+clientleast+"\n"+"The person spent: $"+least);
	}
 
}
