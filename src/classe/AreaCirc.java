package classe;

public class AreaCirc {
    double raio;
    static final double PI = 3.14;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    }
    static double area(double raioParam){
        return PI * Math.pow(raioParam,2);
    }
}
