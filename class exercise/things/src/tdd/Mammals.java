package tdd;

public class Mammals extends Vertebrates {
    public Mammals(String name, int age, double weight) {
        super(name, age, weight);
    }
    void move(){
        IO.println(name + " is a mammal under vertebrate. that is " + age + " years old, with " + weight + "kg, is moving");
    }
}
