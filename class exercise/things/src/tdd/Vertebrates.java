package tdd;

public class Vertebrates extends Animals{
    public Vertebrates(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    void move(){
        IO.println(name + " is a vertebrate that is " + age + " years old, with " + weight + "kg, is moving");
    }
}
