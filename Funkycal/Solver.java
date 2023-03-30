import java.util.Scanner;

public class Solver {
    public static void main(String[] args){
        Caltwo cal = new Caltwo();
        Scanner sc = new Scanner(System.in);
        System.out.println("What math");
        String Problem = sc.nextLine();
        System.out.println(cal.funnyCal(Problem));

    }
    

}
