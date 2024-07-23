import java.util.Scanner;

public class if_else {

    public static void main(String[] args){
        Scanner mini= new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=mini.nextInt();

        if (age>=18){
            System.out.println(" you are eligible for vote casting");
        }
        else {
            System.out.println("you are not eligible for vote casting");
        }
    }
}
