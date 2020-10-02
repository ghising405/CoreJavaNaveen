package JavaBasics;

/*
TWO DIMENSIONAL ARRAY
int i = 10; -- simple variable
int i[] = 10, 20, 30 --storing multiple value in  single variable
String  x[][] --- two dimensional array --first box=row, second box = column

2D array is like matrix:
where rows and columns are available
columns are totally based on rows. For each and every rows columns are same i.e. 0 to 4.
 */

public class TwoDimensionArray5 {

    public static void main(String[] args) {

        //array declaration
        String x[][] = new String[3][5]; //3=row, 5=column

        //to know size of this array: (both of these)
        System.out.println(x.length); //it gives 3, that is total number of rows
        //to get total number of columns
        System.out.println(x[0].length); //gives 5. Number of column is same for each and every row.

        //how do we store the values in 2D array? how to initialize the values rows and column wise?
        //first row
        x[0][0] = "A";
        x[0][1] = "B";
        x[0][2] = "C";
        x[0][3] = "D";
        x[0][4] = "E";

        //second row
        x[1][0] = "A1";
        x[1][1] = "B1";
        x[1][2] = "C1";
        x[1][3] = "D1";
        x[1][4] = "E1";

        //3rd row
        x[2][0] = "A2";
        x[2][1] = "B2";
        x[2][2] = "C2";
        x[2][3] = "D2";
        x[2][4] = "E2";

        System.out.println(x[1][2]);
        System.out.println(x[2][2]);
        System.out.println(x[0][4]);  //first row and last column value = E


        //to print all the values of 2D array: use for loop
        //we have to use two for loops. one for row and another for column
        //row = 0, 1, 2
        for(int row=0; row<x.length; row++){
            //inside this for loop we will write another for loop for column
            //column: 0, 1, 2, 3, 4 (Starts  from 0)
            for(int column=0; column<x[0].length; column++){
                System.out.println(x[row][column]);
                //in this case the row will  execute first.
                // row =0, with column = 0 t0 4
                // row =1, with column = 0 to 4
                // row =2, with column = 0 to 4
            }

        }



    }
}
