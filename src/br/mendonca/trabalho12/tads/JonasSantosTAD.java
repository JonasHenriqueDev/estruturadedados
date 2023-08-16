package br.mendonca.trabalho12.tads;

import br.mendonca.trabalho12.ITAD;

import java.util.Random;

public class JonasSantosTAD implements ITAD {
    /**
     * Aluno: Jonas Henrique da Silva Santos
     * Planta escolhida: Cymbopogon.
     *
     * Cymbopogon é um género botânico pertencente à família Poaceae,
     * subfamília Panicoideae, tribo Andropogoneae.
     * Neste gênero encontram-se a citronela e o capim limão.
     */

    private String planta;
    private double alturaPlanta;
    private boolean repelenteInsetos;

    public JonasSantosTAD() {
        String[] plantas = {
                "Capim-santo",
                "Capim-limão",
                "Erva-cidreira",
                "Chá-de-estrada",
                "Capim-cidreira",
                "Capim-cheiroso",
                "Capim-cidró",
                "Capim-cidrão",
                "Capim-limão-verdadeiro",
                "Capim-de-cheiro",
                "Capim-santo-de-cheiro",
                "Capim-cidreira-do-gado",
                "Capim-limão-mirim",
                "Capim-limão-cimarrão",
                "Capim-catinga",
                "Capim-membeca"
        };

        Random r = new Random();

        this.planta = plantas[r.nextInt(plantas.length)] + ", " +
                plantas[r.nextInt(plantas.length)] + ", " +
                plantas[r.nextInt(plantas.length)];
        this.alturaPlanta = r.nextInt(1, 3) + r.nextDouble();
        this.repelenteInsetos = r.nextBoolean();
    }

    @Override
    public String getString() {
        return planta;
    }

    @Override
    public void setString(String name) {
        this.planta = name;
    }

    @Override
    public double getDouble() {
        return alturaPlanta;
    }

    @Override
    public void setDouble(double value) {
        this.alturaPlanta = value;
    }

    @Override
    public boolean isBoolean() {
        return repelenteInsetos;
    }

    @Override
    public void setBoolean(boolean bit) {
        this.repelenteInsetos = bit;
    }

    @Override
    public String print() {
        return
                "Nome: " + planta + "\n" +
                "Altura da planta: " + alturaPlanta + " m\n" +
                "Repelente de insetos? " + (isBoolean() ? "Sim" : "Não");
    }
}
