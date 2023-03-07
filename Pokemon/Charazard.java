package Pokemon;

public class Charazard extends Fire{
    private String sType;
    public Charazard(){
        super("Fire", 100,50, "Steven");
        sType = "Flying";
    }
    public Charazard(String t, int h, int d, String n){
        super(t, h, d, n);
        sType = "Flying";
    }

    public void attack(){
        System.out.print("Charazard uses Fire Breath for " + damage + " damage");
    }
    public void health(){
        System.out.print("Charazard uses Fire Breath for " + damage + " damage");
    }
    public String getType(){
        return (type + " " + sType);
    }

}

