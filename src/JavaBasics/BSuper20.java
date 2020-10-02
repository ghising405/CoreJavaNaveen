package JavaBasics;

/*
to create relationship: B is a child of A

If any particular class is extending any parent class.
In ASuper20.java (parent class)  we have default constructor
But now if we remove constructor, it will print child class constructor.
The concept here is : the moment I create the object of B (child class) immediately it will jump to B constructor.
But then it sees B extends A, then the object will go first to parent class A. Object will check if we have any
default constructor. Currently we've disabled default constructor but there will be hidden constructor and that will be called.
And in hidden default constructor we are not printing anything, and that's why we will not get anything.
But now we have A constructor and the thing we want to print so it will print.
* create child class object
-- the object will first call parent class
-- and then it will call child class.

# super keyword: it is always used to call parent class constructor only. that's why even though default constructor is enabled, it calls only parameterized constructor and not default constructor.
If you don't write super, by default the object will call default constructor and doesn't matter if you've written or not.
Super keyword should always be the first statement in any constructor. it cannot be second or last statement.
it should be written inside the child class constructor.

 */

public class BSuper20 extends ASuper20 { //Creating relationship between B and A

    public BSuper20(){ //zero parameter constructor

        //to call parent class constructor: we use super keyword
       //super(10); //we are calling parameterized constructor in parent class and giving the value of i
        //when we are using super, it will not print or call default constructor.
        //super(10,20); //we are passing two parameters so automatically 2 parameter constructor will be called.
        super(); //calling default constructor in A
        System.out.println("child class constructor");

    }

    public BSuper20(int i){   //one parameter constructor. calling one parameter constructor in A using super
        super(i);
    }

    public BSuper20(int i, int j){ //two parameter constructor. calling two parameter constructor in A using super
        super(i, j);

    }



    public static void main(String[] args) {

        //creating object of B class
        BSuper20 obj = new BSuper20();
        //the object will go to B constructor and call child class constructor


        //to call all the constructors in A we have to create constructors and object in B
        BSuper20 obj1 = new BSuper20(10);
        BSuper20 obj2 = new BSuper20(10, 20);


    }
}
