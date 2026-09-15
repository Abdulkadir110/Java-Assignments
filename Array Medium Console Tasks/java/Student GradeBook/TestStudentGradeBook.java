import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class TestStudentGradeBook {

    @Test
    public void testClassAverageOfTheScores() {
        int[] scores = {80, 70, 90};
        
        double expected = StudentGradeBook.classAverageOf(scores);
        double actual = 80.0;
        
        assertEquals(expected,actual);
    }

    @Test
    public void testTheHighestScore() {
        int[] scores = {60, 90, 75, 85};
        
        int expected = StudentGradeBook.highestScoreIn(scores);
        int actual = 90;
        
        assertEquals(expected,actual);
    }

    @Test
    public void testTheSmallestScore() {
        int[] scores = {60, 90, 75, 85};
        
        int expected = StudentGradeBook.smallestScoreIn(scores);
        int actual = 60;
        
        assertEquals(expected,actual);
    }

    @Test
    public void testTheNumberOfStudentsPassed() {
        int[] scores = {45, 60, 80, 30, 50};
        
        int expected = StudentGradeBook.numberOfStudentsPassedIn(scores);
        int actual = 3;
        
        assertEquals(expected,actual);
    }

    @Test
    public void testThatTheScoresAreSorted() {
        int[] scores = {60, 90, 75, 85};

        int[] expected = StudentGradeBook.sortedScoresIn(scores);
        int[] actual = {90, 85, 75, 60};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSpecificStudentScore() {
        int[] scores = {60, 90, 75, 85};
        
        int expected = StudentGradeBook.specificStudentScore(scores, 2);
        int actual = 85;
        
        assertEquals(expected,actual);
    }
}
