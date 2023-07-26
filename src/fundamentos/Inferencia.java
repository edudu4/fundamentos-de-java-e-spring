package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		//Inferência Explicita
		double a = 4.5;
		System.out.println(a);
		
		//Inferência Implicita
		var b = 4.5;
		System.out.println(b);
		
		double c; //Variável foi Declarada
		c = b + 3.5 ; // Inicializada
		System.out.println(c); // Usada!
		
		var d = "Texto";
		System.out.println(d);
		
		d = "Outro Texto";
		System.out.println(d);
		
		var e = false;
		System.out.println(e);
		
	}
}
