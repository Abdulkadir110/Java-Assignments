package tdd;

public class Invertebrates extends Animals{
    public Invertebrates(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    void move(){
        IO.println(name + " is a invertebrate that is " + age + " years old, with " + weight + "kg, is moving");
    }
}
