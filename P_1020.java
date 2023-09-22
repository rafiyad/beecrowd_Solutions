import java.util.Scanner;

public class P_1020 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int year = x/365;
        int month=(x%365)/30;
        int day=(x%365)%30;
        System.out.println(year+" ano(s)");
        System.out.println(month+" mes(es)");
        System.out.println(day+" dia(s)");
    }
}
