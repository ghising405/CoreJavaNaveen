package ListConcept;
/*
When global variable name and local variable names are same, we use "this" keyword

Sometimes in ArrayList we can store objects (user defined objects) also.
How can we do that?
Make the ArrayList Employee type. eg. ArrayList<Employee> ar4 = new ArrayList<Employee>(); Then you can store the object in ArrayList
Before that: we created Employee object; created 3 employees; created arraylist object; made the ArrayList type Employee



 */

public class Employee17 {

    //declared variables. Global variables.
    String name;
    int age;
    String dept;

    //creating constructor of employee. constructor name = class name
    Employee17(String name, int age, String dept){ //local variables
        //how to initialize this value?
        //to initialize three global variables we use keyword this
        this.name = name; //this.global variable = local variable
        this.age = age;
        this.dept = dept;

        //created employee class object in ArrayListConcept class.

    }
}
