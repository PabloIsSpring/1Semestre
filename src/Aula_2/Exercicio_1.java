package Aula_2;

public class Exercicio_1 {

    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        
        System.out.println("Valor de x e "+x);
        System.out.println("Valor de y e "+y);
        
        int z = x;
        
        x = y;
        y = z;
        System.out.println("Valor de x e "+x);
        System.out.println("Valor de y e "+y);
    }
    
}
