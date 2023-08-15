package br.mendonca.trabalho10.estruturas;

import br.mendonca.trabalho10.tads.JonasSantosTAD;
import br.mendonca.trabalho10.ITAD;
import br.mendonca.trabalho10.ITrabalho10;

public class JonasSantosEstrutura implements ITrabalho10 {

    private JonasSantosTAD[] lista;
    private int quantidade = 0;
    private int tamanho;

    public JonasSantosEstrutura(int tamanho) {
        lista = new JonasSantosTAD[tamanho];
        this.tamanho = tamanho;
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
        if (quantidade >= tamanho) return;

        for(int i = quantidade; i > 0 ; i--) {
            lista[i] = lista[i - 1];
        }
        lista[0] = (JonasSantosTAD) tad;
        quantidade++;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        if (quantidade >= tamanho) return;

        lista[quantidade] = (JonasSantosTAD) tad;
        quantidade++;
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (posicao < 0 || posicao > quantidade) return;

        if (quantidade + 1 > tamanho) return;

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
    public String print() {
        String str = "";
        for (int i = 0; i < quantidade; i++) {
            str += i + 1 + ". \n";
            str += lista[i].print() + "\n\n";
        }
        return str;
    }
}
