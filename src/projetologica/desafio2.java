package projetologica;

import java.util.Scanner;

public class desafio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a;

        System.out.println("Informe um número inteiro");
        a = ler.nextInt();

        if (a % 2 == 0) {
            System.out.println("Seu número " + a + " é par");
        }

        if (a % 2 != 0) {
            System.out.println("Seu número " + a + " é impar");
        }
//mudar para else depois em vez de 2 if
    }
}
