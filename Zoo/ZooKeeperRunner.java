import java.util.ArrayList;

/*
 * Activity 4.9.2
 */

public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Animal Deer = new Deer();
    Animal Elephant = new Elephant();
    Animal Giraffe = new Giraffe();
    Animal Hippo = new Hippo();
    Animal Gorilla = new Gorilla();
    Animal Lion = new Lion();
    Animal Monkey = new Monkey();
    Animal Tiger = new Tiger();
    hearTheAnimal(Monkey);
    hearTheAnimal(Tiger);
    hearTheAnimal(Deer);
    hearTheAnimal(Elephant);
    hearTheAnimal(Hippo);
    hearTheAnimal(Giraffe);
    hearTheAnimal(Lion);
    hearTheAnimal(Gorilla);
  }
  public static void hearTheAnimal(Animal x){
    System.out.println(x.speak());
  }
}