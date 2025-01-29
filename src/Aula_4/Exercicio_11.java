package Aula_4;

import java.util.Scanner;

public class Exercicio_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite algum numero");
            int num = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            int result = num * i;

            System.out.println(num + " x " + i + " = " + result);
        }

    }
}
