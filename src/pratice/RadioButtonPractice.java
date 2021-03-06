/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

/**
 *
 * @author Gladwin
 */
public class RadioButtonPractice extends javax.swing.JFrame {

    /**
     * Creates new form RadioButtonPractice
     */
    public RadioButtonPractice() {
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

        DisplayGroup = new javax.swing.ButtonGroup();
        hellordo1 = new javax.swing.JRadioButton();
        goodbyerdo2 = new javax.swing.JRadioButton();
        waterrdo3 = new javax.swing.JRadioButton();
        submitbtn = new javax.swing.JButton();
        resultlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DisplayGroup.add(hellordo1);
        hellordo1.setText("Hello");
        hellordo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hellordo1ActionPerformed(evt);
            }
        });

        DisplayGroup.add(goodbyerdo2);
        goodbyerdo2.setText("Goodbye");
        goodbyerdo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodbyerdo2ActionPerformed(evt);
            }
        });

        DisplayGroup.add(waterrdo3);
        waterrdo3.setSelected(true);
        waterrdo3.setText("Water");
        waterrdo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterrdo3ActionPerformed(evt);
            }
        });

        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        resultlbl.setText("Text Here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(submitbtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hellordo1)
                            .addComponent(goodbyerdo2)
                            .addComponent(waterrdo3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(resultlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hellordo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(goodbyerdo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(waterrdo3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(resultlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(submitbtn)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hellordo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hellordo1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_hellordo1ActionPerformed

    private void goodbyerdo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodbyerdo2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_goodbyerdo2ActionPerformed

    private void waterrdo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterrdo3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_waterrdo3ActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        // TODO add your handling code here:

        hellordo1.getText();
        waterrdo3.getText();
        goodbyerdo2.getText();
        if (hellordo1.isSelected()) {
            resultlbl.setText("Hello");
        } else if (goodbyerdo2.isSelected()) {
            resultlbl.setText("GoodBye");
        } else {
            resultlbl.setText("Water");
        }


    }//GEN-LAST:event_submitbtnActionPerformed

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
            java.util.logging.Logger.getLogger(RadioButtonPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RadioButtonPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RadioButtonPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioButtonPractice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioButtonPractice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup DisplayGroup;
    private javax.swing.JRadioButton goodbyerdo2;
    private javax.swing.JRadioButton hellordo1;
    private javax.swing.JLabel resultlbl;
    private javax.swing.JButton submitbtn;
    private javax.swing.JRadioButton waterrdo3;
    // End of variables declaration//GEN-END:variables
}
