public class Bat extends Mammal
{
    public Bat()
    {
        super(300);
    }    

    public void fly()
    {
        System.out.println("Swooooshhhh");
        energyLevel -= 50;
    }

    public void eatHumans()
    {
        System.out.println("I'm not a vampire bat");
        energyLevel += 25;
    }

    public void attackTown()
    {
        System.out.println("Crackle Crackle.... BoooooooMMMMMMMMMMMMMM");
        energyLevel -=100;
    }
}
