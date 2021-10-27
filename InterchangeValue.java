import java.util.Scanner;

public class InterchangeValue {

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first 1 ");
        int nub1= scanner.nextInt();
        System.out.println("Enter second 2 ");
        int nub2=scanner.nextInt();
        int ans=nub1;
        nub1=nub2;
        nub2=ans;
        System.out.println("number1 is"+nub1);
        System.out.println("number2 is"+nub2 );

    }
}
