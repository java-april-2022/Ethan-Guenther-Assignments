public class Mammal
{
    protected int energyLevel = 50;

    public int displayEnergy()
    {
        System.out.println("Your energy:" + this.energyLevel);

        return this.energyLevel;
    }

    public Mammal(int energyLevel)
    {
        this.energyLevel = energyLevel;
    }
}