package Aula_4;

import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {
    
    Scanner scan = new Scanner (System.in);
        float soma = 0;
        
        float media = 0;
        
        System.out.println("Digite 10 idades");
        for(float i = 0; i < 20; i++){
            System.out.println("idade "+ (1 + i) +" :");
            float nm = scan.nextFloat();
            soma += nm;
            
            media = soma/i;
        }
        
        System.out.println("a media das idades e "+ media);
    
    
    
}}
