import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char city=scanner.next().charAt(0);

        if (city=='a')
        {
            System.out.println("vadodara");

        }
        else if (city=='b')
        {
            System.out.println("surat");
        }
        else if (city=='c')
        {
            System.out.println("london");
        }
        else if (city=='d')
        {
            System.out.println("porbander");
        }
        else if (city=='e')
        {
            System.out.println("bharuch");

        }
        else if (city=='f')
        {
            System.out.println("germany");
        }



    }
}
