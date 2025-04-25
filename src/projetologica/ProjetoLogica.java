package projetologica;

import java.util.Scanner;

public class ProjetoLogica {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int anoNasc, idade;
        String nome;
        boolean r;

        System.out.println("Insira o seu nome");
        nome = ler.nextLine();
        System.out.println("Insira a seu ano de nascimento");
        anoNasc = ler.nextInt();

        idade = 2025 - anoNasc;
        System.out.println(nome + ", você nascido no ano de " + anoNasc);
        if (idade < 18) {
            System.out.println("Você tem " + idade + " anos de idade, é bebê da mamãe!");

        } else {
            System.out.println("Você tem " + idade + " anos de idade, é marmanjo barbado!");
        }
    }

}
