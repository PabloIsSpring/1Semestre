package Aula_3;

import java.util.Scanner;

public class Exercicio_9 {

    public static void main(String[] args) {
        
    Scanner scan = new Scanner (System.in);
    
        System.out.println("qual a sua altura?");
            float altura = scan.nextFloat();
            
        System.out.println("quantos quilogramas voce pesa?");
            float peso = scan.nextFloat();
            
        System.out.println("qual a sua idade?");
            int idade = scan.nextInt();
            
            
        if(altura < 1.65){
            System.out.println("voce foi reprovado");
        }
        else if(peso > 100){
            System.out.println("voce foi reprovado");
        }
        else if(idade < 18 && idade > 35){
            System.out.println("voce foi reprovado");
        }
        else{
            System.out.println("voce foi aprovado no programa espacial");
        }
                   
    
    
    } 
}
