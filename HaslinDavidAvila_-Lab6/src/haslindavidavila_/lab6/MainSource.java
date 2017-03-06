package haslindavidavila_.lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class MainSource extends javax.swing.JFrame {

    public MainSource() {
        initComponents();
        this.Principal.setModal(true);
        this.Principal.pack();
        this.Principal.setLocationRelativeTo(this);
        this.Principal.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Todo = new javax.swing.JTree();
        AgregarTodo = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_LugarNacimiento = new javax.swing.JTextField();
        cb_Nacionalidad = new javax.swing.JComboBox<>();
        tf_Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_Edad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        botonColor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tf_Familiar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_LugarNacimiento1 = new javax.swing.JTextField();
        cb_Nacionalidad1 = new javax.swing.JComboBox<>();
        tf_Id1 = new javax.swing.JTextField();
        tf_Edad1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_Nombre1 = new javax.swing.JTextField();
        botonColor1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cb_SeccionTrabajo = new javax.swing.JComboBox<>();
        cb_Estado = new javax.swing.JComboBox<>();
        tf_Sueldo = new javax.swing.JTextField();
        tf_HoraEntrada = new javax.swing.JTextField();
        tf_HoraSalida = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        bt_Family = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        tf_Edad2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tf_Nombre2 = new javax.swing.JTextField();
        botonColor2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        tf_Id2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cb_Nacionalidad2 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tf_LugarNacimiento2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        cb_SeccionTrabajo1 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        tf_clientesatt = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tf_Ganancia = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        bt_Family1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        tf_Edad3 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tf_Nombre3 = new javax.swing.JTextField();
        botonColor3 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        tf_Id3 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        cb_Nacionalidad3 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        tf_LugarNacimiento3 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tf_ticket = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        tf_dinero = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        bt_Family2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        tf_Precio = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jl_ingredientes = new javax.swing.JList<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        tf_altura = new javax.swing.JTextField();
        tf_peso = new javax.swing.JTextField();
        tf_Precio1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        Arbol = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Familiares = new javax.swing.JTree();
        jLabel44 = new javax.swing.JLabel();
        ComboNombres = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        TablaDeObjetos = new javax.swing.JDialog();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablePersonas = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableFams = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableBaleadas = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableGatos = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        pp_Menu = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        pp_MenuArbol = new javax.swing.JPopupMenu();
        Agregar = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        Eliminar2 = new javax.swing.JMenuItem();
        pp_MenuFam = new javax.swing.JPopupMenu();
        Eliminar3 = new javax.swing.JMenuItem();
        pp_MenuBal = new javax.swing.JPopupMenu();
        Eliminar4 = new javax.swing.JMenuItem();
        pp_MenuGat = new javax.swing.JPopupMenu();
        Eliminar5 = new javax.swing.JMenuItem();
        pp_MenuIngr = new javax.swing.JPopupMenu();
        Agregar2 = new javax.swing.JMenuItem();
        AgregarHijo = new javax.swing.JDialog();
        jButton12 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        tf_NombreH = new javax.swing.JTextField();
        tf_IdH = new javax.swing.JTextField();
        tf_EdadH = new javax.swing.JTextField();
        cb_NacionalidadH = new javax.swing.JComboBox<>();
        ModificarHijo = new javax.swing.JDialog();
        jLabel50 = new javax.swing.JLabel();
        tf_NombreH1 = new javax.swing.JTextField();
        tf_IdH1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        cb_NacionalidadH1 = new javax.swing.JComboBox<>();
        tf_EdadH1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Raiz");
        jt_Todo.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jt_Todo);

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal.getContentPane());
        Principal.getContentPane().setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));

        jLabel3.setText("Nacionalidad");

        jLabel4.setText("Lugar de Nacimiento");

        cb_Nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estadounidense", "Hondureño", "Panameño", "Guatemalteco", "Canadiense", "Brasileño", "Argentino", "Chileno", "Salvadoreño", "Mexicano" }));

        jLabel2.setText("ID");

        jLabel1.setText("Edad");

        jLabel5.setText("Nombre");

        botonColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColorActionPerformed(evt);
            }
        });

        jLabel6.setText("Color");

        jLabel7.setText("Padre");

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_Nacionalidad, 0, 159, Short.MAX_VALUE)
                            .addComponent(tf_Edad)
                            .addComponent(tf_Id)
                            .addComponent(tf_LugarNacimiento))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(botonColor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(tf_Familiar))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonColor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(tf_Familiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_LugarNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Familiares", jPanel5);

        jLabel8.setText("Edad");

        jLabel9.setText("ID");

        jLabel10.setText("Nacionalidad");

        jLabel11.setText("Lugar de Nacimiento");

        cb_Nacionalidad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estadounidense", "Hondureño", "Panameño", "Guatemalteco", "Canadiense", "Brasileño", "Argentino", "Chileno", "Salvadoreño", "Mexicano" }));

        jLabel12.setText("Nombre");

        botonColor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColor1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Color");

        jLabel14.setText("Padre");

        jLabel15.setText("Seccion Trabajo");

        jLabel16.setText("Hora Entrada");

        jLabel17.setText("Hora Salida");

        jLabel18.setText("Sueldo");

        jLabel19.setText("Estado");

        cb_SeccionTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocina", "Venta de Baleadas", "Venta de Gatos" }));

        cb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Disponible" }));

        jButton3.setText("Agregar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        bt_Family.setText("Agregar Familiar");
        bt_Family.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_FamilyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel11)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cb_Nacionalidad1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_Edad1)
                                .addComponent(tf_Id1)
                                .addComponent(tf_LugarNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(22, 22, 22)
                                            .addComponent(botonColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(bt_Family, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_HoraEntrada)
                                        .addComponent(cb_SeccionTrabajo, 0, 159, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cb_Estado, 0, 166, Short.MAX_VALUE)
                                .addComponent(tf_Sueldo))))
                    .addComponent(tf_HoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_Edad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tf_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_Id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Nacionalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14)
                    .addComponent(bt_Family))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_LugarNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18)
                    .addComponent(cb_SeccionTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19)
                    .addComponent(cb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_HoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_HoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Empleados", jPanel4);

        jLabel20.setText("Edad");

        jLabel21.setText("Nombre");

        botonColor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColor2ActionPerformed(evt);
            }
        });

        jLabel22.setText("Color");

        jLabel23.setText("ID");

        jLabel24.setText("Nacionalidad");

        cb_Nacionalidad2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estadounidense", "Hondureño", "Panameño", "Guatemalteco", "Canadiense", "Brasileño", "Argentino", "Chileno", "Salvadoreño", "Mexicano" }));

        jLabel25.setText("Padre");

        jLabel26.setText("Lugar de Nacimiento");

        jLabel27.setText("Seccion Trabajo");

        cb_SeccionTrabajo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cocina", "Venta de Baleadas", "Venta de Gatos" }));

        jLabel28.setText("Clientes Atendidos");

        tf_clientesatt.setEditable(false);

        jLabel29.setText("Ganancia");

        tf_Ganancia.setEditable(false);

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        bt_Family1.setText("Agregar Familiar");
        bt_Family1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Family1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel26)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel24)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel27))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cb_SeccionTrabajo1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_Nacionalidad2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_Edad2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Id2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_LugarNacimiento2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(tf_clientesatt)
                            .addComponent(tf_Ganancia))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel25))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(botonColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(bt_Family1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_Edad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(tf_Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_Id2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Nacionalidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(bt_Family1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_LugarNacimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cb_SeccionTrabajo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(tf_clientesatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(tf_Ganancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jTabbedPane2.addTab("Jefes", jPanel6);

        jLabel30.setText("Edad");

        jLabel31.setText("Nombre");

        botonColor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonColor3ActionPerformed(evt);
            }
        });

        jLabel32.setText("Color");

        jLabel33.setText("ID");

        cb_Nacionalidad3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estadounidense", "Hondureño", "Panameño", "Guatemalteco", "Canadiense", "Brasileño", "Argentino", "Chileno", "Salvadoreño", "Mexicano" }));

        jLabel34.setText("Nacionalidad");

        jLabel35.setText("Padre");

        jLabel36.setText("Lugar de Nacimiento");

        jLabel37.setText("Ticket");

        jLabel38.setText("Dinero");

        jButton5.setText("Agregar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        bt_Family2.setText("Agregar Familiar");
        bt_Family2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Family2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel34)
                                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cb_Nacionalidad3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_Edad3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Id3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_LugarNacimiento3, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(tf_ticket)
                            .addComponent(tf_dinero))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel35))
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(botonColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(bt_Family2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tf_Edad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(tf_Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(tf_Id3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_Nacionalidad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(bt_Family2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(tf_LugarNacimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(tf_ticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(tf_dinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Clientes", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Personas", jPanel2);

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));

        jLabel39.setText("Precio");

        jLabel40.setText("Ingredientes");

        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jl_ingredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_ingredientesMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jl_ingredientes);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Precio)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jButton6)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(tf_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton6)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Baleadas", jPanel8);

        jLabel41.setText("Altura");

        jLabel42.setText("Peso");

        jLabel43.setText("Precio");

        jButton7.setText("Agregar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_altura)
                            .addComponent(tf_peso)
                            .addComponent(tf_Precio1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jButton7)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addComponent(tf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(tf_Precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton7)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Gatos", jPanel9);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Articulos", jPanel3);

        javax.swing.GroupLayout AgregarTodoLayout = new javax.swing.GroupLayout(AgregarTodo.getContentPane());
        AgregarTodo.getContentPane().setLayout(AgregarTodoLayout);
        AgregarTodoLayout.setHorizontalGroup(
            AgregarTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        AgregarTodoLayout.setVerticalGroup(
            AgregarTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        Arbol.setBackground(new java.awt.Color(153, 204, 255));

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Arbol Genealogico");
        jt_Familiares.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jt_Familiares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_FamiliaresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_Familiares);

        jLabel44.setText("Nombre");

        jButton11.setText("A G R E G A R");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ArbolLayout = new javax.swing.GroupLayout(Arbol.getContentPane());
        Arbol.getContentPane().setLayout(ArbolLayout);
        ArbolLayout.setHorizontalGroup(
            ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArbolLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboNombres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ArbolLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        ArbolLayout.setVerticalGroup(
            ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArbolLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ArbolLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        TablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "ID", "Nacionalidad"
            }
        ));
        TablePersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePersonasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablePersonas);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Tabla Personas", jPanel11);

        TableFams.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "ID", "Nacionalidad"
            }
        ));
        TableFams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableFamsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TableFams);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Tabla Familiares", jPanel12);

        TableBaleadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Precio", "Ingredientes"
            }
        ));
        TableBaleadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBaleadasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TableBaleadas);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Baleadas", jPanel14);

        TableGatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Altura", "Peso", "Precio"
            }
        ));
        TableGatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableGatosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TableGatos);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane5.addTab("Gatos", jPanel15);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Tabla Articulos", jPanel13);

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel45.setText("Tablas De Objetos");

        javax.swing.GroupLayout TablaDeObjetosLayout = new javax.swing.GroupLayout(TablaDeObjetos.getContentPane());
        TablaDeObjetos.getContentPane().setLayout(TablaDeObjetosLayout);
        TablaDeObjetosLayout.setHorizontalGroup(
            TablaDeObjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TablaDeObjetosLayout.createSequentialGroup()
                .addGroup(TablaDeObjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TablaDeObjetosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TablaDeObjetosLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel45)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TablaDeObjetosLayout.setVerticalGroup(
            TablaDeObjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TablaDeObjetosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        pp_Menu.add(Eliminar);

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        pp_MenuArbol.add(Agregar);

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        pp_MenuArbol.add(Modificar);

        Eliminar2.setText("Eliminar");
        Eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar2ActionPerformed(evt);
            }
        });
        pp_MenuArbol.add(Eliminar2);

        Eliminar3.setText("Eliminar");
        Eliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar3ActionPerformed(evt);
            }
        });
        pp_MenuFam.add(Eliminar3);

        Eliminar4.setText("Eliminar");
        Eliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar4ActionPerformed(evt);
            }
        });
        pp_MenuBal.add(Eliminar4);

        Eliminar5.setText("Eliminar");
        Eliminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar5ActionPerformed(evt);
            }
        });
        pp_MenuGat.add(Eliminar5);

        Agregar2.setText("Agregar Ingredientes");
        Agregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar2ActionPerformed(evt);
            }
        });
        pp_MenuIngr.add(Agregar2);

        jButton12.setText("ADD");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel46.setText("Nombre");

        jLabel47.setText("Id");

        jLabel48.setText("Nacionalidad");

        jLabel49.setText("Edad");

        cb_NacionalidadH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estadounidense", "Hondureño", "Panameño", "Guatemalteco", "Canadiense", "Brasileño", "Argentino", "Chileno", "Salvadoreño", "Mexicano" }));

        javax.swing.GroupLayout AgregarHijoLayout = new javax.swing.GroupLayout(AgregarHijo.getContentPane());
        AgregarHijo.getContentPane().setLayout(AgregarHijoLayout);
        AgregarHijoLayout.setHorizontalGroup(
            AgregarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarHijoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarHijoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AgregarHijoLayout.createSequentialGroup()
                        .addGroup(AgregarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49))
                        .addGroup(AgregarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AgregarHijoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(AgregarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_EdadH, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(tf_IdH)
                                    .addComponent(tf_NombreH)))
                            .addGroup(AgregarHijoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cb_NacionalidadH, 0, 133, Short.MAX_VALUE)))
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        AgregarHijoLayout.setVerticalGroup(
            AgregarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgregarHijoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AgregarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(tf_NombreH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(tf_IdH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(cb_NacionalidadH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(AgregarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(tf_EdadH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addContainerGap())
        );

        jLabel50.setText("Nombre");

        jLabel51.setText("Id");

        jLabel52.setText("Nacionalidad");

        cb_NacionalidadH1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estadounidense", "Hondureño", "Panameño", "Guatemalteco", "Canadiense", "Brasileño", "Argentino", "Chileno", "Salvadoreño", "Mexicano" }));

        jLabel53.setText("Edad");

        jButton13.setText("ADD");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModificarHijoLayout = new javax.swing.GroupLayout(ModificarHijo.getContentPane());
        ModificarHijo.getContentPane().setLayout(ModificarHijoLayout);
        ModificarHijoLayout.setHorizontalGroup(
            ModificarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarHijoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarHijoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModificarHijoLayout.createSequentialGroup()
                        .addGroup(ModificarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53))
                        .addGroup(ModificarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ModificarHijoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(ModificarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_EdadH1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(tf_IdH1)
                                    .addComponent(tf_NombreH1)))
                            .addGroup(ModificarHijoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cb_NacionalidadH1, 0, 133, Short.MAX_VALUE)))
                        .addGap(0, 83, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ModificarHijoLayout.setVerticalGroup(
            ModificarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarHijoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModificarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(tf_NombreH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModificarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(tf_IdH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ModificarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(cb_NacionalidadH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(ModificarHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(tf_EdadH1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true)));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton1.setText("A G R E G A R");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 3, true));

        jButton8.setText("Arbol Familiares");
        jButton8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jButton8StateChanged(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Tabla de Objetos");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton10.setText("RE-OPEN");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("MENU");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenu2.setText("Guardar Como");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Empleados");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Clientes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Jefes");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Familiar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Baleadas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Gatos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Ordenes");
        jMenu2.add(jMenuItem11);

        jMenu1.add(jMenu2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("About");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.AgregarTodo.setModal(true);
        this.AgregarTodo.pack();
        this.AgregarTodo.setLocationRelativeTo(this);
        this.AgregarTodo.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColorActionPerformed
        botonColor.setBackground(JColorChooser.showDialog(this, "Seleccione un color", Color.yellow));
    }//GEN-LAST:event_botonColorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int edad, id;
        String nacionalidad, lugar_nacimiento, nombre;
        Color colorpiel;
        Object pdr;
        try {
            edad = Integer.parseInt(tf_Edad.getText());
            id = Integer.parseInt(tf_Id.getText());
            nacionalidad = cb_Nacionalidad.getSelectedItem().toString();
            lugar_nacimiento = tf_LugarNacimiento.getText();
            nombre = tf_Nombre.getText();
            colorpiel = botonColor.getBackground();
            pdr = tf_Familiar.getText();
            
            DefaultTableModel modelo = (DefaultTableModel) TableFams.getModel();
            Object[] newrow = {nombre, edad, id, nacionalidad};
            modelo.addRow(newrow);
            TableFams.setModel(modelo);
            
            Familiares.add(new Familiar(edad, id, nacionalidad, lugar_nacimiento, nombre, colorpiel, (Familiar)pdr));
            JOptionPane.showMessageDialog(null, "Su Informacion Ha sido Guardada Exitosamente");
            
            tf_Edad.setText("");
            tf_Id.setText("");
            cb_Nacionalidad.setSelectedIndex(0);
            tf_LugarNacimiento.setText("");
            tf_Nombre.setText("");
            tf_Familiar.setText("");
        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de guardar su informacion");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonColor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColor1ActionPerformed
        botonColor1.setBackground(JColorChooser.showDialog(this, "Seleccione un color", Color.yellow));
    }//GEN-LAST:event_botonColor1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String secctr, hentrada, hsalidad, estado;
        double sueldo;
        int edad, id;
        String nacionalidad, lugar_nacimiento, nombre;
        Color colorpiel;
        try {
            edad = Integer.parseInt(tf_Edad1.getText());
            id = Integer.parseInt(tf_Id1.getText());
            nacionalidad = cb_Nacionalidad1.getSelectedItem().toString();
            lugar_nacimiento = tf_LugarNacimiento1.getText();
            nombre = tf_Nombre1.getText();
            colorpiel = botonColor1.getBackground();
            secctr = cb_SeccionTrabajo.getSelectedItem().toString();
            hentrada = tf_HoraEntrada.getText();
            hsalidad = tf_HoraSalida.getText();
            estado = cb_Estado.getSelectedItem().toString();
            sueldo = Double.parseDouble(tf_Sueldo.getText());
            
            DefaultTableModel modelo = (DefaultTableModel) TablePersonas.getModel();
            Object[] newrow = {nombre, edad, id, nacionalidad};
            modelo.addRow(newrow);
            TablePersonas.setModel(modelo);
            
            DefaultTreeModel m = (DefaultTreeModel) jt_Todo.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultMutableTreeNode nodo_persona;
            nodo_persona = new DefaultMutableTreeNode(new Empleado(
                    secctr, hentrada, hsalidad, sueldo, estado,
                    edad, id, nacionalidad, lugar_nacimiento, nombre, null, colorpiel));
            raiz.add(nodo_persona);
            
            lista.add(new Empleado(secctr, hentrada, hsalidad, sueldo, estado, edad, id, nacionalidad, lugar_nacimiento, nombre, null, colorpiel));
            JOptionPane.showMessageDialog(null, "Su Informacion Ha sido Guardada Exitosamente");
            
            tf_Edad1.setText("");
            tf_Id1.setText("");
            cb_Nacionalidad1.setSelectedIndex(0);
            tf_LugarNacimiento1.setText("");
            tf_Nombre1.setText("");
            cb_SeccionTrabajo.setSelectedIndex(0);
            tf_HoraEntrada.setText("");
            tf_HoraSalida.setText("");
            cb_Estado.setSelectedIndex(0);
            tf_Sueldo.setText("");
        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de guardar su informacion");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColor2ActionPerformed
        botonColor2.setBackground(JColorChooser.showDialog(this, "Seleccione un color", Color.yellow));
    }//GEN-LAST:event_botonColor2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String secciontrab;
        int clientesAtt;
        double ganancia;
        int edad, id;
        String nacionalidad, lugar_nacimiento, nombre;
        Color colorpiel;
        try {
            edad = Integer.parseInt(tf_Edad2.getText());
            id = Integer.parseInt(tf_Id2.getText());
            nacionalidad = cb_Nacionalidad2.getSelectedItem().toString();
            lugar_nacimiento = tf_LugarNacimiento2.getText();
            nombre = tf_Nombre2.getText();
            colorpiel = botonColor2.getBackground();
            secciontrab = cb_SeccionTrabajo1.getSelectedItem().toString();
            clientesAtt = 0;
            ganancia = 0.0;
            
            DefaultTableModel modelo = (DefaultTableModel) TablePersonas.getModel();
            Object[] newrow = {nombre, edad, id, nacionalidad};
            modelo.addRow(newrow);
            TablePersonas.setModel(modelo);
            
            DefaultTreeModel m = (DefaultTreeModel) jt_Todo.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultMutableTreeNode nodo_persona;
            nodo_persona = new DefaultMutableTreeNode(new Jefes(
                    secciontrab, clientesAtt, ganancia, edad, id, nacionalidad, 
                    lugar_nacimiento, nombre, m, colorpiel));
            raiz.add(nodo_persona);
            
            lista.add(new Jefes(secciontrab, clientesAtt, ganancia, edad, id, nacionalidad, lugar_nacimiento, nombre, null, colorpiel));
            JOptionPane.showMessageDialog(null, "Su Informacion Ha sido Guardada Exitosamente");
            
            tf_Edad2.setText("");
            tf_Id2.setText("");
            cb_Nacionalidad2.setSelectedIndex(0);
            tf_LugarNacimiento2.setText("");
            tf_Nombre2.setText("");
            cb_SeccionTrabajo1.setSelectedIndex(0);
        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de guardar su informacion");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botonColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonColor3ActionPerformed
        botonColor3.setBackground(JColorChooser.showDialog(this, "Seleccione un color", Color.yellow));

    }//GEN-LAST:event_botonColor3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int ticket;
        double dinero;
        int edad, id;
        String nacionalidad, lugar_nacimiento, nombre;
        Color colorpiel;
        try {
            edad = Integer.parseInt(tf_Edad3.getText());
            id = Integer.parseInt(tf_Id3.getText());
            nacionalidad = cb_Nacionalidad3.getSelectedItem().toString();
            lugar_nacimiento = tf_LugarNacimiento3.getText();
            nombre = tf_Nombre3.getText();
            colorpiel = botonColor3.getBackground();
            ticket = Integer.parseInt(tf_ticket.getText());
            dinero = Double.parseDouble(tf_dinero.getText());
            
            DefaultTableModel modelo = (DefaultTableModel) TablePersonas.getModel();
            Object[] newrow = {nombre, edad, id, nacionalidad};
            modelo.addRow(newrow);
            TablePersonas.setModel(modelo);
            
            DefaultTreeModel m = (DefaultTreeModel) jt_Todo.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultMutableTreeNode nodo_persona;
            nodo_persona = new DefaultMutableTreeNode(new Clientes(
                    ticket, dinero, edad, id, nacionalidad, lugar_nacimiento, 
                    nombre, m, colorpiel));
            raiz.add(nodo_persona);
            
            lista.add(new Clientes(ticket, dinero, edad, id, nacionalidad, lugar_nacimiento, nombre, null, colorpiel));
            JOptionPane.showMessageDialog(null, "Su Informacion Ha sido Guardada Exitosamente");
            
            tf_Edad3.setText("");
            tf_Id3.setText("");
            cb_Nacionalidad3.setSelectedIndex(0);
            tf_LugarNacimiento3.setText("");
            tf_Nombre3.setText("");
            tf_ticket.setText("");
            tf_dinero.setText("");
        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de guardar su informacion");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.Arbol.setModal(true);
        this.Arbol.pack();
        this.Arbol.setLocationRelativeTo(this);
        this.Arbol.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        double precio;
        DefaultListModel model = new DefaultListModel();
        try {
            precio = Integer.parseInt(tf_Precio.getText());
            
            DefaultTableModel modelo = (DefaultTableModel) TableBaleadas.getModel();
            Object[] newrow = {precio, ingredientes};
            modelo.addRow(newrow);
            TableBaleadas.setModel(modelo);
            
            Baleadas.add(new Baleadas(precio));
            JOptionPane.showMessageDialog(null, "Su Informacion Ha sido Guardada Exitosamente");
            
            tf_Precio.setText("");
            jl_ingredientes.setModel(model);
        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de guardar su informacion");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        double precio, altura, peso;
        try {
            precio = Double.parseDouble(tf_Precio1.getText());
            altura = Double.parseDouble(tf_altura.getText());
            peso = Double.parseDouble(tf_peso.getText());
            
            DefaultTableModel modelo = (DefaultTableModel) TableGatos.getModel();
            Object[] newrow = {altura, peso, precio};
            modelo.addRow(newrow);
            TableGatos.setModel(modelo);
            
            Gatos.add(new Gatos(peso, altura, precio));
            JOptionPane.showMessageDialog(null, "Su Informacion Ha sido Guardada Exitosamente");
            
            tf_Precio1.setText("");
            tf_altura.setText("");
            tf_peso.setText("");
        } catch (Exception e) {
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al tratar de guardar su informacion");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.TablaDeObjetos.setModal(true);
        this.TablaDeObjetos.pack();
        this.TablaDeObjetos.setLocationRelativeTo(this);
        this.TablaDeObjetos.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.Principal.setModal(true);
        this.Principal.pack();
        this.Principal.setLocationRelativeTo(this);
        this.Principal.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void TablePersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePersonasMouseClicked
        if (evt.isMetaDown()) {
            pp_Menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_TablePersonasMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TablePersonas.getModel();
        modelo.removeRow(TablePersonas.getSelectedRow());
        lista.remove(TablePersonas.getSelectedRowCount());
        TablePersonas.setModel(modelo);
    }//GEN-LAST:event_EliminarActionPerformed

    private void jt_FamiliaresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_FamiliaresMouseClicked
        if (evt.isMetaDown()) {
            pos = jt_Familiares.getLeadSelectionRow();
            pp_MenuArbol.show(evt.getComponent(), evt.getX(), evt.getY());
            
        } 
    }//GEN-LAST:event_jt_FamiliaresMouseClicked

    private void TableFamsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableFamsMouseClicked
        if (evt.isMetaDown()) {
            pp_MenuFam.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_TableFamsMouseClicked

    private void TableBaleadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBaleadasMouseClicked
        if (evt.isMetaDown()) {
            pp_MenuBal.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_TableBaleadasMouseClicked

    private void TableGatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableGatosMouseClicked
        if (evt.isMetaDown()) {
            pp_MenuGat.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_TableGatosMouseClicked

    private void Eliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar3ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TableFams.getModel();
        modelo.removeRow(TableFams.getSelectedRow());
        Familiares.remove(TableFams.getSelectedRowCount());
        TableFams.setModel(modelo);
    }//GEN-LAST:event_Eliminar3ActionPerformed

    private void Eliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar4ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TableBaleadas.getModel();
        modelo.removeRow(TableBaleadas.getSelectedRow());
        Baleadas.remove(TableBaleadas.getSelectedRowCount());
        TableBaleadas.setModel(modelo);
    }//GEN-LAST:event_Eliminar4ActionPerformed

    private void Eliminar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar5ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TableGatos.getModel();
        modelo.removeRow(TableGatos.getSelectedRow());
        Gatos.remove(TableGatos.getSelectedRowCount());
        TableGatos.setModel(modelo);
    }//GEN-LAST:event_Eliminar5ActionPerformed

    private void jl_ingredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_ingredientesMouseClicked
        if (evt.isMetaDown()) {
            pp_MenuIngr.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_ingredientesMouseClicked

    private void Agregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar2ActionPerformed
        Baleadas b = new Baleadas();
        int seleccion = JOptionPane.showConfirmDialog(this, "Agregar Ingredientes",
                "Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (seleccion == JOptionPane.OK_OPTION) {
            ingredientes = JOptionPane.showInputDialog("Ingrese los Ingredientes de la Baleada");
            b.setIngredientes(ingredientes);
            Ing.add(ingredientes);
        }
        refresh();
    }//GEN-LAST:event_Agregar2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AdminEmpleado ae = new AdminEmpleado("./Empleado.txt");
        AdminJefes aj = new AdminJefes("./Jefes.txt");
        AdminCliente ac = new AdminCliente("./Cliente.txt");
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Empleado) {
                ae.cargarArchivo();
                ae.setEmpleado(((Empleado)lista.get(i)));
                ae.escribirArchivo();
            }
            if (lista.get(i) instanceof Jefes) {
                aj.cargarArchivo();
                aj.setJefes(((Jefes)lista.get(i)));
                aj.escribirArchivo();
            }
            if (lista.get(i) instanceof Clientes) {
                ac.cargarArchivo();
                ac.setClientes(((Clientes)lista.get(i)));
                ac.escribirArchivo();
            }
        }
        AdminFamiliar af = new AdminFamiliar("./Familiar.txt");
        for (int i = 0; i < Familiares.size(); i++) {
            af.cargarArchivo();
            af.setFamiliar(((Familiar)Familiares.get(i)));
            af.escribirArchivo();
        }
        AdminBaleadas ab = new AdminBaleadas("./Baleadas.txt");
        AdminGatos ag = new AdminGatos("./Gatos.txt");
        for (int i = 0; i < Baleadas.size(); i++) {
            ab.cargarArchivo();
            ab.setBaleadas(((Baleadas)Baleadas.get(i)));
            ab.escribirArchivo();
        }
        for (int i = 0; i < Gatos.size(); i++) {
            ag.cargarArchivo();
            ag.setGatos(((Gatos)Gatos.get(i)));
            ag.escribirArchivo();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JFileChooser fc = new JFileChooser();
        int sel = fc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        if (sel == JFileChooser.APPROVE_OPTION) {
            try {
                File arch = fc.getSelectedFile();
                fw = new FileWriter(arch);
                bw = new BufferedWriter(fw);
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i) instanceof Empleado) {
                        bw.write(lista.get(i).toString());
                    }
                }
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JFileChooser fc = new JFileChooser();
        int sel = fc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (sel == JFileChooser.APPROVE_OPTION) {
            try {
                File arch = fc.getSelectedFile();
                fw = new FileWriter(arch);
                bw = new BufferedWriter(fw);
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i) instanceof Clientes) {
                        bw.write(lista.get(i).toString());
                    }
                }
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JFileChooser fc = new JFileChooser();
        int sel = fc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (sel == JFileChooser.APPROVE_OPTION) {
            try {
                File arch = fc.getSelectedFile();
                fw = new FileWriter(arch);
                bw = new BufferedWriter(fw);
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i) instanceof Jefes) {
                        bw.write(lista.get(i).toString());
                    }
                }
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        JFileChooser fc = new JFileChooser();
        int sel = fc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (sel == JFileChooser.APPROVE_OPTION) {
            try {
                File arch = fc.getSelectedFile();
                fw = new FileWriter(arch);
                bw = new BufferedWriter(fw);
                for (int i = 0; i < Familiares.size(); i++) {
                    bw.write(Familiares.get(i).toString());
                }
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JFileChooser fc = new JFileChooser();
        int sel = fc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (sel == JFileChooser.APPROVE_OPTION) {
            try {
                File arch = fc.getSelectedFile();
                fw = new FileWriter(arch);
                bw = new BufferedWriter(fw);
                for (int i = 0; i < Baleadas.size(); i++) {
                    bw.write(Baleadas.get(i).toString());
                }
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        JFileChooser fc = new JFileChooser();
        int sel = fc.showSaveDialog(this);
        FileWriter fw = null;
        BufferedWriter bw = null;
        if (sel == JFileChooser.APPROVE_OPTION) {
            try {
                File arch = fc.getSelectedFile();
                fw = new FileWriter(arch);
                bw = new BufferedWriter(fw);
                for (int i = 0; i < Gatos.size(); i++) {
                    bw.write(Gatos.get(i).toString());
                }
            } catch (Exception e) {
            } finally {
                try {
                    bw.close();
                    fw.close();
                } catch (IOException e) {
                }
            }
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jButton8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jButton8StateChanged
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < Familiares.size(); i++) {
            modelo.addElement(((Familiar)Familiares.get(i)).getFam_padre());
        }
        ComboNombres.setModel(modelo);
    }//GEN-LAST:event_jButton8StateChanged

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (ComboNombres.getSelectedIndex() >= 0) {
            for (int i = 0; i < Familiares.size(); i++) {
                DefaultTreeModel m = (DefaultTreeModel)jt_Familiares.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
                Padre = new DefaultMutableTreeNode(((Familiar)Familiares.get(i)).getFam_padre());
                hijo1 = new DefaultMutableTreeNode(((Familiar)Familiares.get(i)).getNombre());
                Padre.add(hijo1);
                raiz.add(Padre);
                m.reload();
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void bt_FamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_FamilyActionPerformed
        Persona ep = new Empleado();
        Object family; 
        family = JOptionPane.showInputDialog("Ingrese Los Familiares");
        ep.setFam((Familiar) family);
    }//GEN-LAST:event_bt_FamilyActionPerformed

    private void bt_Family1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Family1ActionPerformed
        Persona jf = new Jefes();
        Object family; 
        family = JOptionPane.showInputDialog("Ingrese los Familiares");
        jf.setFam((Familiar) family);
    }//GEN-LAST:event_bt_Family1ActionPerformed

    private void bt_Family2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Family2ActionPerformed
        Persona cl = new Clientes();
        Object family; 
        family = JOptionPane.showInputDialog("Ingrese los Familiares");
        cl.setFam((Familiar) family);
    }//GEN-LAST:event_bt_Family2ActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        this.AgregarHijo.setModal(true);
        this.AgregarHijo.pack();
        this.AgregarHijo.setLocationRelativeTo(this);
        this.AgregarHijo.setVisible(true);
    }//GEN-LAST:event_AgregarActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int id, edad;
        String nacionalidad, nombre;
        Familiar fm = new Familiar();
        try {
            nombre = tf_NombreH.getText();
            id = Integer.parseInt(tf_IdH.getText());
            nacionalidad = cb_NacionalidadH.getSelectedItem().toString();
            edad = Integer.parseInt(tf_EdadH.getText());
            for (int i = 0; i < Familiares.size(); i++) {
                DefaultTreeModel m = (DefaultTreeModel)jt_Familiares.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
                DefaultMutableTreeNode hijoAdd;
                hijoAdd = new DefaultMutableTreeNode((new Familiar(edad, id, nacionalidad, null, nombre, null, null)).getNombre());
                hijo1.add(hijoAdd);
                Padre.add(hijo1);
                raiz.add(Padre);
                m.reload();
            }
            tf_NombreH.setText("");
            tf_IdH.setText("");
            tf_EdadH.setText("");
            fm.sethijos(new Familiar(edad, id, nacionalidad, null, nombre, null, null));
            JOptionPane.showMessageDialog(null, "Su Informacion Ha sido Guardada Exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se encontro un Error al tratar de completar el proceso");
          
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void Eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar2ActionPerformed
        Familiar fm = new Familiar();
        jt_Familiares.remove(pos);
        fm.getLista_hijos().remove(pos);
    }//GEN-LAST:event_Eliminar2ActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        this.ModificarHijo.setModal(true);
        this.ModificarHijo.pack();
        this.ModificarHijo.setLocationRelativeTo(this);
        this.ModificarHijo.setVisible(true);
    }//GEN-LAST:event_ModificarActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int id, edad;
        String nacionalidad, nombre;
        Familiar fm = new Familiar();
        try {
            nombre = tf_NombreH1.getText();
            id = Integer.parseInt(tf_IdH1.getText());
            nacionalidad = cb_NacionalidadH1.getSelectedItem().toString();
            edad = Integer.parseInt(tf_EdadH1.getText());
            for (int i = 0; i < Familiares.size(); i++) {
                DefaultTreeModel m = (DefaultTreeModel)jt_Familiares.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
                DefaultMutableTreeNode hijoAdd;
                hijoAdd = new DefaultMutableTreeNode((new Familiar(edad, id, nacionalidad, null, nombre, null, null)).getNombre());
                hijo1.add(hijoAdd);
                Padre.add(hijo1);
                raiz.add(Padre);
                m.reload();
            }
            tf_NombreH1.setText("");
            tf_IdH1.setText("");
            tf_EdadH1.setText("");
            
            fm.sethijos(new Familiar(edad, id, nacionalidad, null, nombre, null, null));
            JOptionPane.showMessageDialog(null, "Su Informacion Ha sido Guardada Exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se encontro un Error al tratar de completar el proceso");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainSource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSource.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSource().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregar;
    private javax.swing.JMenuItem Agregar2;
    private javax.swing.JDialog AgregarHijo;
    private javax.swing.JDialog AgregarTodo;
    private javax.swing.JDialog Arbol;
    private javax.swing.JComboBox<String> ComboNombres;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Eliminar2;
    private javax.swing.JMenuItem Eliminar3;
    private javax.swing.JMenuItem Eliminar4;
    private javax.swing.JMenuItem Eliminar5;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JDialog ModificarHijo;
    private javax.swing.JDialog Principal;
    private javax.swing.JDialog TablaDeObjetos;
    private javax.swing.JTable TableBaleadas;
    private javax.swing.JTable TableFams;
    private javax.swing.JTable TableGatos;
    private javax.swing.JTable TablePersonas;
    private javax.swing.JButton botonColor;
    private javax.swing.JButton botonColor1;
    private javax.swing.JButton botonColor2;
    private javax.swing.JButton botonColor3;
    private javax.swing.JButton bt_Family;
    private javax.swing.JButton bt_Family1;
    private javax.swing.JButton bt_Family2;
    private javax.swing.JComboBox<String> cb_Estado;
    private javax.swing.JComboBox<String> cb_Nacionalidad;
    private javax.swing.JComboBox<String> cb_Nacionalidad1;
    private javax.swing.JComboBox<String> cb_Nacionalidad2;
    private javax.swing.JComboBox<String> cb_Nacionalidad3;
    private javax.swing.JComboBox<String> cb_NacionalidadH;
    private javax.swing.JComboBox<String> cb_NacionalidadH1;
    private javax.swing.JComboBox<String> cb_SeccionTrabajo;
    private javax.swing.JComboBox<String> cb_SeccionTrabajo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JList<String> jl_ingredientes;
    private javax.swing.JTree jt_Familiares;
    private javax.swing.JTree jt_Todo;
    private javax.swing.JPopupMenu pp_Menu;
    private javax.swing.JPopupMenu pp_MenuArbol;
    private javax.swing.JPopupMenu pp_MenuBal;
    private javax.swing.JPopupMenu pp_MenuFam;
    private javax.swing.JPopupMenu pp_MenuGat;
    private javax.swing.JPopupMenu pp_MenuIngr;
    private javax.swing.JTextField tf_Edad;
    private javax.swing.JTextField tf_Edad1;
    private javax.swing.JTextField tf_Edad2;
    private javax.swing.JTextField tf_Edad3;
    private javax.swing.JTextField tf_EdadH;
    private javax.swing.JTextField tf_EdadH1;
    private javax.swing.JTextField tf_Familiar;
    private javax.swing.JTextField tf_Ganancia;
    private javax.swing.JTextField tf_HoraEntrada;
    private javax.swing.JTextField tf_HoraSalida;
    private javax.swing.JTextField tf_Id;
    private javax.swing.JTextField tf_Id1;
    private javax.swing.JTextField tf_Id2;
    private javax.swing.JTextField tf_Id3;
    private javax.swing.JTextField tf_IdH;
    private javax.swing.JTextField tf_IdH1;
    private javax.swing.JTextField tf_LugarNacimiento;
    private javax.swing.JTextField tf_LugarNacimiento1;
    private javax.swing.JTextField tf_LugarNacimiento2;
    private javax.swing.JTextField tf_LugarNacimiento3;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Nombre1;
    private javax.swing.JTextField tf_Nombre2;
    private javax.swing.JTextField tf_Nombre3;
    private javax.swing.JTextField tf_NombreH;
    private javax.swing.JTextField tf_NombreH1;
    private javax.swing.JTextField tf_Precio;
    private javax.swing.JTextField tf_Precio1;
    private javax.swing.JTextField tf_Sueldo;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_clientesatt;
    private javax.swing.JTextField tf_dinero;
    private javax.swing.JTextField tf_peso;
    private javax.swing.JTextField tf_ticket;
    // End of variables declaration//GEN-END:variables
    String ingredientes;
    int pos;
    DefaultMutableTreeNode hijo1;
    DefaultMutableTreeNode Padre;
    
    ArrayList lista = new ArrayList();
    ArrayList Baleadas = new ArrayList();
    ArrayList Gatos = new ArrayList();
    ArrayList Familiares = new ArrayList();
    private JFileChooser fileSelect = new JFileChooser();
    
    public void refresh() {
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < Ing.size(); i++) {
            modelo.addElement(Ing.get(i).toString());
        }
        jl_ingredientes.setModel(modelo);
    }
    ArrayList Ing = new ArrayList();
}
