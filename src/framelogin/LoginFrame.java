package framelogin;

import frameerror.ErrorFrame;
import java.sql.SQLException;
import mysql.MysqlConexion;

/**
 *
 * @author Vitaminac
 * @version 1.0
 * @since 26/12/2021
 */
public class LoginFrame extends javax.swing.JFrame {
    
    //Titulo del JFrame
    private final String TITULO = "Login - ";

    //Titulo de la compañia
    private final String COMPAÑIA = "Compañia";

    //Clase de funciones del JFrame
    Funciones_LoginFrame funciones_LoginFrame;

    //Clase de la conexión a la base de datos
    MysqlConexion mysqlConexion = new MysqlConexion();

    public LoginFrame() {
        try {
            
            //Comprobamos la conexión con la base de datos
            mysqlConexion.comprobarConexion();

            //Iniciamos los componentes, las  funciones del frame y configuramos
            //algunos valores
            initComponents();
            funciones_LoginFrame = new Funciones_LoginFrame();

            setTitle(TITULO + COMPAÑIA);
            setVisible(true);
            setLocationRelativeTo(null);
        } catch (SQLException | ClassNotFoundException e) {
            ErrorFrame errorFrame = new ErrorFrame("<html>" + e.toString() + "</html>");
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImagenLogin = new javax.swing.JPanel();
        jlb_imagenLogin = new javax.swing.JLabel();
        PanelLogin = new javax.swing.JPanel();
        jlb_iconoUsuario = new javax.swing.JLabel();
        jtf_usuario = new javax.swing.JTextField();
        jpf_contra = new javax.swing.JPasswordField();
        jtb_iniciarSesion = new javax.swing.JButton();
        jlb_iconoUsuarioPassword = new javax.swing.JLabel();
        jlb_iconoPassword = new javax.swing.JLabel();
        jlb_bienvenido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenLogin.setBackground(new java.awt.Color(219, 242, 244));
        ImagenLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_imagenLogin.setBackground(new java.awt.Color(219, 242, 244));
        jlb_imagenLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_imagenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_framelogin/ImagenLogin.png"))); // NOI18N
        jlb_imagenLogin.setToolTipText("");
        ImagenLogin.add(jlb_imagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 450));

        getContentPane().add(ImagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 450));

        PanelLogin.setBackground(new java.awt.Color(200, 232, 234));

        jlb_iconoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_iconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_framelogin/IconoUsuario.png"))); // NOI18N

        jtf_usuario.setBackground(new java.awt.Color(255, 255, 255));
        jtf_usuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtf_usuario.setForeground(new java.awt.Color(15, 15, 15));
        jtf_usuario.setToolTipText("");
        jtf_usuario.setBorder(null);
        jtf_usuario.setCaretColor(new java.awt.Color(190, 202, 204));
        jtf_usuario.setSelectedTextColor(new java.awt.Color(15, 15, 15));
        jtf_usuario.setSelectionColor(new java.awt.Color(219, 242, 244));

        jpf_contra.setBackground(new java.awt.Color(255, 255, 255));
        jpf_contra.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jpf_contra.setForeground(new java.awt.Color(15, 15, 15));
        jpf_contra.setToolTipText("");
        jpf_contra.setBorder(null);
        jpf_contra.setCaretColor(new java.awt.Color(190, 202, 204));
        jpf_contra.setSelectedTextColor(new java.awt.Color(15, 15, 15));
        jpf_contra.setSelectionColor(new java.awt.Color(219, 242, 244));

        jtb_iniciarSesion.setBackground(new java.awt.Color(240, 240, 240));
        jtb_iniciarSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtb_iniciarSesion.setForeground(new java.awt.Color(15, 15, 15));
        jtb_iniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_framelogin/BotonSinPresionar.png"))); // NOI18N
        jtb_iniciarSesion.setText("Iniciar Sesión");
        jtb_iniciarSesion.setToolTipText("");
        jtb_iniciarSesion.setBorder(null);
        jtb_iniciarSesion.setFocusable(false);
        jtb_iniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jtb_iniciarSesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_framelogin/BotonSinPresionar.png"))); // NOI18N
        jtb_iniciarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_framelogin/BotonPresionado.png"))); // NOI18N
        jtb_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_iniciarSesionActionPerformed(evt);
            }
        });

        jlb_iconoUsuarioPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_iconoUsuarioPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_framelogin/IconoUsuarioPassword.png"))); // NOI18N

        jlb_iconoPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_iconoPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_framelogin/IconoPassword.png"))); // NOI18N

        jlb_bienvenido.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jlb_bienvenido.setForeground(new java.awt.Color(15, 15, 15));
        jlb_bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_bienvenido.setText("¡Bienvenido!");

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_iconoUsuarioPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_iconoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtf_usuario)
                    .addComponent(jpf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addComponent(jlb_iconoUsuario)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addComponent(jtb_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                        .addComponent(jlb_bienvenido)
                        .addGap(156, 156, 156))))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlb_iconoUsuario)
                .addGap(12, 12, 12)
                .addComponent(jlb_bienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_iconoUsuarioPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpf_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_iconoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jtb_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 410, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método oyente del botón
    private void jtb_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_iniciarSesionActionPerformed
        //Obtenemos el Usuario
        String usuario = jtf_usuario.getText().trim();

        //Obtenemos la Password
        char[] pass_temp = jpf_contra.getPassword();
        String pass = new String(pass_temp);

        //Comprobamos que los datos no estén vacíos
        funciones_LoginFrame.comprobacionDeDatos(this, usuario, pass);
    }//GEN-LAST:event_jtb_iniciarSesionActionPerformed

    public void CerrarFrame() {
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ImagenLogin;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JLabel jlb_bienvenido;
    private javax.swing.JLabel jlb_iconoPassword;
    private javax.swing.JLabel jlb_iconoUsuario;
    private javax.swing.JLabel jlb_iconoUsuarioPassword;
    private javax.swing.JLabel jlb_imagenLogin;
    public static javax.swing.JPasswordField jpf_contra;
    private javax.swing.JButton jtb_iniciarSesion;
    public static javax.swing.JTextField jtf_usuario;
    // End of variables declaration//GEN-END:variables
}
