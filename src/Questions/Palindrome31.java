package Questions;

/*
palindrome : reverse of that number  = same number. eg: 151, 454, 34543, 161, 78987
in string: teet

steps:
1. get the remainder
2. sum = (sum*10) + r
3. num = num /10
4. you have to keep decreasing the number. should decrease until the num = 0 . when num =0; in while 0>0 false and then it will go to if
 and then finally you will have to check t. and if t==sum then that is palindrome.
 */

public class Palindrome31 {

    public static void isPalindromeNumber(int num) {

        System.out.println("Given number is: " +num);
        int r = 0; //r=reverse variable
        int sum = 0;
        int t; //t=temporary variable

        t = num;

        while (num > 0) {
            r = num % 10;   //num%10=remainder and that remainder value is stored in r. r= get the remainder 151/10; remainder =1
            sum = (sum * 10) + r;  //(0*10)+ 1 = 1;
            num = num / 10;         //151/10=approx 15;
            // goes to while: num=15; 15>0= true; remainder =5; sum = (1*10)+5 = 15; num= 15/10=1
            // goes to while: num=1; 1>0 = true; remainder = 1; sum = (15*10) + 1 = 151; num=151/10=0
            //goes to while: num = 0; 0>0 = false and then goes to if.
        }

        if (t == sum) {  //151 == 151
            System.out.println("palindrome number");
        } else {
            System.out.println("not palindrome number");

        }


    }

    public static void main(String[] args) {
        isPalindromeNumber(151);
        isPalindromeNumber(152);
        isPalindromeNumber(78987);
        isPalindromeNumber(1);
        isPalindromeNumber(1110);
        isPalindromeNumber(0);
    }
}


