package Aula_6;

import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcaoSexo = 0;
        int contSexoF = 0;
        int contSexoM = 0;
        int contIdadeF = 0;
        int contIdadeM = 0;
        int f18a35 = 0;
        int m18a35 = 0;
        int totalIdadeF = 0;
        int totalIdadeM = 0;
        int mediaIdadeF = 0;
        int mediaIdadeM = 0;
        int contAlturaF = 0;
        int contAlturaM = 0;
        int totalAlturaF = 0;
        int totalAlturaM = 0;
        int mediaAlturaF = 0;
        int mediaAlturaM = 0;

        System.out.println("Qualquer opcao fora de 0 e 1 encerrara o programa.");

        while (opcaoSexo == 1 & opcaoSexo == 0) {
            System.out.println("Informe seu sexo:\n[1] - Masculino\n[2] - Feminino");
            opcaoSexo = scan.nextInt();

            switch (opcaoSexo) {
                case 0:
                    ++contSexoF;

                    System.out.println("Qual a sua idade?");
                    contIdadeF = scan.nextInt();

                    if (contIdadeF >= 18 & contIdadeF <= 35) {
                        ++f18a35;
                    }

                    totalIdadeF += contIdadeF;

                    System.out.println("Qual a sua altura?");
                    contAlturaF = scan.nextInt();
                    totalAlturaF += contAlturaF;

                    break;

                case 1:
                    ++contSexoM;

                    System.out.println("Qual sua idade?");
                    contIdadeM = scan.nextInt();

                    if (contIdadeM >= 18 & contIdadeM <= 35) {
                        ++m18a35;
                    }

                    totalIdadeM += contIdadeM;

                    System.out.println("Qual sua altura?");
                    contAlturaM = scan.nextInt();
                    totalAlturaM += contAlturaM;

                    break;

                default:
                    System.out.println("# Opcao Invalida / Programa Encerrando #");
            }
        }
        mediaIdadeF = totalIdadeF / contSexoF;
        mediaIdadeM = totalIdadeM / contSexoM;
        
        mediaAlturaF = totalAlturaF / contSexoF;
        mediaAlturaM = totalAlturaM / contSexoM;
        
        double percentual = (f18a35 + m18a35) / 100;
        
        System.out.println("A media de idade do sexo feminino e: "+ mediaIdadeF
                 +"\nA media de idade do sexo masculino e: "+ mediaIdadeM);
        System.out.println("A media de altura do sexo feminino e: "+ mediaAlturaF
                 +"\nA media de idade do sexo masculino e: "+ mediaAlturaM);
        System.out.println("O percentual de pessoas com a idade entre 18 e 35 e: "+ percentual);
        
    }

}
