import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        //main method declaration
        char ch;//local variable
        Scanner scan=new Scanner(System.in);
        // This statements takes input from the user

        System.out.println("Enter an alphabet:");
        //Get input and it is stored ch variable
        ch=scan.next().charAt(0);
        if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i' ||ch=='I'||ch=='0'||ch=='u')
        {
            System.out.println(ch+"is vowel");

        }
        else
        {
            System.out.println(ch+" is consonant");
        }
        //end of main method

    }
}
