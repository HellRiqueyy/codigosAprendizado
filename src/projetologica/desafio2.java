package projetologica;

import java.util.Scanner;

public class desafio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b, c;

        System.out.println("inform um numero inteiro");
        a = ler.nextInt();
        System.out.println("inform um segundo numero inteiro");
        b = ler.nextInt();
        System.out.println("inform um terceiro numero inteiro");
        c = ler.nextInt();

        if (a > b){
            if(a>c){
                System.out.println(a+ " É o maior numero!");
               
            }
        }

        if (b>a){
            if (b>c){
                System.out.println(b+ " É o maior numero!");
            }
        }
        
        if (c>a){
            if(c>b){
                System.out.println(c+" É o maior numero!");
            }
        }
        
    }
}
