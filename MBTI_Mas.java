/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mbti_mas;

import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ControllerException;

/**
 * Main class - starting the agents
 * @author Hawlink
 */
public class MBTI_Mas {
    
    public static AgentContainer container;

    /**
     * @param args the command line arguments
     * @throws jade.wrapper.ControllerException
     */
    public static void main(String[] args) throws ControllerException {
        Runtime rt = Runtime.instance();
        Properties p = new ExtendedProperties();
        p.setProperty("gui", "true");
        ProfileImpl pc = new ProfileImpl(p);
        //starting the container
        container = rt.createMainContainer(pc);
        container.start();
        AgentController human = container.createNewAgent("INFJTest", "Agents.Human", new Object[]{"INFJ"});
        human.start();
    }
    
}
