package br.mendonca.trabalho15.sorts;

import br.mendonca.trabalho15.ISort;
import br.mendonca.trabalho15.ITrabalho15;
import br.mendonca.trabalho15.tads.JonasSantosTAD;

public class JonasSantosSort implements ISort {
    @Override
    public String getAluno() {
        return "Jonas Henrique da Silva Santos";
    }

    @Override
    public void quick(ITrabalho15 lista, int inicio, int fim) {
        if(fim > inicio){
            int pivo = particiona(lista, inicio, fim);
            quick(lista, inicio, pivo - 1);
            quick(lista, pivo + 1, fim);
        }
    }

    private int particiona(ITrabalho15 lista, int inicio, int fim) {
        int esq = inicio;
        int dir = fim;
        JonasSantosTAD pivo = (JonasSantosTAD) lista.getItem(inicio);

        while (esq < dir) {
            while (lista.getItem(esq).getDouble() <= pivo.getDouble()) {
                esq++;
            }
            while (lista.getItem(dir).getDouble() > pivo.getDouble()) {
                dir--;
            }
            if (esq < dir) {
                JonasSantosTAD aux = (JonasSantosTAD) lista.getItem(esq);
                lista.setItem(lista.getItem(dir), esq);
                lista.setItem(aux, dir);;
            }
        }
        lista.setItem(lista.getItem(dir), inicio);;
        lista.setItem(pivo, dir);;
        return dir;
    }
}
