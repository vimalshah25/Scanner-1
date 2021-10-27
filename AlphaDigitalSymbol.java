import java.util.Scanner;

public class AlphaDigitalSymbol {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char ch;
        System.out.println("Enter character");
        ch = kb.next().charAt(0);

        System.out.println
        (ch >= 'a' && ch <= 'z' ? "small case alphabet"
            : ch >= 'A' && ch <= 'Z' ? "Capital alphabet" : ch >= '0' && ch <= '9' ? "Digit":"Symbol");



    }

}
