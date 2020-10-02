package JavaBasics;

/*
Constructor:
A class entity which is used to define some class features while creating the object.
Properties:
1. Constructor looks like a function / method but it's not a function.
2. Constructor cannot return any value because it does not have any return type like void, static, int, String, etc.
3. Constructor name should be same as class name.
Types of constructor:
1. default constructor: with zero parameters.
2. Parameterized constructor
# this concept is called constructor overloading. Because it has same name with different parameters.
# can we overload a constructor? yes.
# How to call a constructor?
Constructor will be immediately called when you create object of the particular class.
#default constructor is automatically generated so even though we don't create default constructor it will be there.
#and when we don't have default constructor body inside class and call default constructor, it will return/ print nothing.
#Now we have default constructor that prints --Default constructor-- so when we create default object to call default constructor, the object will go to default constructor amd prints what is inside the body i.e. Default constructor.

 The moment we create object, automatically the default constructor will  be called. And we haven't defined default constructor
 anywhere in the class but still default constructor will be called. eg
  FunctionsInJava obj = new FunctionsInJava();
  here: new FunctionsInJava() = default constructor object that will call default  constructor.
 */

public class ConstructorConcept20 {

    //default constructor
    public ConstructorConcept20(){
        System.out.println("Default constructor");
    }

    //parameterized constructor
    public ConstructorConcept20(int i){
        System.out.println("single parameter constructor");
        System.out.println("the value of i is" +i); //printing the value of i


    }

    //two parameter constructor
    public ConstructorConcept20(int i, int j){
        System.out.println("two parameter constructor");
        System.out.println("the value of i is" +i);
        System.out.println("the value of j is" +j);


    }

    public static void main(String[] args) {

        //creating class object
        ConstructorConcept20 obj = new ConstructorConcept20(); //in this case this object will automatically call default constructor.
        ConstructorConcept20 obj1 = new ConstructorConcept20(10); //this object will call one parameter constructor and gives the value 10 to i. i.e. i=10
        ConstructorConcept20 obj2 = new ConstructorConcept20(10,20); //this will call 2 parameter constructor and gives i=10 and j=20


    }

}
