package util;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * 属性值管理
 * 描述：
 * 1. 属性值的列表信息
 * 2. 属性是继承了HashTable ，HashTable 主要是对key和value的数据处理
 * 3. 支持了对于输入和输出流的
 */
public class TestProperties {


    @Test
    public void testCrud() throws IOException {

        Properties properties = new Properties();
        properties.setProperty("k1", "v1");
        properties.setProperty("k2", "v2");
        properties.setProperty("k3", "v3");
        properties.setProperty("k4", "v4");

        Assert.assertEquals(properties.getProperty("k3"), "v3");
        Assert.assertEquals(true, properties.contains("v4"));
        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            Assert.assertNotNull(enumeration.nextElement());
        }

        //修改k4的值
        properties.setProperty("k4", "v5");
        Assert.assertTrue(properties.contains("v5"));

        //删除掉属性的key
        properties.remove("k4");
        Assert.assertFalse(properties.contains("v5"));

        //删除掉所有的属性值的情况
        properties.clear();
        Assert.assertTrue(properties.isEmpty());

        //测试加载属性文件的操作
        Properties properties1 = new Properties();
        FileInputStream inStream = new FileInputStream("tmp.properties");
        properties1.load(inStream);
        Assert.assertTrue(properties1.contains("v6"));

        //相同的结果信息
        Assert.assertEquals("v6", properties.getProperty("k6"));

    }

}
