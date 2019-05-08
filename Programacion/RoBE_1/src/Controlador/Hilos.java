/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_Proto1;

/**
 *
 * @author braghoick
 */
public class Hilos extends Thread{
    
    FRM_Proto1 fRM_Proto1;
    
    public Hilos(FRM_Proto1 fRM_Proto1){
    
        this.fRM_Proto1=fRM_Proto1;
    }
    
    public void run(){
    
        try{
        
            while (true) {                
                
                fRM_Proto1.verificarDireccion();
                sleep(10);
                //fRM_Proto1.direccion="Estatico";
            }
            
        }
        
        catch(Exception error){
        
            System.err.println("Error en la ejecucion del proceso"+error);
        }
        
        
    }
    
    
}
