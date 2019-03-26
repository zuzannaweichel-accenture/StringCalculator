import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {
    @Test
    public void start(){
        Assert.assertNotNull(StringCalculator.class);
    }

    @Test
    public void givenEmptyString_returnZero(){
        StringCalculator calculator = new StringCalculator();
        Assert.assertEquals(0, calculator.add(""));
    }

    @Test
    public void givenOne_return1(){
        StringCalculator calculator = new StringCalculator();
        Assert.assertEquals(1, calculator.add("1"));
    }

    @Test
    public void givenOneAndTwo_return3(){
        StringCalculator calculator = new StringCalculator();
        Assert.assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void givenOneNewLineTwoAndThree_return6(){
        StringCalculator calculator = new StringCalculator();
        Assert.assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    public void canChangeDelimiters(){
        StringCalculator calculator = new StringCalculator();
        Assert.assertEquals(6, calculator.add("//;\n1;2"));
    }

}
