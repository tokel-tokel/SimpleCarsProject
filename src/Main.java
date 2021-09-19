import Enums.Locations;

public class Main
{
    public static void main(String[] args)
    {
        SimpleCar car = new SimpleCar(20, "Toyota", Locations.City);
        Truck truck = new Truck(40, "KAMAZ", Locations.City, 18.3f);
        SportCar sportCar = new SportCar("Ferrari");
        Car[] cars = {sportCar, car, truck};
        IRadio[] radios = {car, truck};
        sportCar.boost(69);
        for (Car c : cars)
        {
            c.printState();
        }
        for (IRadio r : radios)
        {
            r.radioTune(347);
            r.radioPlay();
        }
        truck.radioTune(54);
        truck.radioPlay();

    }
}
