package animalDogCat;

import java.util.ArrayList;

public class AnimalMain {
    void main(){
        ArrayList<Animal> animals = new ArrayList<>();

        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Ben");
        Bird bird = new Bird("Tweety");

        animals.add(cat);
        animals.add(dog);
        animals.add(bird);

        for(int index = 0; index < animals.size(); index++){
            IO.println(animals.get(index).makeSound());
        }
    }
}
