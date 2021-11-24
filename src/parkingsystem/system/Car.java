package parkingsystem.system;

public class Car extends Vehicle {

    public Car(int height) {
        super(height);
    }

    public void drive(){
        System.out.println("wrum");
    }
}
