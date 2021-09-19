public class TokelUtils
{
    public static boolean isIRadio (Object obj)
    {
        try
        {
            IRadio r = (IRadio) obj;
            return true;
        }
        catch (ClassCastException ex)
        {
            return false;
        }
    }
}
