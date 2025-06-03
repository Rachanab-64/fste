package Activities;

public class main {
	public static void main(String[] args) {
  
        Activity1  myCar = new Activity1();

      
        myCar.make = 2014;
        myCar.color = "Black";
        myCar.transmission = "Manual";

        myCar.displayCharacteristics();
        myCar.accelerate();
        myCar.brake();
    }
}
