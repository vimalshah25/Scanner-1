import java.util.Scanner;

public class PositiveNegative
{
    public static void main(String[] args)
    {
        int Number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Please Enter any Integer value:");
        Number = scanner.nextInt();

        if (Number>=0){
            System.out.println("\n You have entered positive number ");

        }
        else {
            System.out.println("\n You have entered negative number");
        }



    }

}
