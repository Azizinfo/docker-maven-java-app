import com.testing.TestKata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestKataTest {
    @Test
    void testConvertString() {
        //given
        String input = "hello world";
        TestKata testKata = new TestKata();

        //when
        String result = testKata.convertString(input);
        //then

        assertEquals(result, "HELLO WORLD");
    }
}