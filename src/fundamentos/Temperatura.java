package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		final double AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double fahrenheit = 78;
		long celsius = Math.round((fahrenheit - AJUSTE) * FATOR);
		
		System.out.println("A temperatura está em " + celsius + " °C.");
	}
}
