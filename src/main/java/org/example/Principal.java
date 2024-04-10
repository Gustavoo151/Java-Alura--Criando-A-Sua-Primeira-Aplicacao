package org.example;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Poderoso chefão");
        meuFilme.setAnoLacamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        System.out.println(meuFilme.toString());
    }
}
