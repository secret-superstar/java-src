package lang;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 类的创建和处理操作
 * 描述：
 * 1. 类是通过类的加载器来实现其的操作
 *
 * @todo 对于类的深入的研究和处理，可以扩展类的处理特性
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

        //加载类
        Class testClass = Class.forName("lang.TestClass");

        //申请类的对象的处理操作
        TestClass testClass1 = new TestClass();

        //可以通过类名获取类的方法擦着哦
        testClass.getMethod("test1").invoke(testClass1);

        //打印类的信息
        System.out.println(testClass.toString());

        //这里可以对类进行动态的调用，比如通过不同的参数来调用类的玩法

        //循环打印类的信息
        Class[] interfaces = testClass.getInterfaces();

        Annotation[] annotations = testClass.getAnnotations();

        //获取类下的方法信息
        Method[] methods = testClass.getMethods();

        //能够获取类的信息，那么就可以获取

    }

    public void test1() {
        System.out.println("test1");
    }
}
