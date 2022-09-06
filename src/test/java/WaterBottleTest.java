import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;
    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void canDrinkWater(){
        assertEquals(90, waterBottle.drinkWater());
    }

    @Test
    public void canEmptyBottle(){
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void canFillBottle(){
        assertEquals(100, waterBottle.fillBottle());
    }
}
