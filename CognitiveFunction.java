/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

/**
 * Class representing a jungian cognitive function
 * @author Hawlink
 */
public abstract class CognitiveFunction {
    
    /**
     * Status of the function's development 
     */
    private final int strength;
    
    /**
     * Constructor
     * @param _strength base value
     */
    public CognitiveFunction(int _strength){
        this.strength = _strength;
    }
    
    /**
     * Method used by the function to process an information
     * @param information String
     */
    public abstract void processInformation(String information);
    
    /**
     * Getter of the strength
     * @return int
     */
    public int getStrength(){
        return this.strength;
    }
}
