package br.mendonca.trabalho05.estruturas;

import br.mendonca.trabalho05.tads.JonasSantosTAD;
import br.mendonca.trabalho05.ITAD;
import br.mendonca.trabalho05.ITrabalho05;

public class JonasSantosEstrutura implements ITrabalho05 {

    private JonasSantosTAD[] pilha;
    private int quantidade = 0;

    public JonasSantosEstrutura(int tamanho) {
        this.pilha = new JonasSantosTAD[tamanho];
    }

    @Override
    public String getAluno() {
        return "Jonas Henrique da Silva Santos";
    }

    @Override
    public Object[] getLista() {
        return pilha;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void push(ITAD tad) {
        if (quantidade == pilha.length) return;

        pilha[quantidade] = (JonasSantosTAD) tad;
        quantidade ++;
    }

    @Override
    public ITAD pop() {
        if (quantidade == 0) return null;

        JonasSantosTAD top = pilha[quantidade - 1];
        quantidade --;

        return top;
    }

    @Override
    public ITAD get(int posicao) {
        return pilha[quantidade -1];
    }

    @Override
    public String print() {
        String str = "";
        for (int i = 0; i < quantidade; i++) {
            str += i + 1 + ". \n";
            str += pilha[i].print() + "\n\n";
        }
        return str;
    }
}
