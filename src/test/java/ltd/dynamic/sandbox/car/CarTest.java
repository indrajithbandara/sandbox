package ltd.dynamic.sandbox.car;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class CarTest {

    private static final String MAKE = "Peugeot";
    private static final String MODEL = "Crapbag";
    private Car car;

    @Before
    public void setUp() {
        car = new Car(MAKE, MODEL);
    }

    @Test
    public void isConstructed() {
        assertThat(car, is(notNullValue()));
    }

    @Test
    public void getMake() {
        assertThat(car.getMake(), is(MAKE));
    }

    @Test
    public void getModel() {
        assertThat(car.getModel(), is(MODEL));
    }

    @Test
    public void getColour() {
        fail("Some stuff goes in here");
    }
}