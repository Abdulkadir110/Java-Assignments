package tdd;

public class StudentGradeBook {
    private int count;
    private int[][] gradeBook;
    private int numberOfStudents;
    private int numberOfSubjects;
    private int[] totalScoresForStudents;
    private double[] averageScoresForStudents;
    private int[] positions;


    public boolean isEmpty() {
        return count == 0;
    }
    public void setNumberOfStudents(int number){
        if(number < 0)throw new IllegalArgumentException("Invalid inputs");
        numberOfStudents = number;
    }
    public void setNumberOfSubjects(int number){
        if(number < 0)throw new IllegalArgumentException("Invalid inputs");
        numberOfSubjects = number;
    }
    public void setGradeBook(){
        gradeBook = new int[numberOfSubjects][numberOfStudents];
    }
    public int[][] getGradeBook(){
        return gradeBook;
    }
    public void putScoreIn(int subject, int student, int score){
        if(score < 0 || score > 100 || subject <= 0 || subject > numberOfSubjects || student <= 0 || student > numberOfStudents){
            throw new IllegalArgumentException("Invalid inputs");
        }
        gradeBook[subject - 1][student-1] = score;
        count = 1;
    }
    public int[] totalScoreForEachStudent(){
        totalScoresForStudents = new int[numberOfStudents];
        int total = 0;
        for(int student = 0; student < numberOfStudents; student++){
            total = 0;
            for(int subject = 0; subject < numberOfSubjects; subject++){
                total += gradeBook[subject][student];
            }
            totalScoresForStudents[student] = total;
        }
        return totalScoresForStudents;
    }
    public double[] averageScoreForEachStudent() {
        averageScoresForStudents = new double[numberOfStudents];
        double average = 0.0;
        int[] total = totalScoresForStudents;
        for(int score = 0; score < total.length; score++){
            average = (double) total[score] / numberOfSubjects;
            averageScoresForStudents[score] = average;
        }
        return averageScoresForStudents;
    }
    public int[] getPositionOfStudents() {
        positions = new int[numberOfStudents];
        double[] average = averageScoresForStudents;
        int count = 0;
        for(int index = 0; index < average.length; index++){
            count = 0;
            for(int secondIndex = 0; secondIndex < average.length; secondIndex++){
                if(average[secondIndex] >= average[index])count++;
            }
            positions[index] = count;
        }
        return positions;
    }
}