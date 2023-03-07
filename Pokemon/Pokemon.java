package Pokemon;

public class Pokemon{
    String name;
    String type;
    int health;
    int damage;
    
    public Pokemon(){
        damage = 1;
        health = 1;
        type = "null";
        name = "null";
    }
    public Pokemon(String t, int h, int d, String n){
        this.type = t;
        this.health = h;
        this.damage = d;
        this.name = n;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public void setType(String t){
        this.type = t;
    }
    public void setDamage(int d){
        this.damage = d;
    }
    public void setHealth(int h){
        this.health = h;
    }
    public int getDamage(){
        return damage;
    }
    public int getHealth(){
        return health;
    }
    public void attack(){
        System.out.print("pokemon attack for " + damage + " damage");
    }
    public void health(){
        System.out.print("Pokemon has " + health + " health");
    }
}