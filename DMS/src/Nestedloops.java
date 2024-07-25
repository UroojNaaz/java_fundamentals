public class Nestedloops {
    public static void main(String[] args) {
//----------------------------------------------Nested Loops with 2D Arrays--------------------------------------------------
          
//EXAMPLE-1 
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
