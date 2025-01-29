package Aula_4;

import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;

        System.out.println("diga 20 numeros");

        for (int i = 0; i < 20; i++) {
            System.out.println("numero " + (1 + i) + ":");
            int num = scan.nextInt();
            if (num <= 100 && num >= 0) {
                ++cont;
            }
        }
        System.out.println("a quantidade de numeros entre 0 e 100 e: "+cont);
    }
}
