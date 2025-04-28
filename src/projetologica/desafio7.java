package projetologica;

import java.util.Scanner;

public class desafio7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double altura;
        String sexo;
        Boolean r;

        System.out.println("Informe seu sexo, M ou F");
        sexo = ler.nextLine();

        if (sexo.equals("M") || sexo.equals("F")) {
        } else {
            System.out.println("TE DECLARO DON COMEDIA!");
            return;
        }

        System.out.println("Informe seu altura em metros");
        altura = ler.nextDouble();

        if (sexo.equals("F")) {

            System.out.println("Seu peso ideal: " + ((62.1 * altura) - 44.7)+"Kg");

        } else {

            System.out.println("Seu peso ideal: " + ((72.7 * altura) - 58)+"Kg");

        }

    }

}
