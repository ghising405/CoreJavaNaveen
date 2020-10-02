package OOPConceptPart1;

/*
1. created sum() outside main method
2. created another sum() outside main method
****duplicate methods are not allowed i.e. same method name are not allowed.
*methods are independent to each other.
*we cannot create a method inside a method.
* in case we have two same method names, we can differentiate by adding parameter eg. sum(); sum(int i);

Method overloading: sum() method is overloaded method because we've given same method name i.e. sum with
zero-input parameter, one-input parameter, and two-input parameters within the same class.

How to call these non-static methods?
By crating object.

 */

public class MethodOverloading9 {

    public static void main(String[] args) {

        //to call non-static methods in main method create object
        MethodOverloading9 obj = new MethodOverloading9();

        obj.sum(); //this will go to sum method and prints what sout has
        obj.sum(10); //prints Sum method and 10
        obj.sum(10, 5); //k=10, l=5



    }


    //Method overloading: when the method name is same with different input parameters or arguments within the same class
    //make sure they also have different data types.
    public void sum(){  //zero input parameter
        System.out.println("SUM method--- with zero parameter");
    }

    public void sum(int i){ //with one-input parameter. this is allowed because this differentiates sum(int i) method from sum() method.
        System.out.println("Sum method---with one-input parameter");
        System.out.println(i);
    }

    public void sum(int k, int l){ //two input parameter
        System.out.println("Sum method with two input parameter");
        System.out.println(k+l); //15

    }


}

/*
Notes:
1. you cannot create method inside a method
2. duplicate methods --- i.e. same method name with same number of arguments are not allowed
3. same method name with different parameter and different data type = method overloading
Can i create one more main method?
Yes-- but will have to have different data type and parameter.
Yes main method can be overloaded.

 */
