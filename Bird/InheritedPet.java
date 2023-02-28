package Bird;
/*
 * Activity 4.9.1
 */
public class InheritedPet
{
  public static void main(String[] args)
  {
    System.out.println("Average Eagle moment");
    Eagle myEagle = new Eagle();
    myEagle.setName("America");
    myEagle.hunt();
    myEagle.fly();
    myEagle.sleep();
    
    System.out.println("Kids be like, parrot;");
    Parrot myParrot = new Parrot();
    myParrot.setName("Zoomer");
    myParrot.talk();
    myParrot.fly();
    myParrot.sleep();

  }
}