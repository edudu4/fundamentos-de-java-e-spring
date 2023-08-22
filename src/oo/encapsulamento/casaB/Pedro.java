package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
        // Ana mae = new Ana();
    void testeAcessos() {
//        segredo - private
//        fazDentroDeCasa - default
//        formaDeFalar - protected
//        todosSabem - public

        //System.out.println(mae.segredo);
        //System.out.println(mae.fazDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todoSabem);
    }
}
