package Aula_9;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double[] mediaAlunos = new double[5];
        double[] notaTeoria = new double [5];
        double[] notaPratica = new double [5];

        for(int i = 0; i < 5; i++){
            System.out.println("Diga a sua nota nas aulas teoricas, aluno "+ (i + 1));
            notaTeoria[i] = scan.nextDouble();
            mediaAlunos[i] = calcMediaTeoria(notaTeoria[i]);

            System.out.println("Diga a sua nota nas aulas praticas, aluno "+ (i + 1));
            notaPratica[i] = scan.nextDouble();
            mediaAlunos[i] += calcMediaPratica(notaPratica[i]);
        }

        System.out.println("Notas dos 5 alunos");

        for(int i = 0; i < 5; i++){
            System.out.println("Media do aluno "+(i + 1)+" : "+ mediaAlunos[i]);
        }


    }
    public static double calcMediaTeoria(double notaTeoria){
        double result = 0;

        result = notaTeoria * 0.6;

        return result;
    }
    public static double calcMediaPratica(double notaPratica){
        double result = 0;

        result = notaPratica * 0.4;

        return result;
    }

}
    

