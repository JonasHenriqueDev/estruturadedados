package br.mendonca.trabalho09.estruturas;

import br.mendonca.trabalho09.ITAD;
import br.mendonca.trabalho09.ITrabalho09;
import br.mendonca.trabalho09.elementos.JonasSantosElemento;

public class JonasSantosEstrutura implements ITrabalho09 {

    private JonasSantosElemento cursor;
    private int quantidade = 0;
    @Override
    public String getAluno() {
        return "Jonas Henrique da Silva Santos";
    }

    @Override
    public int getQuantidade() {
        return 0;
    }

    @Override
    public Object getLista() {
        return null;
    }

    @Override
    public void inserirAntes(ITAD tad) {
        JonasSantosElemento novo = new JonasSantosElemento();
        novo.setTad (tad);

        if (cursor == null) {
            cursor = novo;
            cursor.setNext (novo);
            cursor.setPrevious (novo);
        } else {
            novo.setNext(cursor);
            novo.setPrevious(cursor.getPrevious());
            JonasSantosElemento anterior = (JonasSantosElemento) cursor.getPrevious();
            anterior.setNext(novo);
            cursor.setPrevious(novo);
        }
        quantidade++;
    }

    @Override
    public void inserirDepois(ITAD tad) {

    }

    @Override
    public void deslocarCursor(int posicao) {

    }

    @Override
    public ITAD removerAntes() {
        return null;
    }

    @Override
    public ITAD removerDepois() {
        return null;
    }

    @Override
    public ITAD getAtual() {
        return null;
    }

    @Override
    public ITAD get(int posicao) {
        return null;
    }

    @Override
    public String print() {
        return null;
    }
}
