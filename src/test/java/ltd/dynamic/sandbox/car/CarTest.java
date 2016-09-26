package ltd.dynamic.sandbox.car;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CarTest {

    private Car car;

    @Before
    public void setUp() {
        car = new Car();
    }

    @Test
    public void testSomething() {
        assertThat(car, is(notNullValue()));
    }
}