package Aula_3;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner (System.in);
    
           System.out.println("fale um numero");
                int nm1 = scan.nextInt();
                
           System.out.println("fale outro numero agora");
                int nm2 = scan.nextInt();
                
           if (nm1 > nm2){
               System.out.println("o "+ nm1 +" e maior que "+ nm2);
           }
           else if (nm1 == nm2){
               System.out.println("o "+ nm1 +" e igual ao "+ nm2);
           }
           else{
               System.out.println("o "+ nm2 +" e o maior que "+ nm1);
           }
                
}}
