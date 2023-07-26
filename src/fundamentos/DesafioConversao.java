package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os últimos três salários: ");
		String salarioInformado1 = entrada.nextLine().replace(",", ".");
		String salarioInformado2 = entrada.nextLine().replace(",", ".");
		String salarioInformado3 = entrada.nextLine().replace(",", ".");
		
		Double salario1 =  Double.parseDouble(salarioInformado1);
		Double salario2 =  Double.parseDouble(salarioInformado2);
		Double salario3 =  Double.parseDouble(salarioInformado3);
		
		double media =  (salario1 + salario2 + salario3 )/3;
		
		System.out.printf("A média dos últimos salários  é de: %.2f", media);
		
		entrada.close();
	}
}
