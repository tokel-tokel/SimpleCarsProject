import Enums.Locations;

public class SimpleCar extends Car implements IRadio
{
    private Radio radio = new Radio();

    public SimpleCar(int speed, String mark, Locations location)
    {
        super(speed, mark, location);
    }
    public SimpleCar(String mark)
    {
        super(mark);
    }

    @Override
    public void printState()
    {
        System.out.println(this);
    }
    @Override
    public String toString()
    {
        return super.toString();
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
}
