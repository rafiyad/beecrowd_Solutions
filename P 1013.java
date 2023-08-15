import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        int big,n1,n2,n3;
        Scanner input = new Scanner(System.in);
        n1=input.nextInt();
        n2=input.nextInt();
        n3=input.nextInt();

        big=(n1+n2+Math.abs(n1-n2))/2;
        big=(big+n3+Math.abs(big-n3))/2;

        System.out.println(big+" eh o maior");
        input.close();
 
    }
 
}