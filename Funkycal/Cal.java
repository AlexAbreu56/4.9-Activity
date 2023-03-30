public class Cal {

    public int solve(String equa) {

        try {
        int size = equa.length();
        int braceCount = 0;
        int firstBrace = 0;
        int secbrace = 0;
        boolean found1 = false;



        if(equa.contains("(") || (equa.contains(")"))) {

        for(int i = 0; i < size; i ++) {

            if(equa.substring(i,i+1).equals("(") && (found1 == false)) {
                firstBrace = i;
                found1 = true;
                braceCount++;
            } else if((equa.substring(i,i+1).equals("(")) && (found1 == true)) {   //Hunt down other inner braces
                braceCount++;
            }

            System.out.println(braceCount);

            if(equa.substring(i,i+1).equals(")") ) {      //Hunt down other inner braces Rem. Only outmost now
                braceCount--;
            }

            if(equa.substring(i,i+1).equals(")") && (braceCount == 0)) {
                secbrace = i;
            }
        }
        System.out.println(firstBrace);
        System.out.println(secbrace);
        System.out.println(equa.substring(firstBrace+1,secbrace));
        System.out.println("Recursion");
        int x = solve(equa.substring(firstBrace+1,secbrace));
        equa = equa.substring(0, firstBrace) + x + (equa.substring(secbrace+1));
        }








System.out.println("==============Solve==============");
System.out.println(equa);
  // Start Of adding terms together


if(equa.contains("+-")) {
    int loca =equa.indexOf("+-");
    System.out.println("+- Swap");
    equa.replace("+-", "-");
    System.out.println(equa.indexOf("+-"));
    equa = equa.substring(0, loca) + equa.substring(loca+1);
    System.out.println(equa);
}

if(equa.contains("+")) {

    while(equa.contains("+")) {
        int newSize = equa.length();
        int plusIndex = 0;
        int firstTerm = 0;
        int secTerm = 0;
        int secPlus = 0;
        int otherOper = 0;
        int otherOperSec = equa.length();
        boolean been = false;
        boolean first = false;
        for(int i=0; i < newSize; i++) {
            if(equa.substring(i,i+1).equals("+") && first == true) {
                secPlus = i;
                break;
            }
            if(equa.substring(i,i+1).equals("+") && first == false) {
                plusIndex = i;
                first = true;
            }

            if(equa.substring(i, i+1).equals("-") && first == true && been == true) {
                otherOper = i;
                been = false;
            }
            if(equa.substring(i, i+1).equals("-") && first == true && been == false) {
                otherOperSec = i;
            }
        }

        firstTerm = Integer.parseInt(equa.substring(otherOper,plusIndex));
        if(secPlus > 0){
            secTerm = Integer.parseInt(equa.substring(plusIndex+1,secPlus));
        }
        else{
            secTerm = Integer.parseInt(equa.substring(plusIndex+1,otherOperSec));
        }

        if(secPlus > 0){
            equa = plus(firstTerm,secTerm) + equa.substring(secPlus);
        }
        else{
            return plus(firstTerm,secTerm);
        }
    }
} //This whole block does addition




if(equa.contains("-")) {

    try{

    while(equa.contains("-")) {
        int newSize = equa.length();
        int plusIndex = 0;
        int firstTerm = 0;
        int secTerm = 0;
        int secPlus = 0;
        int otherOper = 0;
        boolean been = false;
        boolean first = false;
        for(int i=0; i < newSize; i++) {
            if(equa.substring(i,i+1).equals("-") && first == true) {
                secPlus = i;

            }
            if(equa.substring(i,i+1).equals("-") && first == false) {
                plusIndex = i;
                first = true;
            }

            if(equa.substring(i, i+1).equals("+") && first == true && been == true) {
                otherOper = i;
                been = false;
            }
        }

        firstTerm = Integer.parseInt(equa.substring(otherOper,plusIndex));
        if(secPlus > 0){
            secTerm = Integer.parseInt(equa.substring(plusIndex+1,secPlus));
        }
        else{
            secTerm = Integer.parseInt(equa.substring(plusIndex+1));
        }

        if(secPlus > 0){
            equa = plus(firstTerm,secTerm) + equa.substring(secPlus);
        }
        else{
            return subt(firstTerm,secTerm);
        }
    }
}
    catch (Exception e) {}
} //This whole block does addition

        }
        catch (Exception e) {
            return Integer.parseInt(equa);
        }
    return Integer.parseInt(equa);
}

















    public int plus(int num1, int num2) {
        int result = num1+num2;
        return result;
    }

    public int subt(int num1,int num2) {
        int result = num1-num2;
        return result;
    }


    public String braceAdd(String a) {
        String newEqua = a;
        int braceCount = 0;

        for(int i = newEqua.length()-1; i > 0; i--) {
            if(newEqua.substring(i, i+1).equals("+") || newEqua.substring(i, i+1).equals("-") || newEqua.substring(i, i+1).equals("*") || newEqua.substring(i, i+1).equals("/")) {
                newEqua = newEqua.substring(0, i-1) + "(" + newEqua.substring(i-1);
                i--;
                braceCount++;
                System.out.println(newEqua);
                System.out.println(braceCount);
            }
           
        }

        for(int j = braceCount; j > 0; j--) {
            newEqua = newEqua + ")";
            System.out.println(newEqua);
        }


        return newEqua;



    }
    
}