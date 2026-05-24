package day8;

// abstraction

public class demo {
    public static void main(String[] args) {
        
        // Car car=new Car();      Error : Cannot instantiate the type Car

        Car car=new ElectricCar();
        car.start();
        car.accelarate();
        car.brake();


        Car c2=new FuelCar();
        c2.start();
        c2.accelarate();
        c2.brake();
    }
}

abstract class Car {

    void start(){
        System.out.println("CAR STARTS!!");
    }

    abstract void accelarate();

    abstract void brake();

}

class FuelCar extends Car{

    @Override
    void accelarate(){
        System.out.println("Fuel car is accelarating");
    }

    @Override
    void brake(){
        System.out.println("Fuel car is stopping");
    }
}

class ElectricCar extends Car{

    @Override
    void accelarate(){
        System.out.println("Electric car is accelarating");
    }

    @Override
    void brake(){
        System.out.println("Electric car is stopping");
    }
}
