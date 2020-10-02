package JavaBasics; //package

public class DifferentDataTypes1 { //class keyword so this is class, public=access modifier


    //main method should be there in java main() method ---> starting/ execution point of the progress
    public static void main(String[] args) {

        /*Data types:
        1. int: int i=10; means in a big city (java memory) there is a person "i" living in one location in that big city.
          we cannot write -- int i=20 -- ; because the same variable cannot be assigned with different values.
          so, variables must be unique.
          Instead we can write -- i=20 -- ; this means the value  of i now will be replaced by 20. Before it was 10, now it's 20.

       2. Double = floating number. double d=12.33; double d1=100; all good because :
           we can store integer in double but not double in integer.

       3.  Character: should be written inside single quote ''
          eg. char c='a'; char c1='A'; char c2='1'; char c3='$'; all okay. here 1 is character because it's inside single quote.
          char should be only single digit value. i.e char c='aa'; is not allowed.

       4. boolean: this is either true or false. They are both values and keywords already available in Java.
           boolean b1 = true; boolean b2 = false;
           we cannot store any other values.

       5. string: it is a class. It is not a data type but can be used as a data type for String values.
            It should be written inside " ". eg. String s = "Hello World"; String s1="Selenium"; String s2 = "Hi this is my first program";
            String s3="1000"; this 1000 will be treated as a string.

        *** int, double, char and boolean are primitive data types but not String.
        *assigning unnecessary variables means taking unnecessary space in java memory. So better to use or delete.

         */

        //int
        int i=10;
        i=20;
        int j=30;
        System.out.println(j);
        int k=40; //unused variable so use it or delete it.
        int l=-1;
        System.out.println(l);
        System.out.println(i+j); //should be 50

        //double
        double d=12.33;
        double d1=34.44;
        System.out.println(d1);
        double d2=100; //treated as 100.00

        //char
        char c = 'a';
        char c1 = 'A';
        char c2 = '1';
        char c3 = '$';

        //boolean
        boolean b1=true;
        boolean b2 = false;

        //String
        String s1 = "Hello World";
        System.out.println(s1);


    }


}
