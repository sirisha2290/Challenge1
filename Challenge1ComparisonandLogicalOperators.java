public class Challenge1ComparisonandLogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean Equalsresult = (a == b);
        boolean NotEqualsresult = (a != b);
        boolean greaterresult = (a > b);
        boolean lesserresult = (a < b);
        boolean gequalsresult = (a >= b);
        boolean lequalsresult = (a <= b);
        boolean logicalandresult = (a>b && b>0);
        boolean logicalorresult = (a<b || b>0);
        boolean notequalsresultR = !(a>b);


        System.out.println("10 equals to 5 is :" +Equalsresult);
        System.out.println("10 not equals to 5 is :" +NotEqualsresult);
        System.out.println("10 is greater than 5 is :" +greaterresult);
        System.out.println("10 is lesser than 5 is :" +lesserresult);
        System.out.println("10 is greater or equals to 5 is :" +gequalsresult);
        System.out.println("10 is lesser or equals to 5 is :" +lequalsresult);
        System.out.println("10 is greater than 5 AND 5 is greater than 0 is :" +logicalandresult);
        System.out.println("10 is lesser than 5 OR 5 is greater than 0 is :" +logicalorresult);
        System.out.println("Opposite of 10 is greater than 5 :" +notequalsresultR);
    }
}
