package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		// Conversão Implícita
		double a = 1;
		System.out.println(a);
		
		// Conversão Explícita - Pode perder informação
		float b = 1.0F; // Maneira convencional
		System.out.println(b);
		
		float c = (float) 1.12345; // Cast
		System.out.println(c);
		
		int d = 130;
		byte e = (byte) d; // Cast
		System.out.println(e);
		
		double f = 1.9999;
		int g = (int) f; // Cast
		System.out.println(g);
	}
}
