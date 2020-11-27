/*
 */
package lab7_denisgallegos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    ArrayList programas = new ArrayList();
    ArrayList listasclau = new ArrayList();
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public DefaultListModel llenarmodeloprogramas(){
        DefaultListModel modelo = new DefaultListModel();
        for (int c = 0 ; c < programas.size();c++){
            Programas objeto = (Programas) programas.get(c);
            modelo.addElement(objeto.toStringProgramas());
        }
        return modelo; 
    }
    
    public DefaultListModel llenarmodeloclaudilist(){
        DefaultListModel modelo = new DefaultListModel();
        for (int c = 0 ; c < listasclau.size();c++){
            Claudilist objeto = (Claudilist) listasclau.get(c);
            modelo.addElement(objeto.toStringClaudilist());
        }
        return modelo; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agregar Programa");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre: ");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Puntuacion: ");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo: ");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Genero: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anime", "Serie", "Documental", "Pelicula" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comedia", "Romance", "Terror", "SyFly", "Suspenso", "Accion" }));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jButton1.setText("Agregar programa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Lista de programas:");

        jList1.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jList1);

        jButton2.setText("Eliminar programa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar programa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Mostrar programa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Agregar Claudilist");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre: ");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Lista de Claudilist: ");

        jList2.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jList2);

        jButton5.setText("Agregar Claudilist");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Eliminar Claudilist");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Modificar Claudilist");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Mostrar Claudilist");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Asignar programa a Claudilist");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Archivar Claudilist");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Menu agregar", jPanel1);

        panel1.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Crud archivos", panel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = jTextField1.getText();
        int puntuacion = Integer.parseInt(jSpinner1.getValue()+"");
        String tipo = jComboBox1.getSelectedItem()+""; 
        String genero = jComboBox2.getSelectedItem()+"";
        String nada = "";
        if ((nombre.equals(nada)) == false){
            Programas programa = new Programas(nombre, puntuacion, tipo, genero);
            programas.add(programa);
            DefaultListModel modelo = (DefaultListModel) jList1.getModel();
            modelo.addElement(programa.toStringProgramas());
            jList1.setModel(modelo);
            jTextField1.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un nombre.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jList1.getSelectedIndex() >= 0){
            DefaultListModel modelo = (DefaultListModel) jList1.getModel();
            modelo.removeElementAt(jList1.getSelectedIndex());
            for (int c = 0; c < programas.size();c++){
                Programas objeto = (Programas) programas.get(c);
                if (objeto.toStringProgramas().equals(jList1.getSelectedValue())){
                    programas.remove(objeto);
                }
            }
            jList1.setModel(modelo);
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione un programa.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jList1.getSelectedIndex() >= 0){
            DefaultListModel modelo = (DefaultListModel) jList1.getModel();
            for (int c = 0; c < programas.size();c++){
                Programas objeto = (Programas) programas.get(c);
                if (objeto.toStringProgramas().equals(jList1.getSelectedValue())){
                    String nombre = jTextField1.getText();
                    int puntuacion = Integer.parseInt(jSpinner1.getValue()+"");
                    String tipo = jComboBox1.getSelectedItem()+""; 
                    String genero = jComboBox2.getSelectedItem()+"";
                    String nada = "";
                    if ((nombre.equals(nada)) == false){
                        Programas programa = new Programas(nombre, puntuacion, tipo, genero);
                        int indice = programas.indexOf(objeto);
                        programas.set(indice, programa);
                        modelo.setElementAt(programa.toStringProgramas(), jList1.getSelectedIndex());
                        jList1.setModel(modelo);
                        jTextField1.setText(""); 
                    }else{
                        JOptionPane.showMessageDialog(null, "Ingrese un nombre.");
                    }
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione un programa.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jList1.getSelectedIndex() >= 0){
            for (int c = 0; c < programas.size();c++){
                Programas objeto = (Programas) programas.get(c);
                if (objeto.toStringProgramas().equals(jList1.getSelectedValue())){
                    jTextField1.setText(objeto.getNombre());
                    jSpinner1.setValue(objeto.getPuntuacion());
                    jComboBox1.setSelectedItem(objeto.getTipo());
                    jComboBox2.setSelectedItem(objeto.getGenero());
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione un programa.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jList1.getSelectedIndex() >= 0){
            String nombre = jTextField2.getText()+"";
            Claudilist listaclau = new Claudilist(nombre);
            listaclau.setNombre(nombre);
            for (int c = 0; c < programas.size();c++){
                Programas objeto = (Programas) programas.get(c);
                if (objeto.toStringProgramas().equals(jList1.getSelectedValue())){
                    listaclau.getProgramas().add(objeto);
                }
            }
            listasclau.add(listaclau);
            DefaultListModel modelo = (DefaultListModel) jList2.getModel();
            modelo.addElement(listaclau.toStringClaudilist());
            jList2.setModel(modelo);
            jTextField2.setText("");
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione al menos un programa.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (jList2.getSelectedIndex() >= 0){
            for (int c = 0 ; c < listasclau.size();c++){
                Claudilist objeto = (Claudilist) listasclau.get(c);
                if (objeto.toStringClaudilist().equals(jList2.getSelectedValue())){
                    ArrayList lista = new ArrayList();
                    lista = objeto.getProgramas();
                    ArrayList lista2 = new ArrayList();
                    lista2 = lista;
                    ArrayList lista3 = new ArrayList();
                    lista3 = programas;
                    for (int j = 0; j < programas.size();j++){
                        Programas objeto2 = (Programas) programas.get(j);
                        for(int h = 0; h < lista.size();h++){
                            Programas objeto3 = (Programas) lista.get(h);
                            if(objeto2.equals(objeto3)){
                                lista2.remove(objeto3);
                                lista3.remove(objeto2);
                            }
                        }                     
                    }
                    objeto.setProgramas(lista2); 
                    programas = lista3;
                    listasclau.remove(objeto);
                    DefaultListModel modelo1 = llenarmodeloprogramas();
                    jList1.setModel(modelo1);
                    modelo1 = llenarmodeloclaudilist(); 
                    jList2.setModel(modelo1);
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una claudilist.");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jList2.getSelectedIndex() >= 0){
            for (int c = 0 ; c < listasclau.size();c++){
                Claudilist objeto = (Claudilist) listasclau.get(c);
                if (objeto.toStringClaudilist().equals(jList2.getSelectedValue())){
                    String nombre = jTextField2.getText();
                    objeto.setNombre(nombre);
                    DefaultListModel modelo = (DefaultListModel) jList2.getModel();
                    modelo = llenarmodeloclaudilist();
                    jList2.setModel(modelo);
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una claudilist.");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jList2.getSelectedIndex() >= 0){
            for (int c = 0 ; c < listasclau.size();c++){
                Claudilist objeto = (Claudilist) listasclau.get(c);
                if (objeto.toStringClaudilist().equals(jList2.getSelectedValue())){
                    jTextField2.setText(objeto.getNombre());
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una claudilist.");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jList1.getSelectedIndex() >= 0){
            if (jList2.getSelectedIndex() >= 0){
                ArrayList lista = new ArrayList(); 
                for (int j = 0 ; j < listasclau.size();j++){
                    Claudilist objeto2 = (Claudilist) listasclau.get(j);
                    if (objeto2.toStringClaudilist().equals(jList2.getSelectedValue())){
                        for (int c = 0; c < programas.size();c++){
                            Programas objeto = (Programas) programas.get(c);
                            if (objeto.toStringProgramas().equals(jList1.getSelectedValue())){
                                lista = objeto2.getProgramas(); 
                                lista.add(objeto);
                                JOptionPane.showMessageDialog(null, "Programa agregado correctamente.");
                            }
                        }
                        objeto2.setProgramas(lista);
                    }                  
                }                
            }else {
                JOptionPane.showMessageDialog(null, "Seleccione una claudilist.");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione un programa.");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (jList2.getSelectedIndex() >= 0){
            for (int c = 0 ; c < listasclau.size();c++){
                Claudilist objeto = (Claudilist) listasclau.get(c);
                if (objeto.toStringClaudilist().equals(jList2.getSelectedValue())){
                    File archivo = null; 
                    FileWriter escritor= null;
                    BufferedWriter escritorenRAM = null;       
                    try{
                        archivo = new File("./"+objeto.getNombre()+".txt");
                        escritor = new FileWriter(archivo, false);
                        escritorenRAM = new BufferedWriter(escritor);
                        String linea = ""; 
                        for (int j = 0; j < objeto.getProgramas().size();j++){
                            Programas programa = (Programas) objeto.getProgramas().get(j);
                            linea = programa.getNombre()+"/"+programa.getPuntuacion()+"/"+programa.getTipo()+"/"+programa.getGenero();
                            escritorenRAM.write(linea);
                            escritorenRAM.newLine();  
                        }                                                     
                        escritorenRAM.flush();

                    }catch (Exception e){

                    }
                    try {
                        escritorenRAM.close();
                        escritor.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }                   
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una claudilist.");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
