package oo.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();

    void testeAcessos() {
//        segredo - private
//        fazDentroDeCasa - default
//        formaDeFalar - protected
//        todosSabem - public
//        System.out.println(esposa.segredo);

        System.out.println(esposa.fazDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todoSabem);
    }
}
