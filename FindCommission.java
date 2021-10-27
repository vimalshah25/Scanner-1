import java.util.Scanner;

public class FindCommission
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=scanner.nextLine();

        System.out.println("Enter the id");
        int id=scanner.nextInt();

        System.out.println("Enter the salary");
        int salary=scanner.nextInt();

        System.out.println("Enter the sales amount");
        int amount= scanner.nextInt();

        int com;
        if (amount>=50000)
        {
            com=amount*35/100;
            System.out.println("commission:"+com);

        }
        else if(amount>=30000)
        {
            com=amount*20/100;
            System.out.println("commission:"+com);
        }
        else if(amount>=20000)
        {
            com=amount*10/100;
            System.out.println("commission:"+com);

        }
        else if(amount>=10000)
        {
            com=amount*5/100;
        }
        else
        {
            com=amount*2/100;
            System.out.println("commission"+com);
        }
    }
}
