package Aula_3;

import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner (System.in);
        
        System.out.println("diga um numero");
            int nm1 = scan.nextInt();
        
        System.out.println("diga o segundo numero");
            int nm2 = scan.nextInt();
        
        System.out.println("diga o ultimo numero agora");
            int nm3 = scan.nextInt();
            
        if (nm1 > nm2 && nm2 > nm3){
            System.out.println(nm1);
            System.out.println(nm2);
            System.out.println(nm3);
        }
        else if (nm1 > nm3 && nm3 > nm2){
            System.out.println(nm1);
            System.out.println(nm3);
            System.out.println(nm2);
        }
        else if (nm2 > nm1 && nm1 > nm3){
            System.out.println(nm2);
            System.out.println(nm1);
            System.out.println(nm3);
        }
        else if (nm2 > nm3 && nm3 > nm1){
            System.out.println(nm2);
            System.out.println(nm3);
            System.out.println(nm1);
        }
        else if (nm3 > nm2 && nm2 > nm1){
            System.out.println(nm3);
            System.out.println(nm2);
            System.out.println(nm1);
        }
        else if (nm3 > nm1 && nm1 > nm2){
            System.out.println(nm3);
            System.out.println(nm1);
            System.out.println(nm2);
        }
   
}}
