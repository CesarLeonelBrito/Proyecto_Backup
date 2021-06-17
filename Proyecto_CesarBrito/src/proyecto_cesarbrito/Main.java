package proyecto_cesarbrito;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_registro = new javax.swing.JFrame();
        jLabel87 = new javax.swing.JLabel();
        registro_agregar = new javax.swing.JButton();
        registro_modificar = new javax.swing.JButton();
        asignar_maestro = new javax.swing.JButton();
        maestro_agregar = new javax.swing.JButton();
        maestro_modificar = new javax.swing.JButton();
        asignar_alumno = new javax.swing.JButton();
        alumnos_agregar = new javax.swing.JButton();
        alumnos_modificar = new javax.swing.JButton();
        clases_agregar = new javax.swing.JButton();
        clases_modificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cerrar_sesion_registro = new javax.swing.JMenuItem();
        cerrar_sistema_registro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jd_crear_registro = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf_registro_user = new javax.swing.JTextField();
        tf_registro_pass = new javax.swing.JTextField();
        jb_crear_registro = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jd_modificar_registro = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        tf_registro_user_m = new javax.swing.JTextField();
        tf_registro_pass_m = new javax.swing.JTextField();
        jb_modificar_registro = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jd_crear_maestro = new javax.swing.JDialog();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf_maestro_user = new javax.swing.JTextField();
        tf_maestro_pass = new javax.swing.JTextField();
        tf_maestro_nombre = new javax.swing.JTextField();
        tf_maestro_profesion = new javax.swing.JTextField();
        tf_maestro_rol = new javax.swing.JTextField();
        tf_maestro_sueldo = new javax.swing.JFormattedTextField();
        tf_maestro_id = new javax.swing.JFormattedTextField();
        jb_crear_maestro = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jd_modificar_maestro = new javax.swing.JDialog();
        tf_maestro_nombre_m = new javax.swing.JTextField();
        tf_maestro_profesion_m = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf_maestro_rol_m = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tf_maestro_sueldo_m = new javax.swing.JFormattedTextField();
        jLabel35 = new javax.swing.JLabel();
        tf_maestro_id_m = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        jb_modificar_maestro = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tf_maestro_user_m = new javax.swing.JTextField();
        tf_maestro_pass_m = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jd_crear_alumno = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_alumno_user = new javax.swing.JTextField();
        tf_alumno_pass = new javax.swing.JTextField();
        tf_alumno_nombre = new javax.swing.JTextField();
        tf_alumno_carrera = new javax.swing.JTextField();
        tf_alumno_rol = new javax.swing.JTextField();
        tf_alumno_clases = new javax.swing.JFormattedTextField();
        tf_alumno_cuenta = new javax.swing.JFormattedTextField();
        jb_crear_alumno = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jd_modificar_alumno = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf_alumno_user_m = new javax.swing.JTextField();
        tf_alumno_pass_m = new javax.swing.JTextField();
        tf_alumno_nombre_m = new javax.swing.JTextField();
        tf_alumno_carrera_m = new javax.swing.JTextField();
        tf_alumno_rol_m = new javax.swing.JTextField();
        tf_alumno_clases_m = new javax.swing.JFormattedTextField();
        tf_alumno_cuenta_m = new javax.swing.JFormattedTextField();
        jb_modificar_alumno = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jd_listar_registros = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_registros = new javax.swing.JList<>();
        jLabel47 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jd_listar_alumnos = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_alumnos = new javax.swing.JList<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jd_listar_maestros = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_maestros = new javax.swing.JList<>();
        jLabel49 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        popup_registro = new javax.swing.JPopupMenu();
        eliminar_registro = new javax.swing.JMenuItem();
        modificar_registro = new javax.swing.JMenuItem();
        popup_alumno = new javax.swing.JPopupMenu();
        eliminar_alumno = new javax.swing.JMenuItem();
        modificar_alumno = new javax.swing.JMenuItem();
        popup_maestro = new javax.swing.JPopupMenu();
        eliminar_maestro = new javax.swing.JMenuItem();
        modificar_maestro = new javax.swing.JMenuItem();
        jd_crear_clase = new javax.swing.JDialog();
        jb_crear_clases = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        tf_clase_nombre = new javax.swing.JTextField();
        tf_clase_id = new javax.swing.JFormattedTextField();
        tf_clase_hora = new javax.swing.JSpinner();
        tf_clase_unidades = new javax.swing.JSpinner();
        tf_clase_semestre = new javax.swing.JSpinner();
        tf_clase_periodo = new javax.swing.JSpinner();
        tf_clase_year = new com.toedter.calendar.JYearChooser();
        jLabel72 = new javax.swing.JLabel();
        jd_modificar_clase = new javax.swing.JDialog();
        tf_clase_nombre_m = new javax.swing.JTextField();
        jb_modificar_clases = new javax.swing.JButton();
        tf_clase_id_m = new javax.swing.JFormattedTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        tf_clase_hora_m = new javax.swing.JSpinner();
        jLabel60 = new javax.swing.JLabel();
        tf_clase_unidades_m = new javax.swing.JSpinner();
        jLabel61 = new javax.swing.JLabel();
        tf_clase_semestre_m = new javax.swing.JSpinner();
        jLabel62 = new javax.swing.JLabel();
        tf_clase_periodo_m = new javax.swing.JSpinner();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        tf_clase_year_m = new com.toedter.calendar.JYearChooser();
        jLabel73 = new javax.swing.JLabel();
        jd_listar_clase = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_clases = new javax.swing.JList<>();
        jLabel74 = new javax.swing.JLabel();
        popup_clase = new javax.swing.JPopupMenu();
        eliminar_clase = new javax.swing.JMenuItem();
        modificar_clase = new javax.swing.JMenuItem();
        jd_asignar_maestro = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_verMaestros = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_verClases = new javax.swing.JList<>();
        jb_asignar_maestro = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jd_asignar_alumno = new javax.swing.JDialog();
        jScrollPane7 = new javax.swing.JScrollPane();
        jl_verAlumnos = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jl_verClasesA = new javax.swing.JList<>();
        jb_asignar_alumnos = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jf_alumno = new javax.swing.JFrame();
        jb_alumnos_tareas = new javax.swing.JButton();
        jb_alumnos_examenes = new javax.swing.JButton();
        jb_alumnos_notas = new javax.swing.JButton();
        jb_alumnos_foros = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        cerrar_sesion_alum = new javax.swing.JMenuItem();
        cerrar_sistema_alum = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jd_entregar_tarea = new javax.swing.JDialog();
        tarea_alum_titulo = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tarea_alum_desc = new javax.swing.JTextArea();
        examinar_equipo = new javax.swing.JButton();
        jb_entregar_tarea = new javax.swing.JButton();
        label_tarea = new javax.swing.JLabel();
        jd_verTareas_alumnos = new javax.swing.JDialog();
        jScrollPane11 = new javax.swing.JScrollPane();
        jl_verMisTareas = new javax.swing.JList<>();
        jb_entregarMiTarea = new javax.swing.JButton();
        jd_alumno_foro = new javax.swing.JDialog();
        tf_alumno_foroTitulo = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        ta_alumno_foroDesc = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        ta_alumnos_aportes = new javax.swing.JTextArea();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        ta_alumnos_miAporte = new javax.swing.JTextArea();
        jb_alumno_ingresarAporte = new javax.swing.JButton();
        jd_verMisForos = new javax.swing.JDialog();
        jScrollPane16 = new javax.swing.JScrollPane();
        jl_verMisForos = new javax.swing.JList<>();
        jb_abrirForo = new javax.swing.JButton();
        jf_maestros = new javax.swing.JFrame();
        jb_maestros_tareas1 = new javax.swing.JButton();
        jb_maestros_examenes1 = new javax.swing.JButton();
        jb_maestros_notas1 = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        cerrar_sesion_maestro = new javax.swing.JMenuItem();
        cerrar_sistema_maesrto = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jd_asignar_tarea = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tarea_date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        tarea_hora = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        tarea_titulo = new javax.swing.JTextField();
        Descripcion = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tarea_descripcion = new javax.swing.JTextArea();
        jb_asignar_tarea = new javax.swing.JButton();
        jd_verClases_maestros = new javax.swing.JDialog();
        jScrollPane12 = new javax.swing.JScrollPane();
        jl_asignar_clases = new javax.swing.JList<>();
        jb_asginat_tarea = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jb_login = new javax.swing.JButton();
        tf_user_login = new javax.swing.JTextField();
        tf_pass_login = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();

        jf_registro.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jf_registro.setTitle("Registro");
        jf_registro.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jf_registro.setResizable(false);
        jf_registro.setSize(new java.awt.Dimension(1920, 1080));
        jf_registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/unitec_logo.png"))); // NOI18N
        jf_registro.getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 860, 310, 110));

        registro_agregar.setBackground(new java.awt.Color(204, 204, 204));
        registro_agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registro_agregar.setForeground(new java.awt.Color(0, 0, 0));
        registro_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/admin.png"))); // NOI18N
        registro_agregar.setText("Agregar Registro");
        registro_agregar.setFocusable(false);
        registro_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registro_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registro_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_agregarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(registro_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        registro_modificar.setBackground(new java.awt.Color(204, 204, 204));
        registro_modificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registro_modificar.setForeground(new java.awt.Color(0, 0, 0));
        registro_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        registro_modificar.setText("Listar Registro");
        registro_modificar.setFocusable(false);
        registro_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registro_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registro_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_modificarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(registro_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        asignar_maestro.setBackground(new java.awt.Color(204, 204, 204));
        asignar_maestro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        asignar_maestro.setForeground(new java.awt.Color(0, 0, 0));
        asignar_maestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/asignar_maestro.png"))); // NOI18N
        asignar_maestro.setText("Asignar Maestro");
        asignar_maestro.setFocusable(false);
        asignar_maestro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        asignar_maestro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        asignar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignar_maestroActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(asignar_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 10, -1, -1));

        maestro_agregar.setBackground(new java.awt.Color(204, 204, 204));
        maestro_agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        maestro_agregar.setForeground(new java.awt.Color(0, 0, 0));
        maestro_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/maestro.png"))); // NOI18N
        maestro_agregar.setText("Agregar Maestro");
        maestro_agregar.setFocusable(false);
        maestro_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        maestro_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        maestro_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maestro_agregarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(maestro_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        maestro_modificar.setBackground(new java.awt.Color(204, 204, 204));
        maestro_modificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        maestro_modificar.setForeground(new java.awt.Color(0, 0, 0));
        maestro_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        maestro_modificar.setText("Listar Maestros");
        maestro_modificar.setFocusable(false);
        maestro_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        maestro_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        maestro_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maestro_modificarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(maestro_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        asignar_alumno.setBackground(new java.awt.Color(204, 204, 204));
        asignar_alumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        asignar_alumno.setForeground(new java.awt.Color(0, 0, 0));
        asignar_alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/matricular_alumno.png"))); // NOI18N
        asignar_alumno.setText("Matricular Alumno");
        asignar_alumno.setFocusable(false);
        asignar_alumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        asignar_alumno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        asignar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignar_alumnoActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(asignar_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 330, -1, -1));

        alumnos_agregar.setBackground(new java.awt.Color(204, 204, 204));
        alumnos_agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        alumnos_agregar.setForeground(new java.awt.Color(0, 0, 0));
        alumnos_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/graduado.png"))); // NOI18N
        alumnos_agregar.setText("Agregar Alumno");
        alumnos_agregar.setFocusable(false);
        alumnos_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        alumnos_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alumnos_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_agregarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(alumnos_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        alumnos_modificar.setBackground(new java.awt.Color(204, 204, 204));
        alumnos_modificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        alumnos_modificar.setForeground(new java.awt.Color(0, 0, 0));
        alumnos_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        alumnos_modificar.setText("Listar Alumnos");
        alumnos_modificar.setFocusable(false);
        alumnos_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        alumnos_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alumnos_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_modificarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(alumnos_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, -1, -1));

        clases_agregar.setBackground(new java.awt.Color(204, 204, 204));
        clases_agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clases_agregar.setForeground(new java.awt.Color(0, 0, 0));
        clases_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clase.png"))); // NOI18N
        clases_agregar.setText("Agregar Clase");
        clases_agregar.setFocusable(false);
        clases_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clases_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clases_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clases_agregarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(clases_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        clases_modificar.setBackground(new java.awt.Color(204, 204, 204));
        clases_modificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clases_modificar.setForeground(new java.awt.Color(0, 0, 0));
        clases_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        clases_modificar.setText("Listar Clases");
        clases_modificar.setFocusable(false);
        clases_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clases_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clases_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clases_modificarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(clases_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/frame_wallpapers.jpg"))); // NOI18N
        jf_registro.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jMenu1.setText("Sesión");

        cerrar_sesion_registro.setText("Cerrar sesión");
        cerrar_sesion_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesion_registroActionPerformed(evt);
            }
        });
        jMenu1.add(cerrar_sesion_registro);

        cerrar_sistema_registro.setText("Cerrar el sistema");
        cerrar_sistema_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sistema_registroActionPerformed(evt);
            }
        });
        jMenu1.add(cerrar_sistema_registro);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        jf_registro.setJMenuBar(jMenuBar1);

        jd_crear_registro.setTitle("Crear Registro");
        jd_crear_registro.setIconImage(null);
        jd_crear_registro.setSize(new java.awt.Dimension(706, 538));
        jd_crear_registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Usuario:");
        jd_crear_registro.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 96, -1, -1));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Contraseña:");
        jd_crear_registro.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 211, -1, -1));

        tf_registro_user.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_registro.getContentPane().add(tf_registro_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 92, 307, -1));

        tf_registro_pass.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_registro.getContentPane().add(tf_registro_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 207, 307, -1));

        jb_crear_registro.setBackground(new java.awt.Color(255, 255, 255));
        jb_crear_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_crear_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_registroActionPerformed(evt);
            }
        });
        jd_crear_registro.getContentPane().add(jb_crear_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 347, -1, -1));
        jd_crear_registro.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_crear_registro.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_modificar_registro.setTitle("Modificar Registro");
        jd_modificar_registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Contraseña:");
        jd_modificar_registro.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 211, -1, -1));

        tf_registro_user_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_registro.getContentPane().add(tf_registro_user_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 92, 307, -1));

        tf_registro_pass_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_registro.getContentPane().add(tf_registro_pass_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 207, 307, -1));

        jb_modificar_registro.setBackground(new java.awt.Color(255, 255, 255));
        jb_modificar_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_modificar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_registroActionPerformed(evt);
            }
        });
        jd_modificar_registro.getContentPane().add(jb_modificar_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 347, -1, -1));

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Usuario:");
        jd_modificar_registro.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 96, -1, -1));
        jd_modificar_registro.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_modificar_registro.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_crear_maestro.setTitle("Crear Maestro");
        jd_crear_maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Usuario:");
        jd_crear_maestro.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 64, -1, -1));

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Contraseña:");
        jd_crear_maestro.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 106, -1, -1));

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Nombre:");
        jd_crear_maestro.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 148, -1, -1));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Profesion:");
        jd_crear_maestro.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 190, -1, -1));

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Rol:");
        jd_crear_maestro.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 232, -1, -1));

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("ID:");
        jd_crear_maestro.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 274, -1, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Sueldo:");
        jd_crear_maestro.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 316, -1, -1));

        tf_maestro_user.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_maestro.getContentPane().add(tf_maestro_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 60, 341, -1));

        tf_maestro_pass.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_maestro.getContentPane().add(tf_maestro_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 102, 341, -1));

        tf_maestro_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_maestro.getContentPane().add(tf_maestro_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 144, 341, -1));

        tf_maestro_profesion.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_maestro.getContentPane().add(tf_maestro_profesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 186, 341, -1));

        tf_maestro_rol.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_maestro.getContentPane().add(tf_maestro_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 228, 341, -1));

        tf_maestro_sueldo.setBackground(new java.awt.Color(255, 255, 255));
        tf_maestro_sueldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_crear_maestro.getContentPane().add(tf_maestro_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 312, 341, 24));

        tf_maestro_id.setBackground(new java.awt.Color(255, 255, 255));
        tf_maestro_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_crear_maestro.getContentPane().add(tf_maestro_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 270, 341, 24));

        jb_crear_maestro.setBackground(new java.awt.Color(255, 255, 255));
        jb_crear_maestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_crear_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_maestroActionPerformed(evt);
            }
        });
        jd_crear_maestro.getContentPane().add(jb_crear_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 393, -1, -1));
        jd_crear_maestro.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_crear_maestro.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_modificar_maestro.setTitle("Modificar Maestro");
        jd_modificar_maestro.setSize(new java.awt.Dimension(710, 540));
        jd_modificar_maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_maestro_nombre_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_maestro.getContentPane().add(tf_maestro_nombre_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 144, 341, -1));

        tf_maestro_profesion_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_maestro.getContentPane().add(tf_maestro_profesion_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 186, 341, -1));

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Usuario:");
        jd_modificar_maestro.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 64, -1, -1));

        tf_maestro_rol_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_maestro.getContentPane().add(tf_maestro_rol_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 228, 341, -1));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Contraseña:");
        jd_modificar_maestro.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 106, -1, -1));

        tf_maestro_sueldo_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_maestro_sueldo_m.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_modificar_maestro.getContentPane().add(tf_maestro_sueldo_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 312, 341, 24));

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Nombre:");
        jd_modificar_maestro.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 148, -1, -1));

        tf_maestro_id_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_maestro_id_m.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_modificar_maestro.getContentPane().add(tf_maestro_id_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 270, 341, 24));

        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Profesion:");
        jd_modificar_maestro.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 190, -1, -1));

        jb_modificar_maestro.setBackground(new java.awt.Color(255, 255, 255));
        jb_modificar_maestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_modificar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_maestroActionPerformed(evt);
            }
        });
        jd_modificar_maestro.getContentPane().add(jb_modificar_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 393, -1, -1));

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Rol:");
        jd_modificar_maestro.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 232, -1, -1));

        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("ID:");
        jd_modificar_maestro.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 274, -1, -1));

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Sueldo:");
        jd_modificar_maestro.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 316, -1, -1));

        tf_maestro_user_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_maestro.getContentPane().add(tf_maestro_user_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 60, 341, -1));

        tf_maestro_pass_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_maestro.getContentPane().add(tf_maestro_pass_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 102, 341, -1));
        jd_modificar_maestro.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_modificar_maestro.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_crear_alumno.setTitle("Crear Alumno");
        jd_crear_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Usuario:");
        jd_crear_alumno.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 64, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contraseña:");
        jd_crear_alumno.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 106, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre:");
        jd_crear_alumno.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 148, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Carrera:");
        jd_crear_alumno.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 190, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Rol:");
        jd_crear_alumno.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 232, -1, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Cuenta:");
        jd_crear_alumno.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 274, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Clases Cursadas:");
        jd_crear_alumno.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 316, -1, -1));

        tf_alumno_user.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_alumno.getContentPane().add(tf_alumno_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 60, 341, -1));

        tf_alumno_pass.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_alumno.getContentPane().add(tf_alumno_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 102, 341, -1));

        tf_alumno_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_alumno.getContentPane().add(tf_alumno_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 144, 341, -1));

        tf_alumno_carrera.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_alumno.getContentPane().add(tf_alumno_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 186, 341, -1));

        tf_alumno_rol.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_alumno.getContentPane().add(tf_alumno_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 228, 341, -1));

        tf_alumno_clases.setBackground(new java.awt.Color(255, 255, 255));
        tf_alumno_clases.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_crear_alumno.getContentPane().add(tf_alumno_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 312, 341, 24));

        tf_alumno_cuenta.setBackground(new java.awt.Color(255, 255, 255));
        tf_alumno_cuenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_crear_alumno.getContentPane().add(tf_alumno_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 270, 341, 24));

        jb_crear_alumno.setBackground(new java.awt.Color(255, 255, 255));
        jb_crear_alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_crear_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_alumnoActionPerformed(evt);
            }
        });
        jd_crear_alumno.getContentPane().add(jb_crear_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 393, -1, -1));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_crear_alumno.getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_modificar_alumno.setTitle("Modificar Alumno");
        jd_modificar_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Usuario:");
        jd_modificar_alumno.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 64, -1, -1));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Contraseña:");
        jd_modificar_alumno.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 106, -1, -1));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Nombre:");
        jd_modificar_alumno.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 148, -1, -1));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Carrera:");
        jd_modificar_alumno.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 190, -1, -1));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Rol:");
        jd_modificar_alumno.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 232, -1, -1));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Cuenta:");
        jd_modificar_alumno.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 274, -1, -1));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Clases Cursadas:");
        jd_modificar_alumno.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 316, -1, -1));

        tf_alumno_user_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_alumno.getContentPane().add(tf_alumno_user_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 60, 341, -1));

        tf_alumno_pass_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_alumno.getContentPane().add(tf_alumno_pass_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 102, 341, -1));

        tf_alumno_nombre_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_alumno.getContentPane().add(tf_alumno_nombre_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 144, 341, -1));

        tf_alumno_carrera_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_alumno.getContentPane().add(tf_alumno_carrera_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 186, 341, -1));

        tf_alumno_rol_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_alumno.getContentPane().add(tf_alumno_rol_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 228, 341, -1));

        tf_alumno_clases_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_alumno_clases_m.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_modificar_alumno.getContentPane().add(tf_alumno_clases_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 312, 341, 24));

        tf_alumno_cuenta_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_alumno_cuenta_m.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_modificar_alumno.getContentPane().add(tf_alumno_cuenta_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 270, 341, 24));

        jb_modificar_alumno.setBackground(new java.awt.Color(255, 255, 255));
        jb_modificar_alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_modificar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_alumnoActionPerformed(evt);
            }
        });
        jd_modificar_alumno.getContentPane().add(jb_modificar_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 393, -1, -1));
        jd_modificar_alumno.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_modificar_alumno.getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_listar_registros.setTitle("Listar Registro");
        jd_listar_registros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_registros.setModel(new DefaultListModel());
        jl_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_registrosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jl_registros);

        jd_listar_registros.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 419, 485));
        jd_listar_registros.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_listar_registros.getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jd_listar_alumnos.setTitle("Listar Alumnos");
        jd_listar_alumnos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_alumnos.setModel(new DefaultListModel());
        jl_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_alumnosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jl_alumnos);

        jd_listar_alumnos.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 419, 485));
        jd_listar_alumnos.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_listar_alumnos.getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jd_listar_maestros.setTitle("Listar Maestros");
        jd_listar_maestros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_maestros.setModel(new DefaultListModel());
        jl_maestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_maestrosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jl_maestros);

        jd_listar_maestros.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 419, 485));
        jd_listar_maestros.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_listar_maestros.getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        eliminar_registro.setText("Eliminar");
        eliminar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_registroActionPerformed(evt);
            }
        });
        popup_registro.add(eliminar_registro);

        modificar_registro.setText("Modificar");
        modificar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_registroActionPerformed(evt);
            }
        });
        popup_registro.add(modificar_registro);

        eliminar_alumno.setText("Eliminar");
        eliminar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_alumnoActionPerformed(evt);
            }
        });
        popup_alumno.add(eliminar_alumno);

        modificar_alumno.setText("Modificar");
        modificar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_alumnoActionPerformed(evt);
            }
        });
        popup_alumno.add(modificar_alumno);

        eliminar_maestro.setText("Eliminar");
        eliminar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_maestroActionPerformed(evt);
            }
        });
        popup_maestro.add(eliminar_maestro);

        modificar_maestro.setText("Modificar");
        modificar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_maestroActionPerformed(evt);
            }
        });
        popup_maestro.add(modificar_maestro);

        jd_crear_clase.setTitle("Crear Clase");
        jd_crear_clase.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_crear_clases.setBackground(new java.awt.Color(255, 255, 255));
        jb_crear_clases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_crear_clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_clasesActionPerformed(evt);
            }
        });
        jd_crear_clase.getContentPane().add(jb_crear_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 392, -1, -1));

        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Nombre:");
        jd_crear_clase.getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 47, -1, -1));

        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("ID:");
        jd_crear_clase.getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 89, -1, -1));

        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Hora:");
        jd_crear_clase.getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 132, -1, -1));

        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Unidades Valorativas:");
        jd_crear_clase.getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 176, -1, -1));

        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Semestre:");
        jd_crear_clase.getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 210, -1, -1));

        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Periodo:");
        jd_crear_clase.getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 254, -1, -1));

        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Año:");
        jd_crear_clase.getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 293, -1, -1));

        tf_clase_nombre.setBackground(new java.awt.Color(255, 255, 255));
        tf_clase_nombre.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_clase.getContentPane().add(tf_clase_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 43, 332, -1));

        tf_clase_id.setBackground(new java.awt.Color(255, 255, 255));
        tf_clase_id.setForeground(new java.awt.Color(0, 0, 0));
        tf_clase_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));
        jd_crear_clase.getContentPane().add(tf_clase_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 85, 332, 24));
        jd_crear_clase.getContentPane().add(tf_clase_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 127, 116, -1));
        jd_crear_clase.getContentPane().add(tf_clase_unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 171, 116, -1));
        jd_crear_clase.getContentPane().add(tf_clase_semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 205, 116, -1));
        jd_crear_clase.getContentPane().add(tf_clase_periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 249, 116, -1));

        tf_clase_year.setBackground(new java.awt.Color(204, 204, 204));
        jd_crear_clase.getContentPane().add(tf_clase_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 285, 116, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_crear_clase.getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_modificar_clase.setTitle("Modificar Clase");
        jd_modificar_clase.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_clase_nombre_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_clase_nombre_m.setForeground(new java.awt.Color(0, 0, 0));
        jd_modificar_clase.getContentPane().add(tf_clase_nombre_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 43, 332, -1));

        jb_modificar_clases.setBackground(new java.awt.Color(255, 255, 255));
        jb_modificar_clases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_modificar_clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_clasesActionPerformed(evt);
            }
        });
        jd_modificar_clase.getContentPane().add(jb_modificar_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 392, -1, -1));

        tf_clase_id_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_clase_id_m.setForeground(new java.awt.Color(0, 0, 0));
        tf_clase_id_m.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));
        jd_modificar_clase.getContentPane().add(tf_clase_id_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 85, 332, 24));

        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Nombre:");
        jd_modificar_clase.getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 47, -1, -1));

        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("ID:");
        jd_modificar_clase.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 89, -1, -1));
        jd_modificar_clase.getContentPane().add(tf_clase_hora_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 127, 116, -1));

        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Hora:");
        jd_modificar_clase.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 132, -1, -1));
        jd_modificar_clase.getContentPane().add(tf_clase_unidades_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 171, 116, -1));

        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("Unidades Valorativas:");
        jd_modificar_clase.getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 176, -1, -1));
        jd_modificar_clase.getContentPane().add(tf_clase_semestre_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 205, 116, -1));

        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("Semestre:");
        jd_modificar_clase.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 210, -1, -1));
        jd_modificar_clase.getContentPane().add(tf_clase_periodo_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 249, 116, -1));

        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Periodo:");
        jd_modificar_clase.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 254, -1, -1));

        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Año:");
        jd_modificar_clase.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 293, -1, -1));

        tf_clase_year_m.setBackground(new java.awt.Color(204, 204, 204));
        jd_modificar_clase.getContentPane().add(tf_clase_year_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 285, 116, -1));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_modificar_clase.getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_listar_clase.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_clases.setModel(new DefaultListModel());
        jl_clases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_clasesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_clases);

        jd_listar_clase.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 58, 386, 493));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_listar_clase.getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        eliminar_clase.setText("Eliminar");
        eliminar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_claseActionPerformed(evt);
            }
        });
        popup_clase.add(eliminar_clase);

        modificar_clase.setText("Modificar");
        modificar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_claseActionPerformed(evt);
            }
        });
        popup_clase.add(modificar_clase);

        jd_asignar_maestro.setTitle("Asignar Maestro");
        jd_asignar_maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_verMaestros.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_verMaestros);

        jd_asignar_maestro.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 82, 302, 495));

        jl_verClases.setModel(new DefaultListModel());
        jScrollPane6.setViewportView(jl_verClases);

        jd_asignar_maestro.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 82, 302, 495));

        jb_asignar_maestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/flecha.png"))); // NOI18N
        jb_asignar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asignar_maestroActionPerformed(evt);
            }
        });
        jd_asignar_maestro.getContentPane().add(jb_asignar_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 325, 137, 59));

        jLabel65.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Seleccione el maestro que desea asignar:");
        jd_asignar_maestro.getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, -1));

        jLabel66.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Seleccione la clase que lo desea asignar:");
        jd_asignar_maestro.getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 360, -1));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_asignar_maestro.getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 630));

        jd_asignar_alumno.setTitle("Asignar Alumno");
        jd_asignar_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_verAlumnos.setModel(new DefaultListModel());
        jScrollPane7.setViewportView(jl_verAlumnos);

        jd_asignar_alumno.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 110, 334, 479));

        jl_verClasesA.setModel(new DefaultListModel());
        jScrollPane8.setViewportView(jl_verClasesA);

        jd_asignar_alumno.getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 110, 330, 479));

        jb_asignar_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/flecha.png"))); // NOI18N
        jb_asignar_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asignar_alumnosActionPerformed(evt);
            }
        });
        jd_asignar_alumno.getContentPane().add(jb_asignar_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 265, 125, 59));

        jLabel76.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setText("Seleccione el estudiante que desea matricular:");
        jd_asignar_alumno.getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel77.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setText("Seleccione la clase que lo desea matricular:");
        jd_asignar_alumno.getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_asignar_alumno.getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 630));

        jf_alumno.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jf_alumno.setTitle("Alumno");
        jf_alumno.setSize(new java.awt.Dimension(1920, 1080));
        jf_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_alumnos_tareas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_alumnos_tareas.setForeground(new java.awt.Color(0, 0, 0));
        jb_alumnos_tareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tareas.png"))); // NOI18N
        jb_alumnos_tareas.setText("Tareas");
        jb_alumnos_tareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alumnos_tareasActionPerformed(evt);
            }
        });
        jf_alumno.getContentPane().add(jb_alumnos_tareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jb_alumnos_examenes.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_alumnos_examenes.setForeground(new java.awt.Color(0, 0, 0));
        jb_alumnos_examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/examenes.png"))); // NOI18N
        jb_alumnos_examenes.setText("Examenes");
        jf_alumno.getContentPane().add(jb_alumnos_examenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jb_alumnos_notas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_alumnos_notas.setForeground(new java.awt.Color(0, 0, 0));
        jb_alumnos_notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grado.png"))); // NOI18N
        jb_alumnos_notas.setText("Notas");
        jf_alumno.getContentPane().add(jb_alumnos_notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 120, -1, -1));

        jb_alumnos_foros.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_alumnos_foros.setForeground(new java.awt.Color(0, 0, 0));
        jb_alumnos_foros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/foro.png"))); // NOI18N
        jb_alumnos_foros.setText("Foros");
        jb_alumnos_foros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alumnos_forosActionPerformed(evt);
            }
        });
        jf_alumno.getContentPane().add(jb_alumnos_foros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, -1, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/unitec_logo.png"))); // NOI18N
        jf_alumno.getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 820, 310, 110));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/frame_wallpapers.jpg"))); // NOI18N
        jf_alumno.getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/unitec_logo.png"))); // NOI18N
        jf_alumno.getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 860, 310, 110));

        jMenu5.setText("Sesión");

        cerrar_sesion_alum.setText("Cerrar sesión");
        cerrar_sesion_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesion_alumActionPerformed(evt);
            }
        });
        jMenu5.add(cerrar_sesion_alum);

        cerrar_sistema_alum.setText("Cerrar el sistema");
        cerrar_sistema_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sistema_alumActionPerformed(evt);
            }
        });
        jMenu5.add(cerrar_sistema_alum);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jf_alumno.setJMenuBar(jMenuBar3);

        jd_entregar_tarea.setTitle("Entregar Tarea");
        jd_entregar_tarea.setMinimumSize(new java.awt.Dimension(1166, 792));
        jd_entregar_tarea.setSize(new java.awt.Dimension(1166, 792));

        tarea_alum_titulo.setEditable(false);

        tarea_alum_desc.setEditable(false);
        tarea_alum_desc.setColumns(20);
        tarea_alum_desc.setRows(5);
        jScrollPane10.setViewportView(tarea_alum_desc);

        examinar_equipo.setText("Examinar mi Equipo");
        examinar_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examinar_equipoActionPerformed(evt);
            }
        });

        jb_entregar_tarea.setText("Entregar");
        jb_entregar_tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entregar_tareaActionPerformed(evt);
            }
        });

        label_tarea.setText("Tarea");

        javax.swing.GroupLayout jd_entregar_tareaLayout = new javax.swing.GroupLayout(jd_entregar_tarea.getContentPane());
        jd_entregar_tarea.getContentPane().setLayout(jd_entregar_tareaLayout);
        jd_entregar_tareaLayout.setHorizontalGroup(
            jd_entregar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_entregar_tareaLayout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addGroup(jd_entregar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_entregar_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_entregar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                        .addComponent(tarea_alum_titulo))
                    .addGroup(jd_entregar_tareaLayout.createSequentialGroup()
                        .addComponent(examinar_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(label_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
        );
        jd_entregar_tareaLayout.setVerticalGroup(
            jd_entregar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_entregar_tareaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(tarea_alum_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jd_entregar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(examinar_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_tarea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jb_entregar_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        jd_verTareas_alumnos.setBounds(new java.awt.Rectangle(1053, 703, 703, 703));
        jd_verTareas_alumnos.setMinimumSize(new java.awt.Dimension(1053, 703));
        jd_verTareas_alumnos.setPreferredSize(new java.awt.Dimension(1053, 703));
        jd_verTareas_alumnos.setSize(new java.awt.Dimension(1053, 703));

        jl_verMisTareas.setModel(new DefaultListModel());
        jScrollPane11.setViewportView(jl_verMisTareas);

        jb_entregarMiTarea.setText("Entregar Tarea");
        jb_entregarMiTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entregarMiTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_verTareas_alumnosLayout = new javax.swing.GroupLayout(jd_verTareas_alumnos.getContentPane());
        jd_verTareas_alumnos.getContentPane().setLayout(jd_verTareas_alumnosLayout);
        jd_verTareas_alumnosLayout.setHorizontalGroup(
            jd_verTareas_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_verTareas_alumnosLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jd_verTareas_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .addComponent(jb_entregarMiTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_verTareas_alumnosLayout.setVerticalGroup(
            jd_verTareas_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_verTareas_alumnosLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jb_entregarMiTarea)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tf_alumno_foroTitulo.setEditable(false);
        tf_alumno_foroTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        ta_alumno_foroDesc.setEditable(false);
        ta_alumno_foroDesc.setColumns(20);
        ta_alumno_foroDesc.setRows(5);
        jScrollPane13.setViewportView(ta_alumno_foroDesc);

        ta_alumnos_aportes.setEditable(false);
        ta_alumnos_aportes.setColumns(20);
        ta_alumnos_aportes.setRows(5);
        jScrollPane14.setViewportView(ta_alumnos_aportes);

        jLabel83.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel83.setText("Aportes");

        ta_alumnos_miAporte.setColumns(20);
        ta_alumnos_miAporte.setRows(5);
        jScrollPane15.setViewportView(ta_alumnos_miAporte);

        jb_alumno_ingresarAporte.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jb_alumno_ingresarAporte.setText("Ingresar Aporte");
        jb_alumno_ingresarAporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alumno_ingresarAporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_alumno_foroLayout = new javax.swing.GroupLayout(jd_alumno_foro.getContentPane());
        jd_alumno_foro.getContentPane().setLayout(jd_alumno_foroLayout);
        jd_alumno_foroLayout.setHorizontalGroup(
            jd_alumno_foroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_alumno_foroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_alumno_foroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_alumno_ingresarAporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane15)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 1235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13)
                    .addComponent(tf_alumno_foroTitulo)
                    .addComponent(jLabel83))
                .addGap(550, 550, 550))
        );
        jd_alumno_foroLayout.setVerticalGroup(
            jd_alumno_foroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_alumno_foroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tf_alumno_foroTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel83)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_alumno_ingresarAporte, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jd_verMisForos.setMinimumSize(new java.awt.Dimension(1047, 691));
        jd_verMisForos.setSize(new java.awt.Dimension(1047, 691));

        jl_verMisForos.setModel(new DefaultListModel());
        jScrollPane16.setViewportView(jl_verMisForos);

        jb_abrirForo.setText("Abrir Foro");
        jb_abrirForo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abrirForoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_verMisForosLayout = new javax.swing.GroupLayout(jd_verMisForos.getContentPane());
        jd_verMisForos.getContentPane().setLayout(jd_verMisForosLayout);
        jd_verMisForosLayout.setHorizontalGroup(
            jd_verMisForosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_verMisForosLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jd_verMisForosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .addComponent(jb_abrirForo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jd_verMisForosLayout.setVerticalGroup(
            jd_verMisForosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_verMisForosLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jb_abrirForo)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jf_maestros.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jf_maestros.setTitle("Maestros");
        jf_maestros.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jf_maestros.setSize(new java.awt.Dimension(1920, 1080));
        jf_maestros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_maestros_tareas1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_maestros_tareas1.setForeground(new java.awt.Color(0, 0, 0));
        jb_maestros_tareas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tareas.png"))); // NOI18N
        jb_maestros_tareas1.setText("Tareas");
        jb_maestros_tareas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_maestros_tareas1ActionPerformed(evt);
            }
        });
        jf_maestros.getContentPane().add(jb_maestros_tareas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jb_maestros_examenes1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_maestros_examenes1.setForeground(new java.awt.Color(0, 0, 0));
        jb_maestros_examenes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/examenes.png"))); // NOI18N
        jb_maestros_examenes1.setText("Examenes");
        jf_maestros.getContentPane().add(jb_maestros_examenes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));

        jb_maestros_notas1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_maestros_notas1.setForeground(new java.awt.Color(0, 0, 0));
        jb_maestros_notas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grado.png"))); // NOI18N
        jb_maestros_notas1.setText("Notas");
        jf_maestros.getContentPane().add(jb_maestros_notas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 130, -1, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/unitec_logo.png"))); // NOI18N
        jf_maestros.getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 820, 310, 110));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/frame_wallpapers.jpg"))); // NOI18N
        jf_maestros.getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("jButton1");
        jf_maestros.getContentPane().add(jButton1);

        jButton2.setText("jButton2");
        jf_maestros.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

        jButton3.setText("jButton3");
        jf_maestros.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, -1, -1));

        jButton4.setText("jButton4");
        jf_maestros.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 560, -1, -1));

        jButton5.setText("jButton5");
        jf_maestros.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, -1, -1));

        jMenu7.setText("Sesión");

        cerrar_sesion_maestro.setText("Cerrar sesión");
        cerrar_sesion_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesion_maestroActionPerformed(evt);
            }
        });
        jMenu7.add(cerrar_sesion_maestro);

        cerrar_sistema_maesrto.setText("Cerrar el sistema");
        cerrar_sistema_maesrto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sistema_maesrtoActionPerformed(evt);
            }
        });
        jMenu7.add(cerrar_sistema_maesrto);

        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jf_maestros.setJMenuBar(jMenuBar4);

        jd_asignar_tarea.setMinimumSize(new java.awt.Dimension(1166, 792));
        jd_asignar_tarea.setSize(new java.awt.Dimension(1166, 792));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("Asignar Nueva Tarea");

        jLabel6.setText("Fecha Final:");

        jLabel7.setText("Hora FInal:");

        jLabel82.setText("Titulo de Tarea:");

        Descripcion.setText("Descripcion:");

        tarea_descripcion.setColumns(20);
        tarea_descripcion.setRows(5);
        jScrollPane9.setViewportView(tarea_descripcion);

        jb_asignar_tarea.setText("Asignar");
        jb_asignar_tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asignar_tareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_asignar_tareaLayout = new javax.swing.GroupLayout(jd_asignar_tarea.getContentPane());
        jd_asignar_tarea.getContentPane().setLayout(jd_asignar_tareaLayout);
        jd_asignar_tareaLayout.setHorizontalGroup(
            jd_asignar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_asignar_tareaLayout.createSequentialGroup()
                .addGroup(jd_asignar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_asignar_tareaLayout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel5))
                    .addGroup(jd_asignar_tareaLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(jd_asignar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel82)
                            .addComponent(Descripcion))
                        .addGap(18, 18, 18)
                        .addGroup(jd_asignar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tarea_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tarea_hora)
                            .addComponent(tarea_titulo)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_asignar_tareaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jb_asignar_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_asignar_tareaLayout.setVerticalGroup(
            jd_asignar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_asignar_tareaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addGroup(jd_asignar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_asignar_tareaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6))
                    .addComponent(tarea_date, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jd_asignar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tarea_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jd_asignar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(tarea_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jd_asignar_tareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_asignar_tareaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Descripcion))
                    .addGroup(jd_asignar_tareaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jb_asignar_tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jd_verClases_maestros.setMinimumSize(new java.awt.Dimension(1053, 703));
        jd_verClases_maestros.setSize(new java.awt.Dimension(1053, 703));

        jl_asignar_clases.setModel(new DefaultListModel());
        jScrollPane12.setViewportView(jl_asignar_clases);

        jb_asginat_tarea.setText("Asignar Tarea");
        jb_asginat_tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asginat_tareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_verClases_maestrosLayout = new javax.swing.GroupLayout(jd_verClases_maestros.getContentPane());
        jd_verClases_maestros.getContentPane().setLayout(jd_verClases_maestrosLayout);
        jd_verClases_maestrosLayout.setHorizontalGroup(
            jd_verClases_maestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_verClases_maestrosLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jd_verClases_maestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
                    .addComponent(jb_asginat_tarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_verClases_maestrosLayout.setVerticalGroup(
            jd_verClases_maestrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_verClases_maestrosLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jb_asginat_tarea)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn");
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(137, 159, 165));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_login.setBackground(new java.awt.Color(255, 255, 255));
        jb_login.setForeground(new java.awt.Color(0, 0, 0));
        jb_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login_button.png"))); // NOI18N
        jb_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_loginActionPerformed(evt);
            }
        });
        jPanel2.add(jb_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 258, 480, 50));

        tf_user_login.setBackground(new java.awt.Color(255, 255, 255));
        tf_user_login.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        tf_user_login.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tf_user_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 480, 40));

        tf_pass_login.setBackground(new java.awt.Color(255, 255, 255));
        tf_pass_login.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        tf_pass_login.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tf_pass_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 480, 40));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONTRASEÑA:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, -1));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("USUARIO:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 500, 330));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/registro_background.png"))); // NOI18N
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_loginActionPerformed
        // TODO add your handling code here:
        try {
            String user = tf_user_login.getText();
            String pass = tf_pass_login.getText();
            boolean found = false;
            administrarRegistros ap = new administrarRegistros("./registro.txt");
            ap.cargarArchivo();
            for (int i = 0; i < ap.getListaRegistros().size(); i++) {

                if (ap.getListaRegistros().get(i).getUsername().equals(user) && ap.getListaRegistros().get(i).getPassword().equals(pass)) {
                    jf_registro.pack();
                    jf_registro.setLocationRelativeTo(this);
                    jf_registro.setExtendedState(MAXIMIZED_BOTH);
                    jf_registro.setVisible(true);
                    this.hide();
                    found = true;
                    tf_user_login.setText("");
                    tf_pass_login.setText("");
                }
            }
            administrarMaestros ap1 = new administrarMaestros("./maestros.cbm");
            ap1.cargarArchivo();
            for (int i = 0; i < ap1.getListaMaestros().size(); i++) {
                if (ap1.getListaMaestros().get(i).getUsername().equals(user) && ap1.getListaMaestros().get(i).getPassword().equals(pass)) {
                    maestroAsig = ap1.getListaMaestros().get(i);
                    indexMaestro = i;
                    jf_maestros.pack();
                    jf_maestros.setLocationRelativeTo(this);
                    jf_maestros.setExtendedState(MAXIMIZED_BOTH);
                    jf_maestros.setVisible(true);
                    this.hide();
                    found = true;
                    tf_user_login.setText("");
                    tf_pass_login.setText("");
                    found = true;
                }
            }
            administrarAlumnos ap2 = new administrarAlumnos("./alumnos.cbm");
            ap2.cargarArchivo();
            for (int i = 0; i < ap2.getListaAlumnos().size(); i++) {
                if (ap2.getListaAlumnos().get(i).getUsername().equals(user) && ap2.getListaAlumnos().get(i).getPassword().equals(pass)) {
                    estudianteAsig = ap2.getListaAlumnos().get(i);
                    indexEstudiante = i;
                    jf_alumno.pack();
                    jf_alumno.setLocationRelativeTo(this);
                    jf_alumno.setExtendedState(MAXIMIZED_BOTH);
                    jf_alumno.setVisible(true);
                    this.hide();
                    found = true;
                    tf_user_login.setText("");
                    tf_pass_login.setText("");
                    found = true;
                }
            }
            if (found == false) {
                JOptionPane.showMessageDialog(this, "USUARIO NO ENCONTRADO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_loginActionPerformed

    private void cerrar_sesion_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesion_registroActionPerformed
        // TODO add your handling code here:        
        int response = JOptionPane.showConfirmDialog(this.getFrames()[0], "Seguro que desea Salirse?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.OK_OPTION) {
            jf_registro.dispose();
            this.setVisible(true);
        }
    }//GEN-LAST:event_cerrar_sesion_registroActionPerformed

    private void cerrar_sistema_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sistema_registroActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrar_sistema_registroActionPerformed

    private void registro_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro_agregarActionPerformed
        // TODO add your handling code here:
        jd_crear_registro.setModal(true);
        jd_crear_registro.pack();
        jd_crear_registro.setLocationRelativeTo(this);
        jd_crear_registro.setVisible(true);
    }//GEN-LAST:event_registro_agregarActionPerformed

    private void maestro_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maestro_agregarActionPerformed
        // TODO add your handling code here:
        jd_crear_maestro.setModal(true);
        jd_crear_maestro.pack();
        jd_crear_maestro.setLocationRelativeTo(this);
        jd_crear_maestro.setVisible(true);
    }//GEN-LAST:event_maestro_agregarActionPerformed

    private void alumnos_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_agregarActionPerformed
        // TODO add your handling code here:
        jd_crear_alumno.setModal(true);
        jd_crear_alumno.pack();
        jd_crear_alumno.setLocationRelativeTo(this);
        jd_crear_alumno.setVisible(true);
    }//GEN-LAST:event_alumnos_agregarActionPerformed

    private void registro_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro_modificarActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_registros.getModel();
        modelo.removeAllElements();
        administrarRegistros ap = new administrarRegistros("./registro.txt");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaRegistros().size(); i++) {
            modelo.addElement(ap.getListaRegistros().get(i));
        }
        jl_registros.setModel(modelo);

        jd_listar_registros.setModal(true);
        jd_listar_registros.pack();
        jd_listar_registros.setLocationRelativeTo(this);
        jd_listar_registros.setVisible(true);
    }//GEN-LAST:event_registro_modificarActionPerformed

    private void maestro_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maestro_modificarActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_maestros.getModel();
        modelo.removeAllElements();
        administrarMaestros ap = new administrarMaestros("./maestros.cbm");
        ap.cargarArchivo();

        for (int i = 0; i < ap.getListaMaestros().size(); i++) {
            modelo.addElement(ap.getListaMaestros().get(i));
        }
        jl_maestros.setModel(modelo);
        jd_listar_maestros.setModal(true);
        jd_listar_maestros.pack();
        jd_listar_maestros.setLocationRelativeTo(this);
        jd_listar_maestros.setVisible(true);
    }//GEN-LAST:event_maestro_modificarActionPerformed

    private void alumnos_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_modificarActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_alumnos.getModel();
        modelo.removeAllElements();
        administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaAlumnos().size(); i++) {
            modelo.addElement(ap.getListaAlumnos().get(i));
        }
        jl_alumnos.setModel(modelo);

        jd_listar_alumnos.setModal(true);
        jd_listar_alumnos.pack();
        jd_listar_alumnos.setLocationRelativeTo(this);
        jd_listar_alumnos.setVisible(true);
    }//GEN-LAST:event_alumnos_modificarActionPerformed

    private void jb_crear_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_registroActionPerformed
        // TODO add your handling code here:
        try {
            String username = tf_registro_user.getText();
            String password = tf_registro_pass.getText();
            Registro p = new Registro(username, password);
            administrarRegistros ap = new administrarRegistros("./registro.txt");
            ap.cargarArchivo();
            ap.getListaRegistros().add(p);
            ap.escribirArchivo();
            tf_registro_user.setText("");
            tf_registro_pass.setText("");
            jd_crear_registro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_crear_registroActionPerformed

    private void jb_crear_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_maestroActionPerformed
        // TODO add your handling code here:
        try {
            String username = tf_maestro_user.getText();
            String password = tf_maestro_pass.getText();
            String nombre = tf_maestro_nombre.getText();
            String profesion = tf_maestro_profesion.getText();
            String rol = tf_maestro_rol.getText();
            int id = Integer.parseInt(tf_maestro_id.getText());
            double sueldo = Double.parseDouble(tf_maestro_sueldo.getText());
            Maestro p = new Maestro(nombre, username, password, profesion, rol, id, sueldo);
            administrarMaestros ap = new administrarMaestros("./maestros.cbm");
            ap.cargarArchivo();
            ap.setMaestro(p);
            ap.escribirArchivo();
            tf_maestro_user.setText("");
            tf_maestro_pass.setText("");
            tf_maestro_nombre.setText("");
            tf_maestro_profesion.setText("");
            tf_maestro_rol.setText("");
            tf_maestro_id.setText("");
            tf_maestro_sueldo.setText("");
            jd_crear_maestro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_crear_maestroActionPerformed

    private void jb_crear_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_alumnoActionPerformed
        // TODO add your handling code here:
        try {
            String username = tf_alumno_user.getText();
            String password = tf_alumno_pass.getText();
            String nombre = tf_alumno_nombre.getText();
            String carrers = tf_alumno_carrera.getText();
            String rol = tf_alumno_rol.getText();
            int cuenta = Integer.parseInt(tf_alumno_cuenta.getText());
            int clasesCursadas = Integer.parseInt(tf_alumno_clases.getText());
            Alumno p = new Alumno(username, password, nombre, carrers, rol, cuenta, clasesCursadas);
            administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
            ap.cargarArchivo();
            ap.setAlumno(p);
            ap.escribirArchivo();
            tf_alumno_user.setText("");
            tf_alumno_pass.setText("");
            tf_alumno_nombre.setText("");
            tf_alumno_carrera.setText("");
            tf_alumno_rol.setText("");
            tf_alumno_cuenta.setText("");
            tf_alumno_clases.setText("");
            jd_crear_alumno.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_crear_alumnoActionPerformed

    private void jl_registrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_registrosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_registros.getSelectedIndex() >= 0) {
                popup_registro.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_registrosMouseClicked

    private void eliminar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_registroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_registros.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jl_registros.getModel();
            modelo.remove(po);
            jl_registros.setModel(modelo);
            administrarRegistros ap = new administrarRegistros("./registro.txt");
            ap.cargarArchivo();
            ap.getListaRegistros().remove(po);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_registroActionPerformed

    private void modificar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_registroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_registros.getSelectedIndex();
            administrarRegistros ap = new administrarRegistros("./registro.txt");
            ap.cargarArchivo();
            Registro x = ap.getListaRegistros().get(po);
            tf_registro_user_m.setText(x.getUsername());
            tf_registro_pass_m.setText(x.getPassword());
            jd_modificar_registro.setModal(true);
            jd_modificar_registro.pack();
            jd_modificar_registro.setLocationRelativeTo(this);
            jd_modificar_registro.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_registroActionPerformed

    private void jb_modificar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_registroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_registros.getSelectedIndex();
            administrarRegistros ap = new administrarRegistros("./registro.txt");
            ap.cargarArchivo();
            String username = tf_registro_user_m.getText();
            String password = tf_registro_pass_m.getText();
            ap.getListaRegistros().get(po).setPassword(password);
            ap.getListaRegistros().get(po).setUsername(username);
            ap.escribirArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_registros.getModel();
            modelo.set(po, ap.getListaRegistros().get(po));
            jl_registros.setModel(modelo);
            jd_modificar_registro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_registroActionPerformed

    private void jl_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_alumnosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_alumnos.getSelectedIndex() >= 0) {
                popup_alumno.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_alumnosMouseClicked

    private void eliminar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_alumnoActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_alumnos.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jl_alumnos.getModel();
            modelo.remove(po);
            jl_alumnos.setModel(modelo);
            administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
            ap.cargarArchivo();
            ap.getListaAlumnos().remove(po);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_alumnoActionPerformed

    private void modificar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_alumnoActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_alumnos.getSelectedIndex();
            administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
            ap.cargarArchivo();
            Alumno x = ap.getListaAlumnos().get(po);
            tf_alumno_user_m.setText(x.getUsername());
            tf_alumno_pass_m.setText(x.getPassword());
            tf_alumno_nombre_m.setText(x.getNombre());
            tf_alumno_carrera_m.setText(x.getCarrera());
            tf_alumno_rol_m.setText(x.getRol());
            tf_alumno_cuenta_m.setText(String.valueOf(x.getCuenta()));
            tf_alumno_clases_m.setText(String.valueOf(x.getClasesCursadas()));
            jd_modificar_alumno.setModal(true);
            jd_modificar_alumno.pack();
            jd_modificar_alumno.setLocationRelativeTo(this);
            jd_modificar_alumno.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_alumnoActionPerformed

    private void jb_modificar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_alumnoActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_alumnos.getSelectedIndex();
            administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
            ap.cargarArchivo();
            String username = tf_alumno_user_m.getText();
            String password = tf_alumno_pass_m.getText();
            String nombre = tf_alumno_nombre_m.getText();
            String carrera = tf_alumno_carrera_m.getText();
            String rol = tf_alumno_rol_m.getText();
            int cuenta = Integer.parseInt(tf_alumno_cuenta_m.getText());
            int clasesCursadas = Integer.parseInt(tf_alumno_clases_m.getText());
            ap.getListaAlumnos().get(po).setUsername(username);
            ap.getListaAlumnos().get(po).setPassword(password);
            ap.getListaAlumnos().get(po).setNombre(nombre);
            ap.getListaAlumnos().get(po).setCarrera(carrera);
            ap.getListaAlumnos().get(po).setRol(rol);
            ap.getListaAlumnos().get(po).setCuenta(cuenta);
            ap.getListaAlumnos().get(po).setClasesCursadas(clasesCursadas);
            ap.escribirArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_alumnos.getModel();
            modelo.set(po, ap.getListaAlumnos().get(po));
            jl_alumnos.setModel(modelo);
            jd_modificar_alumno.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_alumnoActionPerformed

    private void jl_maestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_maestrosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_maestros.getSelectedIndex() >= 0) {
                popup_maestro.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_maestrosMouseClicked

    private void eliminar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_maestroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_maestros.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jl_maestros.getModel();
            modelo.remove(po);
            jl_maestros.setModel(modelo);
            administrarMaestros ap = new administrarMaestros("./maestros.cbm");
            ap.cargarArchivo();
            ap.getListaMaestros().remove(po);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_maestroActionPerformed

    private void modificar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_maestroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_maestros.getSelectedIndex();
            administrarMaestros ap = new administrarMaestros("./maestros.cbm");
            ap.cargarArchivo();
            Maestro x = ap.getListaMaestros().get(po);
            tf_maestro_user_m.setText(x.getUsername());
            tf_maestro_pass_m.setText(x.getPassword());
            tf_maestro_nombre_m.setText(x.getNombre());
            tf_maestro_profesion_m.setText(x.getProfesion());
            tf_maestro_rol_m.setText(x.getRol());
            tf_maestro_id_m.setText(String.valueOf(x.getId()));
            tf_maestro_sueldo_m.setText(String.valueOf(x.getSueldo()));
            jd_modificar_maestro.setModal(true);
            jd_modificar_maestro.pack();
            jd_modificar_maestro.setLocationRelativeTo(this);
            jd_modificar_maestro.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_maestroActionPerformed

    private void jb_modificar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_maestroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_maestros.getSelectedIndex();
            administrarMaestros ap = new administrarMaestros("./maestros.cbm");
            ap.cargarArchivo();
            String username = tf_maestro_user_m.getText();
            String password = tf_maestro_pass_m.getText();
            String nombre = tf_maestro_nombre_m.getText();
            String profesion = tf_maestro_profesion_m.getText();
            String rol = tf_maestro_rol_m.getText();
            int id = Integer.parseInt(tf_maestro_id_m.getText());
            double sueldo = Double.parseDouble(tf_maestro_sueldo_m.getText());
            ap.getListaMaestros().get(po).setUsername(username);
            ap.getListaMaestros().get(po).setPassword(password);
            ap.getListaMaestros().get(po).setNombre(nombre);
            ap.getListaMaestros().get(po).setProfesion(profesion);
            ap.getListaMaestros().get(po).setRol(rol);
            ap.getListaMaestros().get(po).setId(id);
            ap.getListaMaestros().get(po).setSueldo(sueldo);
            ap.escribirArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_maestros.getModel();
            modelo.set(po, ap.getListaMaestros().get(po));
            jl_maestros.setModel(modelo);
            jd_modificar_maestro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_maestroActionPerformed

    private void clases_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clases_agregarActionPerformed
        // TODO add your handling code here:
        jd_crear_clase.setModal(true);
        jd_crear_clase.pack();
        jd_crear_clase.setLocationRelativeTo(this);
        jd_crear_clase.setVisible(true);
    }//GEN-LAST:event_clases_agregarActionPerformed

    private void clases_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clases_modificarActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_clases.getModel();
        modelo.removeAllElements();
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            modelo.addElement(ap.getListaClases().get(i));
        }
        jl_clases.setModel(modelo);

        jd_listar_clase.setModal(true);
        jd_listar_clase.pack();
        jd_listar_clase.setLocationRelativeTo(this);
        jd_listar_clase.setVisible(true);
    }//GEN-LAST:event_clases_modificarActionPerformed

    private void jb_crear_clasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_clasesActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = tf_clase_nombre.getText();
            int id = Integer.parseInt(tf_clase_id.getText());
            int hora = (int) tf_clase_hora.getValue();
            int unidades = (int) tf_clase_unidades.getValue();
            int semestre = (int) tf_clase_semestre.getValue();
            int periodo = (int) tf_clase_periodo.getValue();
            int year = tf_clase_year.getYear();
            Maestro maestro = null;
            Clase p = new Clase(nombre, id, hora, unidades, semestre, periodo, year, maestro);
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            ap.setClase(p);
            ap.escribirArchivo();
            tf_clase_nombre.setText("");
            tf_clase_id.setText("");
            tf_clase_hora.setValue(0);
            tf_clase_unidades.setValue(0);
            tf_clase_semestre.setValue(0);
            tf_clase_periodo.setValue(0);
            tf_clase_year.setYear(2021);
            jd_crear_clase.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_crear_clasesActionPerformed

    private void jb_modificar_clasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_clasesActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_clases.getSelectedIndex();
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            String nombre = tf_clase_nombre_m.getText();
            int id = Integer.parseInt(tf_clase_id_m.getText());
            int hora = (int) tf_clase_hora_m.getValue();
            int unidades = (int) tf_clase_unidades_m.getValue();
            int semestre = (int) tf_clase_semestre_m.getValue();
            int periodo = (int) tf_clase_periodo_m.getValue();
            int year = tf_clase_year_m.getYear();
            ap.getListaClases().get(po).setHora(hora);
            ap.getListaClases().get(po).setId(id);
            ap.getListaClases().get(po).setNombre(nombre);
            ap.getListaClases().get(po).setPeriodo(periodo);
            ap.getListaClases().get(po).setSemestre(semestre);
            ap.getListaClases().get(po).setUnidades(unidades);
            ap.getListaClases().get(po).setYear(year);
            ap.escribirArchivo();
            //
            DefaultListModel modelo = (DefaultListModel) jl_clases.getModel();
            modelo.set(po, ap.getListaClases().get(po));
            jl_clases.setModel(modelo);
            jd_modificar_clase.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_clasesActionPerformed

    private void jl_clasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_clasesMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_clases.getSelectedIndex() >= 0) {
                popup_clase.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_clasesMouseClicked

    private void eliminar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_claseActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_clases.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jl_clases.getModel();
            modelo.remove(po);
            jl_clases.setModel(modelo);
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            ap.getListaClases().remove(po);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_claseActionPerformed

    private void modificar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_claseActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_clases.getSelectedIndex();
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            Clase x = ap.getListaClases().get(po);
            tf_clase_nombre_m.setText(x.getNombre());
            tf_clase_id_m.setText(String.valueOf(x.getId()));
            tf_clase_hora_m.setValue(x.getHora());
            tf_clase_unidades_m.setValue(x.getUnidades());
            tf_clase_semestre_m.setValue(x.getSemestre());
            tf_clase_periodo_m.setValue(x.getPeriodo());
            tf_clase_year_m.setYear(x.getYear());

            jd_modificar_clase.setModal(true);
            jd_modificar_clase.pack();
            jd_modificar_clase.setLocationRelativeTo(this);
            jd_modificar_clase.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_claseActionPerformed

    private void asignar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignar_maestroActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_verMaestros.getModel();
        modelo.removeAllElements();
        administrarMaestros ap = new administrarMaestros("./maestros.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaMaestros().size(); i++) {
            modelo.addElement(ap.getListaMaestros().get(i));
        }
        jl_verMaestros.setModel(modelo);

        DefaultListModel modelo1 = (DefaultListModel) jl_verClases.getModel();
        modelo1.removeAllElements();
        administrarClases ap1 = new administrarClases("./clases.cbm");
        ap1.cargarArchivo();
        for (int i = 0; i < ap1.getListaClases().size(); i++) {
            modelo1.addElement(ap1.getListaClases().get(i));
        }
        jl_verClases.setModel(modelo1);

        jd_asignar_maestro.setModal(true);
        jd_asignar_maestro.pack();
        jd_asignar_maestro.setLocationRelativeTo(this);
        jd_asignar_maestro.setVisible(true);
    }//GEN-LAST:event_asignar_maestroActionPerformed

    private void asignar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignar_alumnoActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_verAlumnos.getModel();
        modelo.removeAllElements();
        administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaAlumnos().size(); i++) {
            modelo.addElement(ap.getListaAlumnos().get(i));
        }
        jl_verAlumnos.setModel(modelo);

        DefaultListModel modelo1 = (DefaultListModel) jl_verClasesA.getModel();
        modelo1.removeAllElements();
        administrarClases ap1 = new administrarClases("./clases.cbm");
        ap1.cargarArchivo();
        for (int i = 0; i < ap1.getListaClases().size(); i++) {
            modelo1.addElement(ap1.getListaClases().get(i));
        }
        jl_verClasesA.setModel(modelo1);

        jd_asignar_alumno.setModal(true);
        jd_asignar_alumno.pack();
        jd_asignar_alumno.setLocationRelativeTo(this);
        jd_asignar_alumno.setVisible(true);
    }//GEN-LAST:event_asignar_alumnoActionPerformed

    private void jb_asignar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asignar_maestroActionPerformed
        // TODO add your handling code here:
        try {
            if (jl_verMaestros.getSelectedIndex() >= 0 && jl_verClases.getSelectedIndex() >= 0) {
                administrarMaestros ap = new administrarMaestros("./maestros.cbm");
                ap.cargarArchivo();
                administrarClases ap1 = new administrarClases("./clases.cbm");
                ap1.cargarArchivo();
                int po = jl_verMaestros.getSelectedIndex();
                int po2 = jl_verClases.getSelectedIndex();

                Maestro x = ap.getListaMaestros().get(po);
                ap1.getListaClases().get(po2).setMaestro(x);
                JOptionPane.showMessageDialog(this, "SE HA ASIGNADO EXITOSAMENTE");

                ap1.escribirArchivo();
                DefaultListModel modelo = (DefaultListModel) jl_verClases.getModel();
                modelo.set(po2, ap1.getListaClases().get(po2));
                jl_verClases.setModel(modelo);
                //System.out.println(ap1.getListaClases());
            } else {
                JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR DE AMBOS LADOS");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_asignar_maestroActionPerformed

    private void jb_asignar_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asignar_alumnosActionPerformed
        // TODO add your handling code here:
        try {
            if (jl_verAlumnos.getSelectedIndex() >= 0 && jl_verClasesA.getSelectedIndex() >= 0) {
                administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
                ap.cargarArchivo();
                administrarClases ap1 = new administrarClases("./clases.cbm");
                ap1.cargarArchivo();
                int po = jl_verAlumnos.getSelectedIndex();
                int po2 = jl_verClasesA.getSelectedIndex();
                boolean found = false;
                for (int i = 0; i < ap1.getListaClases().get(po2).getAlumnos().size(); i++) {
                    if (ap1.getListaClases().get(po2).getAlumnos().get(i).getNombre().equals(ap.getListaAlumnos().get(po).getNombre())
                            && ap1.getListaClases().get(po2).getAlumnos().get(i).getUsername().equals(ap.getListaAlumnos().get(po).getUsername())
                            && ap1.getListaClases().get(po2).getAlumnos().get(i).getPassword().equals(ap.getListaAlumnos().get(po).getPassword())) {
                        found = true;
                    }
                }
                if (found == true) {
                    JOptionPane.showMessageDialog(this, "YA ESTA ASIGNADO A ESTA CLASE");
                } else {
                    ap1.getListaClases().get(po2).getAlumnos().add(ap.getListaAlumnos().get(po));
                    JOptionPane.showMessageDialog(this, "SE HA ASIGNADO EXITOSAMENTE");
                }
                ap1.escribirArchivo();
                DefaultListModel modelo = (DefaultListModel) jl_verClasesA.getModel();
                modelo.set(po2, ap1.getListaClases().get(po2));
                jl_verClasesA.setModel(modelo);
                //System.out.println(ap1.getListaClases());
            } else {
                JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR DE AMBOS LADOS");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_asignar_alumnosActionPerformed

    private void cerrar_sesion_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesion_alumActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this.getFrames()[0], "Seguro que desea Salirse?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.OK_OPTION) {
            jf_alumno.dispose();
            this.setVisible(true);
        }
    }//GEN-LAST:event_cerrar_sesion_alumActionPerformed

    private void cerrar_sistema_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sistema_alumActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrar_sistema_alumActionPerformed

    private void cerrar_sesion_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesion_maestroActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this.getFrames()[0], "Seguro que desea Salirse?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.OK_OPTION) {
            jf_maestros.dispose();
            this.setVisible(true);
        }
    }//GEN-LAST:event_cerrar_sesion_maestroActionPerformed

    private void cerrar_sistema_maesrtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sistema_maesrtoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrar_sistema_maesrtoActionPerformed

    private void jb_alumnos_tareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alumnos_tareasActionPerformed
        // TODO add your handling code here:
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        boolean found = false;
        DefaultListModel modelo = (DefaultListModel) jl_verMisTareas.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            boolean esta = false;
            for (int j = 0; j < ap.getListaClases().get(i).getAlumnos().size(); j++) {
                if (ap.getListaClases().get(i).getAlumnos().get(j).getUsername().equals(estudianteAsig.getUsername())) {
                    esta = true;
                }
            }
            if (esta) {
                esta = false;
                for (int j = 0; j < ap.getListaClases().get(i).getTareas().size(); j++) {
                    for (int k = 0; k < ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().size(); k++) {
                        if (ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().get(k).getEstudiante().getUsername().equals(estudianteAsig.getUsername())) {
                            found = true;
                        }
                    }
                    Date fecha = new Date();
                    if (found == false && fecha.before(ap.getListaClases().get(i).getTareas().get(j).getFechaFinal())) {
                        modelo.addElement(ap.getListaClases().get(i).getTareas().get(j));
                    }
                    found = false;
                }
            }
        }
        jl_verMisTareas.setModel(modelo);

        jd_verTareas_alumnos.setModal(true);
        jd_verTareas_alumnos.pack();
        jd_verTareas_alumnos.setLocationRelativeTo(this);
        jd_verTareas_alumnos.setVisible(true);
    }//GEN-LAST:event_jb_alumnos_tareasActionPerformed

    private void jb_maestros_tareas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_maestros_tareas1ActionPerformed
        // TODO add your handling code here:
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        DefaultListModel modelo = (DefaultListModel) jl_asignar_clases.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            if (ap.getListaClases().get(i).getMaestro().getUsername().equals(maestroAsig.getUsername())) {
                modelo.addElement(ap.getListaClases().get(i));
            }
        }
        jl_asignar_clases.setModel(modelo);
        jd_verClases_maestros.setModal(true);
        jd_verClases_maestros.pack();
        jd_verClases_maestros.setLocationRelativeTo(this);
        jd_verClases_maestros.setVisible(true);
    }//GEN-LAST:event_jb_maestros_tareas1ActionPerformed

    private void jb_asginat_tareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asginat_tareaActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_asignar_clases.getSelectedIndex() >= 0) {
                int po = jl_asignar_clases.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_asignar_clases.getModel();
                Clase x = (Clase) modelo.getElementAt(po);
                String nombre = x.getNombre();
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    if (ap.getListaClases().get(i).equals(nombre)) {
                        poClase = i;
                    }
                }
                jl_asignar_clases.setModel(modelo);
                jd_asignar_tarea.setModal(true);
                jd_asignar_tarea.pack();
                jd_asignar_tarea.setLocationRelativeTo(this);
                jd_asignar_tarea.setVisible(true);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jb_asginat_tareaActionPerformed

    private void jb_asignar_tareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asignar_tareaActionPerformed
        // TODO add your handling code here:
        try {
            Date fecha = tarea_date.getDate();
            fecha.setHours(Integer.parseInt(tarea_hora.getText()));
            String titulo = tarea_titulo.getText();
            String desc = tarea_descripcion.getText();
            Tarea x = new Tarea(fecha, titulo, desc);
            tarea_date.setDate(new Date());
            tarea_hora.setText("");
            tarea_titulo.setText("");
            tarea_descripcion.setText("");
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            ap.getListaClases().get(poClase).getTareas().add(x);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_asignar_tareaActionPerformed

    private void examinar_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examinar_equipoActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser();
            File archivo = null;
            FileFilter filtro = new FileNameExtensionFilter("Tarea", "pdf", "jpeg", "png", "docx");
            fc.setFileFilter(filtro);
            int op = fc.showOpenDialog(null);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo = fc.getSelectedFile();
            }
            label_tarea.setText(archivo.getAbsolutePath());
            archivoSeleccionado = archivo;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_examinar_equipoActionPerformed

    private void jb_entregar_tareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entregar_tareaActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            TareaAlumno x = new TareaAlumno(estudianteAsig, 0, archivoSeleccionado);
            ap.getListaClases().get(poClaseE).getTareas().get(poTareaE).getTareasAlumnos().add(x);
            ap.escribirArchivo();
            boolean found = false;
            DefaultListModel modelo = (DefaultListModel) jl_verMisTareas.getModel();
            modelo.removeAllElements();
            for (int i = 0; i < ap.getListaClases().size(); i++) {
                boolean esta = false;
                for (int j = 0; j < ap.getListaClases().get(i).getAlumnos().size(); j++) {
                    if (ap.getListaClases().get(i).getAlumnos().get(j).getUsername().equals(estudianteAsig.getUsername())) {
                        esta = true;
                    }
                }
                if (esta) {
                    esta = false;
                    for (int j = 0; j < ap.getListaClases().get(i).getTareas().size(); j++) {
                        for (int k = 0; k < ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().size(); k++) {
                            if (ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().get(k).getEstudiante().getUsername().equals(estudianteAsig.getUsername())) {
                                found = true;
                            }
                        }
                        Date fecha = new Date();
                        if (found == false && fecha.before(ap.getListaClases().get(i).getTareas().get(j).getFechaFinal())) {
                            modelo.addElement(ap.getListaClases().get(i).getTareas().get(j));
                        }
                        found = false;
                    }
                }
            }
            jl_verMisTareas.setModel(modelo);
            jd_entregar_tarea.hide();
            JOptionPane.showMessageDialog(this, "SE MANDO EXITOSAMENTE");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jb_entregar_tareaActionPerformed

    private void jb_entregarMiTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entregarMiTareaActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_verMisTareas.getSelectedIndex() >= 0) {
                int po = jl_verMisTareas.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_verMisTareas.getModel();
                Tarea x = (Tarea) modelo.getElementAt(po);
                String nombre = x.getTitulo();
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    for (int j = 0; j < ap.getListaClases().get(i).getTareas().size(); j++) {
                        if (ap.getListaClases().get(i).getTareas().get(j).getTitulo().equals(nombre)) {
                            poClaseE = i;
                            poTareaE = j;
                        }
                    }
                }
                tarea_alum_titulo.setText(ap.getListaClases().get(poClaseE).getTareas().get(poTareaE).getTitulo());
                tarea_alum_desc.setText(ap.getListaClases().get(poClaseE).getTareas().get(poTareaE).getDescripcion());
                jd_entregar_tarea.setModal(true);
                jd_entregar_tarea.pack();
                jd_entregar_tarea.setLocationRelativeTo(this);
                jd_entregar_tarea.setVisible(true);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jb_entregarMiTareaActionPerformed

    private void jb_alumnos_forosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alumnos_forosActionPerformed
        // TODO add your handling code here:
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        DefaultListModel modelo = (DefaultListModel) jl_verMisForos.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            boolean esta = false;
            for (int j = 0; j < ap.getListaClases().get(i).getAlumnos().size(); j++) {
                if (ap.getListaClases().get(i).getAlumnos().get(j).getUsername().equals(estudianteAsig.getUsername())) {
                    esta = true;
                }
            }
            if (esta) {
                esta = false;
                for (int j = 0; j < ap.getListaClases().get(i).getForos().size(); j++) {
                    modelo.addElement(ap.getListaClases().get(i).getForos().get(j));
                }
            }
        }
        jl_verMisForos.setModel(modelo);

        jd_verMisForos.setModal(true);
        jd_verMisForos.pack();
        jd_verMisForos.setLocationRelativeTo(this);
        jd_verMisForos.setVisible(true);
    }//GEN-LAST:event_jb_alumnos_forosActionPerformed

    private void jb_abrirForoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abrirForoActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_verMisForos.getSelectedIndex() >= 0) {
                int po = jl_verMisForos.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_verMisForos.getModel();
                Foro x = (Foro) modelo.getElementAt(po);
                String nombre = x.getTitulo();
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    for (int j = 0; j < ap.getListaClases().get(i).getForos().size(); j++) {
                        if (ap.getListaClases().get(i).getTareas().get(j).getTitulo().equals(nombre)) {
                            poClaseF = i;
                            poForoF = j;
                        }
                    }
                }
                String tit = ap.getListaClases().get(poClaseF).getForos().get(poForoF).getTitulo();
                String desc = ap.getListaClases().get(poClaseF).getForos().get(poForoF).getDescripcion();
                tf_alumno_foroTitulo.setText(tit);
                ta_alumno_foroDesc.setText(desc);
                ta_alumnos_aportes.setText("");
                for (int i = 0; i < ap.getListaClases().get(poClaseF).getForos().get(poForoF).getAportes().size(); i++) {
                    ta_alumnos_aportes.append(ap.getListaClases().get(poClaseF).getForos().get(poForoF).getAportes().get(i));
                    ta_alumnos_aportes.append("\n");
                    ta_alumnos_aportes.append("\n");
                }
                jd_alumno_foro.setModal(true);
                jd_alumno_foro.pack();
                jd_alumno_foro.setLocationRelativeTo(this);
                jd_alumno_foro.setVisible(true);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jb_abrirForoActionPerformed

    private void jb_alumno_ingresarAporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alumno_ingresarAporteActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            String aporte = estudianteAsig.toString() + " - ";
            aporte += ta_alumnos_miAporte.getText();
            ta_alumnos_aportes.append(aporte);
            ta_alumnos_aportes.append("\n");
            ta_alumnos_aportes.append("\n");
            ap.getListaClases().get(poClaseF).getForos().get(poForoF).getAportes().add(aporte);
            ap.escribirArchivo();
            ta_alumnos_miAporte.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_alumno_ingresarAporteActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descripcion;
    private javax.swing.JButton alumnos_agregar;
    private javax.swing.JButton alumnos_modificar;
    private javax.swing.JButton asignar_alumno;
    private javax.swing.JButton asignar_maestro;
    private javax.swing.JMenuItem cerrar_sesion_alum;
    private javax.swing.JMenuItem cerrar_sesion_maestro;
    private javax.swing.JMenuItem cerrar_sesion_registro;
    private javax.swing.JMenuItem cerrar_sistema_alum;
    private javax.swing.JMenuItem cerrar_sistema_maesrto;
    private javax.swing.JMenuItem cerrar_sistema_registro;
    private javax.swing.JButton clases_agregar;
    private javax.swing.JButton clases_modificar;
    private javax.swing.JMenuItem eliminar_alumno;
    private javax.swing.JMenuItem eliminar_clase;
    private javax.swing.JMenuItem eliminar_maestro;
    private javax.swing.JMenuItem eliminar_registro;
    private javax.swing.JButton examinar_equipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton jb_abrirForo;
    private javax.swing.JButton jb_alumno_ingresarAporte;
    private javax.swing.JButton jb_alumnos_examenes;
    private javax.swing.JButton jb_alumnos_foros;
    private javax.swing.JButton jb_alumnos_notas;
    private javax.swing.JButton jb_alumnos_tareas;
    private javax.swing.JButton jb_asginat_tarea;
    private javax.swing.JButton jb_asignar_alumnos;
    private javax.swing.JButton jb_asignar_maestro;
    private javax.swing.JButton jb_asignar_tarea;
    private javax.swing.JButton jb_crear_alumno;
    private javax.swing.JButton jb_crear_clases;
    private javax.swing.JButton jb_crear_maestro;
    private javax.swing.JButton jb_crear_registro;
    private javax.swing.JButton jb_entregarMiTarea;
    private javax.swing.JButton jb_entregar_tarea;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_maestros_examenes1;
    private javax.swing.JButton jb_maestros_notas1;
    private javax.swing.JButton jb_maestros_tareas1;
    private javax.swing.JButton jb_modificar_alumno;
    private javax.swing.JButton jb_modificar_clases;
    private javax.swing.JButton jb_modificar_maestro;
    private javax.swing.JButton jb_modificar_registro;
    private javax.swing.JDialog jd_alumno_foro;
    private javax.swing.JDialog jd_asignar_alumno;
    private javax.swing.JDialog jd_asignar_maestro;
    private javax.swing.JDialog jd_asignar_tarea;
    private javax.swing.JDialog jd_crear_alumno;
    private javax.swing.JDialog jd_crear_clase;
    private javax.swing.JDialog jd_crear_maestro;
    private javax.swing.JDialog jd_crear_registro;
    private javax.swing.JDialog jd_entregar_tarea;
    private javax.swing.JDialog jd_listar_alumnos;
    private javax.swing.JDialog jd_listar_clase;
    private javax.swing.JDialog jd_listar_maestros;
    private javax.swing.JDialog jd_listar_registros;
    private javax.swing.JDialog jd_modificar_alumno;
    private javax.swing.JDialog jd_modificar_clase;
    private javax.swing.JDialog jd_modificar_maestro;
    private javax.swing.JDialog jd_modificar_registro;
    private javax.swing.JDialog jd_verClases_maestros;
    private javax.swing.JDialog jd_verMisForos;
    private javax.swing.JDialog jd_verTareas_alumnos;
    private javax.swing.JFrame jf_alumno;
    private javax.swing.JFrame jf_maestros;
    private javax.swing.JFrame jf_registro;
    private javax.swing.JList<String> jl_alumnos;
    private javax.swing.JList<String> jl_asignar_clases;
    private javax.swing.JList<String> jl_clases;
    private javax.swing.JList<String> jl_maestros;
    private javax.swing.JList<String> jl_registros;
    private javax.swing.JList<String> jl_verAlumnos;
    private javax.swing.JList<String> jl_verClases;
    private javax.swing.JList<String> jl_verClasesA;
    private javax.swing.JList<String> jl_verMaestros;
    private javax.swing.JList<String> jl_verMisForos;
    private javax.swing.JList<String> jl_verMisTareas;
    private javax.swing.JLabel label_tarea;
    private javax.swing.JButton maestro_agregar;
    private javax.swing.JButton maestro_modificar;
    private javax.swing.JMenuItem modificar_alumno;
    private javax.swing.JMenuItem modificar_clase;
    private javax.swing.JMenuItem modificar_maestro;
    private javax.swing.JMenuItem modificar_registro;
    private javax.swing.JPopupMenu popup_alumno;
    private javax.swing.JPopupMenu popup_clase;
    private javax.swing.JPopupMenu popup_maestro;
    private javax.swing.JPopupMenu popup_registro;
    private javax.swing.JButton registro_agregar;
    private javax.swing.JButton registro_modificar;
    private javax.swing.JTextArea ta_alumno_foroDesc;
    private javax.swing.JTextArea ta_alumnos_aportes;
    private javax.swing.JTextArea ta_alumnos_miAporte;
    private javax.swing.JTextArea tarea_alum_desc;
    private javax.swing.JTextField tarea_alum_titulo;
    private com.toedter.calendar.JDateChooser tarea_date;
    private javax.swing.JTextArea tarea_descripcion;
    private javax.swing.JTextField tarea_hora;
    private javax.swing.JTextField tarea_titulo;
    private javax.swing.JTextField tf_alumno_carrera;
    private javax.swing.JTextField tf_alumno_carrera_m;
    private javax.swing.JFormattedTextField tf_alumno_clases;
    private javax.swing.JFormattedTextField tf_alumno_clases_m;
    private javax.swing.JFormattedTextField tf_alumno_cuenta;
    private javax.swing.JFormattedTextField tf_alumno_cuenta_m;
    private javax.swing.JTextField tf_alumno_foroTitulo;
    private javax.swing.JTextField tf_alumno_nombre;
    private javax.swing.JTextField tf_alumno_nombre_m;
    private javax.swing.JTextField tf_alumno_pass;
    private javax.swing.JTextField tf_alumno_pass_m;
    private javax.swing.JTextField tf_alumno_rol;
    private javax.swing.JTextField tf_alumno_rol_m;
    private javax.swing.JTextField tf_alumno_user;
    private javax.swing.JTextField tf_alumno_user_m;
    private javax.swing.JSpinner tf_clase_hora;
    private javax.swing.JSpinner tf_clase_hora_m;
    private javax.swing.JFormattedTextField tf_clase_id;
    private javax.swing.JFormattedTextField tf_clase_id_m;
    private javax.swing.JTextField tf_clase_nombre;
    private javax.swing.JTextField tf_clase_nombre_m;
    private javax.swing.JSpinner tf_clase_periodo;
    private javax.swing.JSpinner tf_clase_periodo_m;
    private javax.swing.JSpinner tf_clase_semestre;
    private javax.swing.JSpinner tf_clase_semestre_m;
    private javax.swing.JSpinner tf_clase_unidades;
    private javax.swing.JSpinner tf_clase_unidades_m;
    private com.toedter.calendar.JYearChooser tf_clase_year;
    private com.toedter.calendar.JYearChooser tf_clase_year_m;
    private javax.swing.JFormattedTextField tf_maestro_id;
    private javax.swing.JFormattedTextField tf_maestro_id_m;
    private javax.swing.JTextField tf_maestro_nombre;
    private javax.swing.JTextField tf_maestro_nombre_m;
    private javax.swing.JTextField tf_maestro_pass;
    private javax.swing.JTextField tf_maestro_pass_m;
    private javax.swing.JTextField tf_maestro_profesion;
    private javax.swing.JTextField tf_maestro_profesion_m;
    private javax.swing.JTextField tf_maestro_rol;
    private javax.swing.JTextField tf_maestro_rol_m;
    private javax.swing.JFormattedTextField tf_maestro_sueldo;
    private javax.swing.JFormattedTextField tf_maestro_sueldo_m;
    private javax.swing.JTextField tf_maestro_user;
    private javax.swing.JTextField tf_maestro_user_m;
    private javax.swing.JPasswordField tf_pass_login;
    private javax.swing.JTextField tf_registro_pass;
    private javax.swing.JTextField tf_registro_pass_m;
    private javax.swing.JTextField tf_registro_user;
    private javax.swing.JTextField tf_registro_user_m;
    private javax.swing.JTextField tf_user_login;
    // End of variables declaration//GEN-END:variables
    Alumno estudianteAsig;
    int indexEstudiante;
    Maestro maestroAsig;
    int indexMaestro;
    // para tareas
    int poClase;
    int poClaseE;
    int poTareaE;
    File archivoSeleccionado;
    // para foros
    int poClaseF;
    int poForoF;
    // para examenes
}
