package Aula_2;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
            System.out.println("Digite algum numero");
                  int num = scan.nextInt();
                  int z = num;
            
            System.out.println("o sucessor desse numero e "+ ++num);
                  int x = --z;
            System.out.println("e o antecessor desse numero e "+ x);
    }
    
}
