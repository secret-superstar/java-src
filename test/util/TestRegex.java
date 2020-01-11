package util;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试正则表达式
 */
public class TestRegex {


    /**
     * 增删改查的处理操作
     */
    @Test
    public void testCrud() {


        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaab");
        Assert.assertTrue(matcher.matches());

        Assert.assertTrue(Pattern.matches("a*b", "aaaab"));
    }


}
