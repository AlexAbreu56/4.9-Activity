/* Reverse a string using an iterative algorithm */
public class Recurrsion{
  public static String reverse(String str){
  String newstr = "";
  for (int x = str.length(); x <= 0; x--){
    newstr += str.substring(x-1, x);

  }
  System.out.println(newstr);
  return newstr;
}
}
