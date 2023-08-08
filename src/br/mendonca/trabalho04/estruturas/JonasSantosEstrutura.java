package br.mendonca.trabalho04.estruturas;

import br.mendonca.trabalho04.ITAD;
import br.mendonca.trabalho04.ITrabalho04;
import br.mendonca.trabalho04.elementos.JonasSantosElemento;

public class JonasSantosEstrutura implements ITrabalho04 {

    private JonasSantosElemento inicio;
    private JonasSantosElemento fim;
    private int quantidade;

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
        return inicio;
    }

    @Override
    public void enqueue(ITAD tad) {
        JonasSantosElemento novoElemento = new JonasSantosElemento(tad);
        if (quantidade == 0) {
            inicio = novoElemento;
        } else {
            fim.setNext(novoElemento);
        }
        fim = novoElemento;
        quantidade++;
    }

    @Override
    public ITAD dequeue() {
        if (quantidade == 0) {
            return null;
        }

        ITAD tadRemovido = inicio.getItad();
        inicio = inicio.getNext();
        quantidade--;

        if (quantidade == 0) {
            fim = null;
        }

        return tadRemovido;
    }

    @Override
    public ITAD get(int posicao) {
        if (posicao < 0 || posicao >= quantidade) {
            return null;
        }

        JonasSantosElemento elementoAtual = inicio;
        for (int i = 0; i < posicao; i++) {
            elementoAtual = elementoAtual.getNext();
        }

        return elementoAtual.getItad();
    }

    @Override
    public String print() {
        String str = "";
        JonasSantosElemento atual = inicio;
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
