import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class StatisticsCalculatorTest{
	
	@Test
	public void testThatIHaveAnArrayOfNumbersRange(){

	//Given
	int [] numbers = {3, 5, 7, 1, 25, 11, 0};

	//When
	int expectedRange = StatisticsCalculator.calculateRangeOf(numbers);

	int actualRange = 25;

	//Check
	assertEquals(expectedRange, actualRange);



	}
    
    @Test
    public void testThatIHaveAnArrayOfNumbersMean() {
    
    //Given
	int [] numbers = {3, 5, 7, 1, 25, 11, 0};

	//When
	double expectedMean = StatisticsCalculator.calculateMeanOf(numbers);

    double actualMean = 7.0;


    //Check
    assertEquals(expectedMean, actualMean);
    }
	
    @Test
    public void testThatIHaveAnArrayOfNumbersMedian() {
    
    //Given
	int [] numbers = {3, 5, 7, 1, 25, 11, 0};

	//When
	int expectedMedian = StatisticsCalculator.calculateMedianOf(numbers);

    int actualMedian = 5;


    //Check
    assertEquals(expectedMedian, actualMedian);
    }

    
    @Test
    public void testThatIHaveAnArrayOfNumbersMode() {
    
    //Given
	int [] numbers = {3, 5, 2, 1, 2, 11, 0, 2};

	//When
	int expectedMode = StatisticsCalculator.calculateModeOf(numbers);

    int actualMode = 2;


    //Check
    assertEquals(expectedMode, actualMode);
    }

    @Test
    public void testThatIHaveAnArrayOfNumbersDeviation() {
    
    //Given
	int [] numbers = {3, 5, 7, 1, 25, 11, 0};

	//When
	double[] expectedDeviation = StatisticsCalculator.calculateDeviationOf(numbers);

    double[] actualDeviation = {-4, -2 , 0, -6, 18, 4 ,-7};


    //Check
    assertArrayEquals(expectedDeviation, actualDeviation);
    }
    @Test
    public void testThatIHaveAnArrayOfNumbersMeanDeviation() {
    
    //Given
	int [] numbers = {3, 5, 7, 1, 25, 11, 0};

	//When
	double expectedMeanDeviation = StatisticsCalculator.calculateMeanDeviationOf(numbers);

    double actualMeanDeviation = 0.42857142857142855;


    //Check
    assertEquals(expectedMeanDeviation, actualMeanDeviation);
    }

    @Test
    public void testThatIHaveAnArrayOfNumbersVariance() {
    
    //Given
	int [] numbers = {3, 5, 7, 1, 25, 11, 0};

	//When
	double expectedVariance = StatisticsCalculator.calculateVarianceOf(numbers);

    double actualvariance = 63.57142857142857;


    //Check
    assertEquals(expectedVariance, actualvariance);
    }    

     @Test
    public void testThatIHaveAnArrayOfNumbersStandardDeviation() {
    
    //Given
	int [] numbers = {3, 5, 7, 1, 25, 11, 0};

	//When
	double expectedStandardDeviation = StatisticsCalculator.calculateStandardDeviationOf(numbers);

    double actualStandardDeviation = 9.081632653061224;


    //Check
    assertEquals(expectedStandardDeviation, actualStandardDeviation);
    }
    
    @Test
    public void testThatIHaveAnArrayOfNumbersCoefficientOfVariance() {
    
    //Given
	int [] numbers = {3, 5, 7, 1, 25, 11, 0};

	//When
	double expectedCoefficientOfVariance = StatisticsCalculator.calculateCoefficientOfVarianceOf(numbers);

    double actualCoefficientOfVariance = 129.73760932944606;


    //Check
    assertEquals(expectedCoefficientOfVariance, actualCoefficientOfVariance);
    }

}
