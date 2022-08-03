package Day_20_Return_Method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Topic_3_ReturnTypes_ExTest {

    @Test
    void MAxNumber() {
        var result = Topic_3_ReturnTypes_Ex.MAxNumber(new int[]{2,3});
        assertEquals(3,result);
    }
}