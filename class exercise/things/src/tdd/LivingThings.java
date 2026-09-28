package tdd;

public class LivingThings extends Things{
    public LivingThings(String name, int age, double weight) {
        super(name, age, weight);
    }
    void move(){
        IO.println("I am moving");
    }
}