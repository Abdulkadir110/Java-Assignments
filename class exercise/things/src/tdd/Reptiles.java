package tdd;

public class Reptiles extends Vertebrates{
    public Reptiles(String name, int age, double weight) {
        super(name, age, weight);
    }
    void move(){
        IO.println(name + " is a reptile under vertebrate, that is " + age + " years old, with " + weight + "kg, is moving");
    }
}
