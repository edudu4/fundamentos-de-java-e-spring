package classe;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        System.out.println("Area 1: " + a1.area());
        AreaCirc a2 = new AreaCirc(5);
        System.out.println("Area 2: " + a2.area());
        System.out.println("Area 3: " + AreaCirc.area(2));
    }
}
