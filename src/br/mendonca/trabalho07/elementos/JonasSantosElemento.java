package br.mendonca.trabalho07.elementos;

import br.mendonca.trabalho07.IElemento;
import br.mendonca.trabalho07.ITAD;
import br.mendonca.trabalho07.tads.JonasSantosTAD;

public class JonasSantosElemento implements IElemento {

    private JonasSantosTAD tad;
    private JonasSantosElemento proximo;
    private JonasSantosElemento anterior;

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
        return proximo;
    }

    @Override
    public void setNext(IElemento next) {
        this.proximo = (JonasSantosElemento) next;
    }

    @Override
    public IElemento getPrevious() {
        return anterior;
    }

    @Override
    public void setPrevious(IElemento previous) {
        this.anterior = (JonasSantosElemento) previous;
    }
}
