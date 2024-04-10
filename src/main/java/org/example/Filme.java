package org.example;

public class Filme {
    private String nome;
    private int anoLacamento;
    private boolean incluiNoPlano;
    private double avaliacao;
    private int toltalDeAvalicoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLacamento() {
        return anoLacamento;
    }

    public void setAnoLacamento(int anoLacamento) {
        this.anoLacamento = anoLacamento;
    }

    public boolean isIncluiNoPlano() {
        return incluiNoPlano;
    }

    public void setIncluiNoPlano(boolean incluiNoPlano) {
        this.incluiNoPlano = incluiNoPlano;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getToltalDeAvalicoes() {
        return toltalDeAvalicoes;
    }

    public void setToltalDeAvalicoes(int toltalDeAvalicoes) {
        this.toltalDeAvalicoes = toltalDeAvalicoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", anoLacamento=" + anoLacamento +
                ", incluiNoPlano=" + incluiNoPlano +
                ", avaliacao=" + avaliacao +
                ", toltalDeAvalicoes=" + toltalDeAvalicoes +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
