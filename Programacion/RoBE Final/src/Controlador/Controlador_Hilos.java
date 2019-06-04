/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_PantallaJuego;
import static java.lang.Thread.sleep;

/**
 *
 * @author braghoick
 */


public class Controlador_Hilos extends Thread{
    
    FRM_PantallaJuego fRM_PantallaJuego;

    public Controlador_Hilos(FRM_PantallaJuego fRM_PantallaJuego) {
        
        this.fRM_PantallaJuego = fRM_PantallaJuego;
    }

    public void run(){
    
       
        try{
        
            while(true){
            
                fRM_PantallaJuego.moverFondo();
                fRM_PantallaJuego.moverItems();
                fRM_PantallaJuego.verificarEstado();
                sleep(50);
                
               
            }
            
            
        }
        
        catch(Exception e){
            System.out.println("Error de carga"+e);
        }
        
    }
    
}
