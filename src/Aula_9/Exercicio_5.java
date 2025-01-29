package Aula_9;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int masc = 0;
        int fem = 0;
        int option = 0;
        double[] alturaFem = new double[5];
        double[] alturaMasc = new double[5];
        double maxAlturaF = 0;
        double maxAlturaM = 0;
        double mediaAlturaFem = 0;
        int sexoMaisAlto = 0;
        double[] menorAltura = new double[2];
        double menorAlturaT = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Qual seu sexo?");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("E qual a sua altura?");
                    alturaMasc[masc] = scan.nextDouble();
                    masc++;
                    break;

                case 2:
                    System.out.println("E qual sua altura?");
                    alturaFem[fem] = scan.nextDouble();
                    fem++;
                    break;

                default:
                    System.out.println("Opção invalida.");
                    break;
            }
        }

        for (int i = 0; i < fem; i++) {
            mediaAlturaFem += alturaFem[i];
            mediaAlturaFem = mediaAlturaFem / fem;
        }

        for (int i = 0; i < masc; i++) {
            if (alturaMasc[i] > maxAlturaM) {
                maxAlturaM = alturaMasc[i];
            }
        }

        for (int i = 0; i < fem; i++){
            if (alturaFem[i] > maxAlturaF){
                maxAlturaF = alturaFem[i];
            }
        }

        if (maxAlturaM > maxAlturaF){
            sexoMaisAlto = 1;
        } else {
            sexoMaisAlto = 2;
        }

        menorAltura[0] = 500;
        menorAltura[1] = 500;

        for (int i = 0; i < masc; i++){
            if(menorAltura[0] > alturaMasc[i]){
                menorAltura[0] = alturaMasc[i];
            }
        }

        for(int i = 0; i < fem; i++){
            if (menorAltura[1] > alturaFem[i]){
                menorAltura[1] = alturaFem[i];
            }
        }

        if (menorAltura[0] < menorAltura[1]){
            menorAlturaT = menorAltura[0];
        } else {
            menorAlturaT = menorAltura[1];
        }

        System.out.println("E a menor altura é "+ menorAlturaT);
        System.out.println("O sexo mais alto e: "+ sexoMaisAlto);
        System.out.println("A quantidade de homens é: "+ masc);
        System.out.println("A menor mulher tem, de altura: "+ mediaAlturaFem);
    }
    
}
