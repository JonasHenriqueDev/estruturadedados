package br.mendonca.trabalho03;

public interface ITrabalho03 {

	String getAluno();
	
	Object[] getLista();

	int getQuantidade();

	void enqueue(ITAD tad);

	ITAD dequeue();

	ITAD get(int posicao);

	String print();

}