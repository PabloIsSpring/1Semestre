package Aula_7;

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int alunos = 3;
        double[] totalNotaAlunos = new double[3];
        double[] notas = new double[4];
        double[] media = new double[3];
        int cont = 0;

        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1) + ":");

            for (int j = 0; j < notas.length; j++) {
                System.out.println("Digite a " + (1 + j) + " nota:");
                notas[j] = scan.nextDouble();

                totalNotaAlunos[i] += notas[j];

            }
        }

        for (int i = 0; i < alunos; i++) {
            media[i] = totalNotaAlunos[i] / 4;
        }
        
        for(int i = 0; i < alunos; i++){
            if(media[i] >= 7){
                ++cont;
            }
            
        }
        System.out.println(cont +" Aluno(s) tem a media maior ou igual a 7");
    }

}
