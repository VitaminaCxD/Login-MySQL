package frameerror;

import framelogin.LoginFrame;

/**
 *
 * @author Vitaminac
 * @version 1.0
 * @since 26/12/2021
 */
public class ErrorFrame extends javax.swing.JFrame {

    //Variable que contendrá el error dado en los parámetros del constructor
    private String error;
   
    public ErrorFrame(String error) {
        //Guardamos el error obtenido en la variable global de la clase
        this.error = error;

        //Iniciamos los componentes, llamos al método mensajeError y configuramos
        //algunos valores
        initComponents();
        mensajeError();

        setVisible(true);
        setLocationRelativeTo(null);
    }

    //Método encargado de colocar el error en el JLabel mensajeError
    private void mensajeError() {
        jlb_mensajeError.setText(error);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        jlb_IconoError = new javax.swing.JLabel();
        jlb_error = new javax.swing.JLabel();
        jlb_mensajeError = new javax.swing.JLabel();
        jbt_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setBackground(new java.awt.Color(240, 240, 240));

        Barra.setBackground(new java.awt.Color(216, 0, 0));

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jlb_IconoError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_IconoError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_frameerror/IconoError.png"))); // NOI18N

        jlb_error.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jlb_error.setForeground(new java.awt.Color(216, 0, 0));
        jlb_error.setText("ERROR:");

        jlb_mensajeError.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jlb_mensajeError.setForeground(new java.awt.Color(15, 15, 15));
        jlb_mensajeError.setText("ErrorErrorErrorErrorErrorErrorErrorErrorErrorErro");
        jlb_mensajeError.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jbt_aceptar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbt_aceptar.setForeground(new java.awt.Color(15, 15, 15));
        jbt_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_frameerror/BotonSinPresionar.png"))); // NOI18N
        jbt_aceptar.setText("Aceptar");
        jbt_aceptar.setBorder(null);
        jbt_aceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbt_aceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_frameerror/BotonSinPresionar.png"))); // NOI18N
        jbt_aceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_frameerror/BotonPresionado.png"))); // NOI18N
        jbt_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlb_IconoError, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlb_error)
                .addGap(18, 18, 18)
                .addComponent(jlb_mensajeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jbt_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlb_IconoError)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb_error)
                            .addComponent(jlb_mensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jbt_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método oyente del botón, el cual cerrará la ventana al presionarlo
    private void jbt_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_aceptarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbt_aceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton jbt_aceptar;
    private javax.swing.JLabel jlb_IconoError;
    private javax.swing.JLabel jlb_error;
    private javax.swing.JLabel jlb_mensajeError;
    // End of variables declaration//GEN-END:variables
}
