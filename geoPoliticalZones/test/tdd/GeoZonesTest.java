import org.junit.jupiter.api.Test;
import tdd.GeoZones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GeoZonesTest {
    @Test
    void test(){
        GeoZones zone = new GeoZones("Lagos");

        assertEquals("SOUTH_WEST", zone.getZoneFor());
    }
    @Test
    void test2(){
        GeoZones zone = new GeoZones("dered");

        assertNull(zone.getZoneFor());
    }
}
