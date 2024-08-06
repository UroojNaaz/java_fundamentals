//Abstract Classes:
//Definition:
//Abstract class ek aisi class hoti hai jo abstract keyword se define hoti hai. Ismein kuch methods abstract 
//hote hain (without implementation) aur kuch methods concrete (with implementation) ho sakte hain.
//Abstract class mein constructor ho sakta hai.
//Ek class sirf ek hi abstract class ko extend kar sakti hai (single inheritance).
//Abstract class ke methods public, protected, private ho sakte hain.

//Usage:
//Abstract class ko tab use kiya jata hai jab aap kuch common behavior define karna chahte hain jo subclasses
//me shared hote hain, lekin kuch methods ko subclasses mein override karna zaroori hota hai.

//Abstract Class Example:
abstract class Animal {
    abstract void makeSound(); // Abstract method

    void eat() { // Concrete method
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}



//Interface Class Classes:
//Definition:
//Interface ek pure abstract type hota hai jo interface keyword se define hota hai. Is mein abstract methods k elwa,
//default methods aur static methods bhi ho sakte hain.
//Interface mein constructor nahi hota.
//Ek class multiple interfaces ko implement kar sakti hai (multiple inheritance).
//Interface ke methods by default public hote hain aur unhe private ya protected nahi banaya ja sakta.


//Usage:
//Interface ko tab use kiya jata hai jab aap multiple inheritance achieve karna chahte hain ya different classes mein 
//common behavior define karna chahte hain jo completely unrelated ho sakti hain.

//Interface Class Example:
interface Animal {
    void makeSound(); // Abstract method

    default void eat() { // Default method
        System.out.println("This animal eats food.");
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
