/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_PantallaJuego;
import Controlador.Controlador_Hilos;
import javax.swing.ImageIcon;

/**
 *
 * @author braghoick
 */

public class FRM_PantallaJuego extends javax.swing.JFrame {

    /**
     * Creates new form FRM_PantallaJuego
     */
    
    Controlador_Hilos controlador_Hilos;
    Controlador_FRM_PantallaJuego controlador_FRM_PantallaJuego;
    
    public String personaje="Base";
    
    public int xPredefItemUp=810;
    public int velocidad=20;
    public int movimiento=30;
    public int caida=20;
    
    public int contadorTiempo;
    public int contadorVelocidad;
    
    public int tiempoLimite=60;
    public boolean colisionPowerUp=false;
    public boolean colisionPowerDown=false;
    
    public FRM_PantallaJuego() {
        initComponents();
        
        
        setSize(1280, 800);
        
        devolverPersonaje();
        controlador_Hilos=new Controlador_Hilos(this);
        controlador_FRM_PantallaJuego= new Controlador_FRM_PantallaJuego(this);
        this.addKeyListener(controlador_FRM_PantallaJuego);
        
        controlador_Hilos.start();

    }
    
    public void moverFondo(){
    
        
        if(JL_Fondo.getX()>-8960){
        
            JL_Fondo.setLocation(JL_Fondo.getX()-velocidad, JL_Fondo.getY());
        }
        
        else{
        
            JL_Fondo.setLocation(0, JL_Fondo.getY());
            velocidad++;
        }
        
        if(contadorTiempo==tiempoLimite){
        
            velocidad+=1;
            tiempoLimite+=60;
            
        }
        
        contadorTiempo++;
          
    }
    
    public String devolverPersonaje(){
    
        return personaje;
        
    }
    
    public int randomObjetos(){
    
        
        int objeto = (int) Math.floor(Math.random()*(6000-2000+1)+2000);  // Valor entre M y N, ambos incluidos.
        
        return objeto;
    }
    
    public void powerUp(){
    
          JL_PowerUp.setLocation(JL_PowerUp.getX()-velocidad, JL_PowerUp.getY());
           
          if(colisionPowerUp==true || JL_Personaje.getX()>JL_PowerUp.getX()+1000){
          
              JL_PowerUp.setLocation(JL_PowerUp.getX()+randomObjetos(), JL_PowerUp.getY());
              colisionPowerUp=false;
              
              if(JL_PowerUp.getX()>10240){
                
                    JL_PowerUp.setLocation(JL_PowerUp.getX()-10240, JL_PowerUp.getY());
                }
              
          }
        
    }
    
    public void powerDown(){
    
      
            JL_PowerDown.setLocation(JL_PowerDown.getX()-velocidad, JL_PowerDown.getY());
            
            if(colisionPowerDown==true || JL_Personaje.getX()>JL_PowerDown.getX()+1000){
            
                JL_PowerDown.setLocation(JL_PowerDown.getX()+randomObjetos(), JL_PowerDown.getY());
                colisionPowerDown=false;
                
                if(JL_PowerDown.getX()>10240){
                
                    JL_PowerDown.setLocation(JL_PowerDown.getX()-10240, JL_PowerDown.getY());
                }
            }
           
        
    }
    
    public void colisionadores(){
    
        
        //Enemigo
//        if(JL_Personaje.getX()+150>JL_PowerUp.getX() && JL_Personaje.getX()<JL_PowerUp.getX()+50 && JL_Personaje.getY()+150>JL_PowerUp.getY()){
//        
//            System.out.println("Colision");
//            System.out.println("colisionando");
//        }


        //power Up
        if(JL_Personaje.getX()+150>JL_PowerUp.getX() && JL_Personaje.getX()<JL_PowerUp.getX()+50 && JL_Personaje.getY()+150>JL_PowerUp.getY()){
        
            System.out.println("Colision PowerUp");
            colisionPowerUp=true;
        }
        
        //powerDown
        if(JL_Personaje.getX()+150>JL_PowerDown.getX() && JL_Personaje.getX()<JL_PowerDown.getX()+50 && JL_Personaje.getY()+150>JL_PowerDown.getY()){
        
            System.out.println("Colision PowerDown");
            colisionPowerDown=true;
        }
        
        
    }
    
