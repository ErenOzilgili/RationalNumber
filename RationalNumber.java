public class RationalNumber{

    /**
     * Class Implemented for Operations with Rational Numbers
     * @author Eren Özilgili
     * @version
     */

    /*
     * Below are the methods implemented in this class with their corresponding arrangement:
     * -------------------------------------------------------------------------------------
     * -(1) Instance Variables (For instances)
     * -(2) Constructors (For instances)
     * -(3) Public Static Methods 
     * -(4) Private Static Methods
     * -(5) Private Methods (For instances)
     * -(6) Public Methods (For instances)
     * -(7) Getters and Setters
     * -(8) toString Method for Displaying the Rational Number
     */

    //-(1) Instance Variables (For Instances)---------------------------------------
    /*
     * -Numerator holds an integer and sign of the rational number is identified here;
     * -Denominator holds a positive integer;
     * ---Signs are dealt accordingly in the constructor;
     */
    private int numerator;
    private int denominator;

    //-(2) Constructors (For instances)------------------------------------------
    /*
     * -If denominator = 0, we fix it to arbitrary number, here it was used as 1;
     * -Signs are issued as wished above; (See the comments above the instance variables)
     * -Numerator and denomnator are then simplified to their absolute form by dividing
     *  them with their gratest common divisor;
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
            else{
                this.denominator = denominator;
                this.numerator = numerator;
            }

        }
        
        int gcd = greatestCommonDivisor();

        this.numerator /= gcd;
        this.denominator /= gcd;

    }

    //-(3) Public Static Methods-------------------------------------------------
    /*
     * -Static method;
     * -Addition is performed by simple 
     *  summation rules, then a new Rational Number 
     *  is assigned to return the result;
     */
    public static RationalNumber sumOfRationals(RationalNumber r1, RationalNumber r2){
        int numNew = ( r1.getNumerator() * r2.getDenominator() + r1.getDenominator() * r2.getNumerator() );
        int denomNew = ( r1.getDenominator() * r2.getDenominator() );
        
        return new RationalNumber(numNew, denomNew);

    }

    /* 
     * -Static method;
     * -Substraction is performed by utilizing
     *  the method named sumOfRationals;
     */
    public static RationalNumber subtractionOfRationals(RationalNumber r1, RationalNumber r2){
        return sumOfRationals( r1, new RationalNumber( (-1) * r2.getNumerator(), r2.getDenominator()) );

    }

    //-(4) Private Static Methods----------------------------------------------

    //-(5) Private Methods (For instances)--------------------------------------
    /*
     * -This private method finds the greatest common divisor of the numerator and
     *  the denominator of the instance RationalNumber by using Euclidean Algorithm;
     */
    private int greatestCommonDivisor(){
        int min = Math.min( Math.abs(this.getNumerator()) , this.getDenominator() );
        int max = Math.max( Math.abs(this.getNumerator()) , this.getDenominator() );

        while(max % min != 0){
            int temp = min;
            min = max % min;
            max = temp;

        }

        return min;

    }

    //-(6) Public Methods (For instances)---------------------------------------------------------
    /*
     * -Above summation method verison of the static function sumOfRationals with instance usage;
     */
    public RationalNumber sumOfRationals(RationalNumber r2){
        int numNew = ( this.getNumerator() * r2.getDenominator() + this.getDenominator() * r2.getNumerator() );
        int denomNew = ( this.getDenominator() * r2.getDenominator() );
        
        return new RationalNumber(numNew, denomNew);

    }

    /*
     * -Above summation method verison of the static function sumOfRationals with instance usage;
     */
    public RationalNumber subtractionOfRationals(RationalNumber r2){
        return sumOfRationals( this, new RationalNumber( (-1) * r2.getNumerator(), r2.getDenominator()) );

    }

    //-(7) Getters and Setters-------------------------------------------------
    /*
     * -Below are listed getter methods for the instance variables;
     */
    public int getNumerator(){
        return this.numerator;

    }

    public int getDenominator(){
        return this.denominator;
        
    }

    /*
     * -Below are listed setter methods for the instance variables.
     *  No setters are implemeneted so far;
     */

    //-(8) toString Method for Displaying the Rational Number--------------------------------------------
    /*
     * -toString method to showcase the Rational Number;
     */
    public String toString(){
        return this.numerator + "/" + this.denominator;

    }

}
