public class Tester{

    public static void main(String[] args) {
        
        RationalNumber r1 = new RationalNumber(10, -6);
        System.out.println(r1);

        RationalNumber r2 = new RationalNumber(2, 8);
        System.out.println(r2);

        System.out.println(sumOfRationals(r1, r2));


    }
    
}
