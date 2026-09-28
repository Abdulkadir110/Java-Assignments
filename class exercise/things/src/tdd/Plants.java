package tdd;

public class Plants extends LivingThings{
    public Plants(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    void move(){
        IO.println( name + "plant, which is " + age + " years old, with " + weight + "kg, is moving");
    }
}
