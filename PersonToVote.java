import java.util.Scanner;

public class PersonToVote {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the age");
        int age=scanner.nextInt();

        if(age>=18)
        {
            System.out.println("Elagible for vote ");
        }
        else
        {
            System.out.println("not elegible for vote");
        }
    }
}
