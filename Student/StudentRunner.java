/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("Alex", 123456, 12); 
    Student t = new Student("Olivia", 654321, 12);
    Student r = new Student("Christian", 321456, 12);

    // Below two statements are equivalent 
    System.out.println(s.toString()); 
    System.out.println(t.toString()); 
    System.out.println(r.toString()); 
    System.out.println(Student.equal(s,t));
  } 
      
} 