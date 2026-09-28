package tdd;

public class Pisces extends Vertebrates{
    public Pisces(String name, int age, double weight) {
        super(name, age, weight);
    }
    void move(){
        IO.println(name + " is a pisce under vertebrate, that is " + age + " years old, with " + weight + "kg, is moving");
    }
}
