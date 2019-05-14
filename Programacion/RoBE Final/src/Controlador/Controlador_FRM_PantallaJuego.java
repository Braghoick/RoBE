/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FRM_PantallaJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author braghoick
 */
public class Controlador_FRM_PantallaJuego implements ActionListener, KeyListener{

    FRM_PantallaJuego fRM_PantallaJuego;
    
    public Controlador_FRM_PantallaJuego(FRM_PantallaJuego fRM_PantallaJuego) {
        
        this.fRM_PantallaJuego=fRM_PantallaJuego;
    }

    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        if(e.getKeyCode()==32){
        
            fRM_PantallaJuego.posicionPersonaje="Aire";
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
