package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Scream Match");
        System.out.println("Filme Top Gun");

        int anoDeLacamento = 2020;
        System.out.println("Ano de lançamento" + anoDeLacamento);

        boolean incluidoNoPlano = true;
        double nota = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Media do Filme: " + media);

        String sinopse;
        sinopse = "Filme de aventura com galãm dos anos 80";
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media/2);  // Isso é usado para fazer o casting da valores nesse caso estamos transformando um double em um int
        System.out.println("Classificação: " + classificacao);
    }
}