package Aula_4;

import java.util.Scanner;

public class Exercicio_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int menor = 999999999;
        int maior = 0;
        
        System.out.println("diga 10 numeros");
        for(int i = 0; i < 10; i++){
            System.out.println("numero "+ (1 + i) +":");
                int num = scan.nextInt();
                
            if(num < menor){
                menor = num;
            }else if(num > maior){
                maior = num;
            }
        }

        System.out.println("o maior numero digitado foi "+ maior +", e menor numero e "+ menor);
    
    
    
    
}}
