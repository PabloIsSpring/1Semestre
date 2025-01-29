package Aula_5;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o numero do erro que ocorreu no sistema?");
        int numErro = scan.nextInt();

        switch (numErro) {
            case 1:
                System.out.println("Erro de conexao com o servidor.");
                break;
            case 2:
                System.out.println("Usuario ou senha invalidos.");
                break;
            case 3:
                System.out.println("Arquivo nao encontrado.");
                break;
            case 4:
                System.out.println("Espaco em disco insuficientes.");
                break;
            case 5:
                System.out.println("Permissao negada para acessar o arquivo ou pasta.");
                break;
        }
    }

}
