package util;

import org.junit.Test;

import java.util.Queue;

/**
 * 链表队列的检查，并且对于并发的CAS的检查操作
 */
public class TestConcurrentLinkedQueue {

    @Test
    public void testCrud(){

    }

//    /**
//     * Inserts the specified element at the tail of this queue.
//     * As the queue is unbounded, this method will never return {@code false}.
//     *
//     * @return {@code true} (as specified by {@link Queue#offer})
//     * @throws NullPointerException if the specified element is null
//     */
//    public boolean offer(E e) {
//        checkNotNull(e);
//        final Node<E> newNode = new Node<E>(e);
//
//        for (Node<E> t = tail, p = t;;) {
//            Node<E> q = p.next;
//            if (q == null) {
//                // p is last node
//                if (p.casNext(null, newNode)) {
//                    // Successful CAS is the linearization point
//                    // for e to become an element of this queue,
//                    // and for newNode to become "live".
//                    if (p != t) // hop two nodes at a time
//                        casTail(t, newNode);  // Failure is OK.
//                    return true;
//                }
//                // Lost CAS race to another thread; re-read next
//            }
//            else if (p == q)
//                // We have fallen off list.  If tail is unchanged, it
//                // will also be off-list, in which case we need to
//                // jump to head, from which all live nodes are always
//                // reachable.  Else the new tail is a better bet.
//                p = (t != (t = tail)) ? t : head;
//            else
//                // Check for tail updates after two hops.
//                p = (p != t && t != (t = tail)) ? t : q;
//        }
//    }

}
