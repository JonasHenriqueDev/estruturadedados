package br.mendonca.trabalho01.estrutura;

import br.mendonca.trabalho01.ITAD;
import br.mendonca.trabalho01.ITrabalho01;

public class JonasSantosEstrutura implements ITrabalho01 {

    private ITAD[] lista;
    private int quantidade = 0;
    private int maximo;

    public JonasSantosEstrutura(int maximo) {
        this.lista = new ITAD[maximo];
        this.maximo = maximo;
    }

    @Override
    public String getAluno() {
        return "Jonas Henrique da Silva Santos";
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public void inserirNoInicio(ITAD tad) {
        if (quantidade >= maximo) return;

        for(int i = quantidade; i > 0 ; i--) {
            lista[i] = lista[i - 1];
        }
        lista[0] = tad;
        quantidade++;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        if (quantidade >= maximo) return;

        lista[quantidade] = tad;
        quantidade++;
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if (posicao < 0 || posicao > quantidade) return;

        if (quantidade + 1 > maximo) return;

        for (int i = quantidade; i > posicao; i--) {
            lista[i] = lista[i - 1];
        }
        lista[posicao] = tad;
        quantidade++;
    }

    @Override
    public void excluirNoFim() {
        if (quantidade == 0) return; // Lista vazia, não há nada para excluir

        lista[quantidade - 1] = null; // Marca o último elemento como null para excluir
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
        if (posicao < 0 || posicao >= quantidade) return; // Posição inválida

        // Desloca todos os elementos após a posição uma posição para a esquerda
        for (int i = posicao; i < quantidade - 1; i++) {
            lista[i] = lista[i + 1];
        }
        lista[quantidade - 1] = null; // Marca o último elemento como null para excluir
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
