/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author claudiacortes
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
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

        jPanel1 = new javax.swing.JPanel();
        lblNumero1 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        txtNumero1 = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        lblNumero3 = new javax.swing.JLabel();
        txtNumero2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        lblNumero1.setFont(new java.awt.Font("Lao MN", 3, 24)); // NOI18N
        lblNumero1.setForeground(new java.awt.Color(102, 102, 102));
        lblNumero1.setText("Numero 1 ");
        jPanel1.add(lblNumero1);
        lblNumero1.setBounds(30, 140, 410, 40);

        lblResultado.setFont(new java.awt.Font("Lao MN", 3, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(102, 102, 102));
        lblResultado.setText("RESULTADO:");
        jPanel1.add(lblResultado);
        lblResultado.setBounds(100, 290, 180, 40);

        lblTitulo.setFont(new java.awt.Font("Lao MN", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setText("OPERACIONES MATEMATICAS");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(190, 20, 410, 40);

        txtResultado.setEditable(false);
        txtResultado.setToolTipText("Ingrese el segundo numero");
        jPanel1.add(txtResultado);
        txtResultado.setBounds(270, 280, 370, 50);

        txtNumero1.setToolTipText("ingrese el primer numero ");
        txtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero1);
        txtNumero1.setBounds(210, 130, 370, 50);

        btnSumar.setBackground(new java.awt.Color(0, 255, 0));
        btnSumar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSumar.setText("SUMAR");
        btnSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSumarMouseClicked(evt);
            }
        });
        jPanel1.add(btnSumar);
        btnSumar.setBounds(100, 370, 140, 23);

        btnRestar.setBackground(new java.awt.Color(0, 255, 255));
        btnRestar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnRestar.setText("RESTAR");
        jPanel1.add(btnRestar);
        btnRestar.setBounds(390, 370, 150, 29);

        lblNumero3.setFont(new java.awt.Font("Lao MN", 3, 24)); // NOI18N
        lblNumero3.setForeground(new java.awt.Color(102, 102, 102));
        lblNumero3.setText("Numero 2");
        jPanel1.add(lblNumero3);
        lblNumero3.setBounds(20, 200, 180, 40);

        txtNumero2.setToolTipText("Ingrese el segundo numero");
        jPanel1.add(txtNumero2);
        txtNumero2.setBounds(210, 200, 370, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 750, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumero1ActionPerformed

    private void btnSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarMouseClicked
       int numero1= Integer.parseInt(txtNumero1.getText());
       int numero2= Integer.parseInt(txtNumero2.getText());
       total = numero1+numero2;
       txtResultado.setText(total+"");
    }//GEN-LAST:event_btnSumarMouseClicked

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }
    
    public int total;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
