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

    /**
     * Creates new form Configuracion
     */
    public Configuracion() {
        initComponents();
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
        editarLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        returnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzagaiden/PizzaQuizz/Caja_Color.png"))); // NOI18N
        returnLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnLabelMouseClicked(evt);
            }
        });
        add(returnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        agregarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzagaiden/PizzaQuizz/Caja_Color.png"))); // NOI18N
        agregarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarLabelMouseClicked(evt);
            }
        });
        add(agregarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        editarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzagaiden/PizzaQuizz/Caja_Color.png"))); // NOI18N
        editarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarLabelMouseClicked(evt);
            }
        });
        add(editarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void returnLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_returnLabelMouseClicked

    private void editarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editarLabelMouseClicked

    private void agregarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agregarLabel;
    private javax.swing.JLabel editarLabel;
    private javax.swing.JLabel returnLabel;
    // End of variables declaration//GEN-END:variables

    public JLabel getjLabel1() {
        return returnLabel;
    }

    public JLabel getjLabel2() {
        return agregarLabel;
    }

    public JLabel getjLabel3() {
        return editarLabel;
    }
}