    public void verificarEstado(){
    
        if(contadorVelocidad==contadorTiempo){
        
            movimiento+=1;
            caida+=1;
        }
        
        if(personaje.equals("Salta")){
        
            JL_Personaje.setLocation(JL_Personaje.getX(), JL_Personaje.getY()-movimiento);
        }
        
        if(JL_Personaje.getY()<=300){
        
            personaje="Despliegue";
        }
        
        if(personaje.equals("Despliegue")){
        
            JL_Personaje.setLocation(JL_Personaje.getX(), JL_Personaje.getY());
        }
        
        if(JL_Personaje.getY()<=450 && personaje.equals("Despliegue")){
        
            personaje="Baja";
        }
   
        if(personaje.equals("Baja")){
              
            JL_Personaje.setLocation(JL_Personaje.getX(), JL_Personaje.getY()+caida);
        }
        
        if(JL_Personaje.getY()>=570){
        
            personaje="Base";
        }
        
        if(personaje.equals("Base")){
        
            JL_Personaje.setLocation(JL_Personaje.getX(), 570);
        }
        contadorVelocidad++;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_Vineta = new javax.swing.JLabel();
        JL_PowerDown = new javax.swing.JLabel();
        JL_PowerUp = new javax.swing.JLabel();
        JL_Enemigo = new javax.swing.JLabel();
        JL_SombraE = new javax.swing.JLabel();
        JL_Personaje = new javax.swing.JLabel();
        JL_SombraP = new javax.swing.JLabel();
        JL_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_Vineta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Fondo y Objetos/V1/Recurso 1.png"))); // NOI18N
        getContentPane().add(JL_Vineta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        JL_PowerDown.setBackground(new java.awt.Color(51, 51, 51));
        JL_PowerDown.setForeground(new java.awt.Color(0, 0, 0));
        JL_PowerDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Objetos de Juego/V1/Recurso 6.png"))); // NOI18N
        getContentPane().add(JL_PowerDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 610, -1, -1));
        JL_PowerDown.getAccessibleContext().setAccessibleDescription("");

        JL_PowerUp.setBackground(new java.awt.Color(51, 51, 51));
        JL_PowerUp.setForeground(new java.awt.Color(0, 0, 0));
        JL_PowerUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Objetos de Juego/V1/Recurso 4.png"))); // NOI18N
        JL_PowerUp.setText("Item Power Up");
        getContentPane().add(JL_PowerUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 50, 50));
        JL_PowerUp.getAccessibleContext().setAccessibleDescription("");

        JL_Enemigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Personajes/V1/MrHungry2.gif"))); // NOI18N
        getContentPane().add(JL_Enemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        JL_SombraE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Personajes/V1/SombraE.png"))); // NOI18N
        getContentPane().add(JL_SombraE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, -1, -1));

        JL_Personaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Personajes/V1/Avo2.gif"))); // NOI18N
        JL_Personaje.setToolTipText("");
        getContentPane().add(JL_Personaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 150, 150));

        JL_SombraP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Personajes/V1/Sombra_1.png"))); // NOI18N
        getContentPane().add(JL_SombraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 700, 100, 25));

        JL_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Fondo y Objetos/V1/Fondo final.png"))); // NOI18N
        getContentPane().add(JL_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10240, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_PantallaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_PantallaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Enemigo;
    public javax.swing.JLabel JL_Fondo;
    private javax.swing.JLabel JL_Personaje;
    private javax.swing.JLabel JL_PowerDown;
    private javax.swing.JLabel JL_PowerUp;
    private javax.swing.JLabel JL_SombraE;
    private javax.swing.JLabel JL_SombraP;
    private javax.swing.JLabel JL_Vineta;
    // End of variables declaration//GEN-END:variables
}
