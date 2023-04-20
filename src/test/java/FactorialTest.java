import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorialTest1(){
        // Given
        Integer expected = 120;

        // When
        Integer actual = Factorial.factorial(5);

        // Then
        Assert.assertEquals(expected,actual);
    }
}
