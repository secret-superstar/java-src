package util;


import org.junit.Assert;
import org.junit.Test;

import java.util.Base64;


/**
 */
public class TestBase64 {


    /**
     * Base64的编码和解码的操作
     */
    @Test
    public void testCrud() {

        //数据编码的操作
        byte[] bytes = Base64.getEncoder().encode("aaa".getBytes());

        Assert.assertNotNull(bytes);

        //对字节的处理操作
        byte[] decodeBytes = Base64.getDecoder().decode(bytes);

        Assert.assertEquals(decodeBytes, "aaa".getBytes());

    }

}

