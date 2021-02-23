/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmosdelreydavid;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOSUÉ DANIEL REYNA ROLDÁN OCHOA
 */
public class Principal extends javax.swing.JFrame {
DefaultTableModel modelo= new DefaultTableModel();

    /**
     * Creates new form Principal
     */
    private JDesktopPane jdpDesktop;
    private static int openFrameCount = 0;
    private BufferedImage img;
    private  ImageIcon imageIcon1;
    public Principal() {
    initComponents();
    this.setSize(1010, 465);
    setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/org/img/lion.png")));  
    String nombreImagen= "leonobeja.jpg";
    jTable1.setModel(modelo);
    imageIcon1=new javax.swing.ImageIcon(getClass().getResource("/org/img/"+nombreImagen));
    Image image1= imageIcon1.getImage();
    image1= image1.getScaledInstance(getWidth(), getHeight(),Image.SCALE_DEFAULT);
    imageIcon1=new ImageIcon(image1);
   //img=(BufferedImage)((Image) imageIcon1.getImage());

        // A specialized layered pane to be used with JInternalFrames
     jdpDesktop = new JDesktopPane() {
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                grphcs.drawImage(imageIcon1.getImage(), 0, 0, null);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(getWidth(),getHeight());
            }
        
        };
        
        this.setContentPane(jdpDesktop);
        agregarDatos();
        jdpDesktop.add(jPanel2);
         jPanel2.setLocation(450, 0);
        setLocationRelativeTo(null);  

    
    }
    
    private void agregarDatos(){
        
  modelo= new DefaultTableModel();
 
    modelo.addColumn("SALMOS DE DAVID");

modelo.addRow(new Object[]{"1: Para prevenir un aborto"});
modelo.addRow(new Object[]{"2: Contra maremotos"});
modelo.addRow(new Object[]{"3: Contra dolor de cabeza y hombro"});
modelo.addRow(new Object[]{"4: Para toda ocasión"});
modelo.addRow(new Object[]{"5: Contra malos espíritus"});
modelo.addRow(new Object[]{"6: Contra enfermedades de los ojos"});
modelo.addRow(new Object[]{"7: Para alejar a los enemigos"});
modelo.addRow(new Object[]{"8: Para agradar"});
modelo.addRow(new Object[]{"9: Para un muchacho enfermo"});
modelo.addRow(new Object[]{"10: Para dominar el odio"});

modelo.addRow(new Object[]{"11: Contra los enemigos"});
modelo.addRow(new Object[]{"12: Contra la debilidad"});
modelo.addRow(new Object[]{"13: Para no sufrir muerte violenta"});
modelo.addRow(new Object[]{"14: Contra el miedo"});
modelo.addRow(new Object[]{"15: Para eliminar un demonio"});
modelo.addRow(new Object[]{"16: Para descubrir a un ladrón"});
modelo.addRow(new Object[]{"17: Para antes de emprender un viaje"});
modelo.addRow(new Object[]{"18: Para quedar a salvo la maldad de un dictador"});
modelo.addRow(new Object[]{"19: Para adquirir sabiduría"});
modelo.addRow(new Object[]{"20: Para decir antes de presentarse a la justicia"});


modelo.addRow(new Object[]{"21: Para decir antes de recurrir ante una autoridad del Gobierno"});
modelo.addRow(new Object[]{"22: Contra todo tipo de sufrimiento"});
modelo.addRow(new Object[]{"23: Para comprender un sueño"});
modelo.addRow(new Object[]{"24: Para escapar de una inundación"});
modelo.addRow(new Object[]{"25: Para dominar la infelicidad"});
modelo.addRow(new Object[]{"26: Para prevenir un aborto"});
modelo.addRow(new Object[]{"27: Contra animales dañinos"});
modelo.addRow(new Object[]{"28: Para que una plegaria se materialice"});
modelo.addRow(new Object[]{"29: Contra los malos espíritus"});
modelo.addRow(new Object[]{"30: Contra todo tipo de mal"});


modelo.addRow(new Object[]{"31: Contra el mal de ojo"});
modelo.addRow(new Object[]{"32: Para pedir misericordia"});
modelo.addRow(new Object[]{"33: Para una madre que haya perdido a sus hijos"});
modelo.addRow(new Object[]{"34: Para decir durante un viaje"});
modelo.addRow(new Object[]{"35: Para cuando los enemigos procuran el mal de uno."});
modelo.addRow(new Object[]{"36: Para eliminar a los perversos"});
modelo.addRow(new Object[]{"37: Para decir al tomar un bien en locación"});
modelo.addRow(new Object[]{"38: Contra malos consejos"});
modelo.addRow(new Object[]{"39: Para quien sufre"});
modelo.addRow(new Object[]{"40: Para quedar a salvo de malos espíritus"});


modelo.addRow(new Object[]{"41: Para quien no tenga empleo"});
modelo.addRow(new Object[]{"42: Al construir una vivienda"});
modelo.addRow(new Object[]{"43: Al construir una vivienda"});
modelo.addRow(new Object[]{"44: Para quedar a salvo de un enemigo"});
modelo.addRow(new Object[]{"45: Para quien tiene una mala pareja"});
modelo.addRow(new Object[]{"46: Para cuando el odio haya logrado infiltrarse en la pareja"});
modelo.addRow(new Object[]{"47: Para despertar la conciencia de la necesidad de reconexión con Hashem"});
modelo.addRow(new Object[]{"48: Para atemorizar a los enemigos"});
modelo.addRow(new Object[]{"49: Contra la fiebre"});
modelo.addRow(new Object[]{"50: Para quedar a salvo de bandidos"});


modelo.addRow(new Object[]{"51: Para quedar a salvo de la impureza de incesto"});
modelo.addRow(new Object[]{"52: Para terminar con el hábito de la maledicencia"});
modelo.addRow(new Object[]{"53: Para atemorizar a los enemigos"});
modelo.addRow(new Object[]{"54: Para dar a los enemigos su merecido"});
modelo.addRow(new Object[]{"55: Para dominar la desdicha"});
modelo.addRow(new Object[]{"56: Para quien está preso"});
modelo.addRow(new Object[]{"57: Para tener éxito"});
modelo.addRow(new Object[]{"58: Contra perros dañinos"});
modelo.addRow(new Object[]{"59: Contra la inclinación al mal"});
modelo.addRow(new Object[]{"60: Al salir a la guerra"});

modelo.addRow(new Object[]{"61: Para quien tema estar en su casa"});
modelo.addRow(new Object[]{"62: Para decir después de la plegaria de la tarde y de la noche"});
modelo.addRow(new Object[]{"63: Para tener éxito en los negocios"});
modelo.addRow(new Object[]{"64: Al atravesar un río"});
modelo.addRow(new Object[]{"65: Al requerir algo de alguien"});
modelo.addRow(new Object[]{"66: Para un poseído por un demonio"});
modelo.addRow(new Object[]{"67: Contra fiebres crónicas"});
modelo.addRow(new Object[]{"68: Contra espíritus malignos"});
modelo.addRow(new Object[]{"69: Para dominar la codicia y la lujuria"});
modelo.addRow(new Object[]{"70: En caso de guerra"});

modelo.addRow(new Object[]{"71: Para hallar la Gracia divina"});
modelo.addRow(new Object[]{"72: Para hallar la Gracia divina"});
modelo.addRow(new Object[]{"73: Para controlar las fobias"});
modelo.addRow(new Object[]{"74: Contra el temor a enemigos"});
modelo.addRow(new Object[]{"75: Para neutralizar la arrogancia"});
modelo.addRow(new Object[]{"76: Para quedar a salvo del fuego y del agua"});
modelo.addRow(new Object[]{"77: Para que no devenga en este día una desgracia"});
modelo.addRow(new Object[]{"78: Hallar gracia ante la autoridad"});
modelo.addRow(new Object[]{"79: Para vencer a los enemigos"});
modelo.addRow(new Object[]{"80: Para quedar a salvo de las doctrinas de los ateos y herejes."});


modelo.addRow(new Object[]{"81: Para quedar a salvo de la herejía"});
modelo.addRow(new Object[]{"82: Para coronar con éxito todo emprendimiento"});
modelo.addRow(new Object[]{"83: En caso de guerra"});
modelo.addRow(new Object[]{"84: Para quien esté débil por causa de sus dolencias"});
modelo.addRow(new Object[]{"85: Para tener buena relación con un compañero"});
modelo.addRow(new Object[]{"86: Para dominar malos espíritus"});
modelo.addRow(new Object[]{"87: Ante una situación de peligro en la ciudad"});
modelo.addRow(new Object[]{"88: Ante una situación de peligro en la ciudad"});
modelo.addRow(new Object[]{"89: Al debilitarse o perder algún miembro del cuerpo"});
modelo.addRow(new Object[]{"90: Para escapar de un león"});


modelo.addRow(new Object[]{"91: Contra malos espíritus"});
modelo.addRow(new Object[]{"92: Para tener el privilegio de ver grandes milagros"});
modelo.addRow(new Object[]{"93: Para ganar un pleito"});
modelo.addRow(new Object[]{"94: Por la aflicción que pueda provocar un enemigo"});
modelo.addRow(new Object[]{"95: Para evitar ser perturbado por la gente de la ciudad"});
modelo.addRow(new Object[]{"96: Para alegrar a la familia"});
modelo.addRow(new Object[]{"97: Para alegrar a la familia"});
modelo.addRow(new Object[]{"98: Para hacer las paces con el prójimo"});
modelo.addRow(new Object[]{"99: Para ser piadoso y caritativo"});
modelo.addRow(new Object[]{"100: Para vencer a los enemigos"});


modelo.addRow(new Object[]{"101: Contra los malos espíritus"});
modelo.addRow(new Object[]{"102: Para que se cure una mujer estéril"});
modelo.addRow(new Object[]{"103: Para que se cure una mujer estéril"});
modelo.addRow(new Object[]{"104: Para exterminar un mal"});
modelo.addRow(new Object[]{"105: Contra la malaria que recurre por cuarta vez"});
modelo.addRow(new Object[]{"106: Contra la malaria que recurre por tercera vez"});
modelo.addRow(new Object[]{"107: Contra la fiebre crónica"});
modelo.addRow(new Object[]{"108: Para el éxito"});
modelo.addRow(new Object[]{"109: Para evitar la opresión que pueda provocar un enemigo"});
modelo.addRow(new Object[]{"110: Para hacer las paces con los enemigos"});

modelo.addRow(new Object[]{"111: Para hacer amistades"});
modelo.addRow(new Object[]{"112: Para lograr mayor fuerza y poder"});
modelo.addRow(new Object[]{"113: Contra la apostasía"});
modelo.addRow(new Object[]{"114: Para antes de llevar a cabo un negocio"});
modelo.addRow(new Object[]{"115: Para rebatir a los apóstatas"});
modelo.addRow(new Object[]{"116: Para quedar a salvo de una muerte trágica"});
modelo.addRow(new Object[]{"117: Contra falsas acusaciones"});
modelo.addRow(new Object[]{"118: Para rebatir al incrédulo. También, para decir al presentarse ante un juez"});
modelo.addRow(new Object[]{"119: Para antes de realizas una mitzva"});
modelo.addRow(new Object[]{"120: Para reconciliarse"});


modelo.addRow(new Object[]{"121: Al salir por la noche a solas"});
modelo.addRow(new Object[]{"122: Al presentarse ante una personalidad"});
modelo.addRow(new Object[]{"123: Por un esclavo que huye"});
modelo.addRow(new Object[]{"124: Al emprender un viaje en barco"});
modelo.addRow(new Object[]{"125: Para quedar a salvo de enemigos"});
modelo.addRow(new Object[]{"126: Para que lo recite la mujer que haya perdido a sus hijos"});
modelo.addRow(new Object[]{"127: Por un recién nacido varón"});
modelo.addRow(new Object[]{"128: Para una mujer embarazada"});
modelo.addRow(new Object[]{"129: Para tener el privilegio de hacer un acto de bien"});
modelo.addRow(new Object[]{"130: Al emprender viaje en barco"});

modelo.addRow(new Object[]{"131: Contra un soberbio"});
modelo.addRow(new Object[]{"132: Para cumplir los juramentos"});
modelo.addRow(new Object[]{"133: Para mantener el estado de amistad entre los amigos"});
modelo.addRow(new Object[]{"134: Para decir antes de estudiar Torá"});
modelo.addRow(new Object[]{"135: Para librarse de pensamientos heréticos"});
modelo.addRow(new Object[]{"136: Para reconocer las faltas cometidas"});
modelo.addRow(new Object[]{"137: Para quitarse el odio"});
modelo.addRow(new Object[]{"138: Para quitarse la soberbia"});
modelo.addRow(new Object[]{"139: Para inspirar amor en la pareja"});
modelo.addRow(new Object[]{"140: Para contrarrestar una mala relación de pareja"});

modelo.addRow(new Object[]{"141: Contra dolencias del corazón"});
modelo.addRow(new Object[]{"142: Contra dolencias en muslos"});
modelo.addRow(new Object[]{"143: Contra dolencias en el brazo"});
modelo.addRow(new Object[]{"144: Por una fractura en el brazo"});
modelo.addRow(new Object[]{"145: Para quitarse el miedo"});
modelo.addRow(new Object[]{"146: Para quedar a salvo de una herida por cualquier elemento cortante"});
modelo.addRow(new Object[]{"147: Contra mordedura de víbora"});
modelo.addRow(new Object[]{"148: Para salvarse de un incendio"});
modelo.addRow(new Object[]{"149: Para evitar la propagación de un incendio"});
modelo.addRow(new Object[]{"150: Para alabar a Hashem por todas Sus obras"});

    jTable1.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SALMOS DE DAVID");
        setMinimumSize(new java.awt.Dimension(816, 465));
        setPreferredSize(new java.awt.Dimension(816, 465));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(48, 122, 185));

        jTable1.setBackground(new java.awt.Color(0, 120, 215));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SALMO 1"},
                {"SALMO 2"},
                {"SALMO 3"},
                {"SALMO 4"},
                {"SALMO 5"},
                {"SALMO 6"},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "SALMOS DE DAVID"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowHeight(25);
        jTable1.setRowSelectionAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("INFO");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        Integer selectedRow = jTable1.getSelectedRow()+1;
        String v=selectedRow.toString();
        new PanelSalmo(v).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

new INFO().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
