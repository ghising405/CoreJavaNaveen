package JavaBasics;

/*
1. declared global variables
2. created parameterized constructor
3. default constructor is automatically there, so it is not created
4. created object : className obj-ref-variable = new className();
5. to initialize global variable:
Inside parameterized constructor : this.name = name  i.e this.global = local

# Whenever you want to initialize your global / class variable with the current value of  constructor,
in that case we've to use "this" keyword.
 */

public class ConstructorWithThisKeyword20 {

    //declaring global variables
    String name;
    int age;

    //creating parameterized constructor
    public ConstructorWithThisKeyword20(String name, int age){ //local variables of constructor
        this.name = name; //this.global = local
        this.age = age;
        System.out.println(name);
        System.out.println(age);
        //tom=local and this makes global = local so now tom = global. i.e. tom=local=global

    }


    public static void main(String[] args) {

        //creating object of the class or constructor
        ConstructorWithThisKeyword20 obj = new ConstructorWithThisKeyword20("Tom",30);
        //tom will be given to name, 30 will be given to age that is in global variable




    }
}
