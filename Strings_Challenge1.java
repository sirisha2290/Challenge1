package Ex_03_Arrays;
import java.util.Scanner;
public class Strings_Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Fist String: ");
        String S1 = scanner.next();
        System.out.println("Enter the Second String: ");
        String S2 = scanner.next();
        System.out.println("The Two Strings provided are :");
        System.out.println(S1);
        System.out.println(S2);
        String S3 = S1.concat(S2);
        System.out.println("The two strings after concatenation is :" + S3);
        System.out.println("The Length of the Concatenated String is :" +S3.length());
        System.out.println("The First Character of the String is :" +S3.charAt(0));
        System.out.println("The Substring from the concatenated String is : " +S3.substring(5));
    }
}
