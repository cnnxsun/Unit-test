import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;
public class RationalTest {

    @Test
    public void testRational() {
        Rational r = new Rational();
        assertNotNull(r);
    }

    @Test
    public void testRationalWithValues() {
        try {
            Rational r = new Rational(2, 4);
            assertEquals(1, r.numerator);
            assertEquals(2, r.denominator);
        } catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }

    }

    /***
     * add your test cases here
     ***/

    @Test
    public void testAdd(){
        try{
            Rational r1 = new Rational(1,2);
            Rational r2 = new Rational(1,4);
            // expected 3/4
            r1.add(r2);
            assertEquals(3,r1.numerator);
            assertEquals(4,r1.denominator);
        }
        catch (Rational.Illegal e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testSubtract(){
        try{
            Rational r1 = new Rational(1,2);
            Rational r2 = new Rational(1,4);
            // expected 1/4
            r1.subtract(r2);
            assertEquals(1,r1.numerator);
            assertEquals(4,r1.denominator);
        }
        catch (Rational.Illegal e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testMultiply(){
        try{
            Rational r1 = new Rational(1,2);
            Rational r2 = new Rational(1,4);
            // expected 1/8
            r1.multiply(r2);
            assertEquals(1,r1.numerator);
            assertEquals(8,r1.denominator);
        }
        catch (Rational.Illegal e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDivide(){
        try{
            Rational r1 = new Rational(1,2);
            Rational r2 = new Rational(1,4);
            // expected 2/1
            r1.divide(r2);
            assertEquals(2,r1.numerator);
            assertEquals(1,r1.denominator);
        }
        catch (Rational.Illegal e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testEquals(){
        try{
            Rational r1 = new Rational(1,2);
            Rational r2 = new Rational(1,2);
            // expected true
            assertTrue(r1.equals(r2));

            Rational r3 = new Rational(1,3);
            Rational r4 = new Rational(1,2);
            // expected false
            assertFalse(r3.equals(r4));
        }
        catch (Rational.Illegal e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testCompareTo(){
        try{
            Rational r1 = new Rational(1,2);
            Rational r2 = new Rational(1,2);
            // expected 0
            assertEquals(0,r1.compareTo(r2));

            Rational r3 = new Rational(1,2);
            Rational r4 = new Rational(1,3);
            // expected -1
            assertEquals(-1,r3.compareTo(r4));

            Rational r5 = new Rational(1,3);
            Rational r6 = new Rational(1,2);
            // expected 1
            assertEquals(1,r5.compareTo(r6));
        }
        catch (Rational.Illegal e){
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testToString(){
        try{
            Rational r1 = new Rational(1,2);
            // expected "1/2"
            assertEquals("1/2",r1.toString());
        }
        catch (Rational.Illegal e){
            throw new RuntimeException(e);
        }
    }

}
