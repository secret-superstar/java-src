package lang;

import org.junit.Assert;
import org.junit.Test;

/**
 * 字符串的处理操作
 */
public class TestString {


    /**
     * 创建增删改成的操作
     */
    @Test
    public void testCrud() {

        String string = new String("abc");

        //新增字符串的
        string = string + "def";
        Assert.assertEquals(string, "abcdef");

        //更新操作
        string = string.concat("g");
        Assert.assertEquals(string, "abcdefg");

        //检查下字符串的情况
        String substring = string.substring(0, 1);
        Assert.assertEquals("a", substring);

        //对字符串增加内容
        substring = substring.concat("a");

        Assert.assertEquals(string, "abcdefg");
        Assert.assertEquals(substring, "aa");
        Assert.assertTrue(substring.contains("a"));
        Assert.assertEquals("AA", substring.toUpperCase());

        //把字符串转成字节的方式
        byte[] bytes = string.getBytes();
        Assert.assertEquals(7, bytes.length);

    }
}
