import java.util.Scanner;

public class Solver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What math");
        Cal cal = new Cal();
        
        System.out.print(cal.solve("4+10+3+3"));
    }
    

}
