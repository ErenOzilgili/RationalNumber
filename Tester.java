public class Tester{

    public static void main(String[] args) {
        //
        RationalNumber r1 = new RationalNumber(10, -6);
        System.out.println(r1);

        RationalNumber r2 = new RationalNumber(2, 8);
        System.out.println(r2);

        //Called from the insatance r2 --> r1 + r2 is operated;
        System.out.println(r1.sumOfRationals(r2));

        //Static method belonging to class RationalNumber called with the parameters r1 and r2 --> r1 - r2 is performed;
        System.out.println(RationalNumber.subtractionOfRationals(r1, r2));

    }
    
}
