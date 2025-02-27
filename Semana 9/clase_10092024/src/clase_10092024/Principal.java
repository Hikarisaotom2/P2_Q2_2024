/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clase_10092024;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author claudiacortes
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        btn_guardar = new javax.swing.JButton();
        btn_abrir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_listaCompleta = new javax.swing.JTextArea();
        jcb_tipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btn_agregarLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_guardar.setText("Guardar");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
            }
        });

        btn_abrir.setText("Abrir");
        btn_abrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_abrirMouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jta_listaCompleta.setColumns(20);
        jta_listaCompleta.setRows(5);
        jScrollPane1.setViewportView(jta_listaCompleta);

        jcb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno", "Docente" }));

        jLabel3.setText("Tipo de Usuario");

        btn_agregarLista.setText("Agregar a Lista");
        btn_agregarLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarListaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcb_tipo, 0, 204, Short.MAX_VALUE)
                            .addComponent(txt_edad)
                            .addComponent(txt_nombre)))
                    .addComponent(btn_agregarLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_abrir))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btn_agregarLista)
                .addGap(144, 144, 144))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        JFileChooser filechooser = new JFileChooser();
        int op = filechooser.showSaveDialog(this);
        if(op == JFileChooser.APPROVE_OPTION){
            File seleccionado = filechooser.getSelectedFile();
            seleccionado = new File(seleccionado+".clau");
            try{
                FileOutputStream fs = new FileOutputStream(seleccionado);
                ObjectOutputStream writer = new ObjectOutputStream(fs);
                writer.writeObject(usuarios);//guardando el objeto en el archivo
                writer.close();
                JOptionPane.showMessageDialog(this, "SE GUARDO EL ARCHIVO EXITOSAMENTE!");
            }catch(IOException e){
                System.out.println("Errror: "+e.getLocalizedMessage());
            }
            
        }
    }//GEN-LAST:event_btn_guardarMouseClicked

    private void btn_abrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_abrirMouseClicked
        JFileChooser filechooser = new JFileChooser();
        int op = filechooser.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION) {
            File seleccionado = filechooser.getSelectedFile();
            try {
                FileInputStream fs = new FileInputStream(seleccionado);
                ObjectInputStream reader = new ObjectInputStream(fs);
//                Object obj = reader.readObject();
//                if(obj instanceof Persona){
//                     Persona p = (Persona) obj;
//                }
//                ArrayList<Object> lista = new ArrayList<Object>();
//                ArrayList<Persona> listaPersonas = (ArrayList<Persona>) reader.readObject();
                ArrayList<Object> listaPersonas = (ArrayList<Object>) reader.readObject();
                for (Object persona : listaPersonas) {
                    if(persona instanceof Docente){
                        jta_listaCompleta.append("Docente - "+persona+"\n");
                        System.out.println("El registro es un docente");
                    }else if (persona instanceof Alumno){
                        jta_listaCompleta.append("Alumno - "+persona+"\n");
                        System.out.println("El registro es un alumno");
                    }else{
                        jta_listaCompleta.append("Registro desconocido"+"\n");
                        System.out.println("Es otro objeto");
                    }
                }
                JOptionPane.showMessageDialog(this, "Se cargo el archivo!");
            } catch (IOException e) {
                System.out.println("Errror: " + e.getLocalizedMessage());

            } catch (ClassNotFoundException ex) {
                System.out.println("Errror: " + ex.getLocalizedMessage());
            }
        }
    }//GEN-LAST:event_btn_abrirMouseClicked

    private void btn_agregarListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarListaMouseClicked
        Persona p;
         String nombre = txt_nombre.getText();
        int edad = Integer.parseInt(txt_edad.getText());
        if(jcb_tipo.getSelectedIndex() == 0){
            //crear alumno
            p = new Alumno(nombre,edad);
        }else{
            //crear docente
            p = new Docente(nombre,edad);
        }
        usuarios.add(p);
        JOptionPane.showMessageDialog(this, "Usuario agregado exitosamente \n cantidad de usuarios: "+usuarios.size());
        txt_nombre.setText("");
        txt_edad.setText("");
    }//GEN-LAST:event_btn_agregarListaMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    ArrayList<Object> usuarios = new ArrayList<Object>();
//    ArrayList<Persona> usuarios = new ArrayList<Persona>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_agregarLista;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_tipo;
    private javax.swing.JTextArea jta_listaCompleta;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
