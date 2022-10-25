import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeTest {
    Deque <Integer> list = new Deque<>();

    @BeforeEach
    void setUp() {
        for (int i = 0; i < 5; i++) {
            list.addFront(i);
        }

        for (int i = 5; i < 10; i++) {
            list.addTail(i);
        }
    }

    @Test
    void addFront() {
        assertTrue(list.size() == 10);
    }

    @Test
    void addTail() {
        list.addTail(9);
        assertTrue(list.contains(9));
    }

    @Test
    void removeFront() {
        list.removeFront();
        assertFalse(list.contains(4));
    }

    @Test
    void removeTail() {
        list.removeTail();
        assertFalse(list.contains(9));
    }

    @Test
    void size() {
        for (int i = 0; i < 100; i++) {
            list.addFront(i);

            assertTrue(list.size() == 11 + i);
        }
    }
}