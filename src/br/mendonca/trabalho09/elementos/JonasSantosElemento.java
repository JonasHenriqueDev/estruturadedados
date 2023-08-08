package br.mendonca.trabalho09.elementos;

import br.mendonca.trabalho09.tads.JonasSantosTAD;
import br.mendonca.trabalho09.IElemento;
import br.mendonca.trabalho09.ITAD;

public class JonasSantosElemento implements IElemento {
    private JonasSantosElemento proximo;
    private JonasSantosElemento anterior;
    JonasSantosTAD tad;
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
