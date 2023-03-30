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


                if(equa.substring(i,i+1).equals(")") ) {      //Hunt down other inner braces Rem. ONly outmost now
                    braceCount--;
                }

                if(equa.substring(i,i+1).equals(")") && (braceCount == 0)) {
                    secbrace = i;
                }
            }
            int x = solve(equa.substring(firstBrace+1,secbrace));
            equa = equa.substring(0, firstBrace) + x + (equa.substring(secbrace+1));
        }

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



        if(secPlus > 0){
            equa = plus(firstTerm,secTerm) + equa.substring(secPlus);
            System.out.println(equa);
        }
        else{
            return plus(firstTerm,secTerm);
            
        }
        
}

} 


if(equa.contains("-")) {
    while(equa.contains("-")) {
    int newSize = equa.length();
    int subIndex = 0;
    int firstTerm = 0;
    int secTerm = 0;
    int secSub = 0;
    boolean first = false;
    for(int i=0; i < newSize; i++) {


        if(equa.substring(i,i+1).equals("-") && first == true) {
            secSub= i;
            break;
        }


        if(equa.substring(i,i+1).equals("-") && first == false) {
            subIndex = i;
            first = true;
        }

       
    }
    firstTerm = Integer.parseInt(equa.substring(0,subIndex));
        if(secSub > 0){
            secTerm = Integer.parseInt(equa.substring(subIndex+1,secSub));
        }
        else{
            secTerm = Integer.parseInt(equa.substring(subIndex+1));
        }


        if(secSub > 0){
            equa = sub(firstTerm,secTerm) + equa.substring(secSub);
        }
        else{
            return sub(firstTerm,secTerm);
        }
}

} 
    return Integer.parseInt(equa);
}





    public int plus(int num1, int num2) {
        int result = num1+num2;
        return result;
    }
    public int sub(int num1, int num2){
        int result = num1-num2;
        return result;
    }
    
}