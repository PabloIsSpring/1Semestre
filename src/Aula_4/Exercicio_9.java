package Aula_4;

import java.util.Scanner;

public class Exercicio_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont = 0;
        int cont2 = 0;

        System.out.println("diga 20 numeros");

        for (int i = 0; i < 20; i++) {
            System.out.println("numero " + (1 + i) + ";");
            int num = scan.nextInt();

            int result = num % 2;

            if (result == 0) {
                ++cont;
            } else {
                ++cont2;
            }
        }
        System.out.println("a quantidade de numeros pares e " + cont + " e impares " + cont2);
    }
}
