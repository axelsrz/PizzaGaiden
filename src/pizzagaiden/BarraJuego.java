/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzagaiden;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author axelsuarez
 */
public class BarraJuego extends javax.swing.JPanel {

    private Juego juego;
    
    /**
     * Creates new form BarraJuego
     */
    public BarraJuego() {
        initComponents();
        instruccionLabel.setHorizontalTextPosition(JLabel.CENTER);
        instruccionLabel.setVerticalTextPosition(JLabel.CENTER);
    }
    
    public void setJuego(Juego juego) {
        this.juego = juego;
    }
    
    public void startTimerBar(int iTiempo) {
        jProgressBar1.setMinimum(0);
        jProgressBar1.setMaximum(iTiempo);
        jProgressBar1.setValue(iTiempo);
        jLabel2.setText("" + 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        instruccionLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 102));
        setPreferredSize(new java.awt.Dimension(1000, 70));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Puntuación:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("2000");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));
        add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 230, 30));

        instruccionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(instruccionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 340, 30));
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getInstruccionLabel() {
        return instruccionLabel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel instruccionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

    public JProgressBar getjProgressBar1() {
        return jProgressBar1;
    }
    
    public void setjLabel2Value(int iVal) {
        jLabel2.setText("" + iVal);
    }
}
