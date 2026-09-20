import org.junit.jupiter.api.Test;
import tdd.GeoZones;

import static org.junit.jupiter.api.Assertions.*;

public class GeoZonesTest {
    @Test
    void test(){
        GeoZones zone = new GeoZones("Lagos");

        assertEquals("SOUTH_WEST", zone.getZoneFor());
    }
    @Test
    void test_to_throw_ExceptionForInvalidStates(){
        GeoZones zone = new GeoZones("vered");
        assertThrows(IllegalArgumentException.class, () -> zone.getZoneFor());
    }
}
