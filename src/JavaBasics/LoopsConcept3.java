package JavaBasics;

//loop means when you are writing same / similar kind of code again and again
//eg. printing top 10 positive integer numbers. 1,2,3,4,5,6,7,8,9,10
//it helps to avoid repetitive lines.

/*1. while loop:
first declare one variable.
write while keyword. starts with small letter
inside bracket we'll write one condition. eg. i<=10
Instead of writing 10 different statements using 3-4 lines we could print 1 to 10.
Disadvantage of while loop: it will give you infinite loop if we don't increase or decrease by 1. The program will be executed infinite times.
 */

/*
2. For loop
syntax: for(initialization; conditional; incremental)
j++ means j=j+1
we will be mainly using for loop  in selenium.
 */



public class LoopsConcept3 {

    public static void main(String[] args) {

        //1. declare one variable
        int i = 1; // declare
        while (i <= 10) {  //body of while loop condition
            System.out.println(i);   //i= 1 will be printed
            i = i + 1;      //increase the value of i by 1.
            //2 is <=10 true. will print 2
            //10 is <=10 true. will print 10. but after that 11<=10 is not true so the code will end here.
        }

        System.out.println("********************");

        //print 0 to 10
        int k = 0;  //starting loop from 0.   //Initialization
        while (k <= 10) {      //conditional
            System.out.println(k);
            k = k + 1; //if we don't write  this part it will give infinite result. //Incremental
        }

        System.out.println("******************************");

        //For Loop:
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }

        System.out.println("********************");

        //print 10 to 1
        //10 9 8 7 6 5 4 3 2 1
        //l-- means l=l-1
        for (int l = 10; l >= 1; l--) {
            System.out.println(l);
        }

        System.out.println("***************************");

        //print from 10 to 0  and 0  to -10
        //10, 9, 8,  7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10
        for(int m=10; m>=-10; m--){
            System.out.println(m);
        }

    }
}



