public class printTriangles {
    public static void main (String...args){

        printShapes(10);
        
    }
    
    public static void printShapes(int number){
        printFirstTriangle(number);
        printSecondTriangle(number);
    }    
        
    public static void printSecondTriangle(int number){
        for(int i = number-1; i >= 1; i--)numberOfTimes(i);
    }    
    
    public static void printFirstTriangle(int number){
        for (int i = 1; i <= number; i++)numberOfTimes(i);
    }
    
    public static void numberOfTimes(int number){
        for (int i = 1; i <= number; i++) printStars();
        printSpace();
    }
    
    public static void printStars(){
        System.out.print("* ");
    }

    public static void printSpace(){
        System.out.println();
    }
}
