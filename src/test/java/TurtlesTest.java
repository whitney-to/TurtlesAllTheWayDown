import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {
    @Test
    public void turtlesTest1(){
        // Given
        Integer expected = 6;

        // When
        Integer actual = Turtles.gcd(12312312,234);

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void turtlesTest2(){
        // Given
        Integer expected = 6;

        // When
        Integer actual = Turtles.gcd2(12312312,234);

        // Then
        Assert.assertEquals(expected,actual);
    }
}