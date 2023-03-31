import java.util.*;

public class Solver {
    public static void main(String[] args){
        FinalCal cal = new FinalCal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Equation: (No negative number or two problems with ()'s Ex: (3+4)+(3+-4))");
        String Problem = sc.nextLine();
        String[] temp = Problem.split("((?=[+-/*()^])|(?<=[+-/*()^]))");
        ArrayList<String> eqList = new ArrayList<String>();
        for(int i =0; i < temp.length; i++)
        {
            eqList.add(temp[i]);
        }
        System.out.println(cal.calc(eqList));

    }
    

}
