//---------------------------------------------LECTURE NUMBER - 02----------------------------------------------

//----------------------------------------------OPERATORS IN JAVA-----------------------------------------------
//Java operators are symbols that perform operations on variables and values.
//1. Arithmetic Operators 
//2. Relational Operators
//3. Logical Operators
//4. Assignment Operators
//5. Increment and Decrement Operators
//6. Conditional (Ternary) Operator

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
//--------------------------------------------Arithmetic Operators----------------------------------------------
//1. Arithmetic Operators: These operators are used to perform basic arithmetic operations.
//Addition (+) , Subtraction (-) , Multiplication (*) , Division (/) , Modulus (%)
        int a = 10;
        int b = 5;
        
        System.out.println("Addition: " + (a + b));     // 15
        System.out.println("Subtraction: " + (a - b));   // 5
        System.out.println("Multiplication: " + (a * b));   // 50
        System.out.println("Division: " + (a / b));      // 2
        System.out.println("Modulus: " + (a % b));     // 0

      
//--------------------------------------------Relational Operators----------------------------------------------
//2. Relational Operators: These operators are used to compare two values.
//Equal to (==), Not equal to (!=), Greater than (>), Less than (<), Greater than or equal to (>=), Less than or equal to (<=)      
        int num1 = 10;
        int num2 = 5;
        
        System.out.println("Equal to: " + (num1 == num2)); // false
        System.out.println("Not equal to: " + (num1 != num2)); // true
        System.out.println("Greater than: " + (num1 > num2)); // true
        System.out.println("Less than: " + (num1 < num2)); // false
        System.out.println("Greater than or equal to: " + (num1 >= num2)); // true
        System.out.println("Less than or equal to: " + (num1 <= num2)); // false

//--------------------------------------------Logical Operators----------------------------------------------
//3. Logical Operators: These operators are used to combine conditional statements.
//Logical AND (&&) ,  Logical OR (||) ,  Logical NOT (!)     
        boolean x = true;
        boolean y = false;
        
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true
        System.out.println("Logical NOT: " + (!x)); // false
      

//--------------------------------------------Assignment Operators----------------------------------------------
//4. Assignment Operators: These operators are used to assign values to variables.
//Assignment (=), Add and assign (+=), Subtract and assign (-=), Multiply and assign (*=), Divide and assign (/=), Modulus and assign (%=)     

//Example-1: 
              int number = 10; // Initial value

        // Add and assign
        number += 5; // number = number + 5
        System.out.println("After adding 5: " + number); // 15

        // Subtract and assign
        number -= 3; // number = number - 3
        System.out.println("After subtracting 3: " + number); // 12

        // Multiply and assign
        number *= 2; // number = number * 2
        System.out.println("After multiplying by 2: " + number); // 24

        // Divide and assign
        number /= 4; // number = number / 4
        System.out.println("After dividing by 4: " + number); // 6

        // Modulus and assign
        number %= 4; // number = number % 4
        System.out.println("After modulus 4: " + number); // 2      
      
//Example-2: 
        int score = 10;
        int bonus = 5;
        
        score += bonus; // score = score + bonus
        System.out.println("Add and assign: " + score); // 15
        
        score -= bonus; // score = score - bonus
        System.out.println("Subtract and assign: " + score); // 10
        
        score *= bonus; // score = score * bonus
        System.out.println("Multiply and assign: " + score); // 50
        
        score /= bonus; // score = score / bonus
        System.out.println("Divide and assign: " + score); // 10
        
        score %= bonus; // score = score % bonus
        System.out.println("Modulus and assign: " + score); // 0

      
//--------------------------------------------Increment and Decrement Operators----------------------------------------------    
//5. Increment and Decrement Operators: These operators are used to increment or decrement the value of a variable by 1.
//Increment (++)
//Decrement (--)
      
        int num = 10;
        
        // Post-increment
        System.out.println("Original value: " + num); // 10
        System.out.println("Post-increment: " + (num++)); // 10 (value before increment)
        System.out.println("After post-increment: " + num); // 11 (value after increment)
        
        // Pre-increment
        System.out.println("Pre-increment: " + (++num)); // 12 (value after increment)
        
        // Post-decrement
        System.out.println("Post-decrement: " + (num--)); // 12 (value before decrement)
        System.out.println("After post-decrement: " + num); // 11 (value after decrement)
        
        // Pre-decrement
        System.out.println("Pre-decrement: " + (--num)); // 10 (value after decrement)

      
//--------------------------------------------Conditional (Ternary) Operator----------------------------------------------     
//6. Conditional (Ternary) Operator: This operator is a shorthand for the if-else statement.
//Conditional (? :)
      
//Example-1: 
        int c = 10;
        int d = 5;
        
        String result = (c > d) ? "c is greater" : "d is greater";
        System.out.println(result); // c is greater
      
      
//Example-2:      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        String category = (age >= 18) ? "Adult" : "Minor";
        System.out.println("The person is an: " + category);
        
        // Comment this line if you need to use the scanner again in your program
        scanner.close();
      
    }
}
