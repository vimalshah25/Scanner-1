import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number ");
        int nub1=scanner.nextInt();

        System.out.println("Enter the second number");
        int nub2=scanner.nextInt();
        System.out.println("Enter the third number ");
        int nub3=scanner.nextInt();
        System.out.println("Enter the fourth number");
        int nub4=scanner.nextInt();
        System.out.println("Enter the fifth number");
        int nub5=scanner.nextInt();

        int total=nub1+nub2+nub3+nub4+nub5;
        System.out.println("the total number is :"+total);
        int avg=total/5;
        System.out.println("the average is:-"+avg);

    }

}
