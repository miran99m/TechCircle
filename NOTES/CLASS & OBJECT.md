
What is Polymorphism?
EXAMPLE:
Think of different types of vehicles such as cars, bikes, and buses. All of these vehicles have a common method of transportation, which is to move from one place to another. However, they do so in different ways, using different methods of propulsion.

For example, cars use internal combustion engines or electric motors, while bikes use pedals and muscles, and buses use diesel engines or electric motors. Despite their different methods of propulsion, all vehicles have a common method of transportation, which is an example of polymorphism.

In this scenario, the different types of vehicles are the subclasses, and the method of transportation is the common method that they all share, which allows them to respond to the same message (move from one place to another) in different ways.





OverRiding

Method overriding is a feature of Java's inheritance mechanism.

To override a method, the method in the subclass must have the same name, return type, and parameter list as the method in the parent class.

The access level of the overridden method in the subclass cannot be more restrictive than the access level of the same method in the parent class.For example, if the parent class's method is public, then the subclass's method cannot be private or protected.

The @Override annotation can be used to indicate that a method is intended to override a method in the parent class. This annotation is optional but can help catch errors during compilation if the method is not correctly overridden.



OverLoading!!!
The method must have the same name as another method in the class.

The method must have different parameters than the other method(s) with the same name.

The parameters must differ in one of the following ways:
1-Number of parameters
2-Data type of the parameters
3-Order of the parameters



Task OverRide

- Create a parent class called "Vehicle" 
two methods: startEngine() and stopEngine()

		 - The startEngine() method should print a message indicating that 
		 "the engine of the vehicle is starting."

		 - The stopEngine() method should print a message indicating that 
		 "the engine of the vehicle is stopping."

-Create two subclasses called "Car" and "Motorcycle" that extend the "Vehicle" class.

-Override the startEngine() and stopEngine() methods for each subclass to print messages that are specific to cars and motorcycles. 

For example: 
-the startEngine() method for the "Car" class could print a message like 
"Starting the engine of the car..."

-the startEngine() method for the "Motorcycle" class could print a message like
 "Starting the engine of the motorcycle...".

Create a main method that creates objects of the "Car" and "Motorcycle" classes and calls their "startEngine()" and "stopEngine()" methods.

Print the output to the console to demonstrate that the methods are working correctly.








