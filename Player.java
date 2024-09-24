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
