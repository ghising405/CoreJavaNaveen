package AbstractionConceptOOP24;

/*
In interface all the methods are abstract in nature. They have only method prototype; no method body.
No need to write abstract keyword.
always define only abstract keyword
no method body
only method declaration
we achieve 100% abstraction: we are not going to define any business logic inside the interface. Interface = only prototype / blueprint.

We cannot create the object of interface.
We cannot create the object of abstract class.
In interface we can define only static and final variables.
 */

public interface Car24 {

    int wheels = 4;  //by default this variable is final and static.


//declaring abstract method.
    public void start();
    public void stop();
    public void refuel();

}
