/*
 * Activity 4.9.7
 */ 
public class Student 
{ 
  private String name = "";  
  private int id;
  private int grade;

  // Constructor 
  Student(String inputName, int inputId, int inputGrade) 
  { 
    name = inputName;
    id = inputId;
    grade = inputGrade;
  } 
  public String toString()
  {
    return (name + ", " + id + ", " + grade);
  }
  public int getId()
  {
    return id;
  }
  public static boolean equal(Student x, Student i){
    if(x.getId() == i.getId()){

      return true;
    }
    else{

      return false;
    }

  }
} 