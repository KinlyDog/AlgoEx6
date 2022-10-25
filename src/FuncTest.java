import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncTest {
    Func f = new Func();

    String str1 = "tenet";
    String str2 = "moloom";
    String str3 = "terret";
    String str4 = "madagaskar";

    @Test
    void tenet1() {
        assertTrue(f.tenet(str1));
    }

    @Test
    void tenet2() {
        assertFalse(f.tenet(str2));
    }

    @Test
    void tenet3() {
        assertTrue(f.tenet(str3));
    }

    @Test
    void tenet4() {
        assertFalse(f.tenet(str4));
    }
}