package br.mendonca.trabalho01;

import br.mendonca.trabalho01.estrutura.JonasSantosEstrutura;
import br.mendonca.trabalho01.tads.JonasSantosTAD;

public class Launch {

	public static void main(String[] args) {
		JonasSantosTAD tad;
		JonasSantosEstrutura estrutura = new JonasSantosEstrutura(10);

		for (int i = 0; i < 3; i++) {
			estrutura.inserirNoFim(new JonasSantosTAD());
		}



	}

}
