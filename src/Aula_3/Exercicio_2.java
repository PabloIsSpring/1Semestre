package Aula_3;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
     
    Scanner scan = new Scanner (System.in);
    
        System.out.println("fale um numero");
            int nm1 = scan.nextInt();
            
        if (nm1 > 0){
            System.out.println("seu numero e positivo"); 
        }
        else if (nm1 == 0){
            System.out.println("seu numero e igual a zero");
        }
        else{
            System.out.println("seu numero e negativo");
        }
    
    
}}
