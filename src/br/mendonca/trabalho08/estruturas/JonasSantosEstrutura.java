package br.mendonca.trabalho08.estruturas;

import br.mendonca.trabalho08.ITAD;
import br.mendonca.trabalho08.ITrabalho08;
import br.mendonca.trabalho08.elementos.JonasSantosElemento;

public class JonasSantosEstrutura implements ITrabalho08 {

    private JonasSantosElemento inicio;
    private int quantidade = 0;

    @Override
    public String getAluno() {
        return "Jonas Henrique da Silva Santos";
    }

    @Override
    public Object getLista() {
        return inicio;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void inserirNoIncio(ITAD tad) {
        JonasSantosElemento novo = new JonasSantosElemento(tad);

        if (quantidade == 0) {
                inicio = novo;
                novo.setNext (novo);
        } else {
            JonasSantosElemento cursor = inicio;
            while (cursor.getNext() != inicio) {
                    cursor = (JonasSantosElemento) cursor.getNext();
            }
            cursor.setNext (novo);
            novo.setNext (inicio);
            inicio = novo;
        }
        quantidade += 1;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        JonasSantosElemento novo = new JonasSantosElemento(tad);

        if (quantidade == 0) {
            inicio = novo;
            novo.setNext(novo);
        } else {
            JonasSantosElemento cursor = inicio;
            while (cursor.getNext() != inicio) {
                cursor = (JonasSantosElemento) cursor.getNext();
            }
            cursor.setNext(novo);
            novo.setNext(inicio);
        }
        quantidade += 1;
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (posicao <= 1) this.inserirNoIncio(tad);
        if (posicao >= quantidade) this.inserirNoFim(tad);

        JonasSantosElemento novo = new JonasSantosElemento(tad);

        JonasSantosElemento cursor = this.inicio;
        JonasSantosElemento anterior = cursor;

        for (int i = 1; i < posicao; i++) {
            anterior = cursor;
            cursor = (JonasSantosElemento) cursor.getNext();
        }

        novo.setNext(cursor);
        anterior.setNext(novo);
        quantidade += 1;

    }

    @Override
    public ITAD removerNoInicio() {
        if (quantidade == 0) return null;

        ITAD tadRemovido = inicio.getTad();

        if (quantidade == 1) {
            inicio = null;
        } else {
            JonasSantosElemento cursor = inicio;
            while (cursor.getNext() != inicio) {
                cursor = (JonasSantosElemento) cursor.getNext();
            }
            cursor.setNext(inicio.getNext());
            inicio = (JonasSantosElemento) inicio.getNext();
        }

        quantidade--;
        return tadRemovido;
    }

    @Override
    public ITAD removerNoFim() {
        if (quantidade == 0) return null;

        ITAD tadRemovido = inicio.getTad();

        if (quantidade == 1) {
            inicio = null;
        } else {
            JonasSantosElemento cursor = inicio;
            while (cursor.getNext().getNext() != inicio) {
                cursor = (JonasSantosElemento) cursor.getNext();
            }
            cursor.setNext(inicio);
        }

        quantidade--;
        return tadRemovido;
    }

    @Override
    public ITAD removerNoMeio(int posicao) {
        if (posicao < 1 || posicao > quantidade) return null;

        ITAD tadRemovido;
        if (posicao == 1) {
            tadRemovido = removerNoInicio();
        } else if (posicao == quantidade) {
            tadRemovido = removerNoFim();
        } else {
            JonasSantosElemento cursor = inicio;
            JonasSantosElemento anterior = null;

            for (int i = 1; i < posicao; i++) {
                anterior = cursor;
                cursor = (JonasSantosElemento) cursor.getNext();
            }

            tadRemovido = cursor.getTad();
            anterior.setNext(cursor.getNext());
            quantidade--;
        }

        return tadRemovido;
    }

    @Override
    public ITAD get(int posicao) {
        if (posicao < 1 || posicao > quantidade) return null;

        JonasSantosElemento cursor = inicio;
        for (int i = 1; i < posicao; i++) {
            cursor = (JonasSantosElemento) cursor.getNext();
        }
        return cursor.getTad();
    }

    @Override
    public String print() {
        String str = "";
        JonasSantosElemento atual = inicio;
        int index = 1;
        while (atual != null) {
            str += index + ". \n";
            str += atual.getTad().print() + "\n\n";
            atual = (JonasSantosElemento) atual.getNext();
            index++;
        }
        return str;
    }
}
