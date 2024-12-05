package classes;

import java.util.ArrayList;

public class Log {
    private Double notaAtual;
    private ArrayList<Double> notaAnterior;
    private String nomeCoordenador;

    public Log(String string, Double notaAnterior, double novaNota) {}

    public Log(String nomeCoordenador, ArrayList<Double> notaAnterior, Double notaAtual) {
        this.nomeCoordenador = nomeCoordenador;
        this.notaAnterior = notaAnterior;
        this.notaAtual = notaAtual;
    }

    public Double getNotaAtual() {
        return notaAtual;
    }

    public void setNotaAtual(Double notaAtual) {
        this.notaAtual = notaAtual;
    }

    public ArrayList<Double> getNotaAnterior() {
        return notaAnterior;
    }

    public void setNotaAnterior(ArrayList<Double> notaAnterior) {
        this.notaAnterior = notaAnterior;
    }

    public String getNomeCoordenador() {
        return nomeCoordenador;
    }

    public void setNomeCoordenador(String nomeCoordenador) {
        this.nomeCoordenador = nomeCoordenador;
    }
}
