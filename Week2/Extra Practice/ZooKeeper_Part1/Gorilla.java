public class Gorilla extends Mammal{

    public Gorilla(int energyLevel)
    {
        super(energyLevel);
    }
    public void throwSomething()
    {
        System.out.println("The gorilla threw a banana peel");
        energyLevel -= 5;
    }
    public void eatBananas()
    {
        System.out.println("Banana Good. Me want another!");
        energyLevel +=10;
    }
    public void climb()
    {
        System.out.println("Climbing fun, me climb again");
        energyLevel-=10;
    }
    public int getEnergy()
    {
        return this.energyLevel;
    }
}
