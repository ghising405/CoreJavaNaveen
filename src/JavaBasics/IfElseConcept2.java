package JavaBasics;

//Different comparison operators
//inside if condition we always write some boolean condition. Boolean condition means either it should be true or false.
//if the condition inside if is satisfied then it comes to if part and prints the thing inside if.
//this is comparison: comparing two variables.
//different comparison operators are:
// < less than
// > greater than
// <= less than or equal to
// >= greater than or equal to
// == equal to equal to
// != not equal to
//c=d -> assignment operator, means now the value of c is also d. it means assign the value od d into c.
//c==d -> comparison operator
//false and false = false
//true and true = true
//false and true = false
//if you want  to satisfy if condition , both the condition must be satisfied, then only it will come to if part.


public class IfElseConcept2 {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;

        if (b > a) {
            System.out.println("b is greater than a");
            //if b is greater than a and if if it is true, console will display b is greater than a
        } else {
            System.out.println("a is greater than b");
            //if b is not greater than a then it will come to else part and will print a is greater than b
        }

        int c = 40;
        int d = 40;
        if (c == d) {
            System.out.println("c and d are equal"); //if c and d are equal print both are equal
        } else {
            System.out.println("c and d are not equal");
        }


        //write a logic to find out the highest number
        int a1=100;
        int b1=200;
        int c1=300;

        //for this we will use nested if else condition:
        //first i will compare a1 with b1 and c1

        if(a1>b1 & a1>c1){  //condition not satisfied = both are false
            System.out.println("a1 is the greatest"); //if a1 is greater than b1 and c1 then a1 is the greatest
        }
        //inside else we can create one more if
        else if(b1>c1){ //again condition not satisfied
            System.out.println("b1 is the greatest"); //if this condition is also not satisfied then come to the else part
        }
        else { System.out.println("c1 is the greatest");} //condition satisfied.





    }
}


