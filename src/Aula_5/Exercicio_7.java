package Aula_5;

public class Exercicio_7 {

    public static void main(String[] args) {
        
        int cont = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                ++cont;
                System.out.print(cont + " ");
            }
        }
    }

}
