public class death {
public static void main(String[] args){
    System.out.println(reverse("hello"));
}
public static String reverse(String str){
    String newstr = "";

    for (int x = str.length(); x > 0; x--){
      newstr = newstr + str.substring(x-1, x);

    }
    return newstr;
}
}
