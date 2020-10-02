package OOPConceptPart1;

/*
call by value or pass by value: just passing the copy of arguments/ input parameters.

 */

public class CallByValueAndCallByReference12 {

    //global variables
    int p;
    int q;


    public static void main(String[] args) {

        /*to call testSum() we'll create an object
        CallByValueAndCallByReference12 obj1 = new CallByValueAndCallByReference12();
        int d =  obj1.testSum(10, 20);
        //a copy of 10 and 20 will be given to a and b
        System.out.println(d); //30

         */

        //********************************************************************
        //call BY value
        //or if assigned in this way
        CallByValueAndCallByReference12 obj = new CallByValueAndCallByReference12();
        int x = 10;
        int y = 20;
        obj.testSum(x,y); //this is call by value or pass by value
        //the copy of x and y will be given to a and b. Not the original value.
        //here x will be given to a, y will be given to b. but only duplicate copy will be given to a and b.
        //so ultimately: a=10, b=20, c=30;

        obj.p = 50; //calling and giving value. initializing them using object reference.
        obj.q = 60;

        obj.swap(obj);  //didn't understand from here. "don't pass t here. we've to pass only obj because obj is the
        //reference. we've to pass reference to reference
        
        //after swap
        System.out.println(obj.p); //60
        System.out.println(obj.q); //50



    }

    public int testSum(int a, int b ){  //some input some output type of method
        //here if
        //up to now a = x = 10; b = y = 20; //a and b are getting copy of x and y.
        a = 30;
        b = 40;
        int c = a+b;       // = 30+40 = 70 = new value ;
        /*But now the calculation will be based on new values i.e. a=30 and b=40. the result will be 70.
        But there won't be any change in x and y because a and b has only duplicate copies. and changing values
        in duplicate copies will not affect original copy.
         */
        return c;  //c=int so return type = int
    }

    //*********************
    //CALL BY REFERENCE
    /*1.declare two global variables
    2. give value to non static variables in main method using object.
    3. create swap method
    inside the swap() we will pass the reference variable of particular class i.e. CallByValueAndCallByReference12
    class = CallByValueAndCallByReference12
    t = reference variable
    4. call swap() in main function and will pass obj
    obj.swap(obj) = passing obj
    In swap function we get only reference
    obj will be given to t so, t=obj
    now, one object has two references obj and t.
    5. create temp variable: because we need to swap and we need 3rd variable


     */

    public void swap(CallByValueAndCallByReference12 t){
        //classname= CallByValueAndCallByReference12 reference variable=t
        int temp;
        temp = t.p; //50 will be given to temp so temp = 50
        t.p = t.q;  //60 will be given to t.p so t.p = 60
        //so p is now 60 . p=60 and we have to swap it
        //swap means : currently p=50, q=60; but we want p=60 and q=50;
        t.q = temp; //temp=50; 50 will be given to q; t.q=50
        //swap is done

        //latest value: p=60; q=50 because we've swapped using 3rd variable

        /*Call by reference: we are passing the value of object reference.
        here we have object references. inside the object we have number of variables
        so we are passing object references and that is called pass/call by  reference .
        Is it possible  to call by reference in JAVA?
        --> YES. by  using object references

         */









    }


}
