package projetologica;

import java.util.Scanner;

public class desafio5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota1, nota2;

        System.out.println("Informe a primeira nota");
        nota1 = ler.nextDouble();
        System.out.println("Informa a segunda nota");
        nota2 = ler.nextDouble();

        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
            System.out.println("Media das notas: " + (nota1 + nota2) / 2);

        } else {
            System.out.println("INFORME NOTAS VALIDAS");
            return;
        }
    }

}
