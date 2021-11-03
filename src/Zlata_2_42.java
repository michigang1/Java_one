import java.util.Scanner;
public class Zlata_2_42 {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Choise 1 or 2:");
int choise = in.nextInt();
int h,m,time;
switch (choise){
    case 1:
        h = rnd(0,12);
        m = rnd(0,59);
        System.out.println(h+" hours,"+m+" minutes");

    case 2:

    }
}
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
