public class Cal {

    public int solve(String equa) {
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

            if(equa.substring(i,i+1).equals(")") ) {      //Hunt down other inner braces Rem. ONly outmost now
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

if(equa.contains("+")) {


while(equa.contains("+")) {
    int newSize = equa.length();
    int plusIndex = 0;
    int firstTerm = 0;
    int secTerm = 0;
    int secPlus = 0;
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

       
    }



    firstTerm = Integer.parseInt(equa.substring(0,plusIndex));
    if(secPlus > 0){
        secTerm = Integer.parseInt(equa.substring(plusIndex+1,secPlus));
    }
    else{
        secTerm = Integer.parseInt(equa.substring(plusIndex+1));
    }


    System.out.println(plus(firstTerm, secTerm));
    System.out.println(equa);
    if(secPlus > 0){
        equa = plus(firstTerm,secTerm) + equa.substring(secPlus);
    }
    else{
        return plus(firstTerm,secTerm);
    }

}

} 
    return Integer.parseInt(equa);
}





    public int plus(int num1, int num2) {
        int result = num1+num2;
        return result;
    }
    
}