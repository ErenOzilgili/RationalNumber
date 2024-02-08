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
                this.denominator = -1 * denominator;
                this.numerator = -1 * numerator;
            }

        }

        int gcd = greatestCommonDivisor(this);

        this.numerator /= gcd;
        this.denominator /= gcd;

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
