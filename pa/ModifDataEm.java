/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import lo.*;
import static pa.PanelAdminEm.rfc2;

/**
 *
 * @author chenc
 */
public class ModifDataEm extends javax.swing.JFrame
{

    Tools to = new Tools();
    Consultas cl = new Consultas();
    Empleado ad = cl.dataEmpleado(rfc2);

    /**
     * Creates new form NewAdmin
     */
    public ModifDataEm()
    {
        initComponents();
        setIconImage(to.icono());
        cargaData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTele = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        chRfc = new javax.swing.JCheckBox();
        chName = new javax.swing.JCheckBox();
        chPho = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar mis datos");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar datos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 220, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RFC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 220, -1));

        txtRfc.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel1.add(txtRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 300, 35));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 220, -1));

        txtUser.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 300, 35));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 220, -1));

        txtName.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 300, 35));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Teléfono");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 220, -1));

        txtTele.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel1.add(txtTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 300, 35));

        jLabel8.setBackground(new java.awt.Color(84, 194, 66));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modificar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 180, 35));

        jLabel9.setBackground(new java.awt.Color(226, 15, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cancelar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 190, 35));

        chRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chRfcActionPerformed(evt);
            }
        });
        jPanel1.add(chRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        chName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chNameActionPerformed(evt);
            }
        });
        jPanel1.add(chName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, -1, -1));

        chPho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chPhoActionPerformed(evt);
            }
        });
        jPanel1.add(chPho, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Regresar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel8MouseClicked
    {//GEN-HEADEREND:event_jLabel8MouseClicked
        String rfc, name, tele;
        rfc = "";
        name = txtName.getText();
        tele = txtTele.getText();
        if (txtRfc.getText().isEmpty() || name.isEmpty() || tele.isEmpty())
        {
            to.error("No deje campos vacíos", "Error de campos");
        } else
        {
            if (!ad.getRfc().equals(txtRfc.getText()))
            {
                rfc = txtRfc.getText().toUpperCase();
            }

            Modifica md = new Modifica();
            System.out.println("rfc " + rfc);
            if (md.modifiDataEmpleado(rfc, ad.getRfc(), name.toUpperCase(), tele))
            {
                to.aviso("Se actualizaron los datos", "Mensaje de exíto");
                dipose2();
            } else
            {
                to.error("no se actualizaron los datos", "Error de actualización");
            }
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel9MouseClicked
    {//GEN-HEADEREND:event_jLabel9MouseClicked
        if (to.pregunta("¿Quieres cancelar?", "Mensaje de confirmación") == 0)
        {
           dipose2();
        }

    }//GEN-LAST:event_jLabel9MouseClicked

    private void chPhoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chPhoActionPerformed
    {//GEN-HEADEREND:event_chPhoActionPerformed
        if (chPho.isSelected())
        {
            txtTele.setEnabled(true);
        } else
        {
            txtTele.setEnabled(false);
        }
    }//GEN-LAST:event_chPhoActionPerformed

    private void chRfcActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chRfcActionPerformed
    {//GEN-HEADEREND:event_chRfcActionPerformed
        if (chRfc.isSelected())
        {
            txtRfc.setEnabled(true);
        } else
        {
            txtRfc.setEnabled(false);
        }
    }//GEN-LAST:event_chRfcActionPerformed

    private void chNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chNameActionPerformed
    {//GEN-HEADEREND:event_chNameActionPerformed
        if (chName.isSelected())
        {
            txtName.setEnabled(true);
        } else
        {
            txtName.setEnabled(false);
        }
    }//GEN-LAST:event_chNameActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panel_inicio newframe = new panel_inicio();
    newframe.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void cargaData()
    {
        txtRfc.setEnabled(false);
        txtUser.setEnabled(false);
        txtName.setEnabled(false);
        txtTele.setEnabled(false);
        txtRfc.setText(ad.getRfc());
        txtUser.setText(ad.getUsuario());
        txtName.setText(ad.getNombre());
        txtTele.setText(ad.getTelefono());
    }

    private void dipose2()
    {
        WindowEvent windowClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClosing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ModifDataEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ModifDataEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ModifDataEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ModifDataEm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ModifDataEm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chName;
    private javax.swing.JCheckBox chPho;
    private javax.swing.JCheckBox chRfc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtTele;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
