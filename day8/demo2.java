package day8;

// interfaces

public class demo2 {
    public static void main(String[] args) {

        //
        Car car=new Car();

        car.changeGear(1);
        car.speedUp(30);

        // 
        Bike bike=new Bike();

        bike.speedUp(20);
        bike.changeGear(2);
    }
}

interface Vehicle{
    
    void changeGear(int a);

    void speedUp(int a);
}

class Car implements Vehicle{
    
    int gear;
    int speed;

    @Override
    public void changeGear(int newGear){
        gear=newGear;
    }

    @Override
    public void speedUp(int inc){
        speed+=inc;
    }
}

class Bike implements Vehicle{
    
    int gear;
    int speed;

    @Override
    public void changeGear(int newGear){
        gear=newGear;
    }

    @Override
    public void speedUp(int inc){
        speed+=inc;
    }
}