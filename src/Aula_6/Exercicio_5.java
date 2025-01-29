package Aula_6;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nm1 = 2;
        int a025 = 0;
        int a2650 = 0;
        int a5175 = 0;
        int a76100 = 0;
        
        System.out.println("Esse algoritmo le quantos numeros voce digitou entre certos intervalor,"
                + " se for digitado um valor negativo ou maior que 100, o algoritmo encerra.");

        while (nm1 <= 100 & nm1 >= 0) {
            System.out.println("Digite um numero:");
            nm1 = scan.nextInt();

            if (nm1 >= 0 & nm1 <= 25) {
                ++a025;
            } else if (nm1 >= 26 & nm1 <= 50) {
                ++a2650;
            } else if (nm1 >= 51 & nm1 <= 75) {
                ++a5175;
            } else if (nm1 >= 76 & nm1 <= 100) {
                ++a76100;
            }
        }
        System.out.println("# Voce digitou um valor maior que 100 ou negativo, algoritmo encerrado... #");
        
        System.out.println("Voce digitou "+ a025 +" numeros entre o intervalo [0-25]."
                + "\nVoce digitou "+ a2650 +" numeros entre o intervalo [26-50]."
                + "\nVoce digitou "+ a5175 +" numeros entre o intervalo [51-75]."
                + "\nVoce digitou "+ a76100 +" numeros entre o intervalo [76-100].");
    }

}
