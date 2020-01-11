package util;


import org.junit.Assert;
import org.junit.Test;

import java.text.Collator;
import java.util.*;

/**
 * JAVA的数组能力的处理
 * 描述：
 * 1.该类主要用于数组的操作，包括搜索，排序，还有数组转成列表的处理方式
 * 2. 对于数组的特性的进行处理
 */
public class TestArrays {


    @Test
    public void testCrud() {

        String[] strings = new String[]{"1", "2"};
        List list = Arrays.asList(strings);

        int pos = Arrays.binarySearch(strings, "2");
        Assert.assertEquals(1, pos);
        Arrays.sort(strings);

        Assert.assertEquals("1", strings[0]);

        //对于比较器的处理方式
        Comparator<String> comparator = new StringComparator();
        Arrays.sort(strings, comparator);

        String[] strings2 = new String[]{"西瓜", "大豆"};
        Comparator<String> comparator1 = new ChinaCollatorComparator();
        Arrays.sort(strings2, comparator1);
        Assert.assertEquals("大豆", strings2[0]);

    }

    class StringComparator implements Comparator<String> {

        /**
         * @param o1
         * @param o2
         * @return
         */
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }

    class ChinaCollatorComparator implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {

            Collator collator = Collator.getInstance(Locale.CHINA);
            return collator.compare(o1, o2);
        }
    }

    /**
     * 对于数组的各种排序的实现，核心是使用Dual-Pivot的快速排序的逻辑来实现的
     * 1. 默认快速排序在1<<13 (8w)数据类性能非常高， 超过了这个值的时候排序，
     * 2. 可以采用parallelSort，这个是在大的数据里面进行指定区域进行排序操作 ，
     * 详细见：ArraysParallelSortHelpers.FJChar.Sorter
     *
     * @todo ， 对于研究排序算法来说，可以重点看下这一块的逻辑
     */
    @Test
    public void testSort() {

        int[] arr = new int[]{1, 3, 9, 7, 6, 7, 20};
        Arrays.sort(arr);

        //排序后的结果验证
        Assert.assertArrayEquals(new int[]{1, 3, 6, 7, 7, 9, 20}, arr);

    }

    /**
     * 对于数组的搜索的实现，核心主要是根据二分法的搜索来处理
     */
    @Test
    public void testSearch() {


    }

    /**
     * 二分法的搜索处理
     *
     * @param a
     * @param fromIndex
     * @param toIndex
     * @param key
     * @return
     */
    // Like public version, but without range checks.
    private static int binarySearch0(long[] a, int fromIndex, int toIndex,
                                     long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    public static int hashCode(long a[]) {
        if (a == null)
            return 0;

        int result = 1;
        for (long element : a) {
            int elementHash = (int)(element ^ (element >>> 32));
            result = 31 * result + elementHash;
        }

        return result;
    }


}

