package Aula_4;

import java.util.Scanner;

public class Exercicio_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;

        System.out.println("digite 10 numeros");
        for (int i = 0; i < 10; i++) {
            System.out.println("numero " + (1 + i) + ":");
            int num = scan.nextInt();

            if (num > 0) {
                ++cont1;
            } else if (num == 0) {
                ++cont2;
            } else {
                ++cont3;
            }
        }

        System.out.println(cont1 + " sao positivos, " + cont2 + " sao zeros e " + cont3 + " sao negativos");
    }
}
