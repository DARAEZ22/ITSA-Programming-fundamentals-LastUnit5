package UNIDAD_5;

public class FuncionSaludar {
	// Methods can be placed before or after (main).
	private static void saludar(String msg) {
	System.out.println("mensaje: "+ msg);		
	}
	//this one is (main).
	public static void main(String[] args) {
		saludar("Buenos dias");
		saludar("Hola a todos");
		saludar("Eres un buen programador bro!");
		saludar("I look up to you bro!");

	}

}
