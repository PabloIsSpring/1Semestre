package Aula_3;

import java.util.Scanner;

public class Exercicio_10 {

    public static void main(String[] args) {
       
    Scanner scan = new Scanner (System.in);
        
        System.out.println("digite um numero");
            int nm1 = scan.nextInt();
            
        int nm2 = nm1%3;
        int nm3 = nm1%2;
        
        if (nm2 == 0 && nm3 == 00){
            System.out.println("o numero "+ nm1 +" e multiplo de 3, e par");
        }
        else if (nm2 == 1 && nm3 == 0){
            System.out.println("o numero "+ nm1 + " nao e multiplo de 3, mas e par");
        }
        else if (nm2 == 0 && nm3 == 1){
            System.out.println("o numero "+ nm1 +" e multiplo de 3, mas nao e par");
        }
        else if (nm2 == 1 && nm3 == 1){
            System.out.println("o numero "+ nm1 +" nao e multiplo de 3, nem e par");
        }
    
}}
