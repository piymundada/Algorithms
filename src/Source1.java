// Class name should be "Source1",
// otherwise solution won't be accepted
public class Source1 {
    public static void main(String args[] ) throws Exception {
        Car car = new Car("Toyota", "Corolla", 4);
        car.displayDetails();
    }
}

class Vehicle{
    public String make;
    public String model;

    public Vehicle(String make, String model){
        this.make = make;
        this.model = model;
    }
}

class Car extends Vehicle{
    private int number_of_doors;

    public Car(String make, String model, int number_of_doors){
        super(make, model);
        this.number_of_doors = number_of_doors;
    }

    public void displayDetails(){
        System.out.println("Make: "+ this.make);
        System.out.println("Model: "+ this.model);
        System.out.println("Number of Doors: " +this.number_of_doors);
    }
}