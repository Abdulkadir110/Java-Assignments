package tdd;

public class Aves extends Vertebrates{
    public Aves(String name, int age, double weight) {
        super(name, age, weight);
    }
    void move(){
        IO.println(name + " is an ave under vertebrate, that is " + age + " years old, with " + weight + "kg, is moving");
    }
}
