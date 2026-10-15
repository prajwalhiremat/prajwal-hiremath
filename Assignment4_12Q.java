public class Car {
    String color = "Red";

    public static void main(String[] args) {
        Car myObj1 = new Car(); 
        Car myObj2 = new Car(); 
        
        myObj2.color = "Blue"; 

        System.out.println("Object 1 Car Color: " + myObj1.color);
        System.out.println("Object 2 Car Color: " + myObj2.color);
    }
}
