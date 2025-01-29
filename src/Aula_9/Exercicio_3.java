package Aula_9;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double[] lados = new double[3];
        String triangulo = null;

        System.out.println("Digite os lados de um triangulo, que eu vou te falar se ele é um equilátero," +
                " isóceles ou triângulo retângulo.");

        for(int i = 0; i < 3; i++){
            System.out.println("lado "+ (i + 1) + ":");
            lados[i] = scan.nextDouble();
        }

        triangulo = triangulo(lados[0], lados [1], lados[2]);

        System.out.println("É um triangulo "+ triangulo);

    }

    public static String triangulo(double l1, double l2, double l3){
        String Triangulo = null;

        if(l1 == l2 && l2 == l3){
            Triangulo = "equilátero";
        } else if (l1 != l2 && l2 != l3 && l1 != l3) {
            Triangulo = "Escaleno";
        } else {
            Triangulo = "Isóceles";
        }

        return Triangulo;
    }

}
    

