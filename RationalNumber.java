public class RationalNumber{

    private int numerator;
    private int denominator;

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

    private int greatestCommonDivisor(RationalNumber rationalMain){
        int min = Math.abs(Math.min(rationalMain.getNumerator(), rationalMain.getDenominator()));
        int max = Math.abs(Math.max(rationalMain.getNumerator(), rationalMain.getDenominator()));

        while(max % min != 0 || min != 1){
            int temp = min;
            min = max % min;
            max = temp;

        }

        return min;

    }

    public int getNumerator(){
        return this.numerator;

    }

    public int getDenominator(){
        return this.denominator;
        
    }

    public String toString(){
        return this.numerator + "/" + this.denominator;
        
    }

}
