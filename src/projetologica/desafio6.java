
package projetologica;

import java.util.Scanner;


public class desafio6 {
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double a;

        System.out.println("Informe um numero fracionário");
        a = ler.nextDouble();

        if (a >= 0) {
            System.out.println("RECEBA A RAIZ QUADRADA: " + Math.sqrt(a));

        } else {

            System.out.println("RECEBA ELE AO QUADRADO: " + a * a);

        }

    }

    
}
