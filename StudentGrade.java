import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name ");
        String name=scanner.nextLine();
        System.out.println("Enter the roll number");
        int number=scanner.nextInt();
        System.out.println("Enter the mark 1");
        int m1=scanner.nextInt();
        System.out.println("Enter the mark 2");
        int m2=scanner.nextInt();
        System.out.println("Enter the mark 3" );
        int m3=scanner.nextInt();
        int total=m1+m2+m3;
        System.out.println("total marks"+total);
        float per =total*100/300;
        System.out.println("per is "+per);

        if (per>=80)
        {
            System.out.println("your grade A +");

        }
        else if (per>=60)
        {
            System.out.println("your grade A");
        }
        else if (per>=50){
            System.out.println("your grade B");
    }
        else if (per>=350){
            System.out.println("your grade C");
        }
        else
        {
            System.out.println("you are fail");
        }




}
}