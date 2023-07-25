package br.mendonca.trabalho02.elementos;

import br.mendonca.trabalho02.ITAD;

public class JonasSantosElemento {

    private ITAD itad;
    private JonasSantosElemento next;

    public JonasSantosElemento(ITAD itad) {
        super();
        this.itad = itad;
    }

    public ITAD getItad() {
        return itad;
    }

    public void setItad(ITAD itad) {
        this.itad = itad;
    }

    public JonasSantosElemento getNext() {
        return next;
    }

    public void setNext(JonasSantosElemento next) {
        this.next = next;
    }

}
