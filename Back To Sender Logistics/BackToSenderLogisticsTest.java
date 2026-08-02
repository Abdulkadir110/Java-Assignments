import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackToSenderLogisticsTest {
    @Test
    public void testForTheAmountOfTheCollectionRateMoreThan70Percent() {
        BackToSenderLogistics logistics = new BackToSenderLogistics();
        int result = logistics.riderWageForSuccessfulDeliveryAboveSeventyPercent(87);
        int expected = 48500;

        assertEquals(expected, result);
    }
    @Test
    public void testForTheAmountOfTheCollectionRateBetween60To69Percent() {
        BackToSenderLogistics logistics = new BackToSenderLogistics();
        int result = logistics.riderWageForSuccessfulDeliveryBetweenSixtyToSixtyNinePercent(64);
        int expected = 21000;

        assertEquals(expected, result);
    }
    @Test
    public void testForTheAmountOfTheCollectionRateBetween50To59Percent() {
        BackToSenderLogistics logistics = new BackToSenderLogistics();
        int result = logistics.riderWageForSuccessfulDeliveryBetweenFiftyToFiftyNinePercent(56);
        int expected = 16200;

        assertEquals(expected, result);
    }
    @Test
    public void testForTheAmountOfTheCollectionRateLessThan50Percent() {
        BackToSenderLogistics logistics = new BackToSenderLogistics();
        int result = logistics.riderWageForSuccessfulDeliveryBelowFiftyPercent(33);
        int expected = 10280;

        assertEquals(expected, result);
    }

    @Test
    public void testForTheAmountOfTheCollectionRate() {
        BackToSenderLogistics logistics = new BackToSenderLogistics();
        int result = logistics.logisticsPayment(50);
        int expected = 15000;

        assertEquals(expected, result);
    }
}
