import java.util.Scanner;
public class Zlata_4_40 {
    public static void main(String[] args) {
        double x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number x:");
        x = in.nextDouble();
        if(x>=-2.4&x<=5.7) System.out.println("Function f(x)=x^2:" +
                "\nFunction f(x)="+Math.round(x*x));
        else System.out.println("Function f(x)=4");

    }
}
