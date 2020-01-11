package lang;

import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;


/**
 * 非常有用的字段和方法
 * 描述：
 * 1. 包括输入，输出
 * 2. 包括定义的属性和环境变量
 * 3. 加载的文件和库文件
 * 4. 一个工具的方法进行快速的数组复制
 */
public class TestSystem {

    /**
     * 支持对于对象内存进行copy的处理
     */
    @Test
    public void arraycopy() {

        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[6];
        arr2[3] = 4;
        arr2[4] = 5;
        arr2[5] = 6;
        System.arraycopy(arr1, 0, arr2, 0, 3);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr2);

        System.arraycopy(arr1, 0, arr2, 2, 1);
        Assert.assertArrayEquals(new int[]{1, 2, 1, 4, 5, 6}, arr2);


        for (int i = 0; i < arr2.length; i++) {
            System.out.println("value :" + arr2[i]);
        }
    }

    /**
     * 对于系统的属性的测试
     * 描述：
     * 1. 获取系统的属性
     * 2. 更新属性值
     * 3.
     */
    @Test
    public void properties() {

        Properties properties = System.getProperties();
    }
}
