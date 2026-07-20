public class EvenNumbersBetweenOneToFifty {
	public static void main (String [] args) { 
		 for (int counter = 1; counter <= 50; counter++)	{
			if( counter % 2 == 0){
			   System.out.print(counter + " ");
			}
		}
	}
}