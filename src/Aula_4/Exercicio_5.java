package Aula_4;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        
        int soma = 0;
       
        System.out.println("Digite 10 numeros");
        for (int i = 0; i < 10; i++) {
            System.out.println("numero" + (1 + i) + ":");
            int nm = scan.nextInt();
            soma += nm;
        }
        System.out.println("A soma dos numeros e " + soma);
    }

}
