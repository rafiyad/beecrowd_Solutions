import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double A,B,C,pi=3.14159;
        A=input.nextDouble();
        B=input.nextDouble();
        C=input.nextDouble();

        double TRIANGULO = 0.5*A*C;
        double CIRCULO = pi*Math.pow(C, 2);
        double TRAPEZIUM = 0.5*(A+B)*C;
        double SQUARE = Math.pow(B, 2);
        double RECTANGLE = A*B;
        
        System.out.printf("TRIANGULO: %.3f%n",TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n",CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n",TRAPEZIUM);
        System.out.printf("QUADRADO: %.3f%n",SQUARE);
        System.out.printf("RETANGULO: %.3f%n",RECTANGLE);

        input.close();    
 
    }
 
}