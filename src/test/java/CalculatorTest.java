import org.example.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {

    private Main calculator;
    
    @Before
    public void setUp(){
        calculator = new Main();
    }

    @Test
    public void test_sqrt_positive() {
        double x = 4.0;
        double expectedResult = 2.0;
        Assert.assertEquals(expectedResult, calculator.sqrt(x), 0.001);
    }

    @Test
    public void test_sqrt_negative_input() {
        double x = -4.0;
        double expectedResult = Double.NaN;
        Assert.assertEquals(expectedResult, calculator.sqrt(x), 0.001);
    }

    @Test
    public void test_factorial_positive() {
        int x = 5;
        long expectedResult = 120;
        Assert.assertEquals(expectedResult, calculator.factorial(x));
    }

    @Test
    public void test_factorial_zero() {
        int x = 0;
        long expectedResult = 1;
        Assert.assertEquals(expectedResult, calculator.factorial(x));
    }

    @Test
    public void test_factorial_negative_input() {
        int x = -3;
        long expectedResult = -1;  // As factorial should return -1 for negative input
        Assert.assertEquals(expectedResult, calculator.factorial(x));
    }

    @Test
    public void test_ln_positive() {
        double x = Math.E;
        double expectedResult = 1.0;  // ln(e) = 1
        Assert.assertEquals(expectedResult, calculator.ln(x), 0.001);
    }

    @Test
    public void test_ln_zero() {
        double x = 0.0;
        double expectedResult = Double.NaN;  // ln(0) is undefined
        Assert.assertEquals(expectedResult, calculator.ln(x), 0.001);
    }

    @Test
    public void test_ln_negative_input() {
        double x = -2.0;
        double expectedResult = Double.NaN;  // ln of negative number is undefined
        Assert.assertEquals(expectedResult, calculator.ln(x), 0.001);
    }

    @Test
    public void test_power_positive() {
        double x = 2.0;
        double y = 3.0;
        double expectedResult = 8.0;  // 2^3 = 8
        Assert.assertEquals(expectedResult, calculator.power(x, y), 0.001);
    }

    @Test
    public void test_power_zero_exponent() {
        double x = 5.0;
        double y = 0.0;
        double expectedResult = 1.0;  // Any number to the power of 0 is 1
        Assert.assertEquals(expectedResult, calculator.power(x, y), 0.001);
    }

    @Test
    public void test_power_negative_exponent() {
        double x = 2.0;
        double y = -2.0;
        double expectedResult = 0.25;  // 2^-2 = 1/4
        Assert.assertEquals(expectedResult, calculator.power(x, y), 0.001);
    }
}