package Aula_6;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ra = 0;
        int nota = 0;
        int somaNotas = 0;
        int media = 0;
        int opcaoMenu = 1;
        int result = 0;

        while (opcaoMenu != 0) {
            System.out.println("[1] - Inserir RA\n[2] - Calcular media de notas\n[0] - Encerrar programa");
            opcaoMenu = scan.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Insira seu RA");
                    ra = scan.nextInt();
                    System.out.println("# RA Cadastrado #");
                    break;
                case 2:
                    if (ra == 0) {
                        System.out.println("# Insira seu RA para calcular suas notas #");
                    } else {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Insira sua nota numero " + (i + 1) + ":");
                            nota = scan.nextInt();
                            
                            somaNotas +=  nota;
                            ++media;
                        }
                    result = somaNotas / media;
                    
                    System.out.println("Aluno de RA: "+ ra +"\nsua media ficou: "+result);
                    }
                    break;
                case 0:
                    System.out.println("# Encerrando algoritmo #");
                    break;
                default:
                    System.out.println("# Opcao Invalida #");
                    break;
            }
        }
        
        
        
    }

}
