import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable{
    
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;
    
    public Player(String name, int hitPoints, int strength) {
        
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
    }

    public String getName(){
        return name;
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    public int getHitPoints(){
        return hitPoints;
    }
    
    public int getStrength(){
        return strength;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }

    @Override
    public List<String> write(){
        
        List<String> values = new ArrayList<String>();
        
        values.add(0, name);
        values.add(1, String.valueOf(hitPoints));
        values.add(2, String.valueOf(strength));
        values.add(3, weapon);
        
        return values;

    }
    
    public void setStrength(int strength){
        this.strength = strength;
    }

    @Override
    public void read(List<String> list){
        
        if(!(list == null || list.size() <= 0)){
            
            name = list.get(0);
            hitPoints = Integer.parseInt(list.get(1));
            strength = Integer.parseInt(list.get(2));
            weapon = list.get(3);
        }
        
    }
    
    
    @Override
    public String toString() {
        return "Player{" + "name='" + name + "', " + "hitPoints=" +
                hitPoints + ", " + "strength=" + strength + ", " +
                "weapon='" + weapon + "'}";
    }
    
}
