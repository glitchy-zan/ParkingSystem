package parkingsystem.system;

public class Van extends Vehicle {

    public Van(int height) {
        super(height);
    }

    public void drive(){
        System.out.println("wrum wrum");
    }
}
