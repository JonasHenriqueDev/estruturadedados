package br.mendonca.trabalho13.estruturas;

import br.mendonca.trabalho13.ITAD;
import br.mendonca.trabalho13.ITrabalho13;
import br.mendonca.trabalho13.tads.JonasSantosTAD;

public class JonasSantosEstrutura implements ITrabalho13 {

    private int quantidade = 0;
    private JonasSantosTAD[] lista;

    public JonasSantosEstrutura(int tamanho) {
        lista = new JonasSantosTAD[tamanho];
    }
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
        if (quantidade >= lista.length) return;

        for(int i = quantidade; i > 0 ; i--) {
            lista[i] = lista[i - 1];
        }
        lista[0] = (JonasSantosTAD) tad;
        quantidade++;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        if (quantidade >= lista.length) return;

        lista[quantidade] = (JonasSantosTAD) tad;
        quantidade++;
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (posicao < 0 || posicao > quantidade) return;

        if (quantidade + 1 > lista.length) return;

        for (int i = quantidade; i > posicao; i--) {
            lista[i] = lista[i - 1];
        }
        lista[posicao] = (JonasSantosTAD) tad;
        quantidade++;
    }

    @Override
    public void excluirNoFim() {
        if (quantidade == 0) return;

        lista[quantidade - 1] = null;
        quantidade--;
    }

    @Override
    public void excluirNoInicio() {
        if (quantidade == 0) return;

        for (int i = 0; i < quantidade - 1; i++) {
            lista[i] = lista[i + 1];
        }
        lista[quantidade - 1] = null;
        quantidade--;
    }

    @Override
    public void excluirNoMeio(int posicao) {
        if (posicao < 0 || posicao >= quantidade) return;

        for (int i = posicao; i < quantidade - 1; i++) {
            lista[i] = lista[i + 1];
        }
        lista[quantidade - 1] = null;
        quantidade--;
    }

    @Override
    public ITAD getItem(int posicao) {
        if (posicao < 0 || posicao >= quantidade) return null;

        return lista[posicao];
    }

    @Override
    public void setItem(ITAD tad, int posicao) {
        if (posicao < 0 || posicao >= quantidade) return;

        lista[posicao] = (JonasSantosTAD) tad;
    }

    @Override
    public String print() {
        String str = "";
        for (int i = 0; i < quantidade; i++) {
            str += i + 1 + ". \n";
            str += lista[i].print() + "\n\n";
        }
        return str;
    }
}
