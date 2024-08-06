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
