
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

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
        //ya tenemos los componenetes creados y monstrandose en el jframe
        // el jframe aun no se esta mostrando al usuario por que el constructor no ha terminado de ejecutarse
        
        /* 
        1. el usuario escribe 
        2. el listener detecta que escribimos y mira que escribimos (por cada letra)
        3. entramos al metodo keyTyped
        4. una vez que se ejecuta el metodo keyTyped, se actualiza lo que se escribio en el textfield
        */
        
       txtNumero1.addKeyListener(new KeyAdapter(){
       @Override
       public void keyTyped(KeyEvent e){
           char carac = e.getKeyChar(); //obtener la ultima letra que se escribio
           if(Character.isDigit(carac)){
               System.out.println("es un numero ");
           }else{
               JOptionPane.showMessageDialog(rootPane, "error","ingrese un numero",1);
               e.consume(); // eliminamos la letra 
           }
       }

       });
             btnRestar.setVisible(false);
            btnSumar.setVisible(false);
              txtResultado.setVisible(false);
            lblResultado.setVisible(false);
            jcbOpciones.setVisible(false);
            jcbPersonas.setVisible(false);
            btnAgregar.setVisible(false);
            lblTitulo.setText("menu principal");
            lblNumero1.setVisible(false);
            lblNumero3.setVisible(false);
            txtNumero1.setVisible(false);
            txtNumero2.setVisible(false);
       
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
        jcbOpciones = new javax.swing.JComboBox<>();
        jcbMenu = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jcbPersonas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        lblNumero1.setFont(new java.awt.Font("Lao MN", 3, 24)); // NOI18N
        lblNumero1.setForeground(new java.awt.Color(102, 102, 102));
        lblNumero1.setText("Numero 1 ");
        jPanel1.add(lblNumero1);
        lblNumero1.setBounds(20, 170, 410, 40);

        lblResultado.setFont(new java.awt.Font("Lao MN", 3, 24)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(102, 102, 102));
        lblResultado.setText("RESULTADO:");
        jPanel1.add(lblResultado);
        lblResultado.setBounds(50, 330, 180, 40);

        lblTitulo.setFont(new java.awt.Font("Lao MN", 3, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setText("OPERACIONES MATEMATICAS");
        jPanel1.add(lblTitulo);
        lblTitulo.setBounds(150, 10, 410, 40);

        txtResultado.setEditable(false);
        txtResultado.setToolTipText("Ingrese el segundo numero");
        jPanel1.add(txtResultado);
        txtResultado.setBounds(260, 310, 370, 50);

        txtNumero1.setToolTipText("ingrese el primer numero ");
        txtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumero1);
        txtNumero1.setBounds(220, 160, 370, 50);

        btnSumar.setBackground(new java.awt.Color(0, 255, 0));
        btnSumar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSumar.setText("SUMAR");
        btnSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSumarMouseClicked(evt);
            }
        });
        jPanel1.add(btnSumar);
        btnSumar.setBounds(80, 390, 140, 23);

        btnRestar.setBackground(new java.awt.Color(0, 255, 255));
        btnRestar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnRestar.setText("RESTAR");
        btnRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestarMouseClicked(evt);
            }
        });
        jPanel1.add(btnRestar);
        btnRestar.setBounds(370, 390, 150, 29);

        lblNumero3.setFont(new java.awt.Font("Lao MN", 3, 24)); // NOI18N
        lblNumero3.setForeground(new java.awt.Color(102, 102, 102));
        lblNumero3.setText("Numero 2");
        jPanel1.add(lblNumero3);
        lblNumero3.setBounds(30, 240, 180, 40);

        txtNumero2.setToolTipText("Ingrese el segundo numero");
        jPanel1.add(txtNumero2);
        txtNumero2.setBounds(240, 230, 370, 50);

        jcbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "suma", "resta", "multiplicacion", "division" }));
        jPanel1.add(jcbOpciones);
        jcbOpciones.setBounds(210, 120, 370, 30);

        jcbMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calculadora", "CRUD" }));
        jcbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jcbMenu);
        jcbMenu.setBounds(230, 50, 280, 23);

        btnAgregar.setText("Agregar Persona");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(60, 390, 200, 40);

        btnModificar.setText("Modifiar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(270, 390, 170, 40);

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(490, 390, 140, 40);

        jcbPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPersonasActionPerformed(evt);
            }
        });
        jPanel1.add(jcbPersonas);
        jcbPersonas.setBounds(220, 80, 290, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 520);

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

    private void btnRestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarMouseClicked
        int numero1= Integer.parseInt(txtNumero1.getText());
       int numero2= Integer.parseInt(txtNumero2.getText());
       total = numero1-numero2;
       txtResultado.setText(total+"");
    }//GEN-LAST:event_btnRestarMouseClicked

    private void jcbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMenuActionPerformed
      //este codigo se ejecuta cuando el usuario selecciona algo del dropddown
        System.out.println("Index seleccionado "+ jcbMenu.getSelectedIndex());
        //conversion de object a string 
