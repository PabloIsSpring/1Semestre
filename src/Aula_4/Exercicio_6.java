package Aula_4;

import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
    int soma = 0;
    int result = 0;
    
        for(int i = 0; i < 20; i++){
            System.out.println("digite suas idades");
            soma = scan.nextInt();
            result = result + soma;
            
        }
        
        System.out.println("a soma das idades e "+ result);
    
    
    
    
}}
