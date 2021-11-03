import java.util.Scanner;

public class Zlata4_131 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int todayYear,todayMonth;
        String Age;
        final int YEAR_OF_BIRTH,MONTH_OF_BIRTH;

            System.out.println("Enter the your year of birth: ");
            YEAR_OF_BIRTH = in.nextInt();
            System.out.println("Enter the your month of birth: ");
            MONTH_OF_BIRTH = in.nextInt();
            System.out.println("Enter today month: ");
            todayMonth = in.nextInt();
            System.out.println("Enter today year: ");
            todayYear = in.nextInt();
            Age = DefineOfAge(YEAR_OF_BIRTH, MONTH_OF_BIRTH, todayYear, todayMonth);
            System.out.println(Age);
        }

    public static String DefineOfAge(int YEAR_OF_BIRTH,int MONTH_OF_BIRTH, int todayYear,int todayMonth){

        int Age_year = todayYear - YEAR_OF_BIRTH;
        int Age_month = todayMonth - MONTH_OF_BIRTH;

        if(Age_month<0){
            int temp = Age_month;
            Age_month=temp+12;
        }
        return "Age year:" + Age_year + "\nAge month:" + Age_month;
    }
}
