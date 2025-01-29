package Aula_3;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    
        System.out.println("qual e a sua idade?");
            int idade = scan.nextInt();
            
        if (idade < 12){
            System.out.println("voce e uma crianca");
        }
        else if (idade >= 12 && idade < 18){
            System.out.println("voce e um adolescente");
        }
        else if (idade >=18 && idade <= 60){
            System.out.println("voce e um adulto");
        }
        

    
    
    
    
    
}}
