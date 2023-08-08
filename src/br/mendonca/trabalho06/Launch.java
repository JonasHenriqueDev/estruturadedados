package br.mendonca.trabalho06;

import br.mendonca.trabalho06.estruturas.JonasSantosEstrutura;
import br.mendonca.trabalho06.tads.JonasSantosTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JonasSantosEstrutura pilha = new JonasSantosEstrutura();
		JonasSantosTAD tad;

		for(int i = 0; i < 3; i++) {
			tad = new JonasSantosTAD();
			System.out.println("Elemento adicionado: " + tad.print());
			pilha.push(tad);
		}
		System.out.println("---------------------------------------------------------");
		System.out.println(pilha.print());
		System.out.println("---------------------------------------------------------");
		tad = (JonasSantosTAD) pilha.pop();
		System.out.println("Elemento removido: " + tad.print());
	}

}
