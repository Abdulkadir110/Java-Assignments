import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStatisticsCalculator {

    @Test
    public void testForTheMeanOfTheCollection() {
       //Given 
        double[] numbers = {1.9, 2.5, 3.7, 2, 1.5};
        //When
        double expectedMean = StatisticsDeviation.mean(numbers);
        double actualMean = 2.33;
        //Check
        assertEquals(expectedMean, actualMean);
    }
    
    @Test
    public void testForTheDerivativeOfTheNumbersIn(){
        //Given 
        double[] numbers = {1.9, 2.5, 3.7, 2, 1.5};
        //When
        double expectedDerivative = StatisticsDeviation.deviation(numbers);
        double actualDerivative = -0.42;
        //Check
        assertEquals(expectedDerivative, actualDerivative);
    }
}
