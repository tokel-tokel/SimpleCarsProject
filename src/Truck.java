import Enums.Locations;

public class Truck extends Car implements  IRadio
{
    private Radio radio = new Radio();
    private float liftingCapacity = 20f;

    public Truck(int speed, String mark, Locations location, float liftingCapacity)
    {
        super(speed, mark, location);
        this.liftingCapacity = liftingCapacity;
    }

    public Truck(String mark)
    {
        super(mark);
    }


    @Override
    public void printState()
    {
        System.out.println(this);
    }

    @Override
    public void radioTune(int times)
    {
        radio.tune(times);
    }

    @Override
    public void radioPlay()
    {
        radio.play();
    }

    @Override
    public String toString()
    {
        return super.toString() + liftingCapacity + " tons";
    }
}