//        String selected = jcbMenu.getSelectedItem().toString();
        String selected = (String)jcbMenu.getSelectedItem();
        
        if(selected.equalsIgnoreCase("crud")){
            System.out.println("ENTRANDO AL CRUD");
            btnRestar.setVisible(false);
            btnSumar.setVisible(false);
            txtResultado.setVisible(false);
            lblResultado.setVisible(false);
            jcbOpciones.setVisible(false);
            jcbPersonas.setVisible(true);
            btnAgregar.setVisible(true);
            lblNumero1.setText("ID");
            lblNumero3.setText("Nombre: ");

        }else{
            System.out.println("entrando calculadora");
            btnRestar.setVisible(true);
            btnSumar.setVisible(true);
              txtResultado.setVisible(true);
            lblResultado.setVisible(true);
            jcbOpciones.setVisible(true);
            lblNumero1.setText("Numero 1: ");
            lblNumero3.setText("Numero 2: ");
            jcbPersonas.setVisible(false);
            btnAgregar.setVisible(false);
        }
        
        lblNumero1.setVisible(true);
            lblNumero3.setVisible(true);
            txtNumero1.setVisible(true);
            txtNumero2.setVisible(true);

    }//GEN-LAST:event_jcbMenuActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        
        int id = Integer.parseInt(txtNumero1.getText());
        String nombre = txtNumero2.getText();
        Persona p = new Persona(nombre,id);
        
        
        // agreguen los objetos. 
        // obtenemos el modelo (lo que maneja la informacion) actual del combobox
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)jcbPersonas.getModel();
        modelo.addElement(p);// estamos agregando todo el objeto al combobox
        jcbPersonas.setModel(modelo); // agregamos el nuevo modelo actualizado
        JOptionPane.showMessageDialog(rootPane,"Persona agregada");
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void jcbPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPersonasActionPerformed
        personaSeleccionada = (Persona) jcbPersonas.getSelectedItem();
        txtNumero1.setText(personaSeleccionada.getId()+"'");
        txtNumero2.setText(personaSeleccionada.getNombre());
    }//GEN-LAST:event_jcbPersonasActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:
        //Modificar la informacion 
        String nuevoNombre = txtNumero2.getText();
        int nuevoId = Integer.parseInt(txtNumero1.getText());
        
        if(personaSeleccionada!=null){
            personaSeleccionada.setId(nuevoId);
            personaSeleccionada.setNombre(nuevoNombre);
            JOptionPane.showMessageDialog(rootPane,"persona actualizada");
        }else{
            JOptionPane.showMessageDialog(rootPane,"Seleccione una persona");
        }
        
 
        
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        jcbPersonas.removeItem(personaSeleccionada);
        //jcbPersonas.remove(0);
        JOptionPane.showMessageDialog(rootPane,"Se elimino a la persona");
    }//GEN-LAST:event_btnEliminarMouseClicked

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
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    Persona personaSeleccionada;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbMenu;
    private javax.swing.JComboBox<String> jcbOpciones;
    private javax.swing.JComboBox<String> jcbPersonas;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
