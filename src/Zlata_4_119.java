import java.util.Scanner;
public class Zlata_4_119 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, d;
        a = Math.abs(Math.round(Math.random() * 10 - 2));
        b = Math.abs(Math.round(Math.random() * 10 - 2));
        c = Math.abs(Math.round(Math.random() * 10 - 2));
        d = Math.abs(Math.round(Math.random() * 10 - 2));
        System.out.println("a="+a+"\nb="+b+"\nc="+c+"\nd="+d);
        System.out.println("Choise \n1-a;\n2-б;\n3-в;\n4-г\n5-д");
        byte choise = in.nextByte();
        switch (choise) {
            case 1:
                if (a == c || b == d) {
                    System.out.println("Ладья (" + a + ";" + b + ") угрожает полю (" + c + ';' + d + ")");
                } else {
                    System.out.println("Ладья (" + a + ";" + b + ") не угрожает полю (" + c + ';' + d + ")");
                }
            case 2:
                if (a==(c)) {
                    System.out.println("Слон (" + a + ";" + b + ") угрожает полю (" + c + ';' + d + ")");
                } else {
                    System.out.println("Слон(" + a + ";" + b + ") не угрожает полю (" + c + ';' + d + ")");
                }
//не доделано

        }

    }

}

