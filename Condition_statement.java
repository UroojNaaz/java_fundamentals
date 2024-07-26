import java.util.Scanner;

public class Condition_statement {
    public static void main(String[] args) {

//---------------------------------------------IF STATEMENT------------------------------------------------
        System.out.println("IF STATEMENT:- ");
        Scanner S= new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int Age=S.nextInt();

        if(Age >=18)
        {
            System.out.println(" you are eligible");
        }

//----------------------------------------IF-ELSE STATEMENT----------------------------------------------
        System.out.println("IF-ELSE STATEMENT:- ");
        Scanner mini= new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=mini.nextInt();

        if (age>=18){
            System.out.println(" you are eligible for vote casting");
        }
        else {
            System.out.println("you are not eligible for vote casting");
        }

//------------------------------------ELSE-IF-ELSE STATEMENT--------------------------------------------

        System.out.println("\n ELSE-IF-ELSE STATEMENT :- ");
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the vale of a");
        int a=obj.nextInt();
        System.out.println("enter the vale of b");
        int b=obj.nextInt();
        System.out.println("enter the vale of c");
        int c=obj.nextInt();
        if (a==5 && b==10){
            System.out.println("if is true");
        }
        else if (b==15 || c==20) {
            System.out.println(" else if 1 is true");
        }
        else if (b==5 || c==15) {
            System.out.println(" else if 2 is true");
        }
        else {
            System.out.println("else is true");
        }

//-------------------------------------------SWITCH CASE-----------------------------------------------

        int day=4;
        switch (day)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
