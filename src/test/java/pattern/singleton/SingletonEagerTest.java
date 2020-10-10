package pattern.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SingletonEagerTest {

    @Test
    public void testThatTwoVariablesOfInstanceAreEqual() {
        SingletonEager first = SingletonEager.getInstance();
        SingletonEager second = SingletonEager.getInstance();

        assertTrue(first == second);
        assertEquals(first, second);
    }

    @Test
    @DisplayName("Always is one instance of object, the same counter value even we call it many times")
    public void testCountValueIsConstant() {
        SingletonEager first = SingletonEager.getInstance();
        SingletonEager second = SingletonEager.getInstance();
        SingletonEager third = SingletonEager.getInstance();

        int expectedCount = 1;

        assertEquals(expectedCount, first.getCount());
        assertEquals(expectedCount, second.getCount());
        assertEquals(expectedCount, third.getCount());
    }

}
