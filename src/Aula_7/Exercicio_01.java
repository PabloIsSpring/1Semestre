package Aula_7;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int numeros[] = new int[5];
        
        for(int i = 0; i < 5; i++){
            System.out.println("Digite um numero");
            numeros[i] = scan.nextInt();
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println("numero "+ (i + 1) +": "+ numeros[i]);
        }
    }
    
}
