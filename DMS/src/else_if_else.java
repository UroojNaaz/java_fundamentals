import java.util.Scanner;

public class else_if_else {
    public static void main(String[] args){
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
    }
}
