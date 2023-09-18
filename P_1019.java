import java.util.Scanner;

public class P_1019 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sec=x%60;
        int min=(x/60)%60;
        int hour=x/3600;
        System.out.println(hour+":"+min+":"+sec);
    }
}
