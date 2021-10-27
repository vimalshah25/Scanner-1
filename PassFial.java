import java.util.Scanner;
public class PassFial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("student name ");
        String name = scanner.nextLine();
        System.out.println("Roll number ");
        int number = scanner.nextInt();
        System.out.println("Marks of s1");
        int s1 = scanner.nextInt();
        System.out.println("Marks of s2");
        int s2 = scanner.nextInt();
        System.out.println("Marks of s3");
        int s3 = scanner.nextInt();

        if(s1>=35 && s2>=35 && s3>=35)
        {
            System.out.println("student is pass is in all subjects ");

        }
        else
        {
            System.out.println("student is failed ");
        }

    }
}

