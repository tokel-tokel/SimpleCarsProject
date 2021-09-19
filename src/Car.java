import Enums.Locations;

public abstract class Car
{
    private int speed;
    private String mark;
    private int permSpeed;

    public Car(int speed, String mark, Locations location)
    {
        relocate(location);
        setSpeed(speed);
        this.mark = mark;
    }
    public Car(String mark)
    {
        this(0, mark, Locations.City);
    }

    public void setSpeed(int speed)
    {
        this.speed = speed <= permSpeed && speed >= 0 ? speed : this.speed;
    }

    public void boost(int delta)
    {
        setSpeed(speed + delta);
    }
    public void breaking(int delta)
    {
        setSpeed(speed - delta);
    }

    public void garageTuning(String mark)
    {
        this.mark = mark;
    }

    public void relocate(Locations location)
    {
        switch (location)
        {
            case City -> permSpeed = 60;
            case OutOfCity -> permSpeed = 80;
            case Track -> permSpeed = 120;
        }
    }

    public abstract void printState();
    @Override
    public String toString()
    {
        return speed + " " + mark + " ";
    }
}
