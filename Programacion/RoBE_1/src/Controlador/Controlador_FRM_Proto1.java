/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_Proto1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author braghoick
 */
public class Controlador_FRM_Proto1 implements ActionListener, KeyListener{

    FRM_Proto1 fRM_Proto1;

    public Controlador_FRM_Proto1(FRM_Proto1 fRM_Proto1) {
        this.fRM_Proto1 = fRM_Proto1;
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
    }

//***************************************************************************
    
    
    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent tecla) {
        
        if(tecla.getKeyCode()==65){
        
            fRM_Proto1.direccion="Izquierda";
            
        }
        
        if(tecla.getKeyCode()==68){
        
            fRM_Proto1.direccion="Derecha";
        }
        
        
    }

    public void keyReleased(KeyEvent e) {
        
        //fRM_Proto1.direccion="Estatico";
    }
    
//***************************************************************************

    
}
