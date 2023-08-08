package br.mendonca.trabalho09.estruturas;

import br.mendonca.trabalho09.ITAD;
import br.mendonca.trabalho09.ITrabalho09;
import br.mendonca.trabalho09.elementos.JonasSantosElemento;

import java.util.ArrayList;
import java.util.List;

public class JonasSantosEstrutura implements ITrabalho09 {

    private JonasSantosElemento cursor;
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
    public Object getLista() {
        if (cursor == null) {
            return null;
        }

        List<ITAD> lista = new ArrayList<>();
        JonasSantosElemento current = cursor;

        do {
            lista.add(current.getTad());
            current = (JonasSantosElemento) current.getNext();
        } while (current != cursor);

        return lista;
    }

    @Override
    public void inserirAntes(ITAD tad) {
        JonasSantosElemento novo = new JonasSantosElemento();
        novo.setTad (tad);

        if (cursor == null) {
            cursor = novo;
            cursor.setNext (novo);
            cursor.setPrevious (novo);
        } else {
            novo.setNext(cursor);
            novo.setPrevious(cursor.getPrevious());
            JonasSantosElemento anterior = (JonasSantosElemento) cursor.getPrevious();
            anterior.setNext(novo);
            cursor.setPrevious(novo);
        }
        quantidade++;
    }

    @Override
    public void inserirDepois(ITAD tad) {
        JonasSantosElemento novo = new JonasSantosElemento();
        novo.setTad (tad);

        if (cursor == null) {
            cursor = novo;
            cursor.setNext(novo);
            cursor.setPrevious(novo);
        } else {
            novo.setNext(cursor.getNext());
            novo.setPrevious(cursor);
            JonasSantosElemento proximo = (JonasSantosElemento) cursor.getNext();
            proximo.setPrevious(novo);
            cursor.setNext(novo);
        }

        quantidade++;
    }

    @Override
    public void deslocarCursor(int posicao) {
        while (posicao !=0) {
            if (posicao > 0) {
                cursor = (JonasSantosElemento) cursor.getNext();
                posicao--;
            } else {
                cursor = (JonasSantosElemento) cursor.getPrevious();
                posicao++;
            }
        }
    }

    @Override
    public ITAD removerAntes() {
        if (quantidade == 0 || cursor == null) return null;

        JonasSantosElemento anterior = (JonasSantosElemento) cursor.getPrevious();
        ITAD tadRemovido = anterior.getTad();

        if (quantidade == 1) {
            cursor = null;
        } else {
            cursor.setPrevious(anterior.getPrevious());
            anterior.getPrevious().setNext(cursor);
        }

        quantidade--;
        return tadRemovido;
    }

    @Override
    public ITAD removerDepois() {
        if (quantidade == 0 || cursor == null) return null;

        JonasSantosElemento proximo = (JonasSantosElemento) cursor.getNext();
        ITAD tadRemovido = proximo.getTad();

        if (quantidade == 1) {
            cursor = null;
        } else {
            cursor.setNext(proximo.getNext());
            proximo.getNext().setPrevious(cursor);
        }

        quantidade--;
        return tadRemovido;
    }

    @Override
    public ITAD getAtual() {
        if (cursor == null) return null;

        return cursor.getTad();
    }

    @Override
    public ITAD get(int posicao) {
        if (cursor == null) return null;

        return cursor.getTad();
    }

    @Override
    public String print() {
        String msg = "\nLISTA SEQUENCIAL DINAMICA CIRCULAR DUPLAMENTE ENCADEADA\n";
        if (cursor != null) {
            JonasSantosElemento inicio = cursor;
            do {
                msg += inicio.getTad().print();
                inicio = (JonasSantosElemento) inicio.getNext();
            } while (inicio != cursor);
        }
        return msg;
    }
}
