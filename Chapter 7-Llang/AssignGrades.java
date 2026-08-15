import java.util.Scanner;
public class AssignGrades {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = inputCollector.nextInt();
        
        int[] scores = new int[numberOfStudents];
        System.out.print("Enter 4 scores: ");
        for(int index = 0; index < numberOfStudents; index++){
            scores[index] = inputCollector.nextInt();
        }
        resultOfStudent(numberOfStudents, scores);
    }
    public static int bestIn(int[] scores) {
        int best = scores[0];
        for(int index = 0; index < scores.length; index++){
            if(scores[index] > best) {
                best = scores[index];
            }
        }
        return best;
    }
     public static String gradeOf(int scores, int best) {
        if (scores >= best - 10 ) {
            return "grade is A";
        }
        else if (scores >= best - 20)  {
            return "grade is B";
        }
        else if (scores >=  best - 30) {
            return "grade is C";
        } 
        else if (scores >= best - 40) {
            return "grade is D";
        } 
        else {
            return "grade is F";
        }
      }
      
    public static void resultOfStudent(int numberOfStudents, int[] scores) {
        for(int index = 0; index < numberOfStudents; index++){
            System.out.println("Student " + index + " score is " + scores[index] + " and " + gradeOf(scores[index], ));
            
        }
    }
}    
