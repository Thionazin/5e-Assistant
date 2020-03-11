/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5eassistant.Client;

/**
 *
 * @author wywang
 */
public class TileObject {
    //wtf is going on here
    
    
    //variable below stores all booleans as one string.
    //0 is no, 1 is yes
    //First digit is the status. Is the TileObject a living being?
    //Second one is if it's a player character like object.
    //Might add more later
    String boolInfo = "00";
    //This mega string is used to store the scores.
    //STR, DEX, CON, INT, WIS, CHA
    String abilityScores = "00|00|00|00|00|00";
    //This mega string is used for modifiers.
    String modifiers = "00|00|00|00|00|00";
    //rest of variables
    int health;
    int AC;
    String notes;
    String name;
    
    public TileObject(String objectName, String objectNotes, int hp, String objectModifiers, String abilityScore, String yesNo)
    {
        notes = objectNotes;
        health = hp;
        name = objectName;
        modifiers = objectModifiers;
        abilityScores = abilityScore;
        boolInfo = yesNo;
    }
    
    public void modifyHealth(int change)
    {
        health += change;
    }
    
    public void updateNotes(String newNotes)
    {
        notes = newNotes;
    }
    
    public void changeName(String newName)
    {
        name = newName;
    }
    
    public int checkHealth()
    {
        return health;
    }
    
    public String getName()
    {
        return name; 
    }
    
    public String getInfo()
    {
        return notes;
    }
    
    public String getModifier(String type)
    {
        switch(type)
        {
            case "STR": return modifiers.substring(0,2);
            case "DEX": return modifiers.substring(3,5);
            case "CON": return modifiers.substring(6,8);
            case "INT": return modifiers.substring(9,11);
            case "WIS": return modifiers.substring(12,14);
            case "CHA": return modifiers.substring(15);
            default: return "Error";
        }
    }
}
