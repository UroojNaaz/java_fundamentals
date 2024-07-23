import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=obj.nextInt();

        if(age >=18)
        {
            System.out.println(" you are eligible");
        }
    }
}