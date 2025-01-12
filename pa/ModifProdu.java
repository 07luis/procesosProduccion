/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import lo.*;
import static pa.PanelAdminPro.tfclave;

/**
 *
 * @author chenc
 */
public class ModifProdu extends javax.swing.JFrame
{

    Tools to = new Tools();
    Consultas cl = new Consultas();
    Producto tpro=cl.dataPro(tfclave);
    ArrayList<Proveedor> pro = cl.consuProvee();

    /**
     * Creates new form NewAdmin
     */
    public ModifProdu()
    {
        initComponents();
        setIconImage(to.icono());
        comboca();
        carst();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClav = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbCate = new javax.swing.JComboBox<>();
        txtCat = new javax.swing.JTextField();
        txtPre = new javax.swing.JTextField();
        cbIdPr = new javax.swing.JComboBox<>();
        chClave = new javax.swing.JCheckBox();
        chName = new javax.swing.JCheckBox();
        chCanti = new javax.swing.JCheckBox();
        chPre = new javax.swing.JCheckBox();
        chCost = new javax.swing.JCheckBox();
        chCate = new javax.swing.JCheckBox();
        chProve = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de nuevo producto");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 220, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clave");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 220, -1));

        txtClav.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel1.add(txtClav, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 300, 35));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 220, -1));

        txtNom.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 300, 35));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 220, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 300, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Costo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 220, -1));

        txtCost.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel1.add(txtCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 300, 35));

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
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 300, 35));

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
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 300, 35));

        cbCate.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel1.add(cbCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 300, 35));

        txtCat.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel1.add(txtCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 300, 35));

        txtPre.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel1.add(txtPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 300, 35));

        cbIdPr.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jPanel1.add(cbIdPr, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 300, 35));

        chClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chClaveActionPerformed(evt);
            }
        });
        jPanel1.add(chClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 20, -1));

        chName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chNameActionPerformed(evt);
            }
        });
        jPanel1.add(chName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        chCanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chCantiActionPerformed(evt);
            }
        });
        jPanel1.add(chCanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        chPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chPreActionPerformed(evt);
            }
        });
        jPanel1.add(chPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        chCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chCostActionPerformed(evt);
            }
        });
        jPanel1.add(chCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, -1));

        chCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chCateActionPerformed(evt);
            }
        });
        jPanel1.add(chCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, -1));

        chProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chProveActionPerformed(evt);
            }
        });
        jPanel1.add(chProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Regresar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel8MouseClicked
    {//GEN-HEADEREND:event_jLabel8MouseClicked
        String clave, nombre, cantida, preci, cost, cate, prove;
        clave = txtClav.getText();
        nombre = txtNom.getText();
        cantida = txtCat.getText();
        preci = txtPre.getText();
        cost = txtCost.getText();
        cate = cbCate.getSelectedItem().toString();
        prove = cbIdPr.getSelectedItem().toString();
        if (clave.isEmpty() || nombre.isEmpty() || cantida.isEmpty() || preci.isEmpty() || nombre.isEmpty() || cost.isEmpty()
                || cate.equals("Selecciona una categoría") || prove.equals("Selecciona un proveedor"))
        {
            to.error("No deje campos vacíos", "Error en los campos");
        } else
        {
            int icanti = Integer.valueOf(cantida);
            double dpreci = new Double(preci);
            double dcost = new Double(cost);
            int idpr=buscada(prove);
            Modifica mod= new Modifica();
            if (tfclave.equals(clave))
            {
                clave="";
            }
            
            if (mod.modifiDataPro(clave, tfclave, nombre, icanti, dpreci, dcost, cate, idpr))
            {
                to.aviso("Se modificarón los datos", "Mensaje de exíto");
                dipose2();
            } else
            {
                to.error("No se pudieron modificar los datos", "Error de actulización");
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

    private void chNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chNameActionPerformed
    {//GEN-HEADEREND:event_chNameActionPerformed
        if (chName.isSelected())
        {
            txtNom.setEnabled(true);
        } else
        {
            txtNom.setEnabled(false);
        }
    }//GEN-LAST:event_chNameActionPerformed

    private void chClaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chClaveActionPerformed
    {//GEN-HEADEREND:event_chClaveActionPerformed
        if (chClave.isSelected())
        {
            txtClav.setEnabled(true);
        } else
        {
            txtClav.setEnabled(false);
        }
    }//GEN-LAST:event_chClaveActionPerformed

    private void chCantiActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chCantiActionPerformed
    {//GEN-HEADEREND:event_chCantiActionPerformed
        if (chCanti.isSelected())
        {
            txtCat.setEnabled(true);
        } else
        {
            txtCat.setEnabled(false);
        }
    }//GEN-LAST:event_chCantiActionPerformed

    private void chPreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chPreActionPerformed
    {//GEN-HEADEREND:event_chPreActionPerformed
        if (chPre.isSelected())
        {
            txtPre.setEnabled(true);
        } else
        {
            txtPre.setEnabled(false);
        }
    }//GEN-LAST:event_chPreActionPerformed

    private void chCostActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chCostActionPerformed
    {//GEN-HEADEREND:event_chCostActionPerformed
        if (chCost.isSelected())
        {
            txtCost.setEnabled(true);
        } else
        {
            txtCost.setEnabled(false);
        }
    }//GEN-LAST:event_chCostActionPerformed

    private void chCateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chCateActionPerformed
    {//GEN-HEADEREND:event_chCateActionPerformed
        if (chCate.isSelected())
        {
            cbCate.setEnabled(true);
        } else
        {
            cbCate.setEnabled(false);
        }
    }//GEN-LAST:event_chCateActionPerformed

    private void chProveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chProveActionPerformed
    {//GEN-HEADEREND:event_chProveActionPerformed
        if (chProve.isSelected())
        {
            cbIdPr.setEnabled(true);
        } else
        {
            cbIdPr.setEnabled(false);
        }
    }//GEN-LAST:event_chProveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panel_inicio newframe = new panel_inicio();
    newframe.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboca()
    {
        cbIdPr.addItem("Selecciona un proveedor");
        cbCate.addItem("Selecciona una categoría");
        for (int i = 0; i < pro.size(); i++)
        {
            Proveedor d = pro.get(i);
            cbIdPr.addItem(d.getNombre());
        }
        ArrayList ca = cl.consuCate();
        for (int j = 0; j < ca.size(); j++)
        {
            String cat = ca.get(j).toString();
            cbCate.addItem(cat);
        }
    }
    
    private int buscada(String s)
    {
        for (int i = 0; i < pro.size(); i++)
        {
            Proveedor d= pro.get(i);
                    
            if (d.getNombre().equals(s))
            {
                return d.getId();
            }
        }
        return -1;
    }

    private String buscaPro()
    {
        for (int i = 0; i < pro.size(); i++)
        {
            Proveedor d= pro.get(i);
                    
            if (d.getId()==tpro.getIdpr())
            {
                return d.getNombre();
            }
        }
        return "";
    }
    private void carst()
    {
        txtCat.setEnabled(false);
        txtClav.setEnabled(false);
        txtCost.setEnabled(false);
        txtNom.setEnabled(false);
        txtPre.setEnabled(false);
        cbCate.setEnabled(false);
        cbIdPr.setEnabled(false);
        txtClav.setText(tpro.getClave());
        txtCat.setText(""+tpro.getCantidad());
        txtCost.setText(""+tpro.getCosto());
        txtNom.setText(tpro.getNombre());
        txtPre.setText(""+tpro.getPrecio());
        cbCate.setSelectedItem(tpro.getCategoria());
        cbIdPr.setSelectedItem(buscaPro());
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
            java.util.logging.Logger.getLogger(ModifProdu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ModifProdu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ModifProdu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ModifProdu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ModifProdu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCate;
    private javax.swing.JComboBox<String> cbIdPr;
    private javax.swing.JCheckBox chCanti;
    private javax.swing.JCheckBox chCate;
    private javax.swing.JCheckBox chClave;
    private javax.swing.JCheckBox chCost;
    private javax.swing.JCheckBox chName;
    private javax.swing.JCheckBox chPre;
    private javax.swing.JCheckBox chProve;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCat;
    private javax.swing.JTextField txtClav;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPre;
    // End of variables declaration//GEN-END:variables

}
