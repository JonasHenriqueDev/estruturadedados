package br.mendonca.trabalho07.estruturas;

import br.mendonca.trabalho07.ITAD;
import br.mendonca.trabalho07.ITrabalho07;
import br.mendonca.trabalho07.elementos.JonasSantosElemento;
import br.mendonca.trabalho07.tads.JonasSantosTAD;

public class JonasSantosEstrutura implements ITrabalho07 {

    private JonasSantosElemento inicio;
    private JonasSantosElemento fim;
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
        JonasSantosElemento novo = new JonasSantosElemento();
        novo.setTad(tad);

        if(inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setNext(inicio);
            inicio.setPrevious(novo);
            inicio = novo;
        }
        quantidade++;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        JonasSantosElemento novo = new JonasSantosElemento();
        novo.setTad(tad);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setPrevious(fim);
            fim.setNext(novo);
            fim = novo;
        }
        quantidade++;
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (posicao < 1 || posicao > quantidade) return;

        JonasSantosElemento novo = new JonasSantosElemento();
        novo.setTad(tad);

        JonasSantosElemento aux = inicio;
        int cursor = 1;
        while (cursor < posicao) {
            aux = (JonasSantosElemento) aux.getNext();
            cursor++;
        }
        novo.setNext(aux);
        novo.setPrevious(aux.getPrevious());
        JonasSantosElemento anterior = (JonasSantosElemento) aux.getPrevious();
        anterior.setNext(novo);
        aux.setPrevious(novo);

        quantidade++;
    }

    @Override
    public ITAD removerNoInicio() {
        if (inicio == null) return null;

        JonasSantosTAD tadRemovido = (JonasSantosTAD) inicio.getTad();
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = (JonasSantosElemento) inicio.getNext();
            inicio.setPrevious(null);
        }
        quantidade--;

        return tadRemovido;
    }

    @Override
    public ITAD removerNoFim() {
        if (inicio == null) return null;

        JonasSantosTAD tadRemovido = (JonasSantosTAD) fim.getTad();
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            fim = (JonasSantosElemento) fim.getPrevious();
            fim.setNext(null);
        }
        quantidade--;

        return tadRemovido;
    }

    @Override
    public ITAD removerNoMeio(int posicao) {
        if (posicao < 1 || posicao > quantidade) return null;


        if (posicao == 0) {
            removerNoInicio();
            return null;
        }

        JonasSantosElemento aux = inicio;
        int cursor = 1;
        while (cursor < posicao) {
            aux = (JonasSantosElemento) aux.getNext();
            cursor++;
        }

        ITAD tadRemovido = aux.getTad();
        JonasSantosElemento previous = (JonasSantosElemento) aux.getPrevious();
        JonasSantosElemento next = (JonasSantosElemento) aux.getNext();

        if (previous != null) {
            previous.setNext(next);
        }
        if (next != null) {
            next.setPrevious(previous);
        }

        quantidade--;

        return tadRemovido;
    }

    @Override
    public ITAD get(int posicao) {
        if(posicao >= quantidade - 1 ) return null;

        JonasSantosElemento aux = null;
        int doInicio = posicao - 0;
        int doFim = quantidade - posicao;

        if (doInicio < doFim) {
            System.out.println("pelo início");
            aux = inicio;
            int cursor = 1;
            while (cursor < posicao) {
                aux = (JonasSantosElemento) aux.getNext();
                cursor++;
            }
        } else {
            System.out.println("pelo fim");
            aux = fim;
            int cursor = quantidade - 1;
            while (cursor > posicao) {
                aux = (JonasSantosElemento) aux.getPrevious();
                cursor--;
            }
        }

        return aux.getTad();

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
