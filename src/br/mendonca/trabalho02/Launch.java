package br.mendonca.trabalho02;

import br.mendonca.trabalho02.estruturas.JonasSantosEstrutura;
import br.mendonca.trabalho02.tads.JonasSantosTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JonasSantosEstrutura listaEncadeada = new JonasSantosEstrutura();

		JonasSantosTAD elemento1 = new JonasSantosTAD();
		JonasSantosTAD elemento2 = new JonasSantosTAD();
		JonasSantosTAD elemento3 = new JonasSantosTAD();

		listaEncadeada.inserirNoInicio(elemento1);
		listaEncadeada.inserirNoFim(elemento2);
		listaEncadeada.inserirNoFim(elemento3);

		System.out.println(listaEncadeada.print());
	}

}
