package Aula_5;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int impar = 0;
        int par = 0;

        System.out.println("Diga a quantidade de numeros que voce deseja digitar");
        int nm1 = scan.nextInt();

        for (int i = 0; i < nm1; i++) {
            System.out.println("Numero " + (i + 1) + ":");
            int nm2 = scan.nextInt();

            int result = nm2 % 2;

            switch(result){
                case 0:
                    par += nm2;
                    break;
                case 1:
                    impar += nm2;
                    break;
            }

        }
        System.out.println("A soma dos numeros impares digitados e: "+ impar +"\nA soma dos numeros pares digitados"
                + " e: "+par);
    }

}
