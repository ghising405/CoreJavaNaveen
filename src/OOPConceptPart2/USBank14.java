package OOPConceptPart2;

/*
Step 1: create interface
step 2: create class
Interface:
(internet)
Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body).
Interfaces specify what a class must do and not how. It is the blueprint of the class.
An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
If a class implements an interface and does not provide method bodies for all functions specified in the interface, then the class must be declared abstract.
A Java library example is, Comparator Interface. If a class implements this interface, then it can be used to sort a collection.

To declare an interface, use interface keyword. It is used to provide total abstraction. That means all the methods in an interface are declared with an empty body and are public and all fields are public, static and final by default. A class that implements an interface must implement all the methods declared in the interface. To implement interface use implements keyword.

(Naveen)
1. create interface instead of class. There is no main() in interface.
In interface we write rules and regulations in the form of method. Giving method body will give error.
variable and methods defined in Interface are pre-defined standard rules. We cannot change these rules.
 */

public interface USBank14 {

    //initializing variable
    int min_bal = 100; //static by nature--> can call directly or classname. no need to create object
    //also final by nature. it cannot be changed.

    //creating method. Here there won't be method body part i.e. {... }. Only declaration of the method will be here
    public void credit(); //non-static so need to create object to call.
    public void debit();
    public void transferMoney();


    /*Different properties of interface:
    1.only method declaration is done.
    2. there won't be method body. i.e. only method prototype.
    3. In interface we can declare the variables and variables are by default static in nature. So no need to write static keyword there.
    **if it is static, you can call directly or by classname and without creating object.
    4. the value of variable will not be changed.
    5. no static method in interface. i.e no "public static void method()".
    Because interface are part of object oriented programming concept(OOP). It's part of objects. So objects cannot have static method. That's why we cannot write static method in interface
    ***if there is object, then that means it is non-static method.
    6. no main method in interface.
    7. Interface are abstract in nature. that means we cannot create/instantiate the object of interface.

     */






}
