import java.util.Scanner;

public class P_1018 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();

        int hundred=x/100;
        int remainder=x%100;

        int fifty = remainder/50;
        remainder=remainder%50;

        int twenty = remainder/20;
        remainder=remainder%20;

        int ten = remainder/10;
        remainder=remainder%10;

        int five = remainder/5;
        remainder=remainder%5;

        int two = remainder/2;
        remainder=remainder%2;

        int one= remainder;


        System.out.println(x);
        System.out.println(hundred+" nota(s) de R$ 100,00");
        System.out.println(fifty+" nota(s) de R$ 50,00");
        System.out.println(twenty+ " nota(s) de R$ 20,00");
        System.out.println(ten+" nota(s) de R$ 10,00");
        System.out.println(five+" nota(s) de R$ 5,00");
        System.out.println(two+" nota(s) de R$ 2,00");
        System.out.println(one+" nota(s) de R$ 1,00");

    }
}
