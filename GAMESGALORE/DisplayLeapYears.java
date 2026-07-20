/*
Set a loop that counts from 2000 to 2100
then if the number is divible by 4 and it is not a multiple of 100 or it is divisble by 400
print the number.
**/



public class DisplayLeapYears {
	public static void main(String[] args) {
		
		for(int counter = 2000; counter <= 2100; counter++)	{
			
			if(counter % 4 == 0 && counter % 100 != 0 || counter % 400 == 0) {
				System.out.printf("%d\t\t ", counter);
			}
	
		}
	}
}