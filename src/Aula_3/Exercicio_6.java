package Aula_3;

import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("quanto voce tirou na prova?");
            int nota = scan.nextInt();
            
        if (nota >= 7){
            System.out.println("voce foi aprovado");
        }
        else if (nota >= 5 && nota < 7){
            System.out.println("voce esta de recuperacao");
        }
        else{
            System.out.println("voce foi reprovado");
        }
}}
