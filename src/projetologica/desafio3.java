package projetologica;

import java.util.Scanner;

public class desafio3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int gol1, gol2;
        String time1, time2;

        System.out.println("Informe o nome do primeiro time");
        time1 = ler.nextLine();
        System.out.println("Informe o nome do segundo time");
        time2 = ler.nextLine();
        System.out.println("Imforme a quantidade de gols do primeiro time");
        gol1 = ler.nextInt();
        System.out.println("Informe a quantidade de gols do segundo time");
        gol2 = ler.nextInt();

        if (gol1 > gol2) {
            System.out.println("Vitoria do " + time1);
        }

        if (gol1 < gol2) {
            System.out.println("Vitoria do " + time2);
        }

        if (gol1 == gol2) {
            System.out.println("Empate entre os times");
        }

    }
}
