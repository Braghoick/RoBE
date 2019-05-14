/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.FRM_Proto2;

/**
 *
 * @author braghoick
 */
public class Hilos extends Thread{
    
    FRM_Proto2 fRM_Proto2;
    
    public Hilos(FRM_Proto2 fRM_Proto2){
    
        this.fRM_Proto2=fRM_Proto2;
    }
    
    public void run(){
    
        try{
        
            while (true) {                
                
                fRM_Proto2.movimientoPersonaje();
                sleep(30);
            }
            
        }
        
        catch(Exception error){
        
            System.err.println("Error en la ejecucion del proceso"+error);
        }
        
        
    }
    
    
}
