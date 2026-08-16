/*
Factory Pattern — How It Works
Vehicle → Common interface.
Car/Bike → Different vehicle classes.
Factory → Decides which vehicle to create.
Client → Asks the Factory instead of using new directly.
Factory returns the required object.
Simple flow:

Client → Factory → Create Object → Return Object → Use Object

*/


package Creational;
interface Vehicle{
    void delive();
}

class Car implements Vehicle{
    @Override
    public void delive(){
        System.out.println("This is from Carr");
    }
}

class Bike implements Vehicle{
    @Override
    public void delive(){
        System.out.println("This is from Carr");
    }
}

class VehicleFactory{
    public static Vehicle createVhicle(String type){
       if(type.equals("car")){
          return new Car();
       }else if(type.equals("bike")){
          return new Bike();
       }
       throw new IllegalArgumentException("Unknown type ");
    }
}

public class Factory {

    public static void main(String[] args) {

        Vehicle vehicle1 =
                VehicleFactory.createVhicle("car");

        vehicle1.delive();


        Vehicle vehicle2 =
                VehicleFactory.createVhicle("bike");

        vehicle2.delive();


        Vehicle vehicle3 =
                VehicleFactory.createVhicle("truck");

        vehicle3.delive();
    }
}