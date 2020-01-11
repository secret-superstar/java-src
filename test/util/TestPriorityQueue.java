package util;

import org.junit.Test;

/**
 * 队列的操作
 * 1. 对于优先级队列来看，会根据比较器来判断队列的元素的大小
 * 2. 采用数组的方式，每出一个队列，队列的数据全部向前移动一位
 */
public class TestPriorityQueue {

    /**
     * TestPriorityQueue ，
     * 通过比较器来生成优先级队列,根据比较器来排序队列的操作
     */
    @Test
    public void testCrud() {


    }

//    @SuppressWarnings("unchecked")
//    private void siftUpUsingComparator(int k, E x) {
//        while (k > 0) {
//            int parent = (k - 1) >>> 1;
//            Object e = queue[parent];
//            if (comparator.compare(x, (E) e) >= 0)
//                break;
//            queue[k] = e;
//            k = parent;
//        }
//        queue[k] = x;
//    }

}
