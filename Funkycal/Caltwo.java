

public class Caltwo {
    public int funnyCal(String x)
    {
        int braceCount = 0;
        int firstBrace = 0;
        int secBrace = 0;
        boolean found1 = false;
        String newE = "";
        String newX = x;
        String[] equa = newX.split("((?=[+-/*()])|(?<=[+-/*()]))");
        if(x.contains("(") || (x.contains(")")))
        {
            for(int i = 0; i < equa.length; i ++)
            {
                if(equa[i].equals("(") && (found1 == false))
                {
                    firstBrace = i;
                    found1 = true;
                    braceCount++;
                } 
                else if(equa[i].equals("(") && (found1 == true))
                {
                    braceCount++;
                }
                if(equa[i].equals(")") ) {      //Hunt down other inner braces Rem. ONly outmost now
                    braceCount--;
                }

                if(equa[i].equals(")") && (braceCount == 0)) {
                    secBrace = i;
                }

            }
        for(int v = firstBrace+1; v< secBrace; v++)
        {
            newE += equa[v].toString();
        }
        int q = funnyCal(newE);
        x = x.substring(0, firstBrace) + q + (x.substring(secBrace+1));
        }

        while(x.contains("+"))
        {
            String[] newEqua = x.split("((?=[+-/*()])|(?<=[+-/*()]))"); 
            int plusIndex = 0;
            
            for(int i = 0; i < newEqua.length; i ++)
            {
                if(equa[i].equals("+") ) 
                {  
                    plusIndex = i;
                    break;
                }
            }
            if(newEqua.length != 3)
            {
                x = plus(Integer.parseInt(newEqua[plusIndex-1]), Integer.parseInt(newEqua[plusIndex+1])) + x.substring(plusIndex+1);
            }
            else{
                plus(Integer.parseInt(newEqua[plusIndex-1]), Integer.parseInt(newEqua[plusIndex+1]));
            }
             
        }


        
        return Integer.parseInt(x);
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
