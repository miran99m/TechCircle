package Interface.Alarm;

public interface Alarm {

	/*
	 * An interface is a reference type in Java. It is similar to class. 
	 *  It is a collection of abstract methods. 
		However, an interface is different from a class in several ways, including −
		You cannot instantiate an interface.
		An interface does not contain any constructors.
		All of the methods in an interface are abstract.
		An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
		An interface is not extended by a class; it is implemented by a class.
		An interface can extend multiple interfaces.
		
	 */
	
	void setAlarm();
	
	int size = 5; // by default its static and final variable. you can't change the value later.
}
