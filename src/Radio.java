public class Radio
{
    private float frequency = 87.5f;
    final float minFrequency = 87.5f;
    final float maxFrequency = 108.0f;
    final float deltaFrequency = maxFrequency - minFrequency;

    public void tune(int times)
    {
        frequency += times * 0.1f - minFrequency;
        frequency -= ((int) (frequency / deltaFrequency)) * deltaFrequency;
        frequency += minFrequency;
    }
    public void play()
    {
        System.out.println("Сейчас радио играет на частоте " + frequency);
    }
}
