package OOPConceptPart1;

/*
Immediately after the class, we will create 2 class variables/ global  variables.
global / class variable = variables declared immediately after class. Available throughout the program.

How to access global variables?
You have to create object of particular class.
When you create object a copy of global variable and non-static methods will be given to the object.
we access it using object reference variable/ object name.
object creation: className object-reference-variable = new className();
local variables cannot me used outside local methods.

What happens in java memory?
we have: 2 global variables; 1 main method and 1 sum method.
all the non-static things (copy of global variables and non-static method will be given to object)
there will be different location for main() in java memory.


 */

public class LocalVsGlobalVariables8 {

    //these are global variables or class variables.
    String name = "Tom";
    int age = 25; //this age is available throughout the program.


    public static void main(String[] args) {
        int i=10;   //i variable can be used only inside main method. This i is local variable of main method.

        LocalVsGlobalVariables8 obj = new LocalVsGlobalVariables8();
        //calling and printing global variable in main method.
        System.out.println(obj.name);
        System.out.println(obj.age);

    }

    public void sum(){
        int i = 15;     //local variable.
        //This i is different and i in main method is different. This i is local variable of sum().
        int j = 20;     //local variable.
        int age = 25;   //this age is available only inside the sum method. This is local variable
    //these variables i,j,age are available only inside local method i.e. sum(). Not outside sum method.
    }
}

