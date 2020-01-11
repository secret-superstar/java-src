package util;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * 使用数组做的双端队列，
 * deque 即双端队列
 * 初始对象是8个.
 * 核心方法是使用System.arraycopy的处理方式
 */
public class TestArrayDeque {

    @Test
    public void testCrud() {

        Deque<String> deque = new ArrayDeque<>();
        Assert.assertEquals(0, deque.size());

        deque.add("1");
        deque.add("2");
        deque.add("3");
        Assert.assertEquals(true, deque.contains("2"));

        //开始双端队列的处理方式，在前面和在后面添加队列的方式
        deque.addFirst("0");
        deque.addLast("4");

        //检查下队列数据应该是0，1，~4
        Object[] arr = deque.toArray();
        Assert.assertEquals(arr, new Object[]{"0", "1", "2", "3", "4"});

        //先进先出的方式
        Assert.assertEquals("0", deque.element());
        Assert.assertEquals("4", deque.getLast());

        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            Assert.assertNotNull(iterator.next());
        }

        //进行队列的删除操作
        deque.push("11");
        deque.pop();

        //进行队列的制定删除
        deque.remove("2");
        deque.removeFirst();
        Assert.assertNotEquals(0, deque.size());
        deque.clear();
        Assert.assertEquals(0, deque.size());
    }
}
