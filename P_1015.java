import java.util.Scanner;

public class P_1015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1,y1,x2,y2,dis;
        x1 =in.nextDouble();
        y1 =in.nextDouble();
        x2 =in.nextDouble();
        y2 =in.nextDouble();
        dis = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.printf("%.4f%n",dis);
        in.close();

    }
}


/*Scanner in = new Scanner(System.in);
        double x1,y1,x2,y2,dis;
        x1 =in.nextDouble();
        y1 =in.nextDouble();
        x2 =in.nextDouble();
        y2 =in.nextDouble();
        dis = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        System.out.printf("%.4f%n",dis);
        in.close();
*/
