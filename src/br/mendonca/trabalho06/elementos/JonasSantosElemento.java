package br.mendonca.trabalho06.elementos;

import br.mendonca.trabalho06.tads.JonasSantosTAD;
import br.mendonca.trabalho06.ITAD;

public class JonasSantosElemento {

    JonasSantosElemento next;
    JonasSantosTAD tad;

    public JonasSantosElemento(ITAD tad) {
        super();
        this.tad = (JonasSantosTAD) tad;
    }

    public ITAD getItad() {
        return (ITAD) tad;
    }

    public void setItad(ITAD tad) {
        this.tad = (JonasSantosTAD) tad;
    }

    public JonasSantosElemento getNext() {
        return next;
    }

    public void setNext(JonasSantosElemento next) {
        this.next = next;
    }
}
