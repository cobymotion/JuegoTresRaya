package edu.games.gui;

import java.util.Arrays;

/**
 *
 * @author coby
 */
public class VentanaJuego extends javax.swing.JFrame {
    /**
     * Creates new form VentanaJuego
     */   
    
    int juego[][] = new int[3][3];
    PanelJuego lJuego;
    
    private void limpiarMatriz() 
    {
        for (int[] juego1 : juego) {
           Arrays.fill(juego1, -1);
        }
    }
    
    public VentanaJuego() {
        initComponents();       
        limpiarMatriz();
        lJuego = new PanelJuego(juego);        
        EscuchaClick es = new EscuchaClick(lJuego,juego);
        lJuego.addMouseListener(es);
        this.add(lJuego);//agrege canvas
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 420));

        jMenu1.setText("Juego");

        jMenuItem1.setText("Reiniciar Juego");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if(lJuego!=null){
            limpiarMatriz();
            lJuego.repaint();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
