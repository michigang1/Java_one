import java.util.Scanner;

public class Zlata_4_89 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x,k;
        System.out.println("Enter the numbers x,k resp..");
        x = in.nextDouble();
        k = in.nextDouble();
        if(k>=x)
            if(Math.sin(x)>=0) System.out.println("Function f(x)=k+x" +
                    "\nFunction f(x)="+Math.round(x+x*x));
            else System.out.println("Function f(x)=x+|x|" +
                    "\nFunction f(x)="+Math.round(x+Math.abs(x)));
        else
            if(Math.sin(x)>=0) System.out.println("Function f(x)=kx" +
                "\nFunction f(x)="+Math.round(x*x*x));
            else System.out.println("Function f(x)=x+|x|" +
                "\nFunction f(x)="+Math.round(x*Math.abs(x)));

    }
}
