package OOPConceptPart1;

/*
1. create two global variables
2. make second global variable static
3. create two more methods
4. how to call static methods and variables?
--> 1. direct calling i.e. sum();
--> 2. calling by class name. i.e StaticAndNonStaticConcept10.sum();
5. How to call static variable?
---> 1. directly. eg System.out.println(age);
---> 2. call by classname. i.e. System.out.println(StaticAndNonStaticConcept10.age);
6. as soon as object is created, copy of non-static methods and variables will be given to the object.
7. static method and static variable is not part of an object.
separate memory location will be given to static (methods and variables). [age and sum()]
8. Can I access static method using object reference?
--> yes we can. --> obj.sum(); -->but it will give warning saying static method must be accessed in static way.
i.e. either it should be called directly or call by classname. So calling static method by object is not a good practice.
Static method = freely available in java memory.
9. how to call non static (methods and variables) --> by creating object.


 */
public class StaticAndNonStaticConcept10 {

    //global variable: the scope of global variables will be available across all the functions with some conditions.
    //condition: if static (call directly or call by classname), and if non-static (call by creating object).
    String name = "Tom";    //non-static global variable
    static int age = 25;    //static global variable


    public static void main(String[] args) {

        //how to call static method?
        //calling static method directly:
        sum();
        //calling by classname
        StaticAndNonStaticConcept10.sum();

        //how to call static variable?
        //1. direct calling
        System.out.println(age);
        //2. calling by classname
        System.out.println(StaticAndNonStaticConcept10.age);

        //how to create non-static methods and variables?
        //by creating object
        StaticAndNonStaticConcept10 obj = new StaticAndNonStaticConcept10();
        obj.sendMail();
        System.out.println(obj.name);
        //as soon as object is created, copy of non-static methods and variables will be given to the object.


    }

    public void sendMail(){   //non static method
        System.out.println("Send mail method");
    }

    public static void sum(){  //static method
        System.out.println("Sum method");
    }
}
