package BoyGirlfriend;

public class LekkiBabe implements GirlFriend{
    @Override
    public void cook(){
        System.out.println("Cook with plenty pepper");
    }
    @Override
    public void cook(String food){
        System.out.printf("Cook %s with plenty pepper%n", food);
    }
}
