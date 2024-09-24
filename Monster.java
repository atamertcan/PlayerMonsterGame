import java.util.List;
import java.util.ArrayList;

public class Monster implements ISaveable{
    
    private String name;
    private int hitPoints;
    private int strength;
    
    public Monster(String name, int hitPoints, int strength) {
        
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName(){
        return name;
    }
    
    public int getHitPoints(){
        return hitPoints;
    }
    
    public int getStrength(){
        return strength;
    }

    @Override
    public List<String> write() {
        
        List<String> values = new ArrayList<String>();
        
        values.add(0, name);
        values.add(1, String.valueOf(hitPoints));
        values.add(2, String.valueOf(strength));
        
        return values;
    }
