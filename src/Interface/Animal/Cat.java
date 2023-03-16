package Interface.Animal;

public class Cat implements Animal {

	private String name;

    // Constructor method
    public Cat(String name) {
        this.name = name;
    }

    // Implement the "speak" method from the "Animal" interface
    public void speak() {
        System.out.println(name + " says meow!");
    }

    // Implement the "eat" method from the "Animal" interface
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
}
