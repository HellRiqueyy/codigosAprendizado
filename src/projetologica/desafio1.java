package projetologica;

import java.util.Scanner;

public class desafio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double a;

        System.out.println("Informe um numero positivo:");
        a = ler.nextDouble();

        if (a < 0) {
            System.out.println("informe um numero valido");
            return;
        }

        System.out.println("RECEBA A RAIZ QUADRADA: " + Math.sqrt(a));

    }

}
