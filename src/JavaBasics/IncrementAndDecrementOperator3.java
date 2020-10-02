package JavaBasics;

//++ increment
//-- decrement
/*post increment int i=1; int j=i++;
first the  value of i will be given to j
and then increase the value of i by 1.
It means  increase the value of i by 1 later.

pre increment: ++a
it means increase the value of a by 1 first.
a=1 (initially)
increase the value of a by 1 i.e. a=1+1 =2
the  2 will be given to b

post-decrement: a--
first get the value of m and give it to n. decrease the  value of n by 1

pre-decrement: --a
first decrease the value of a , and the give the whole value to b
 */

public class IncrementAndDecrementOperator3 {

    public static void main(String[] args) {

        //post increment
        int i=1;
        int j=i++;  //post increment
        System.out.println(i); //2
        System.out.println(j); //1

        //pre-increment -- increase the  value of a by 1 first
        int a =1; //a=a+1 = a=1+1 = 2
        int b=++a; //then 2 will be  given to b so b=2
        System.out.println(a); //2
        System.out.println(b); //2

        //post decrement
        int m=2;
        int n = m--;
        System.out.println(m); //1
        System.out.println(n); //2

        //pre decrement
        int p = 2;
        int q = --p;
        System.out.println(p);  //1
        System.out.println(q);  //1
        //decrease the value of p by 1  first i.e. p=2-1=1
        //then give  the whole value to q i.e. to q i.e. q=1


    }
}
