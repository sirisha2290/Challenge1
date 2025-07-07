package Ex_03_Arrays;

public class Strings_Challenge2 {
    public static void main(String[] args) {
        String S1 = "Hello";
        String S2 = "hello";
        String S3 = "Hello";
        System.out.println("Equals Method Result : " +S1.equals(S2));
        System.out.println("Equals Method while Ignoring Case Result : " +S1.equalsIgnoreCase(S2));
        System.out.println("CompareTo Method Result : " +S1.compareTo(S2));
    }
}
