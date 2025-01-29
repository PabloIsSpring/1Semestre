package Aula_4;

import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;

        System.out.println("diga sua idade");
        for (int i = 0; i < 20; i++) {
            System.out.println("idade" + (1 + i) + ":");
            int idade = scan.nextInt();
            if (idade >= 18) {
                ++cont;
            }
        }
        System.out.println("o numero de pessoas maiores de idade e: " + cont);
    }
}
