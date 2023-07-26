package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		int expressao = (int) Math.pow(6*(3+2), 2)/(3*2);
		int expressaoDois = (int) Math.pow( ((1-5)*(2-7) )/2, 2);
		int resultado = (int) (Math.pow((expressao - expressaoDois), 3))/ (int) Math.pow(10, 3);
		
		System.out.printf("O resultado é: %d", resultado);
	}
}