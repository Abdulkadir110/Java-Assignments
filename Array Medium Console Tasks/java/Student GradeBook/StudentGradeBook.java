public class StudentGradeBook {
    public static double classAverageOf(int[] scores){
        int total = 0;
        for(int index = 0; index < scores.length; index++){
            total += scores[index];
        }
        return total / scores.length;
    }
    public static int highestScoreIn(int[] scores){
        int[] array = sortedScoresIn(scores);
        return array[0];
    }
    public static int smallestScoreIn(int[] scores){
        int[] array = sortedScoresIn(scores);
        return array[scores.length];
    }
     public static int numberOfStudentsPassedIn(int[] scores){
        int count = 0;
        for(int index = 0; index < scores.length; index++){
            if(scores[index] >= 50){
                count++;
            }
        }
        return count;
    }
    public static int[] sortedScoresIn(int[] scores){
        int temp = 0;
        for(int index = 0; index < scores.length; index++){
            for(int secondIndex = index + 1; secondIndex < scores.length; secondIndex++){
                if(scores[secondIndex] > scores[index]){
                    temp = scores[index];
                    scores[index] = scores[secondIndex];
                    scores[secondIndex] = temp;
                }
            }
        }
        return scores;
    }
    public static int specificStudentScore(int [] scores, int position){
        int[] array = sortedScoresIn(scores);
        return array[position-1];
    }
}
