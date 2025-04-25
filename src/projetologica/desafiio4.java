package projetologica;

import java.util.Scanner;

public class desafiio4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double maca, valor;

        System.out.println("Quantidade de maça");
        maca = ler.nextDouble();

        if (maca < 12) {
            valor = maca * 1.30;
            System.out.println("Valor total R$ " + valor);
        }

        if (maca >= 12) {
            valor = maca;
            System.out.println("Valor total R$ " + valor);
        }

    }
}
