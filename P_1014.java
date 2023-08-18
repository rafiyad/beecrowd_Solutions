import java.io.IOException;
import java.util.Scanner;

public class P_1014 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int X=in.nextInt();
        double Y = in.nextDouble();
        double mileage=X/Y;
        System.out.printf("%.3f km/l%n",mileage);
        in.close();
    }

}