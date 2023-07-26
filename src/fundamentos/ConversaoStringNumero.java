package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número ");
		
		System.out.println(valor1 + valor2);
		
		long numero1 = Long.parseLong(valor1);
		long numero2 = Long.parseLong(valor2);
		
		long soma = numero1+numero2;
		//double media = (numero1+numero2)/2; -> Resultado diferente, por conta da conversão implícita
		double media = (double)(numero1+numero2)/2;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
	}
}
