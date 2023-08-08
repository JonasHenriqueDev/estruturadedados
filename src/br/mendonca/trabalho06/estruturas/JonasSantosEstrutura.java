package br.mendonca.trabalho06.estruturas;

import br.mendonca.trabalho06.elementos.JonasSantosElemento;
import br.mendonca.trabalho06.ITAD;
import br.mendonca.trabalho06.ITrabalho06;

public class JonasSantosEstrutura implements ITrabalho06 {

    private int quantidade;
    private JonasSantosElemento topo;
    @Override
    public String getAluno() {
        return "Jonas Henrique da Silva Santos";
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public Object getLista() {
        return topo;
    }

    @Override
    public void push(ITAD tad) {
        JonasSantosElemento novo = new JonasSantosElemento(tad);

        novo.setNext(topo);
        topo = novo;
        quantidade++;
    }

    @Override
    public ITAD pop() {
        if (topo == null) return null;

        JonasSantosElemento elemento = topo;
        topo = topo.getNext();
        quantidade--;

        return elemento.getItad();
    }

    @Override
    public ITAD get(int posicao) {
        return topo.getItad();
    }

    @Override
    public String print() {
        String str = "";
        JonasSantosElemento atual = topo;
        int index = 1;
        while (atual != null) {
            str += index + ". \n";
            str += atual.getItad().print() + "\n\n";
            atual = atual.getNext();
            index++;
        }
        return str;
    }
}
