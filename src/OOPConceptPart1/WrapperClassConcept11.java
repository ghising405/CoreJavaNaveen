package OOPConceptPart1;

/*
Data conversion:
1. how to convert string into integer?
we can use wrapper class concept.
if we want to convert into integer then use Integer wrapper class. And then parse it using parseInt() method.
parseInt(x) will parse string x i.e. 100 into integer.
And the converted integer value will be stored in some int variable int i.
*******int i = Integer.parseInt(x);
int i = storage location for newly converted integer value i.e. 100.
Integer = wrapper class
parseInt(x) = method that converts string x into integer
2. Types of wrapper classes:
Integer, Double, Character, Boolean

**In selenium:
you have to parse some value from the web-page called "tax calculation". And you're getting it  in the form of string.
So, you'll have to convert the string value into double or integer value then only we can perform mathematical operation.
eg. tax = 200 and we have to add in the principal amount. before that we have to covert 200 into integer/ boolean then we can add.
At that time we have to use wrapper classes.
To convert string into integer, the string value must be pure numeric value.
eg. if given 100a then the output will give Number Format Exception: that means format of number is not correct.


 */

public class WrapperClassConcept11 {
    public static void main(String[] args) {

        String x = "100"; //100 is string here
        System.out.println(x+20); //output = 10020 doing string concatenation
        //how to convert String into integer?
        int i = Integer.parseInt(x);
        //Integer = wrapper class
        //parseInt(x) = used to parse the string and convert them into integer. x=string. we need to parse x variable
        //parseInt = will return integer.
        //int i = storage location for parsed string that is now converted into integer.
        //string 100 = integer 100 = int i
        System.out.println(i+20); //now i = 100 so output = 100+20 =120


        //string to double conversion
        String y = "12.33"; //for now this is string
        double d = Double.parseDouble(y);
        System.out.println(d+10); //will print 22.33
        //Double = wrapper class in which we want to convert.
        //parseDouble(y) = this will convert string y into double
        // double d = storage location for newly converted double value

        //convert string to boolean
        String k = "true"; //now it is a string
        boolean b =  Boolean.parseBoolean(k);
        System.out.println(b);
        //Boolean = wrapper class in which we want to convert
        //parseBoolean(k) = this will convert (parse) string k into boolean
        //boolean b = storage location for newly converted boolean value.


        //what if int to string conversion
        int j = 200;
        String s = String.valueOf(j);
        System.out.println(s+20); //always print new value that is in s. o/p = 20020

        //try to convert string to integer
        String u = "100A"; //not a pure numeric value.
        int p = Integer.parseInt(u);
        System.out.println(p);
        //will get Number Format Exception: that means the format of a number is not correct.



    }
}
