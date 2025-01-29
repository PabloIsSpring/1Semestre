package Aula_7;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um numero");
            numeros[i] = scan.nextInt();
        }
        
        System.out.println("A ordem inversa dos numeros digitados foi:");
        
        for (int i = 9; i >= 0; i--) {
            System.out.println("numero "+ (i + 1) +": "+ numeros[i]);
        }
    }

}
