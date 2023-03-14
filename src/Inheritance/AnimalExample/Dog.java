package Inheritance.AnimalExample;

public class Dog extends Animal{

    private String breed;

    public Dog(String name, int age, String gender, double weight, String breed) {
        super(name, age, gender, weight);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

    public void makeSound() {
        System.out.println(name + " says woof!");
    }

    public String toString() {
        return super.toString() +
               "Breed: " + breed + "\n";
    }
}
