package Questions;

/*
 null = keyword; all small letters; case sensitive
 reference variable: default value of obj or any reference variable will be null.

 For the custom class, for default class, and for object class; for any kind of class reference if you try to print directly, the default value will be null.




 */

public class NullConcept36 {

    static Object obj;  //Object=class
    static String str;  //String= class
    static NullConcept36 nc; //NullConcept36 = custom class



    public static void main(String[] args) {
        //2. default reference value will be null.
        //System.out.println(obj); //default value of obj = null
        //System.out.println(str); //if you don't define anything by default str will be null
        //System.out.println(nc); // for custom class if you try to print directly, the default value will be null.

        //3. primitive datatype value cannot be null
       // Integer i = null;  //this is not allowed because
        //int j = i;  //it will give  Exception in thread "main" java.lang.NullPointerException

        //4. instanceof=keyword operator is there
       // Integer k = null;
       // Integer l = 10;
       // System.out.println(l instanceof Integer); //if l is instance of integer---> it will return true. output=true
       // System.out.println(k instanceof Integer); //output=false. though k is the instance of integer, it is pointing to null

//5. static vs non-static with respect to null

        //calling static and non-static
        NullConcept36 obj = null; //reference is there but it is pointing to null.
        //obj.send(); //will give nullPointer exception
        obj.sum();//static methods cannot be stored inside the object. but here we can. output = sum.....
        //static methods can be accessed by null references.

        //5. we can apply == and != for null operator
        System.out.println(null == null); //true
        System.out.println(null != null); //false

        //6. what is the default value of string?
        String str = null;
        Integer i1 = null;
        Double d1 = null;

        //can i type cast null into string? No.
        String s1 = (String) null;
        System.out.println(s1 + "naveen"); //null naveen
        System.out.println(s1 + "123"); //null 123
       // System.out.println(s1.length()); //Exception in thread "main" java.lang.NullPointerException.
        // s1 cannot  perform any action s1.length().
        System.out.println(s1.charAt(0)); //Exception in thread "main" java.lang.NullPointerException

        //but actions possible for these:
        //null can be type casted into integer and double
        Integer i2 = (Integer) null;
        Double d2 = (Double) null;





    }

    //5. static vs non-static
    public static void sum(){   //static method
        System.out.println("sum.....");
    }

    public void send(){
        System.out.println("send.....");
    }
}
