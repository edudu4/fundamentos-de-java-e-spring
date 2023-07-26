package fundamentos;

public class Wrappers {

	public static void main(String[] args) {

		Byte b = 100; // byte

		Short s = 1000; // short

		// Integer i = Integer.parseInt(entrada.next());

		Integer i = 10000; // int
		
		Long l = 1000000L; // long

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F; // float
		System.out.println(f);
		
		Double d = 1234.5678; // double
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");

	}
}
