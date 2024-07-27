//-------------------------------------------------------Lecture Number - 06-------------------------------------------------------

//----------------------------------------------------------ARRAY LIST-------------------------------------------------------------
import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {
    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
      
//-------------------------------------------------------Adding elements---------------------------------------------------------
        // Adding elements:
        names.add("Urooj");
        names.add("Iqra");

        // Adding elements by index number:
        names.add(2,"Areej");

        // Adding elements
        numbers.add(10);
        numbers.add(20);

        // Adding elements by index number:
        numbers.add(2,50);
      
//----------------------------------------------------------Accessing elements---------------------------------------------------------
        // Accessing elements:
        //Names:
        System.out.println("First name: " + names.get(0));
        System.out.println("Second name: " + names.get(1));
        System.out.println("Third name: " + names.get(2));

        //Numbers:
        System.out.println("Second number: " + numbers.get(0));
        System.out.println("Second number: " + numbers.get(1));
        System.out.println("Third number: " + numbers.get(2));
      
//-------------------------------------------------------Array List with Loops--------------------------------------------------------
//----------------------------------------------------------For each loop-------------------------------------------------------------
      
        // Iterating over elements - For each loop
        //Names:
        System.out.println("Names (For each loop):");
        for (String name : names) {
            System.out.println(name);
        }
      
        //Numbers:
        System.out.println("Numbers (For each loop):");
        for (int number : numbers) {
            System.out.println(number);
        }

//----------------------------------------------------------For loop-------------------------------------------------------------

        // Iterating over elements - For loop
        //Names:
        System.out.println("Names (For loop):");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Numbers:
        System.out.println("Numbers (For loop):");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

      
//----------------------------------------------------------Do While loop-------------------------------------------------------------

        // Iterating over elements - Do while loop
        //Names:
        System.out.println("Names (do while loop):");
        int k = 0;
        do {
            System.out.println(names.get(k));
            k++;
        } while (k < names.size());

        //Numbers:
        System.out.println("Numbers (do while loop):");
        int l = 0;
        do {
            System.out.println(numbers.get(l));
            l++;
        } while (l < numbers.size());

      
//----------------------------------------------------------While loop-------------------------------------------------------------
        
        // Iterating over elements - While loop
        //Names:
        System.out.println("Names (while loop):");
        int i = 0;
        while (i < names.size()) {
            System.out.println(names.get(i));
            i++;
        }
      
        //Numbers:
        System.out.println("Numbers (while loop):");
        int j = 0;
        while (j < numbers.size()) {
            System.out.println(numbers.get(j));
            j++;
        }

      
//-----------------------------------------------------Iterator with While loop--------------------------------------------------

//Iterator: is ka use ArrayList aur doosre collection classes se elements ko traverse karne ke liye hota hai, bina direct index access ke.
//Traverse: is ka matlab hota hai kisi data structure ya collection ke elements ko systematically visit karna ya access karna.
//Example: Using loops to access each element in an ArrayList.
      
        // Iterating over elements - Iterator with while loop:-
        //Names:
        System.out.println("Names (iterator with while loop):");
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {                       //hasNext(): Ye method check karta hai kya next element available hai.
            System.out.println(namesIterator.next());
        }
      
        //Numbers:
        System.out.println("Numbers (iterator with while loop):");
        Iterator<Integer> numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            System.out.println(numbersIterator.next());         //next(): Ye method next element ko return karta hai 
        }

      
//----------------------------------------------------------Replacing elements-------------------------------------------------------------

        // Replace elements:
        // Displaying the original list
        System.out.println("Original Names List: " + names);
        // Replacing the second element (index 1) with a new value
        names.set(1, "Ayesha");
        // Displaying the modified list
        System.out.println("Modified List: " + names);


//----------------------------------------------------------Removing elements-------------------------------------------------------------
        
        // Checking size/length of array before remove:
        System.out.println("Names size (before) : " + names.size());
        System.out.println("Numbers size (before) : " + numbers.size());

        // Removing elements
        names.remove(0);
        numbers.remove(1);

        // Checking size/length of array:
        System.out.println("Names size (after) : " + names.size());
        System.out.println("Numbers size (after) : " + numbers.size());
      
//----------------------------------------------------------Clearing the ArrayList-------------------------------------------------------------
        
        // Clearing the ArrayList
        names.clear();
        numbers.clear();

        // Checking if ArrayList is empty
        System.out.println("Is names empty? " + names.isEmpty());
        System.out.println("Is numbers empty? " + numbers.isEmpty());
    }
}
