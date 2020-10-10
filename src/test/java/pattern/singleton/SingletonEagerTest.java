package pattern.singleton;

import org.junit.jupiter.api.Test;

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
    public void testCountValueIsConstant() {
        SingletonEager first = SingletonEager.getInstance();
        SingletonEager second = SingletonEager.getInstance();

        int expectedCount = 1;

        assertEquals(expectedCount, first.getCount());
        assertEquals(expectedCount, second.getCount());
    }

}
