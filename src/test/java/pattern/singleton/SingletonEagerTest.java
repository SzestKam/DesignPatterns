package pattern.singleton;


import org.junit.Assert;
import org.junit.Test;

public class SingletonEagerTest {

    @Test
    public void testThatTwoVariablesOfInstanceAreEqual() {
        SingletonEager first = SingletonEager.getInstance();
        SingletonEager second = SingletonEager.getInstance();

        Assert.assertTrue(first == second);
        Assert.assertEquals(first, second);
    }

    @Test
    public void testCountValueIsConstant() {
        SingletonEager first = SingletonEager.getInstance();
        SingletonEager second = SingletonEager.getInstance();

        int expectedCount = 1;

        Assert.assertEquals(expectedCount, first.getCount());
        Assert.assertEquals(expectedCount, second.getCount());
    }

}
