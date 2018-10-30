/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agents;

import Functions.CognitiveFunction;
import Functions.Fe;
import Functions.Fi;
import Functions.Ne;
import Functions.Ni;
import Functions.Se;
import Functions.Si;
import Functions.Te;
import Functions.Ti;
import jade.core.Agent;

/**
 * Class representing a human being
 * @author Hawlink
 */
public class Human extends Agent {
    
    private String tag;
    private CognitiveFunction dominantFunction;
    private CognitiveFunction secondaryFunction;
    private CognitiveFunction tertiaryFunction;
    private CognitiveFunction inferiorFunction;
    
    @Override
    protected void setup(){
        Object[] args = this.getArguments();
        if (args != null && args.length > 0){
            this.tag = (String)args[0];
        }
        initializeFunctions();
        System.out.println("I'm alive and " + this.tag);
    }
    
    void initializeFunctions(){
        switch(this.tag){
            case "INTJ" :
                dominantFunction = new Ni(100); secondaryFunction = new Te(75); 
                tertiaryFunction = new Fi(50); inferiorFunction = new Se(25);
                break;
            case "INTP" :
                dominantFunction = new Ti(100); secondaryFunction = new Ne(75); 
                tertiaryFunction = new Si(50); inferiorFunction = new Fe(25);
                break;
            case "ENTJ" :
                dominantFunction = new Te(100); secondaryFunction = new Ni(75); 
                tertiaryFunction = new Se(50); inferiorFunction = new Fi(25);
                break;
            case "ENTP" :
                dominantFunction = new Ne(100); secondaryFunction = new Ti(75);
                tertiaryFunction = new Fe(50); inferiorFunction = new Si(25);
                break;
            case "INFJ" :
                dominantFunction = new Ni(100); secondaryFunction = new Fe(75); 
                tertiaryFunction = new Ti(50); inferiorFunction = new Se(25);
                break;
            case "INFP" :
                dominantFunction = new Fi(100); secondaryFunction = new Ne(75); 
                tertiaryFunction = new Si(50); inferiorFunction = new Te(25);
                break;
            case "ENFJ" :
                dominantFunction = new Fe(100); secondaryFunction = new Ni(75); 
                tertiaryFunction = new Se(50); inferiorFunction = new Ti(25);
                break;
            case "ENFP" :
                dominantFunction = new Ne(100); secondaryFunction = new Fi(75); 
                tertiaryFunction = new Te(50); inferiorFunction = new Si(25);
                break;
            case "ISTJ" :
                dominantFunction = new Si(100); secondaryFunction = new Te(75); 
                tertiaryFunction = new Fi(50); inferiorFunction = new Ne(25);
                break;
            case "ISFJ" :
                dominantFunction = new Si(100); secondaryFunction = new Fe(75); 
                tertiaryFunction = new Ti(50); inferiorFunction = new Ne(25);
                break;
            case "ESTJ" :
                dominantFunction = new Te(100); secondaryFunction = new Si(75); 
                tertiaryFunction = new Ne(50); inferiorFunction = new Fi(25);
                break;
            case "ESFJ" :
                dominantFunction = new Fe(100); secondaryFunction = new Si(75); 
                tertiaryFunction = new Ne(50); inferiorFunction = new Ti(25);
                break;
            case "ISTP" :
                dominantFunction = new Ti(100); secondaryFunction = new Se(75); 
                tertiaryFunction = new Ni(50); inferiorFunction = new Fe(25);
                break;
            case "ESFP" :
                dominantFunction = new Se(100); secondaryFunction = new Fi(75); 
                tertiaryFunction = new Te(50); inferiorFunction = new Ni(25);
                break;
            case "ESTP" :
                dominantFunction = new Se(100); secondaryFunction = new Ti(75); 
                tertiaryFunction = new Fe(50); inferiorFunction = new Ni(25);
                break;
            case "ISFP" :  
                dominantFunction = new Fi(100); secondaryFunction = new Se(75); 
                tertiaryFunction = new Ni(50); inferiorFunction = new Te(25);
                break;
            default :
                doDelete();
                break;
        }
    }
}
