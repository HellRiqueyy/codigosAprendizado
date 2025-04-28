package projetologica;

import java.text.ChoiceFormat;
import java.util.Scanner;

public class desafio8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota1, nota2, nota3, notaFinal;

        System.out.println("Informe a primeira nota");
        nota1 = ler.nextDouble();

        if (nota1 < 0 || nota1 > 10) {
            System.out.println("informe uma nota valida");
            return;
        }

        System.out.println("Informe a segunda nota");
        nota2 = ler.nextDouble();

        if (nota2 < 0 || nota2 > 10) {
            System.out.println("informe uma nota valida");
            return;
        }

        System.out.println("Informe a terceira nota");
        nota3 = ler.nextDouble();

        if (nota3 < 0 || nota3 > 10) {
            System.out.println("informe uma nota valida");
            return;
        }

        notaFinal = (nota1 + nota2 + nota3 * 2) / 4;

        if (notaFinal >= 70) {
            System.out.println("PARABENS! APROVADO! " + notaFinal);

        } else {
            System.out.println("PARABENS! REPROVADO! " + notaFinal);
        }

    }
}
