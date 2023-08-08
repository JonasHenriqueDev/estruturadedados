package br.mendonca.trabalho08.elementos;

import br.mendonca.trabalho08.tads.JonasSantosTAD;
import br.mendonca.trabalho08.IElemento;
import br.mendonca.trabalho08.ITAD;

public class JonasSantosElemento implements IElemento {

    private JonasSantosElemento next;
    private JonasSantosTAD tad;

    public JonasSantosElemento(ITAD tad) {
        super();
        this.tad = (JonasSantosTAD) tad;
    }
    @Override
    public ITAD getTad() {
        return tad;
    }

    @Override
    public void setTad(ITAD tad) {
        this.tad = (JonasSantosTAD) tad;
    }

    @Override
    public IElemento getNext() {
        return next;
    }

    @Override
    public void setNext(IElemento next) {
        this.next = (JonasSantosElemento) next;
    }
}
