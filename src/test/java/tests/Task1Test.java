package tests;

import Lab3.Task1.ArrayImplementation;
import Lab3.Task1.DoubleStackImplementation;
import Lab3.Task1.LinkedListImplementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Task1Test {
    @Test
    void testArrayImplementation() {
        ArrayImplementation<Integer> queue = new ArrayImplementation<>();
        Assertions.assertTrue(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        Assertions.assertEquals(3, queue.size());
        Assertions.assertEquals(1, queue.peek());
        queue.dequeue();
        Assertions.assertEquals(2, queue.size());
        queue.dequeue();
        queue.dequeue();
        Assertions.assertEquals(0, queue.size());
    }

    @Test
    void testLinkedListImplementation() {
        LinkedListImplementation<String> queue = new LinkedListImplementation<>();
        Assertions.assertTrue(queue.isEmpty());
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");

        Assertions.assertEquals(3, queue.size());
        Assertions.assertEquals("a", queue.peek());
        queue.dequeue();
        Assertions.assertEquals(2, queue.size());
        queue.dequeue();
        queue.dequeue();
        Assertions.assertEquals(0, queue.size());
    }
    @Test
    void testDoubleStackImplementation() {
        DoubleStackImplementation<Integer> queue = new DoubleStackImplementation<>();
        Assertions.assertTrue(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        Assertions.assertEquals(3, queue.size());
        queue.dequeue();
        Assertions.assertEquals(2, queue.peek());
        Assertions.assertEquals(2, queue.size());
        queue.dequeue();
        Assertions.assertEquals(1, queue.size());
        queue.dequeue();
        Assertions.assertEquals(0, queue.size());
    }
}
