/* Copyright (C) 2018 - All Rights Reserved
 * Jens Krinke (UCL), Chaiyong Ragkhitwetsagul (Mahidol), Morakot Choetkiertikul (Mahidol)
 */

 public class Rational {
    long numerator, denominator;

    class Illegal extends Exception {
        String reason;

        Illegal(String reason) {
            this.reason = reason;
        }
    }

    Rational() {

    }

    Rational(long numerator, long denominator) throws Illegal {
        this.numerator = numerator;
        this.denominator = denominator;
        simplestForm();
    }

    // find the reduce form
    private void simplestForm() {
        long computeGCD;
        computeGCD = GCD(Math.abs(numerator), denominator);
        numerator /= computeGCD;
        denominator /= computeGCD;
    }

    // find the greatest common denominator
    private long GCD(long a, long b) {
        if (a % b == 0) return b;
        else return GCD(b, a % b);
    }

    public void add(Rational x) {
        numerator = (numerator * x.denominator) + (x.numerator * denominator);
        denominator = denominator * x.denominator;
        simplestForm();
    }

    public void subtract(Rational x) {
        numerator = (numerator * x.denominator) - (x.numerator * denominator);
        denominator = denominator * x.denominator;
        simplestForm();
    }

    public void multiply(Rational x) {
        numerator =  (x.numerator * numerator);
        denominator = denominator * x.denominator;
        simplestForm();
    }

    public void divide(Rational x) {
        numerator = numerator * x.denominator;
        denominator = denominator * x.numerator;
        simplestForm();
    }

    /***
     * If the given rational number equals to this rational number
     * return true. If not, return false.
     */

    public boolean equals(Object x) {
        Rational r = (Rational) x;
        r.simplestForm();
        if (this.numerator == r.numerator && this.denominator == r.denominator) {
            return true;
        } else {
            return false;
        }
    }

    /***
     * If the given rational number equals to this rational number, return 0.
     * If the given rational number is larger than this rational number, return -1.
     * If the given rational number is smaller than this rational number, return 1.
     */
    //
    public long compareTo(Object x) {
        Rational r = (Rational) x;
        r.simplestForm();
        if (this.numerator == r.numerator && this.denominator == r.denominator) {
            return 0;
        } else if ((numerator * r.denominator) > (r.numerator * denominator)) {
            return -1;
        } else {
            return 1;
        }
    }


    public String toString() {
        simplestForm();
        return String.valueOf(numerator) + "/" + String.valueOf(denominator);
    }
}
