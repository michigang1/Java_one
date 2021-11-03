import java.util.Scanner;
public class Zlata_4_96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the a: ");
        double a = in.nextDouble();
        if (a==0) System.out.println("a must not be equaled to 0");
        else {
            System.out.println("Enter the b: ");
            double b = in.nextDouble();
            System.out.println("Enter the c: ");
            double c = in.nextDouble();
            double x1, x2, D;
            D = b * b - 4 * a * c;
            if (D >= 0) {
                x1 = (-b + Math.sqrt(D)) / 2 * a;
                x2 = (-b - Math.sqrt(D)) / 2 * a;
                if (x1 == x2) System.out.println("x=" + Math.round(x1));
                else {
                    System.out.println("x=" + Math.round(x1));
                    System.out.println("x=" + Math.round(x2));
                }
            } else System.out.println("X doesn't exist");
        }
    }
}
