//-----------------------------------------------------Lecture Number - 08-------------------------------------------------------

//----------------------------------------------------------CLASS----------------------------------------------------------------

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
