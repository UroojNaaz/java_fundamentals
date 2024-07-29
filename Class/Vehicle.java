//-----------------------------------------------------Lecture Number - 08-------------------------------------------------------

//----------------------------------------------------------CLASS----------------------------------------------------------------
/* Class Definition: Java class ek template hai jisse aap objects banate hain. Ek class ek blueprint provide karti hai jo objects  
   ko define karti hai, unke properties (fields) aur behaviors (methods) ko specify karti hai.  */

/*Class Syntax:
       public class ClassName {
            Fields (Attributes)
            Constructors
            Methods
        } */

//Fields (Attributes): Class ke andar variables ko fields kehte hain. Ye objects ke state ya data ko store karte hain.
//Methods (Behaviors): Methods functions hain jo class ke objects ke behaviors define karte hain.
//Constructors: Constructor ek special method hai jo class ka object create karte waqt call hota hai. Ye initial setup ke liye use hota hai.

public class Vehicle {
    private String company;       // Brand of the vehicle
    private String model;      // Model of the vehicle
    private int year;          // Year of manufacture
    private String color;      // Color of the vehicle

    // Constructor
    public Vehicle(String company, String model, int year, String color) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.color = color;
    } 

    // Getter and Setter methods
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to start the vehicle
    public void start() {
        System.out.println("The vehicle is starting.");
    }

    // Method to stop the vehicle
    public void stop() {
        System.out.println("The vehicle is stopping.");
    }

    // Method to accelerate the vehicle
    public void accelerate() {
        System.out.println("The vehicle is accelerating.");
    }

    // Method to brake the vehicle
    public void brake() {
        System.out.println("The vehicle is braking.");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
