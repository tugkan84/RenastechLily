package Day_20_Return_Method;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Topic_1_ReturnTypesTest {

    @Test
    void count() {
        var result = Topic_1_ReturnTypes.Count(new int[]{2,3});
        assertEquals(2,result);

    }

    @Test
    void sum() {
        var result2 = Topic_1_ReturnTypes.Sum(new int[]{2,2});
        assertEquals(4,result2);
    }
}