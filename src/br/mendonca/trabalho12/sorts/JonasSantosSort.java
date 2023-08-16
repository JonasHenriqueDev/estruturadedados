package br.mendonca.trabalho12.sorts;

import br.mendonca.trabalho12.ISort;
import br.mendonca.trabalho12.ITAD;
import br.mendonca.trabalho12.ITrabalho12;

public class JonasSantosSort implements ISort {
    @Override
    public String getAluno() {
        return "Jonas Henrique da Silva Santos";
    }

    @Override
    public void insert(ITrabalho12 lista) {
        for(int i = 0; i < lista.getQuantidade(); i++) {
            for(int j = i; j > 0; j--) {
                if(lista.getItem(j).getDouble() < lista.getItem(j - 1).getDouble()) {
                    ITAD aux = lista.getItem(j - 1);
                    lista.setItem(lista.getItem(j), j - 1);
                    lista.setItem(aux, j);
                }
            }
        }
    }
}
