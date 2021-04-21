package vista;

/**
 *
 * @author sagov8
 */
import javax.swing.JButton;
import modelo.ControlBatallaNaval;

public class Oceano extends javax.swing.JFrame {

    ControlBatallaNaval control;
    int misiles= 75;
    int puntos=0;
    int disparos=0;

    public Oceano() {
        initComponents();
        control = new ControlBatallaNaval();
        control.asignarSubmarino();
       
        control.imprimir();
        txt_Misiles_.setText("75");
        txt_Puntos.setText("0");
        txt_disparos_.setText("0");
    }
    
    

   
    @SuppressWarnings("unchecked")
    
  


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BTN_01 = new javax.swing.JButton();
        BTN_07 = new javax.swing.JButton();
        BTN_06 = new javax.swing.JButton();
        BTN_02 = new javax.swing.JButton();
        BTN_10 = new javax.swing.JButton();
        BTN_03 = new javax.swing.JButton();
        BTN_04 = new javax.swing.JButton();
        BTN_05 = new javax.swing.JButton();
        BTN_08 = new javax.swing.JButton();
        BTN_09 = new javax.swing.JButton();
        BTN_11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        JB_nuevoJuego_ = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_Misiles_ = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Puntos = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_disparos_ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        BTN_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_01.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_01ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_01);
        BTN_01.setBounds(10, 2, 68, 55);

        BTN_07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_07.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_07ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_07);
        BTN_07.setBounds(454, 2, 68, 55);

        BTN_06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_06.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_06ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_06);
        BTN_06.setBounds(380, 2, 68, 55);

        BTN_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_02.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_02ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_02);
        BTN_02.setBounds(84, 2, 68, 55);

        BTN_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_10ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_10);
        BTN_10.setBounds(676, 2, 68, 55);

        BTN_03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_03.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_03ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_03);
        BTN_03.setBounds(158, 2, 68, 55);

        BTN_04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_04.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_04ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_04);
        BTN_04.setBounds(232, 2, 68, 55);

        BTN_05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_05.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_05ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_05);
        BTN_05.setBounds(306, 2, 68, 55);

        BTN_08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_08.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_08ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_08);
        BTN_08.setBounds(528, 2, 68, 55);

        BTN_09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_09.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_09ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_09);
        BTN_09.setBounds(602, 2, 68, 55);

        BTN_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_11ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_11);
        BTN_11.setBounds(10, 68, 68, 55);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);
        jButton13.setBounds(84, 68, 68, 55);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);
        jButton14.setBounds(158, 68, 68, 55);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);
        jButton15.setBounds(232, 68, 68, 55);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton16);
        jButton16.setBounds(306, 68, 68, 55);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);
        jButton17.setBounds(380, 68, 68, 55);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);
        jButton18.setBounds(454, 68, 68, 55);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19);
        jButton19.setBounds(528, 68, 68, 55);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton20);
        jButton20.setBounds(602, 68, 68, 55);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21);
        jButton21.setBounds(676, 68, 68, 55);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22);
        jButton22.setBounds(10, 129, 68, 55);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton23);
        jButton23.setBounds(84, 129, 68, 55);

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24);
        jButton24.setBounds(158, 129, 68, 55);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton25);
        jButton25.setBounds(232, 129, 68, 55);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton26);
        jButton26.setBounds(306, 129, 68, 55);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27);
        jButton27.setBounds(380, 129, 68, 55);

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28);
        jButton28.setBounds(454, 129, 68, 55);

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29);
        jButton29.setBounds(528, 129, 68, 55);

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton30);
        jButton30.setBounds(602, 129, 68, 55);

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31);
        jButton31.setBounds(676, 129, 68, 55);

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton32);
        jButton32.setBounds(10, 190, 68, 55);

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton33);
        jButton33.setBounds(84, 190, 68, 55);

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton34);
        jButton34.setBounds(158, 190, 68, 55);

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton35);
        jButton35.setBounds(232, 190, 68, 55);

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton36);
        jButton36.setBounds(306, 190, 68, 55);

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton37);
        jButton37.setBounds(380, 190, 68, 55);

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton38);
        jButton38.setBounds(454, 190, 68, 55);

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton39);
        jButton39.setBounds(528, 190, 68, 55);

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton40);
        jButton40.setBounds(602, 190, 68, 55);

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton41);
        jButton41.setBounds(676, 190, 68, 55);

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton42);
        jButton42.setBounds(10, 251, 68, 55);

        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton43);
        jButton43.setBounds(84, 251, 68, 55);

        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton44);
        jButton44.setBounds(158, 251, 68, 55);

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton45);
        jButton45.setBounds(232, 251, 68, 55);

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton46);
        jButton46.setBounds(306, 251, 68, 55);

        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton47);
        jButton47.setBounds(380, 251, 68, 55);

        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton48);
        jButton48.setBounds(454, 251, 68, 55);

        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton49.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton49);
        jButton49.setBounds(528, 251, 68, 55);

        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton50);
        jButton50.setBounds(602, 251, 68, 55);

        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton51);
        jButton51.setBounds(676, 251, 68, 55);

        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton52);
        jButton52.setBounds(10, 312, 68, 55);

        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton53);
        jButton53.setBounds(84, 312, 68, 55);

        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton54);
        jButton54.setBounds(158, 312, 68, 55);

        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton55.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton55);
        jButton55.setBounds(232, 312, 68, 55);

        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton56);
        jButton56.setBounds(306, 312, 68, 55);

        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton57);
        jButton57.setBounds(380, 312, 68, 55);

        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton58.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton58);
        jButton58.setBounds(454, 312, 68, 55);

        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton59.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton59);
        jButton59.setBounds(528, 312, 68, 55);

        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton60.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton60);
        jButton60.setBounds(602, 312, 68, 55);

        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton61);
        jButton61.setBounds(676, 312, 68, 55);

        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton62.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton62);
        jButton62.setBounds(10, 373, 68, 55);

        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton63.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton63);
        jButton63.setBounds(84, 373, 68, 55);

        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton64.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton64);
        jButton64.setBounds(158, 373, 68, 55);

        jButton65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton65.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton65);
        jButton65.setBounds(232, 373, 68, 55);

        jButton66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton66.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton66);
        jButton66.setBounds(306, 373, 68, 55);

        jButton67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton67.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton67);
        jButton67.setBounds(380, 373, 68, 55);

        jButton68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton68.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton68);
        jButton68.setBounds(454, 373, 68, 55);

        jButton69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton69.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton69);
        jButton69.setBounds(528, 373, 68, 55);

        jButton70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton70.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton70);
        jButton70.setBounds(602, 373, 68, 55);

        jButton71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton71);
        jButton71.setBounds(676, 373, 68, 55);

        jButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton72.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton72);
        jButton72.setBounds(10, 434, 68, 55);

        jButton73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton73.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton73);
        jButton73.setBounds(84, 434, 68, 55);

        jButton74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton74.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton74);
        jButton74.setBounds(158, 434, 68, 55);

        jButton75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton75.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton75);
        jButton75.setBounds(232, 434, 68, 55);

        jButton76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton76.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton76);
        jButton76.setBounds(306, 434, 68, 55);

        jButton77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton77.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton77);
        jButton77.setBounds(380, 434, 68, 55);

        jButton78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton78.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton78);
        jButton78.setBounds(454, 434, 68, 55);

        jButton79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton79.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton79);
        jButton79.setBounds(528, 434, 68, 55);

        jButton80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton80.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton80);
        jButton80.setBounds(602, 434, 68, 55);

        jButton81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton81.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton81);
        jButton81.setBounds(676, 434, 68, 55);

        jButton82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton82);
        jButton82.setBounds(10, 495, 68, 55);

        jButton83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton83.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton83);
        jButton83.setBounds(84, 495, 68, 55);

        jButton84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton84.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton84);
        jButton84.setBounds(158, 495, 68, 55);

        jButton85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton85.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton85);
        jButton85.setBounds(232, 495, 68, 55);

        jButton86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton86.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton86);
        jButton86.setBounds(306, 495, 68, 55);

        jButton87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton87.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton87);
        jButton87.setBounds(380, 495, 68, 55);

        jButton88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton88.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton88);
        jButton88.setBounds(454, 495, 68, 55);

        jButton89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton89.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton89);
        jButton89.setBounds(528, 495, 68, 55);

        jButton90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton90.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton90);
        jButton90.setBounds(602, 495, 68, 55);

        jButton91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton91.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton91);
        jButton91.setBounds(676, 495, 68, 55);

        jButton92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton92);
        jButton92.setBounds(10, 556, 68, 55);

        jButton93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton93);
        jButton93.setBounds(84, 556, 68, 55);

        jButton94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton94);
        jButton94.setBounds(158, 556, 68, 55);

        jButton95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton95);
        jButton95.setBounds(232, 556, 68, 55);

        jButton96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton96);
        jButton96.setBounds(306, 556, 68, 55);

        jButton97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton97);
        jButton97.setBounds(380, 556, 68, 55);

        jButton98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton98);
        jButton98.setBounds(454, 556, 68, 55);

        jButton99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton99);
        jButton99.setBounds(528, 556, 68, 55);

        jButton100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton100);
        jButton100.setBounds(602, 556, 68, 55);

        jButton101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        jButton101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton101);
        jButton101.setBounds(676, 556, 68, 55);

        JB_nuevoJuego_.setBackground(new java.awt.Color(0, 0, 0));
        JB_nuevoJuego_.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        JB_nuevoJuego_.setForeground(new java.awt.Color(0, 153, 0));
        JB_nuevoJuego_.setText("NEW GAME");
        JB_nuevoJuego_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 4));
        JB_nuevoJuego_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_nuevoJuego_ActionPerformed(evt);
            }
        });
        jPanel2.add(JB_nuevoJuego_);
        JB_nuevoJuego_.setBounds(810, 420, 230, 70);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Misiles");

        txt_Misiles_.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txt_Misiles_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Misiles_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(txt_Misiles_, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Misiles_))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(810, 140, 198, 50);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("Puntos");

        txt_Puntos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_Puntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PuntosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(txt_Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(810, 230, 200, 56);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("BATALLA NAVAL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(760, 40, 330, 60);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setText("Disparos");

        txt_disparos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_disparos_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_disparos_, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_disparos_)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(810, 310, 200, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UR1032.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(752, 5, 340, 610);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_01ActionPerformed
            control.submarinosEncontrados(BTN_01,0,0, puntos,txt_Puntos);
            control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
            
    }//GEN-LAST:event_BTN_01ActionPerformed

    private void BTN_07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_07ActionPerformed

    private void BTN_06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_06ActionPerformed

    private void BTN_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_02ActionPerformed
         control.submarinosEncontrados(BTN_02,0,1, puntos,txt_Puntos);
         control.jugada(misiles, disparos,  txt_Misiles_, txt_disparos_);
    }//GEN-LAST:event_BTN_02ActionPerformed

    private void BTN_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_10ActionPerformed

    private void BTN_03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_03ActionPerformed

    private void BTN_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_04ActionPerformed

    private void BTN_05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_05ActionPerformed

    private void BTN_08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_08ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_08ActionPerformed

    private void BTN_09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_09ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_09ActionPerformed

    private void BTN_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton101ActionPerformed

    private void JB_nuevoJuego_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_nuevoJuego_ActionPerformed
        control.imprimir();
        control.limpiar();
        control.asignarSubmarino();
        
        txt_Misiles_.setText("75");
        txt_disparos_.setText("0");
        txt_Puntos.setText("0");
        
    }//GEN-LAST:event_JB_nuevoJuego_ActionPerformed

    private void txt_PuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PuntosActionPerformed

    private void txt_Misiles_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Misiles_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Misiles_ActionPerformed

    private void txt_disparos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_disparos_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_disparos_ActionPerformed

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
            java.util.logging.Logger.getLogger(Oceano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oceano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oceano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oceano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oceano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_01;
    private javax.swing.JButton BTN_02;
    private javax.swing.JButton BTN_03;
    private javax.swing.JButton BTN_04;
    private javax.swing.JButton BTN_05;
    private javax.swing.JButton BTN_06;
    private javax.swing.JButton BTN_07;
    private javax.swing.JButton BTN_08;
    private javax.swing.JButton BTN_09;
    private javax.swing.JButton BTN_10;
    private javax.swing.JButton BTN_11;
    private javax.swing.JButton JB_nuevoJuego_;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txt_Misiles_;
    private javax.swing.JTextField txt_Puntos;
    private javax.swing.JTextField txt_disparos_;
    // End of variables declaration//GEN-END:variables
}
