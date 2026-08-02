import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IyaHonourPizzaApplicationTest {
    @Test
    public void testThatCalculateTheNumberOfSapaSizePizzaTypeBoxes() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateNumberOfBoxesForSapaSizePizza(40);
    int expected = 10;
    assertEquals(expected, result);
    }
    
    @Test
    public void testThatCalculateTheSapaSizePizzaRemainingSlices() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateForSapaSizePizzaRemainingSlices(42);
    int expected = 2;
    assertEquals(expected, result);
    }

    @Test
    public void testThatCalculateThePriceForSapaSizeOrder() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateForSapaSizeOrder(42);
    int expected = 27500;
    assertEquals(expected, result);
    }
    ///////////////////////////////////////////////////////////////////

     @Test
    public void testThatCalculateTheNumberOfSmallMoneyPizzaTypeBoxes() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateNumberOfBoxesForSmallMoneyPizza(84);
    int expected = 14;
    assertEquals(expected, result);
    }
    
    @Test
    public void testThatCalculateTheSmallMoneyPizzaRemainingSlices() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateForSmallMoneyPizzaRemainingSlices(42);
    int expected = 0;
    assertEquals(expected, result);
    }

    @Test
    public void testThatCalculateThePriceForSmallMoneyOrder() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateForSmallMoneyOrder(42);
    int expected = 20300;
    assertEquals(expected, result);
    }
    /////////////////////////////////////////////////////////////////////

    @Test
    public void testThatCalculateTheNumberOfBigBoysPizzaTypeBoxes() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateNumberOfBoxesForBigBoysPizza(74);
    int expected = 10;
    assertEquals(expected, result);
    }
    
    @Test
    public void testThatCalculateTheBigBoysPizzaRemainingSlices() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateForBigBoysPizzaRemainingSlices(37);
    int expected = 3;
    assertEquals(expected, result);
    }

    @Test
    public void testThatCalculateThePriceForBigBoysOrder() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateForBigBoysOrder(22);
    int expected = 12000;
    assertEquals(expected, result);
    }
    ///////////////////////////////////////////////////////////////////////// 

    @Test
    public void testThatCalculateTheNumberOfOdogwuPizzaTypeBoxes() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateNumberOfBoxesForOdogwuPizza(62);
    int expected = 6;
    assertEquals(expected, result);
    }
    
    @Test
    public void testThatCalculateTheOdogwuPizzaRemainingSlices() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateForOdogwuPizzaRemainingSlices(97);
    int expected = 11;
    assertEquals(expected, result);
    }

    @Test
    public void testThatCalculateThePriceForOdogwuOrder() {

    IyaHonourPizzaApplication pizzaApp = new IyaHonourPizzaApplication();

    int result = pizzaApp.calculateForOdogwuOrder(104);
    int expected = 46800;
    assertEquals(expected, result);
    }
    ///////////////////////////////////////////////////////////////////////// 
}
