package Aula_6;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        float cont1 = 0;
        float cont2 = 0;
        float nm1 = 0;
        float result = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Vou calcular a media dos numeros que voce digitar ate vir um numero negativo");

        while (nm1 >= 0) {
            System.out.println("Digite um numero: ");
            nm1 = scan.nextFloat();
            if (nm1 >= 0) {
                cont1 += nm1;
                ++cont2;
            }
        }
        result = cont1 / cont2;
        
        System.out.println("A media dos numeros digitados e: "+ result);

    }

}
