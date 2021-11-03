import java.sql.SQLOutput;
import java.util.Scanner;
public class Zlata_4_37 {
    private static Object String;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number of interval: ");
        byte x1 = in.nextByte();
        System.out.println("Enter last number of interval: ");
        byte x2 = in.nextByte();
        System.out.println("Enter the checked number of interval: ");
        byte x = in.nextByte();
        String questionOfBelonging;
        questionOfBelonging = BelongsToTheInterval(x1, x2, x);
        System.out.println(questionOfBelonging);
    }

    public static java.lang.String BelongsToTheInterval(byte x1, byte x2, byte x) {
        byte[] intervalArr = new byte[Math.abs(x2 - x1)];
        byte sum = 0;
        for(int i = 0;i<intervalArr.length;i++){
            sum+=i;
            intervalArr[i]= (byte) (x1+i);
            if(x == intervalArr[i] & (x == x1 || x == x2)) System.out.println("The number "+x+" belongs to the interval ("+x1+";"+x2+")");
            else if (x != intervalArr[i])
                if (i==(intervalArr.length)-1) System.out.println("The number "+x+" doesn't belong to the interval ("+x1+";"+x2+")");
        }
        return (String) (" ");
    }
}