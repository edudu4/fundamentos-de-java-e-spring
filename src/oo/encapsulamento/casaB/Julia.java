package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
    Ana sogra = new Ana();

    void testeAcessos() {
//        segredo - private
//        fazDentroDeCasa - default
//        formaDeFalar - protected
//        todosSabem - public

//        System.out.println(esposa.segredo);
//        System.out.println(sogra.fazDentroDeCasa);
//        System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todoSabem);
    }
}
