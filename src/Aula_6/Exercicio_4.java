package Aula_6;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float valor1 = 1;
        float media = 0;
        float cont1 = 0;
        float valorTotal = 0;
        float parImpar = 0;
        float result = 0;

        while (valor1 != 0) {
            System.out.println("Digite um numero");
            valor1 = scan.nextFloat();

            cont1 = valor1;
            parImpar = valorTotal % 2;

            if (parImpar == 0) {
                valorTotal += cont1;
                ++media;
            }
        }
        media = media - 1;
        result = valorTotal / media;
        System.out.println("a media de todos os numeros digitado e: " + result);
    }

}
