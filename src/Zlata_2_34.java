import java.util.Scanner;

public class Zlata_2_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = rnd(10,99);
        int b = rnd(0,9);
        System.out.println("a1a2= "+a);
        System.out.println("b= "+b);
        int a1 = a/10;
        int a2 = a%10;
        System.out.println("a1= "+a1);
        System.out.println("a2= "+a2);

        System.out.println("Needed number is "+(a1+a2+b));
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
