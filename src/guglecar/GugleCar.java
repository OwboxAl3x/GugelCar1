/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guglecar;

import es.upv.dsic.gti_ia.core.AgentID;
import es.upv.dsic.gti_ia.core.AgentsConnection;

/**
 *
 * @author Adrian
 * @author Alejandro García
 */
public class GugleCar {

    /**
     * @author Adrian
     * @author Alejandro García
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche car = null;
        Perceptor sensor = null;
        
        AgentsConnection.connect("isg2.ugr.es", 6000, "Cerastes", "Boyero", "Carducci", false);
        
        try {
            String nombreCoche = "car";
            String nombrePerceptor = "sensor";
            
            car = new Coche(new AgentID(nombreCoche),nombrePerceptor);
            sensor = new Perceptor(new AgentID(nombrePerceptor),nombreCoche);
            
        } catch (Exception ex) {
            
            System.err.println("Fallo al crear al agente coche/sensor");
            System.exit(1);
            
        }
        
        car.start();
        sensor.start();
        
    }
    
}
