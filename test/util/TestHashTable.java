package util;

import org.junit.Test;

import java.util.Hashtable;


/**
 * 1.hashtable 的核心就是通过初始容量的散列来实现其效果
 * 2. hashtable 增加了synchronized 来保证线程的安全性的处理
 */
public class TestHashTable {

    @Test
    public void testCrud() {

    }


//    /**
//     * Increases the capacity of and internally reorganizes this
//     * hashtable, in order to accommodate and access its entries more
//     * efficiently.  This method is called automatically when the
//     * number of keys in the hashtable exceeds this hashtable's capacity
//     * and load factor.
//     */
//    @SuppressWarnings("unchecked")
//    protected void rehash() {
//        int oldCapacity = table.length;
//        Hashtable.Entry<?,?>[] oldMap = table;
//
//        // overflow-conscious code
//        int newCapacity = (oldCapacity << 1) + 1;
//        if (newCapacity - MAX_ARRAY_SIZE > 0) {
//            if (oldCapacity == MAX_ARRAY_SIZE)
//                // Keep running with MAX_ARRAY_SIZE buckets
//                return;
//            newCapacity = MAX_ARRAY_SIZE;
//        }
//        Hashtable.Entry<?,?>[] newMap = new Hashtable.Entry<?,?>[newCapacity];
//
//        modCount++;
//        threshold = (int)Math.min(newCapacity * loadFactor, MAX_ARRAY_SIZE + 1);
//        table = newMap;
//
//        for (int i = oldCapacity ; i-- > 0 ;) {
//            for (Hashtable.Entry<K,V> old = (Hashtable.Entry<K,V>)oldMap[i]; old != null ; ) {
//                Hashtable.Entry<K,V> e = old;
//                old = old.next;
//
//                int index = (e.hash & 0x7FFFFFFF) % newCapacity;
//                e.next = (Hashtable.Entry<K,V>)newMap[index];
//                newMap[index] = e;
//            }
//        }
//    }
}
