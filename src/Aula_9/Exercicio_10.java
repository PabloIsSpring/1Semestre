/*Escreva um algoritmo que leia um vetor de n elementos inteiros. Ordene o valor em ordem decrescente e exiba-o*/
package Aula_9;

import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num = 0;
        
        System.out.println("Deseja digitar ume sequencia de quantos numeros?");
        num = scan.nextInt();
        
        int sequencia[] = new int[num];
        
        for(int i = 0; i < num; i++){
            System.out.println("Digite o numero "+(i + 1)+" da sequencia:");
            sequencia[i] = scan.nextInt();
        }
        
        
        for(int i = 0; i < num - 1; i++){
            for(int j = 0; j < num - 1 - i; j++){
                if(sequencia[j] < sequencia [j + 1]){
                    int temp = 0;
                    
                    temp = sequencia[j];
                    sequencia[j] = sequencia [j + 1];
                    sequencia[j + 1] = temp;
                }
            }
        }
        
        System.out.println("A ordem decrescente da sua sequencia digitada é:");
        
        for(int i = 0; i < num; i++){
            System.out.println(sequencia[i]);
        }
    }
    
}
