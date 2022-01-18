package frameprincipal;

import javax.swing.JLabel;
import usuario.Usuario;

/**
 *
 * @author Vitaminac
 * @version 1.0
 * @since 26/12/2021
 */
public class PrincipalFrame extends javax.swing.JFrame {

    Funciones_PrincipalFrame funciones_PrincipalFrame;
    
    public PrincipalFrame(Usuario usuario) {
        initComponents();
        
        funciones_PrincipalFrame = new Funciones_PrincipalFrame(usuario);
        
        JLabel[] labels = new JLabel[]{jlb_nombreUsuario, jlb_rol};
        funciones_PrincipalFrame.colocarInfoUsuario(labels);
        
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Informacion = new javax.swing.JPanel();
        jlb_rol = new javax.swing.JLabel();
        jlb_nombreUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(219, 242, 244));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(219, 242, 244));

        Informacion.setBackground(new java.awt.Color(200, 232, 234));
        Informacion.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(150, 150, 150)));

        jlb_rol.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlb_rol.setForeground(new java.awt.Color(15, 15, 15));
        jlb_rol.setText("ROL: adasdad");

        jlb_nombreUsuario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jlb_nombreUsuario.setForeground(new java.awt.Color(15, 15, 15));
        jlb_nombreUsuario.setText("USUARIO: DSAFS");

        javax.swing.GroupLayout InformacionLayout = new javax.swing.GroupLayout(Informacion);
        Informacion.setLayout(InformacionLayout);
        InformacionLayout.setHorizontalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformacionLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlb_rol, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InformacionLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jlb_nombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        InformacionLayout.setVerticalGroup(
            InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InformacionLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jlb_rol)
                .addGap(90, 90, 90))
            .addGroup(InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(InformacionLayout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jlb_nombreUsuario)
                    .addContainerGap(161, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Informacion;
    private javax.swing.JLabel jlb_nombreUsuario;
    private javax.swing.JLabel jlb_rol;
    // End of variables declaration//GEN-END:variables
}
