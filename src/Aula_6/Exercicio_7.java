package Aula_6;

import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numProd = 0;
        int codigoProd = 0;
        double precoCusto = 0;
        double somaPrecoCusto = 0;
        double precoNovo = 0;
        double somaPrecoNovo = 0;

        while (codigoProd >= 0) {
            System.out.println("Digite o codigo do produto:");
            codigoProd = scan.nextInt();

            if (codigoProd >= 0) {
                System.out.println("Digite o preco de custo:");
                precoCusto = scan.nextDouble();

                precoNovo = precoCusto * 1.20;

                System.out.println("Para o produto de codigo: " + codigoProd + "\no novo valor e: R$" + precoNovo);
                
                somaPrecoCusto += precoCusto;
                somaPrecoNovo += precoNovo;
                ++numProd;
            } else {
                System.out.println("# Encerrando Programa #");
            }
        }
        double mediaPrecoCusto = somaPrecoCusto / numProd;
        double mediaPrecoNovo = somaPrecoNovo / numProd;
        
        System.out.println("A media dos produtos com preco de custo e: R$"+ mediaPrecoCusto);
        System.out.println("A Media dos produtos com o novo preco e: R$"+ mediaPrecoNovo);
    }

}
