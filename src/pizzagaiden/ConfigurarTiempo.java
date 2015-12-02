/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzagaiden;

import javax.swing.JButton;

/**
 *
 * @author Evan
 */
public class ConfigurarTiempo extends javax.swing.JPanel {

    private Juego juego;
    
    /**
     * Creates new form Agregar
     */
    public ConfigurarTiempo() {
        initComponents();
        jSlider1.setMinimum(20);
        jSlider1.setMaximum(120);
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setSnapToTicks(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintLabels(true);
    }

    public void addMouseListenerToLabels(java.awt.event.MouseListener listener) {
        jButton1.addMouseListener(listener);
    }
    
    public void setJuego(Juego juego) {
        this.juego = juego;
        jSlider1.setValue(juego.getiTiempo());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();

        setBackground(new java.awt.Color(255, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Hot Pizza", 0, 14)); // NOI18N
        jLabel2.setText("Tiempo de juego (segs)");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, 30));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Hot Pizza", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Configurar tiempo");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));
        add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 440, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        juego.setiTiempo(jSlider1.getValue());
        System.out.println(jSlider1.getValue() + "asdfad");
        juego.cambiaPanelPrincipal("config");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        juego.cambiaPanelPrincipal("config");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables

    public JButton getjButton1() {
        return jButton1;
    }
}
