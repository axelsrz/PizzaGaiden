/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzagaiden;

import javax.swing.JLabel;

/**
 *
 * @author axelsuarez
 */
public class Configuracion extends javax.swing.JPanel {

    Juego juego;
    /**
     * Creates new form Configuracion
     */
    public Configuracion() {
        initComponents();
        agregarLabel.setText("Agregar preguntas");
        agregarLabel.setHorizontalTextPosition(JLabel.CENTER);
        agregarLabel.setVerticalTextPosition(JLabel.CENTER);
        
        returnLabel.setText("Regresar a menu");
        returnLabel.setHorizontalTextPosition(JLabel.CENTER);
        returnLabel.setVerticalTextPosition(JLabel.CENTER);
        
        tiempoLabel.setText("Configurar tiempo de juego");
        tiempoLabel.setHorizontalTextPosition(JLabel.CENTER);
        tiempoLabel.setVerticalTextPosition(JLabel.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnLabel = new javax.swing.JLabel();
        agregarLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tiempoLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnLabel.setFont(new java.awt.Font("Hot Pizza", 0, 36)); // NOI18N
        returnLabel.setForeground(new java.awt.Color(255, 255, 255));
        returnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzagaiden/PizzaQuizz/Caja_Color.png"))); // NOI18N
        returnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnLabelMouseClicked(evt);
            }
        });
        add(returnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        agregarLabel.setFont(new java.awt.Font("Hot Pizza", 0, 36)); // NOI18N
        agregarLabel.setForeground(new java.awt.Color(255, 255, 255));
        agregarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzagaiden/PizzaQuizz/Caja_Color.png"))); // NOI18N
        agregarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarLabelMouseClicked(evt);
            }
        });
        add(agregarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Hot Pizza", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Configuracion");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        tiempoLabel.setFont(new java.awt.Font("Hot Pizza", 0, 36)); // NOI18N
        tiempoLabel.setForeground(new java.awt.Color(255, 255, 255));
        tiempoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzagaiden/PizzaQuizz/Caja_Color.png"))); // NOI18N
        tiempoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tiempoLabelMouseClicked(evt);
            }
        });
        add(tiempoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void returnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLabelMouseClicked
        juego.cambiaPanelPrincipal("menu");
    }//GEN-LAST:event_returnLabelMouseClicked

    private void agregarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLabelMouseClicked
        juego.cambiaPanelPrincipal("agregar");
    }//GEN-LAST:event_agregarLabelMouseClicked

    private void tiempoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoLabelMouseClicked
        juego.cambiaPanelPrincipal("configTiempo");
    }//GEN-LAST:event_tiempoLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JLabel tiempoLabel;
    // End of variables declaration//GEN-END:variables

    public JLabel getjLabel1() {
        return returnLabel;
    }

    public JLabel getjLabel2() {
        return agregarLabel;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }
}
