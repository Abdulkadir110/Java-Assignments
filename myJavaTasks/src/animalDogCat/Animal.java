package animalDogCat;

public class Animal {
    protected String name;
    Animal(String name) {
        this.name = name;
    }
    public String makeSound(){
        return "...";
    }
}
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound(){
        return name + " says bark!";
    }
}
class Cat extends Animal{

    Cat(String name){
        super(name);
    }
    @Override
    public String makeSound(){
        return name + " says meow!";
    }
}
class Bird extends Animal {
    Bird(String name){
        super(name);
    }
    @Override
    public String makeSound(){
        return name + " says tweet!";
    }
}
