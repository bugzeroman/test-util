package test.java.lang;

import org.junit.Assert;
import org.junit.Test;

/**
 * 为JDK自带的类库数学工具类java.lang.Math编写单元测试
 *
 */
public class MathTest {

    @Test
    public void testMathMinSuccess() {
        int a = 1;
        int b = 9;
        int min = Math.min(a, b);
        Assert.assertEquals(a, min);
    }
}
