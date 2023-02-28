package Bird;
/*
 * Activity 4.9.1
 */
public class Bird
{
  private String name;
  private int energy;
  private int happy;
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getName()
  {
    return name;
  }
  
  public void fly()
  {
    energy += 10;
    happy += 5;
    System.out.println("I go zoom.");
  }

  public void sleep()
  {
    energy += 5;
    System.out.println("honk shoe");
  }
  
}
