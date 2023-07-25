package br.mendonca.trabalho02.estruturas;

import br.mendonca.trabalho02.ITAD;
import br.mendonca.trabalho02.ITrabalho02;
import br.mendonca.trabalho02.elementos.JonasSantosElemento;

public class JonasSantosEstrutura implements ITrabalho02 {

    private JonasSantosElemento inicio;
    private int quantidade = 0;

    @Override
    public String getAluno() {
        return "Jonas Henrique da Silva Santos";
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void inserirNoInicio(ITAD tad) {
        JonasSantosElemento novoElemento = new JonasSantosElemento(tad);
        novoElemento.setNext(inicio);
        inicio = novoElemento;
        quantidade++;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        JonasSantosElemento novoElemento = new JonasSantosElemento(tad);
        if (inicio == null) {
            inicio = novoElemento;
        } else {
            JonasSantosElemento atual = inicio;
            while (atual.getNext() != null) {
                atual = atual.getNext();
            }
            atual.setNext(novoElemento);
        }
        quantidade++;
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (posicao < 0 || posicao > quantidade) return;

        if (posicao == 0) {
            inserirNoInicio(tad);
            return;
        }

        JonasSantosElemento novoElemento = new JonasSantosElemento(tad);
        JonasSantosElemento atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.getNext();
        }
        novoElemento.setNext(atual.getNext());
        atual.setNext(novoElemento);
        quantidade++;
    }

    @Override
    public void excluirNoFim() {
        if (inicio == null) return;

        if (quantidade == 1) {
            inicio = null;
        } else {
            JonasSantosElemento atual = inicio;
            while (atual.getNext().getNext() != null) {
                atual = atual.getNext();
            }
            atual.setNext(null);
        }
        quantidade--;
    }

    @Override
    public void excluirNoInicio() {
        if (inicio == null) return;

        inicio = inicio.getNext();
        quantidade--;
    }

    @Override
    public void excluirNoMeio(int posicao) {
        if (inicio == null || posicao < 0 || posicao >= quantidade) return;

        if (posicao == 0) {
            excluirNoInicio();
            return;
        }

        JonasSantosElemento atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.getNext();
        }
        atual.setNext(atual.getNext().getNext());
        quantidade--;
    }

    @Override
    public ITAD getItem(int posicao) {
        if (inicio == null || posicao < 0 || posicao >= quantidade) return null;

        JonasSantosElemento atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getNext();
        }
        return atual.getItad();
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
