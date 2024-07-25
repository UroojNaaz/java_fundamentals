public class Array {
    public static void main(String[] args) {
      
//Array:
        int marks[] = new int[4];   //4 represents length of an array
        marks[0] = 10;  // Assign 10 to the 0th index
        marks[1] = 20;  // Assign 20 to the 1st index
        marks[2] = 30;  // Assign 30 to the 2nd index
        marks[3] = 5;   // Assign 5 to the 3rd index

// Printing individual elements
        System.out.println(marks[0] + ", " + marks[1]); // Output: 10, 20
        System.out.println(marks[1]); // Output: 20
        System.out.println(marks[2]); // Output: 30
        System.out.println(marks[3]); // Output: 5

// Printing the length of the array:
        System.out.println("Length of the array: " + marks.length); // Output: 4

// Using a do-while loop to print all elements:
        System.out.println("\tDO-WHILE Loop");
        int k = 0;
        do {
            System.out.print(" " + marks[k] + ", ");
            k++;
        } while (k < marks.length);

// Using a while loop to print all elements:
        System.out.println("\n\tWHILE Loop");
        int j = 0;
        while (j < marks.length) {
            System.out.print(" " + marks[j] + ", ");
            j++;
        }

// Using a for loop to print all elements:
        System.out.println("\n\tFOR Loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(" " + marks[i] + ", ");
        }

// Using a for-each loop to print all elements:
        System.out.println("\n\tFOR EACH");
        for (int m : marks) {
            System.out.print(" " + m + ", ");
          
//-----------------------------------------------------------------------------------------------------------------


//Array - find sum, min, max, averege:
       int Marks[] = new int[]{50,32,12,45,69,75,100,45,67,89}; //Another way to array decleartion in single line
       int sum=0,min=100,max=0,avg;


//Array - find sum, min, max, averege (Using Foreach loop):
       for(int m:Marks)
       {
           System.out.print(" "+m+", ");
           sum += m;

           if(max<m)
           {
               max=m;
           }
           if(min>m)
           {
               min=m;
           }
       }
       System.out.print("\n Sum : "+sum+" min : "+min+" max : "+max);
       System.out.println("Average : "+(sum/Marks.length));


//-------------------------------------------------2D Array-------------------------------------------------------
          
        int[][] Age = new int[2][3];
        Age[0][0] = 50;
        Age[0][1] = 98;
        Age[0][2] = 100;
        Age[1][0] = 66;
        Age[1][1] = 49;
        Age[1][2] = 25;
          
// Printing individual elements:  
        System.out.println("Element at Age[0][0]: " + Age[0][0]); // Output: 50
        System.out.println("Element at Age[0][1]: " + Age[0][1]); // Output: 98
        System.out.println("Element at Age[0][2]: " + Age[0][2]); // Output: 100
        System.out.println("Element at Age[1][0]: " + Age[1][0]); // Output: 66
        System.out.println("Element at Age[1][1]: " + Age[1][1]); // Output: 49
        System.out.println("Element at Age[1][2]: " + Age[1][2]); // Output: 25
          
// Printing various properties and elements of the 2D array:
        System.out.println("Number of rows: " + Age.length); // Output: 2
        System.out.println("Number of columns in row 0: " + Age[0].length); // Output: 3
        System.out.println("Number of columns in row 1: " + Age[1].length); // Output: 3
        System.out.println("Total number of elements: " + (Age[1].length + Age[0].length)); // Output: 6

//----------------------------------------------Nested Loops with 2D Arrays--------------------------------------------------
          
//Nested Loops with 2D Arrays:
        int[][] Age = {{2, 3, 5, 8}, {55, 98, 92, 88, 53}};
        
        // For Loop:
        System.out.println("For Loop");
        for (int i = 0; i < Age.length; i++) {
            for (int j = 0; j < Age[i].length; j++) {
                System.out.print(" " + Age[i][j]);
            }
            System.out.println();
        }

        // For Each Loop:
        System.out.println("For Each Loop");
        for (int[] r : Age) {
            for (int c : r) {
                System.out.print(" " + c);
            }
            System.out.println();
        }

        // WHILE Loop:
        System.out.println("WHILE Loop");
        int i = 0;
        while (i < Age.length) {
            int j = 0;
            while (j < Age[i].length) {
                System.out.print(" " + Age[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }

        // DO-WHILE Loop:
        System.out.println("DO WHILE Loop");
        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(" " + Age[i][j]);
                j++;
            } while (j < Age[i].length);
            System.out.println();
            i++;
        } while (i < Age.length);


//EXAMPLE-2          
//2D array of characters:
        String[][] name = {{"Abid", "Asad"}, {"Hussain", "Atif"}};
        char[][] n = new char[4][10]; // assuming max length of any string is 10
        
        int i = 0;
        for (String[] na : name) {
            for (String naa : na) {
                n[i] = naa.toCharArray(); // assign char array to row i
                i++;
            }
        }
        
        // Printing the 2D char array 
        for (char[] row : n) {
            System.out.println(row);

    }
}
