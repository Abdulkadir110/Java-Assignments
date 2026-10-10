package BoyGirlfriend;

public class MushinBabe implements GirlFriend{

    @Override
    public void cook() {
        System.out.println("Cooking with little pepper");
    }

    @Override
    public void cook(String food) {
        System.out.printf("Cooking %s with little pepper%n", food);
    }
}
