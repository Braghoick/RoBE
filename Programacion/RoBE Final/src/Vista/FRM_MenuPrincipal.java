/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_MenuPrincipal;

/**
 *
 * @author braghoick
 */
public class FRM_MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FRM_MenuPrincipal
     */
    
    Controlador_FRM_MenuPrincipal controlador_FRM_MenuPrincipal;
    
    public FRM_MenuPrincipal() {
        initComponents();
        controlador_FRM_MenuPrincipal=new Controlador_FRM_MenuPrincipal(this);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_Play = new javax.swing.JButton();
        BTN_Options = new javax.swing.JButton();
        BTN_Exit = new javax.swing.JButton();
        JL_FondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_Play.setBackground(new java.awt.Color(0, 0, 0));
        BTN_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Menus y Pantallas/V1/Recurso 1.png"))); // NOI18N
        BTN_Play.setContentAreaFilled(false);
        getContentPane().add(BTN_Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 612, 182, 113));

        BTN_Options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Menus y Pantallas/V1/Recurso 2.png"))); // NOI18N
        BTN_Options.setOpaque(false);
        getContentPane().add(BTN_Options, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 612, 261, 116));

        BTN_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Menus y Pantallas/V1/Recurso 3.png"))); // NOI18N
        BTN_Exit.setOpaque(false);
        getContentPane().add(BTN_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1076, 612, 163, 112));

        JL_FondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Menus y Pantallas/V1/menu principal.jpg"))); // NOI18N
        getContentPane().add(JL_FondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

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
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Exit;
    private javax.swing.JButton BTN_Options;
    private javax.swing.JButton BTN_Play;
    private javax.swing.JLabel JL_FondoMenu;
    // End of variables declaration//GEN-END:variables
}
