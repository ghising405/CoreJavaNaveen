package OOPConceptPart2;

/*
In this class we will test. so we need main method.
1. create object of BMW class in main method. Because BMW is publicly accessible/ defined. And we can create object in TestClass13 class

2. start() is both in Car13 and BMW13 class. How to know which one we are getting?
Whenever a method is common in child class and parent class, the preference will be given to child class method.
Java compiler will say: you're already having your own start(), why are you going to access from your parent? It will say no need to inherit.
You've already overridden start() from Car13 class(parent), then use your own method. Don't take start() from your parent.

Method overriding: when same method is present in parent class as well as in child class with the same name and
same number of arguments. Then it is called method overriding. common method = overridden method

Compile time polymorphism: at the time of compilation Java will decide which method Java will need to call.

Polymorphism: means one to many methods. It means method overridden. same method (with same name and method) is
written in parent and child class. And there is method overriding.

Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.

Dynamic polymorphism or run time polymorphism: child class object can be referred by parent class reference variable.
child says: we've done lots of hard work in theftSafety feature, how can you access just by creating the reference? you can refer my object but you cannot take my properties.
Only overridden methods (common method) and parent class methods will be called using dynamic polymorphism.

To access theftSafety feature --> use static/ compile time polymorphism. And only pure BMW class object reference variable can access BMW's feature.

Top casting: dynamic polymorphism. child can be referred by parent. allowed
down casting: degrading parent class to child class. not allowed. will give ClassCastException error.

 */

public class TestCar13 {

    public static void main(String[] args) {

        //Object created to access BMW13 Class
        //this is called ***** static polymorphism or ---- compile time polymorphism
        BMW13 b = new BMW13();
        b.start(); //start method of BMW is called. Overridden method.
        b.stop();  //it will check first in BMW13 class; not found; goes to parent class; found; inherit from parent class
        b.refuel(); //same as for stop. first checks in BMW13 class and then to parent class and inherits from there.
        b.theftSafety(); //inherited from BMW13 class
        b.engine(); //from grandparent Vehicle class

        System.out.println("*****************************************");

        //create parent class object: you can only access car class method because parent cannot inherit any property from child.
        Car13 c = new Car13();
        c.start(); //parent's own method
        c.stop();  //parent's own method
        c.refuel(); //can access refuel method from car class because it is it's own method.
        //Car class cannot access theftSafety method because it is child class' method.
        // parent cannot inherit any property from child. But child can inherit all the property of parent.


        System.out.println("*************************");

        //Another concept: Dynamic polymorphism or run time polymorphism: child class object can be referred by parent class reference variable.
        //creating only object of BMW class without any reference
        Car13 c1 = new BMW13(); //object [new BMW13()]= child class;  reference variable = from parent class = Car13 c1
        //parent and child mixed
        c1.start(); //overridden method will be called. (from child class) because preference will always be given to child class method
        c1.stop(); //from parent
        c1.refuel(); //from parent
        //cannot access method in child class. Because object is from child class but it is referred by parent class reference variable.
        //Also called top casting: making child object class referred by parent class.
        //small thing can fit into big thing (parent maa child). so top casting is allowed.



        System.out.println("******************");

        //down casting: parent class object can be referred by child class reference variable
        //BMW13 b1 = new Car13(); // this is not allowed.
        //big thing cannot fit in small thing.
        //but if you cast, you can do that but will return: ClassCastException: car cannot be cast to BMW
        BMW13 b1  = (BMW13) new Car13();
        //(BMW13) = means casting and this will convert new Car13() object into BMW class object. And b1 can now refer the BMW class object.
        //while running: it will return error: ClassCastException: car cannot be cast to BMW. WHY?
        /*Because while compile time java will be confused. There are two stages of execution:
        1. compile time: says fine; car is converted to BMW
        2. run time: will give ClassCastException: means car cannot be cast to BMW.

         */







    }
}
