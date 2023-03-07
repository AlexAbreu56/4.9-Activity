public class Elephant extends Animal{
    public Elephant(){
        sound = ("Toot Toot, Honk Honk");
    }
    public Elephant(String food, boolean nocturnal, double aveLifeSpan)
{
  super(food, nocturnal, aveLifeSpan);
}

    public void forage(){
        System.out.println("Get berry.");
    }
    public String toString()
{
  return "This is an object of the Elephant class.";
}
}
