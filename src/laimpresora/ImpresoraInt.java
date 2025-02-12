package laimpresora;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import laimpresora.DocumentosYPaginas.Documento;
public class ImpresoraInt extends javax.swing.JFrame {
    public ImpresoraInt() {
        this.timertask = new TimerTask() {
            @Override
            public void run() {
                docu2=colaImpresion.peek();
                if (docu2!=null){
                    pagre++;
                    Doccola1.setText("Imprimiendo: "+docu2.toString());
                    Pagcola.setText("Paginas restantes: "+(docu2.getPaginasRestantes()-pagre));
                    Doccola.setText("Documentos restantes: "+docre);
                    progresdoc.setMaximum(docu2.getNumPaginas());
                    progresdoc.setValue(pagre);
                if (pagre==docu2.getPaginasRestantes()) {docre--; colaImpresion.remove();pagre=-1;}
                }
                else {
                    Doccola1.setText("Imprimiendo: NINGUNO");
                    Pagcola.setText("No hay paginas en cola");
                    Doccola.setText("No hay documentos en cola");
                    progresdoc.setValue(0);}
            }
        };
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Imprimir = new javax.swing.JButton();
        Ingnombre = new javax.swing.JTextField();
        Anadir = new javax.swing.JButton();
        titulonombredoc = new javax.swing.JLabel();
        titulonumpag = new javax.swing.JLabel();
        Ingpag = new javax.swing.JTextField();
        Pagcola = new javax.swing.JLabel();
        progresdoc = new javax.swing.JProgressBar();
        Doccola1 = new javax.swing.JLabel();
        Doccola = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        Titulo.setText("Impresora");

        Imprimir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Imprimir.setText("Imprimir");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        Ingnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngnombreActionPerformed(evt);
            }
        });

        Anadir.setFont(new java.awt.Font("NSimSun", 0, 18)); // NOI18N
        Anadir.setText("Añadir");
        Anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirActionPerformed(evt);
            }
        });

        titulonombredoc.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        titulonombredoc.setText("Nombre del documento");

        titulonumpag.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        titulonumpag.setText("Numero de paginas");

        Ingpag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngpagActionPerformed(evt);
            }
        });

        Pagcola.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Pagcola.setText("No hay paginas en cola");

        Doccola1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Doccola1.setText("Imprimiendo: NINGUNO");

        Doccola.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        Doccola.setText("No hay documentos en cola");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titulonombredoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ingnombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulonumpag, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Ingpag, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(progresdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pagcola, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Doccola1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Doccola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulonombredoc)
                    .addComponent(titulonumpag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingpag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(Doccola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pagcola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Doccola1)
                .addGap(18, 18, 18)
                .addComponent(progresdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anadir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static String doc; static int pag,pagre=-1,docre,presionado=0;
    Timer timer;
    TimerTask timertask;

DocumentosYPaginas doyp = new DocumentosYPaginas();
DocumentosYPaginas.Documento docu;
DocumentosYPaginas.Documento docu2;
    Queue<Documento> colaImpresion = new LinkedList<>();
    private void AnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirActionPerformed
        doc=Ingnombre.getText();
        pag=Integer.parseInt(Ingpag.getText());
        docu = doyp.new Documento(doc, pag);
        docu.setNombre(doc);docu.setNumPaginas(pag);docre++;
        colaImpresion.add(docu);
    }//GEN-LAST:event_AnadirActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        presionado++;
        if (presionado <=1){
        timer=new Timer();
        timer.scheduleAtFixedRate(timertask, 0, 1000);
        }
    }//GEN-LAST:event_ImprimirActionPerformed

    private void IngpagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngpagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngpagActionPerformed

    private void IngnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngnombreActionPerformed
    
 
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
            java.util.logging.Logger.getLogger(ImpresoraInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImpresoraInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImpresoraInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImpresoraInt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImpresoraInt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Anadir;
    private javax.swing.JLabel Doccola;
    private javax.swing.JLabel Doccola1;
    private javax.swing.JButton Imprimir;
    private javax.swing.JTextField Ingnombre;
    private javax.swing.JTextField Ingpag;
    private javax.swing.JLabel Pagcola;
    private javax.swing.JLabel Titulo;
    private javax.swing.JProgressBar progresdoc;
    private javax.swing.JLabel titulonombredoc;
    private javax.swing.JLabel titulonumpag;
    // End of variables declaration//GEN-END:variables
}
