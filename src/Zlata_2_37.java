import java.util.Scanner;

public class Zlata_2_37 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter the k:");
        int k = in.nextInt();
        int [] DoubleNumber = new int[90];

        if (1 <= k  & k <= 180) {
            for(int i=0;i<DoubleNumber.length;i++){
                DoubleNumber[i] = 10 + i;
                if(k == DoubleNumber[i] / 10 || k == DoubleNumber[i] % 10){
                    System.out.println("#"+i+"-"+DoubleNumber[i]);
                }
            }
        }
        else System.out.println("Enter other number");

    }


}
