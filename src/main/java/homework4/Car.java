package homework4;

public class Car {
     String color;
     int currentSpeed ;
     String brand;


    public Car(String color, int currentSpeed,String brand) {
        this.currentSpeed = 0;
        this.color = color;
        this.brand = brand;
    }

    public int getCurrentSpeed() {
        return currentSpeed;

    }

    public void speedUp(int speed) {
        currentSpeed = currentSpeed + speed;

    }

    public void brake() {
        if (currentSpeed <= 10) {
            currentSpeed = 0;
        } else {
            currentSpeed = currentSpeed - 10;
        }

    }
}

