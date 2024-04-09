package org.example;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLacamento = 2022;
        boolean incluidoNoPlano = true;
        double nota = 8.1;
        String tipoPlano = "plus";

        if (anoDeLacamento >= 2022){
            System.out.println("Lançamento que os cliente estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Deve pagar a locação");
        }
    }
}
