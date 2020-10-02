package JavaBasics;

// + sign is called concatenation operator.
//whenever you add integer with a string and if you are writing String first, that will be new String.
//whatever is passed inside "system.out.println" that will be printed in console.
//println= is used to print on the console with a new line
//print= is just used to print on the console.


public class StringConcatenation2 {

    public static void main(String[] args) {


        int a=100;
        int b=200;

        String x ="Hello";
        String y ="World";

        double c=12.33;
        double d=10.33;

        System.out.println(a+b); //result will be 100+200 = 300

        System.out.println(x+y); //will print HelloWorld

        //execution always starts from left to right.
        System.out.println(a+b+x+y); //will print 300HelloWorld

        System.out.println(x+y+a+b); //will print HelloWorld100200

        System.out.println(x+y+(a+b)); //will print HelloWorld300

        System.out.println(a+b+x+y+a+x+b+y); //will print 300HelloWorld100Hello200World

        System.out.println(a+b+x+y+a+b); //300HelloWorld100200

        System.out.println(c+d); //will be 22.66

        System.out.println(x+y+c+d); //should be HelloWorld12.3310.33 = new String

        //using concatenation
        System.out.println("The value of a is:"+a); // will print the value of a is:100
        System.out.println("the value of b is:"+b);  //the  value  of b is:200
        System.out.println("the addition of a and b is:"+(a+b)); //the addition of a and b is:300

        //println(prints on new line) and print(prints on same line)
        System.out.print("Hello selenium");
        System.out.println("hello testing"); //Hello SeleniumHello testing




    }
}
