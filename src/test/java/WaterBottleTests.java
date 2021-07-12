import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTests {

    WaterBottle waterbottle;

    @Before
    public void setUp(){
        waterbottle = new WaterBottle();
    }

    @Test
    public void testWaterBottleHasStartingVolumeOf100(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void testDrinkRemoves10Volume(){
        waterbottle.drink();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void testEmptyWaterBottleEmptiesBottle(){
        waterbottle.empty();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void testFillBottleSetsVolumeTo100(){
        waterbottle.fill();
        assertEquals(100, waterbottle.getVolume());
    }
}
