//------------------------------------------------------Interface in OOP------------------------------------------------------
//Interface abstraction aur polymorphism achieve karne ke liye use hota hai. Interface ke through, aap classes ke behavior ko 
//define kar sakte hain bina implementation detail provide kiye.
//Interface-Abstraction:
//Interface abstraction ko achieve karne mein madad karta hai. Interface sirf methods ke signatures define karta hai, implementation
//nahi deta. Is se aap implementation details ko hide kar sakte hain aur sirf necessary details expose kar sakte hain.
//Interface-Polymorphism:
//Interface ke through polymorphism achieve hota hai. Ek interface ko implement karte hue multiple classes alag-alag tarike se 
//uske methods ko implement kar sakti hain. Is tarah se aap ek reference variable ko multiple classes ke objects refer karane 
//ke liye use kar sakte hain.

// Interface declaration
interface Animal {
    void makeSound(); // abstract method
    void sleep();     // abstract method
}

// Class implementing the interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

// Another class implementing the interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat using Animal (Parent) reference
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Polymorphism in action
        myDog.makeSound(); // Output: Bark
        myDog.sleep();     // Output: Dog is sleeping
        myCat.makeSound(); // Output: Meow
        myCat.sleep();     // Output: Cat is sleeping
    }
}
