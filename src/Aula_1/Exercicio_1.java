package Aula_1;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        System.out.println("fale um numero");
              float nm1 = scan.nextFloat();
          
        System.out.println("fale outro numero");
                 float nm2 = scan.nextFloat();
                 float result = nm1 + nm2;
                 float sub = nm1 - nm2;
                 float mult = nm1 * nm2;
                 float div = nm1 / nm2;
                 
        System.out.println("o resultado da soma e"+" "+result);
        System.out.println("o resultado da subtracao e"+" "+sub);
        System.out.println("o resultado da multiplicacao e"+" "+mult);
        System.out.println("o resultado da divisao e"+" "+div);
    }
    
}
