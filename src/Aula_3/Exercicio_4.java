package Aula_3;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("quantos graus esta fazendo ai");
            int temp = scan.nextInt();
            
        if(temp > 30){
            System.out.println("ta quente demais");
        }
        else if (temp > 15 && temp <=30){
            System.out.println("ta mornin");
        }
        else{
            System.out.println("ta frio demais");
        }
    
    
}}
