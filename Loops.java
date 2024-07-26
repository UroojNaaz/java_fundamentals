//-------------------------------------------LECTURE NUMBER - 04------------------------------------------

//----------------------------------------------- LOOPS --------------------------------------------------
//use for repetition of task
// two types of loops :
//1-entry control (for, while,for each)
//2-exist control loop (do-while loop)


public class Loops {
//main then tab generating this code
public static void main(String[] args) {

//----------------------------------------------- FOR LOOP ------------------------------------------------
//It is finite loop jis ma count ya length ka pata hota ha.
//Example: Counting , Table


        //Counting
for (int i=1 ; i<=5; i++ )
{
   System.out.print(i);
}


        // Reverse Counting
for (int i=5 ; i>=1; i-- )
{
   System.out.println(i);
   System.out.print(i);  //in row
}


        //Table
       for (int i=2 ; i<=10; i++ )
       {
           System.out.println("2X"+ i + "=" + (2*i));
       }


        //Table (print even numbers)
       for (int i=2 ; i<=10; i+=2 )
       {
           System.out.println("2X"+ i + "=" + (2*i));
       }


        //Table - multiple tables (2 to 10)
       for (int i=1 ; i<=10; i++ )
       {
           System.out.print("2X"+ i + "=" + (2*i));
           System.out.print("\t3X"+ i + "=" + (3*i));
           System.out.print("\t4X"+ i + "=" + (4*i));
           System.out.print("\t5X"+ i + "=" + (5*i));
           System.out.print("\t6X"+ i + "=" + (6*i));
           System.out.print("\t7X"+ i + "=" + (7*i));
           System.out.print("\t8X"+ i + "=" + (8*i));
           System.out.print("\t9X"+ i + "=" + (9*i));
           System.out.println("\t10X"+ i + "=" + (10*i));
       }


         //------------------FOR (NESTED LOOP)-----------------------

        //Star Pattern with Nested loop
       int n = 4;
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print("*");
           }
           System.out.println();    //for next line
       }


        // Reverse/Inverted Star Pattern with Nested loop
       int n = 4; // Number of rows
       for (int i = n; i >= 1; i--) {
           for (int j = 1; j <= i; j++) {
               System.out.print("*");
           }
           System.out.println();     //for next line
       }


        //---------------------END------------------------


        //------------------FOR EACH-----------------------
//It is use for array and objects of array






        //---------------------END------------------------


        //------------------FOR WHILE----------------------
//It is infinite loop , yaha length ka andaza nhe, count ya length hota user dependent hota ha.
//Example: Game (Life and score)






        //---------------------END------------------------


        //------------------FOR DO-WHILE-------------------
//This loop run (iterated) 1 time , after iteration then check condition , if condition not fulfill loop is terminated.
//Example: FB Login form validation, ATM CARD












        //---------------------END------------------------
    }
}
