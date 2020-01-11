package lang;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

/**
 * 类的创建和处理操作
 * 描述：
 * 1. 类是通过类的加载器来实现其的操作
 * 2.
 */
public class TestClass {

    /**
     * 类的增删改查的操作
     * 1. 加载类的处理操作
     * 2. 对于类的执行的处理操作
     * 3. 通过类的反射机制来来获取类的处理操作
     */
    @Test
    public void testCrud() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class testClass = Class.forName("lang.TestClass");

        //申请类的对象的处理操作
        TestClass testClass1 = new TestClass();

        //可以通过类名获取类的方法擦着哦
        testClass.getMethod("test1").invoke(testClass1);
    }

    public void test1() {
        System.out.println("test1");
    }
}
