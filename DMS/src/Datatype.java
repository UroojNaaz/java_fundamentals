//In Java, data types define the kind of data that can be stored and manipulated within a program. 
//Java has two main categories of data types: 
//1-Primitive Data Types : byte, short, int, long, float, double, char, boolean  
//Definition: Primitive data types are the most basic data types in Java. They hold their values directly. They are not objects.

//2-Non-Primitive/Reference Data Types :  Objects, Arrays, Interfaces, Enums
//Definition: Reference data types refer to objects and arrays. They store references (or addresses) to the actual data. 

public class Datatype {
    public static void main(String[] args) {
        byte age = 127;
        boolean Male = true;
        short Marks = 32239;
        char Blood_group = 'B';
        float temperature = 50.5f;
        String Name = "Abid Ali";
        double Balance_amount = 78948654.5489;
        
        System.out.println("Your name is : " + Name);
        System.out.println("Your age is : " + age);
        System.out.println("Are Male : " + Male);
        System.out.println("Your Marks : " + Marks);
        System.out.println("Your blood group is : " + Blood_group);
        System.out.println("Temperature is : " + temperature);
        System.out.println("Bank balance is : " + Balance_amount);

      
//--------------------------------------------------TYPE CASTING------------------------------------------------------------- 

      
// TYPE CASTING: In Java, type casting refers to converting one data type to another.
      
// Example of Implicit Casting (Widening Conversion):
//Definition: Automatically converts a smaller data type to a larger one.
      
        double i = (double) Blood_group;  //casting of char to double
        System.out.println("Your blood group ASCII value as double is : " + i);

      
// Example of Explicit Casting (Narrowing Conversion): 
//Definition: Manually converts a larger data type to a smaller one.
      
        double d = 95.9;
        int p = (int) d; // Casting double to int (truncates decimal part)
        System.out.println("Converted value from double to int: " + p);
    }
}
