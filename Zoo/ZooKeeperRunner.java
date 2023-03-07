import java.util.ArrayList;

/*
 * Activity 4.9.2
 */

public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    //a.trumpet();
    Object o = new Object();
    System.out.println(o.toString());
    Elephant e = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(e.toString());
    Animal a3 = new Animal();
    System.out.println(a3.toString());
    Animal a4 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(a4.toString());  
    Object o2 = new Elephant("leaves, grasses, roots", false, 60.0);
    System.out.println(o2.toString());
  }
  
  public static void hearTheAnimal(Animal x){
    System.out.println(x.speak());
  }
}