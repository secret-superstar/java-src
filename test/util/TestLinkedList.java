package util;


import org.junit.Assert;
import org.junit.Test;

import java.util.*;


/**
 * 数组列表的处理
 */
public class TestLinkedList {


    @Test
    public void testCrud() {


        List<String> list = new LinkedList<String>();

        list.add("1");
        list.add("2");
        list.add("3");

        Assert.assertEquals("1", list.get(0));
        Assert.assertNotEquals(1, list.get(0));

        list.set(0, "0");
        list.set(1, "1");

        Assert.assertEquals("0", list.get(0));
        Assert.assertEquals("1", list.get(1));

        //删除指定的值
        list.remove(0);
        Assert.assertNotNull(list.get(0));

        //循环打印所有的数据
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            Assert.assertNotNull(iterator.next());
        }

        //检查数组的长度情况
        Assert.assertEquals(2, list.size());
        Assert.assertFalse(list.isEmpty());

        Assert.assertTrue(list.contains("3"));
        Assert.assertEquals(1, list.indexOf("3"));
        list.remove("3");
        Assert.assertFalse(list.contains("3"));
        Assert.assertEquals(1, list.size());

        //全部删除，检查size是否为空
        list.clear();
        Assert.assertEquals(0, list.size());

    }

    /**
     * 进行深入测试
     * 1. 考虑集合的概念，把集合加入进来
     * 2. 对集合的数据进行单元测试的操作
     */
    @Test
    public void testDeep() {

        Collection<String> collection = new Stack<>();
        collection.add("1");
        collection.add("2");
        Assert.assertTrue(collection.contains("1"));
        Assert.assertFalse(collection.isEmpty());
        Assert.assertEquals(2, collection.size());

        Collection<String> collection2 = new Stack<>();
        collection2.add("2");
        collection2.add("1");
        collection2.add("3");

        //集合2 包含集合1,即使顺序一不一致都可以
        Assert.assertTrue(collection2.containsAll(collection));

        Assert.assertTrue(collection.addAll(collection2));

        //合并集合，数据是不重复的
        Assert.assertEquals(5, collection.size());

        //
        String[] arr = new String[]{"1", "2", "3"};
        List list = Arrays.asList(arr);
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {

            //迭代的数据都在1，2，3的数组里面
            Assert.assertTrue(list.contains(iterator.next()));
        }

        List list2 = Arrays.asList(collection.toArray());
        Assert.assertNotNull(list2);
        Assert.assertEquals(5, list2.size());

        //获取子列表的数据信息
        List subList = list2.subList(0, 2);
        Assert.assertEquals(2, subList.size());

        //不支持clear的操作，@todo
//        subList.clear();
//        Assert.assertEquals(0, subList.size());
        Assert.assertEquals(5, list2.size());


    }


}

