import java.util.Scanner;

public class P_1017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour,speed;
        double millage;
        hour=in.nextInt();
        speed=in.nextInt();
        millage=(hour*speed)/12.0;
        System.out.printf("%.3f%n",millage);

    }
}
