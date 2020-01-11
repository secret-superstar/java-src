package util;


import org.junit.Assert;
import org.junit.Test;

import java.util.Formatter;

/**
 * 对格式化数据的操作
 */
public class TestFormatter {

    /**
     * 增删改查的操作
     */
    @Test
    public void testCrud() {

        Formatter formatter = new Formatter();
        formatter.format("it is %.2f good ! %s  ", 12.3, "aaa");

        Assert.assertEquals(formatter.toString() , "it is 12.30 good ! aaa  ");
    }
}
