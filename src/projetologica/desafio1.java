package projetologica;

import java.util.Scanner;

public class desafio1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b;
        System.out.println("Informe um numero inteiro");
        a = ler.nextInt();
        System.out.println("Informe o segundo numero");
        b = ler.nextInt();

        if (a == b) {
            System.out.println("INFORME DOIS NUMÉROS DIFERENTES! BURRO!");
        }

        if (a > b) {
            System.out.println("O numero maior é " + a);
        }

        if (a < b) {
            System.out.println("O numero maior é " + b);
        }

    }
}
