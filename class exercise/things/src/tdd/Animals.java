package tdd;

public class Animals extends LivingThings{
    public Animals(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    void move(){
        IO.println(name + " is an animal that is " + age + " years old, with " + weight + "kg, is moving");
    }
}
