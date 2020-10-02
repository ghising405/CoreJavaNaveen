package JavaBasics;

/*
ONE DIMENSIONAL ARRAY
Array: to store similar data type values in a array variable.
how to declare?
int array: int [] = new int[4]; we can store 4 values.
int i[] = integer array variable
int i = normal/ simple integer variable
starting index = 0 and here ending index = 3

if the size of array is n, then the highest  index will be  n-1.
lowest bound or index =0
upper bound or index = n-1 where n = size of array
formula/method to print size of array = (i.length) i=variable name
to print all the values of array = use for loop
[] => one square bracket = one dimensional array.

Advantage: we can store multiple values in  single variable with similar datatype.

Two disadvantages of array:
1. size is fixed-- that's why it is called static array.
2. stores only similar data types. if int only int.

Therefore, to overcome this problem we use
For fixed size, we use Collections or Dynamic array (eg. ArrayList, HashTable)
For similar data type problem we use Object array.

Object array:
Object  is a super class of all classes in Java. O will be capital.
Object array is used to store different data types value.

 */

public class ArrayConcept4 {

    public static void main(String[] args) {

        //1. int array
        int i[] = new int[4];
        //how to store the values?
        i[0]=10;
        i[1]=20;
        i[2]=30;
        i[3]=40;
        System.out.println(i[2]);
        System.out.println(i[3]);

        //System.out.println(i[4]); //will give array index out of bound exception. i[4] i.e. 5th value does not exist.

        // to print size / length of array:
        System.out.println(i.length); //4

        //to print all the values of array: the you've to use for loop
        //0 to size of array i.e. 4
        //0 1 2 3 so we have to start our loop from 0 to 3.
        //this  will compare the index number with total index length/size.
        for(int j=0; j<i.length; j++){  //j<i.length not j<=i.length because we don't have 4th value
            System.out.println(i[j]);
        }


        System.out.println("**************");
        //2. declare  double array
        double d[] =  new double[3];
        d[0]=12.33;
        d[1]=13.44;
        d[2]=45.55;
        System.out.println(d[2]);

        //3. character array
        char c[] = new char[3];
        c[0]='q';
        c[1]='2';
        c[2]='$';

        //4. boolean array
        boolean b[]= new boolean[2];
        b[0]= true;
        b[1]= false;

        //5. String array:
        String s[] = new String[3];
        s[0] = "test";
        s[1] = "hello";
        s[2] = "world";
        System.out.println(s.length); //prints size of array
        System.out.println(s[1]);

        //6. Object array -- is used to store different data types values
        Object ob[] = new Object[6]; //wants to store employee information
        ob[0] ="Tom"; //name --String
        ob[1] = 25; //age --int
        ob[2] = 12.33; //tax --double
        ob[3] = "1/1/1990"; //dob --string
        ob[4] = 'M'; //gender --char
        ob[5] = "London"; //city --string
        System.out.println(ob[5]); //London
        System.out.println(ob.length); //size of array is 6

        //print all the values of object array
        //0 1 2 3 4 5
        for(int p=0; p<ob.length; p++){
            System.out.println(ob[p]);
        }




    }
}
