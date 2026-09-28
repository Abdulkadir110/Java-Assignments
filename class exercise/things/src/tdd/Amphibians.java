package tdd;

public class Amphibians extends Vertebrates{
    public Amphibians(String name, int age, double weight) {
        super(name, age, weight);
    }
    void move(){
        IO.println(name + " is an amphibian under vertebrate, that is " + age + " years old, with " + weight + "kg, is moving");
    }
}
