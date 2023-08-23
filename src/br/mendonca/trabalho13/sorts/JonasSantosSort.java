package br.mendonca.trabalho13.sorts;

import br.mendonca.trabalho13.ISort;
import br.mendonca.trabalho13.ITrabalho13;
import br.mendonca.trabalho13.tads.JonasSantosTAD;

public class JonasSantosSort implements ISort {
    @Override
    public String getAluno() {
        return "Jonas Henrique da Silva Santos";
    }

    @Override
    public void selection(ITrabalho13 lista) {
            int menor;

            for(int i = 0; i < lista.getQuantidade()- 1; i++){
                menor = i;
                for(int j = i + 1; j < lista.getQuantidade(); j++){
                    if(lista.getItem(j).getDouble() < lista.getItem(menor).getDouble()){
                        menor = j;
                    }
                }

                if(i != menor){
                    JonasSantosTAD aux = (JonasSantosTAD) lista.getItem(i);
                    lista.setItem(lista.getItem(menor), i);
                    lista.setItem(aux, menor);
                }
            }
    }
}
