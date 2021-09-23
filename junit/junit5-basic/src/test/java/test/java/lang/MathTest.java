package test.java.lang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 为JDK自带的类库数学工具类java.lang.Math编写单元测试
 */
public class MathTest {
    @Test
    public void testMathMinSuccess() {
        int a = 1;
        int b = 9;
        int min = Math.min(a, b);
        Assertions.assertEquals(a, min);
    }

    @Test
    @DisplayName("测试Math的max方法")
    public void testMathMaxSuccess() {
        int a = 1;
        int b = 9;
        int max = Math.max(a, b);
        Assertions.assertEquals(b, max);
    }
}
