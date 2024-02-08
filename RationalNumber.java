public class RationalNumber{

    /*
     * -Numerator holds an integer and sign of the rational number is identified here;
     * -Denominator holds a positive integer;
     * ---Signs are dealt accordingly in the constructor;
     */
    private int numerator;
    private int denominator;

    /*
     * -If denominator = 0, we fix it to arbitrary number, here it was used as 1;
     * -Signs are issued as wished above; (See the comments above the instance variables)
     * -Numerator and denomnator are then simplified to their absolute form by dividing
     * them with their gratest common divisor;
     */
    public RationalNumber(int numerator, int denominator){
        if(denominator == 0){
            this.denominator = 1;

        }
        else{
            if(denominator < 0){
                this.denominator = (-1) * denominator;
                this.numerator = (-1) * numerator;
            }

        }

        int gcd = greatestCommonDivisor(this);

        this.numerator /= gcd;
        this.denominator /= gcd;

    }

    /*
     * -Addition is performed by simple 
     * summation rules, then a new Rational Number 
     * is assigned to return the result;
     */
    public RationalNumber sumOfRationals(RationalNumber r1, RationalNumber r2){
        int numNew = ( r1.getNumerator() * r2.getDenominator() + r1.getDenominator() * r2.getNumerator() );
        int denomNew = ( r1.getDenominator() * r2.getDenominator() );
        
        return new RationalNumber(numNew, denomNew);

    }

    /*
     * -Substraction is performed by utilizing
     * the method named sumOfRationals;
     */
    public void subtractionOfRationals(RationalNumber r1, RationalNumber r2){
        sumOfRationals( r1, new RationalNumber( (-1) * r2.getNumerator(), r2.getDenominator()) );

    }

    /*
     * -This private method finds the greatest common divisor of the numerator and
     * the denominator of a given Rational Number by using Euclidean Algorithm;
     */
    private int greatestCommonDivisor(RationalNumber rationalMain){
        int min = Math.abs(Math.min(rationalMain.getNumerator(), rationalMain.getDenominator()));
        int max = Math.abs(Math.max(rationalMain.getNumerator(), rationalMain.getDenominator()));

        while(max % min != 0){
            int temp = min;
            min = max % min;
            max = temp;

        }

        return min;

    }

    /*
     * -Below are listed getter methods for the instance variables 
     */
    public int getNumerator(){
        return this.numerator;

    }

    public int getDenominator(){
        return this.denominator;
        
    }

    /*
     * -toString method to showcase the Rational Number;
     */
    public String toString(){
        return this.numerator + "/" + this.denominator;

    }

}
