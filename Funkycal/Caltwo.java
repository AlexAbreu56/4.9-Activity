import java.util.ArrayList;

public class Caltwo {
    public int funnyCal(String x)
    {
        int braceCount = 0;
        int firstBrace = 0;
        int secBrace = 0;
        boolean found1 = false;
        String newE= "";
        ArrayList<String> equa = new ArrayList<String>();
        for(int i = 0; i < x.length(); i++)
        {
            equa.add(x.substring(i,i+1));
        }

        if(x.contains("(") || (x.contains(")")))
        {
            for(int i = 0; i < equa.size(); i ++)
            {
                if(equa.get(i).equals("(") && (found1 == false))
                {
                    firstBrace = i;
                    found1 = true;
                    braceCount++;
                } 
                else if(equa.get(i).equals("(") && (found1 == true))
                {
                    braceCount++;
                }
                if(equa.get(i).equals(")") ) {      //Hunt down other inner braces Rem. ONly outmost now
                    braceCount--;
                }

                if(equa.get(i).equals(")") && (braceCount == 0)) {
                    secBrace = i;
                }

            }
        for(int v = firstBrace+1; v< secBrace; v++)
        {
            newE += equa.get(v).toString();
        }
        int q = funnyCal(newE);
        x = x.substring(0, firstBrace) + q + (x.substring(secBrace+1));
        }

        
        while(x.contains("+") || x.contains("-") || x.contains("*") || x.contains("/"))
        {
            ArrayList<String> equa2 = new ArrayList<String>();
            String[] temp = x.split("((?=[+-/*()])|(?<=[+-/*()]))");
            for(int i = 0; i < temp.length; i++)
            {
                equa2.add(temp[i]);
            }
            int sum =0;
            int count = 0;

            for(int i = 0; i < equa2.size(); i ++)
            {
                if((!(equa2.get(i).contains("+"))) || !(equa2.get(i).contains("*")) || !(equa2.get(i).contains("-")) || !(equa2.get(i).contains("/")))
                {
                    count++;
                }
            }
            for(int i = 0; i < equa2.size(); i ++)
            {
                if(equa2.get(i).contains("*"))
                {
                    if(count == 2)
                    {
                        return mult(Integer.parseInt(equa2.get(equa2.indexOf("*")-1)), Integer.parseInt(equa2.get(equa2.indexOf("*")+1)));
                    }
                    else
                    {
                        String newEqua = "";
                        sum = mult(Integer.parseInt(equa2.get(equa2.indexOf("*")-1)), Integer.parseInt(equa2.get(equa2.indexOf("*")+1)));
                        equa2.remove(equa2.get(equa2.indexOf("*")-1));
                        equa2.remove(equa2.get(equa2.indexOf("*")+1));
                        equa2.set(equa2.indexOf("*"), Integer.toString(sum));
                        for(int a= 0; a < equa2.size(); a++)
                        {
                            newEqua += equa2.get(a);
                            x = newEqua;
                        }
                    }
                }
            }
            
            for(int i = 0; i < equa2.size(); i ++)
            {
                if(equa2.get(i).contains("/"))
                {
                    if(count == 2)
                    {
                        return div(Integer.parseInt(equa2.get(equa2.indexOf("/")-1)), Integer.parseInt(equa2.get(equa2.indexOf("/")+1)));
                    }
                    else
                    {
                        String newEqua = "";
                        sum = div(Integer.parseInt(equa2.get(equa2.indexOf("/")-1)), Integer.parseInt(equa2.get(equa2.indexOf("/")+1)));
                        equa2.remove(equa2.get(equa2.indexOf("/")-1));
                        equa2.remove(equa2.get(equa2.indexOf("/")+1));
                        equa2.set(equa2.indexOf("/"), Integer.toString(sum));
                        for(int a= 0; a < equa2.size(); a++)
                        {
                            newEqua += equa2.get(a);
                            x = newEqua;
                        }
                    }
                }
            }

            for(int i = 0; i < equa2.size(); i ++)
            {
                if(equa2.get(i).contains("+"))
                {
                    if(count == 2)
                    {
                        return plus(Integer.parseInt(equa2.get(equa2.indexOf("+")-1)), Integer.parseInt(equa2.get(equa2.indexOf("+")+1)));
                    }
                    else
                    {
                        String newEqua = "";
                        sum = plus(Integer.parseInt(equa2.get(equa2.indexOf("+")-1)), Integer.parseInt(equa2.get(equa2.indexOf("+")+1)));
                        equa2.remove(equa2.get(equa2.indexOf("+")-1));
                        equa2.remove(equa2.get(equa2.indexOf("+")+1));
                        equa2.set(equa2.indexOf("+"), Integer.toString(sum));
                        for(int a= 0; a < equa2.size(); a++)
                        {
                            newEqua += equa2.get(a);
                            x = newEqua;
                        }
                    }
                }
            }
            for(int i = 0; i < equa2.size(); i ++)
            {
                if(equa2.get(i).contains("-"))
                {
                    if(count == 2)
                    {
                        return sub(Integer.parseInt(equa2.get(equa2.indexOf("-")-1)), Integer.parseInt(equa2.get(equa2.indexOf("-")+1)));
                    }
                    else
                    {
                        String newEqua = "";
                        sum = sub(Integer.parseInt(equa2.get(equa2.indexOf("-")-1)), Integer.parseInt(equa2.get(equa2.indexOf("-")+1)));
                        equa2.remove(equa2.get(equa2.indexOf("-")-1));
                        equa2.remove(equa2.get(equa2.indexOf("-")+1));
                        equa2.set(equa2.indexOf("-"), Integer.toString(sum));
                        for(int a= 0; a < equa2.size(); a++)
                        {
                            newEqua += equa2.get(a);
                            x = newEqua;
                        }
                    }
                }
            }

                





                

            
        }
        
        /* 
        while(x.contains("+"))
        {
            String[] newEqua = x.split("((?=[+-/*()])|(?<=[+-/*()]))"); 
            int plusIndex = 0;
            int plusIndex2 = 0;
            String stringAfter = "";
            String stringBefore = "";
            boolean first = false;

            for(int i = 0; i < newEqua.length; i ++)
            {
                if(newEqua[i].equals("+") && first == true) 
                {  
                    plusIndex2 = i;
                    break;
                }
                if(newEqua[i].equals("+") && first == false) 
                {  
                    plusIndex = i;
                    first = true;
                }
            }

            if(plusIndex2 > 0)
            {
                
                for(int r = plusIndex2; r < newEqua.length; r++)
                {
                    stringAfter += newEqua[r];
                }
                for(int r = plusIndex; r < 0; r--)
                {
                    stringBefore += newEqua[r];
                }

                x = stringBefore + plus(Integer.parseInt(newEqua[plusIndex-1]), Integer.parseInt(newEqua[plusIndex+1])) + stringAfter;
            }
            else{
                return plus(Integer.parseInt(newEqua[plusIndex-1]), Integer.parseInt(newEqua[plusIndex+1]));
            }
             
        }
        while(x.contains("-"))
        {
            String[] newEqua = x.split("((?=[+-/*()])|(?<=[+-/*()]))"); 
            int subIndex = 0;
            int subIndex2 = 0;
            String stringAfter = "";
            String stringBefore = "";
            boolean first = false;

            for(int i = 0; i < newEqua.length; i ++)
            {
                if(newEqua[i].equals("-") && first == true) 
                {  
                    subIndex2 = i;
                    break;
                }
                if(newEqua[i].equals("-") && first == false) 
                {  
                    subIndex = i;
                    first = true;
                }
            }

            if(subIndex2 > 0)
            {
                
                for(int r = subIndex2; r < newEqua.length; r++)
                {
                    stringAfter += newEqua[r];
                }

                x = stringBefore + sub(Integer.parseInt(newEqua[subIndex-1]), Integer.parseInt(newEqua[subIndex+1])) + stringAfter;
            }
            else{
                return sub(Integer.parseInt(newEqua[subIndex-1]), Integer.parseInt(newEqua[subIndex+1]));
            }
             
        }*/

        
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
    public int div(int num1, int num2)
    {
        int result = num1 / num2;
        return result;
    }
    public int mult(int num1, int num2)
    {
        int result = num1 * num2;
        return result;
    }
}
