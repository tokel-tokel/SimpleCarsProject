import Enums.Locations;

public class SportCar extends  Car
{
    private int spoilerAngle = 160;
    final int minSpoilerAngle = 150;
    final int maxSpoilerAngle = 175;

    public SportCar(int speed, String mark, Locations location, int spoilerAngle)
    {
        super(speed, mark, Locations.OutOfCity);
        relocate(location);
        setSpoilerAngle(spoilerAngle);
    }
    public SportCar(String mark)
    {
        super(0, mark, Locations.OutOfCity);
    }

    private void setSpoilerAngle(int spoilerAngle)
    {
        this.spoilerAngle = spoilerAngle >= minSpoilerAngle && spoilerAngle <= maxSpoilerAngle ? spoilerAngle : this.spoilerAngle;
    }

    @Override
    public void printState()
    {
        System.out.println(this);
    }

    @Override
    public String toString()
    {
        return super.toString() + spoilerAngle + "°";
    }

    @Override
    public void relocate(Locations location)
    {
        if (location == Locations.Track || location == Locations.OutOfCity)
        {
            super.relocate(location);
        }
    }
}
