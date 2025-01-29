package Aula_4;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("digite seu nome");
            String nome = scan.nextLine();
        System.out.println("digite algum numero agora");
            int num = scan.nextInt();
            
        for(int i = 1; i <= num; i++){
            System.out.println(nome);
        }

    
    
    
}}
