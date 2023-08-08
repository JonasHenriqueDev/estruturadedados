package br.mendonca.trabalho04;

import br.mendonca.trabalho04.estruturas.JonasSantosEstrutura;
import br.mendonca.trabalho04.tads.JonasSantosTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JonasSantosEstrutura fila = new JonasSantosEstrutura();


		JonasSantosTAD tad = null;
		for (int i = 0; i < 10; i++) {
			tad = new JonasSantosTAD();
			System.out.println("Elemento adicionado: " + i + tad.print());
			fila.enqueue(tad);
		}

		fila.dequeue();

		System.out.println("Elemento removido: " + tad.print());

		System.out.println("-------------------------------------------------");
		for (int i = 0; i < 10; i++) {
			JonasSantosTAD tad2 = new JonasSantosTAD();
			System.out.println("Elemento adicionado: " + i + tad2.print());
			fila.enqueue(tad2);
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println(fila.print());
	}

}
