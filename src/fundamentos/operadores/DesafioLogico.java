package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = false;
		
		boolean televisao50Polegadas = trabalhoTerca && trabalhoQuinta;
		boolean televisao32Polegadas = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		
		// Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50?\" " + televisao50Polegadas);
		System.out.println("Comprou TV 32?\" " + televisao32Polegadas);
		System.out.println("Comprou Sorvete?\" " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
		
	}
}
