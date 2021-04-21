package vista;

/**
 *
 * @author sagov8
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import modelo.ControlBatallaNaval;

public class Oceano extends javax.swing.JFrame {

    ControlBatallaNaval control;
    int misiles = 75;
    int puntos = 0;
    int disparos = 0;

    public Oceano() {
        initComponents();
        control = new ControlBatallaNaval();
        control.asignarSubmarino();
        control.imprimir();
        
        txt_Misiles_.setText("75");
        txt_Puntos.setText("0");
        txt_disparos_.setText("0");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
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
        BTN_12 = new javax.swing.JButton();
        BTN_13 = new javax.swing.JButton();
        BTN_14 = new javax.swing.JButton();
        BTN_15 = new javax.swing.JButton();
        BTN_16 = new javax.swing.JButton();
        BTN_17 = new javax.swing.JButton();
        BTN_18 = new javax.swing.JButton();
        BTN_19 = new javax.swing.JButton();
        BTN_20 = new javax.swing.JButton();
        BTN_21 = new javax.swing.JButton();
        BTN_22 = new javax.swing.JButton();
        BTN_23 = new javax.swing.JButton();
        BTN_24 = new javax.swing.JButton();
        BTN_25 = new javax.swing.JButton();
        BTN_26 = new javax.swing.JButton();
        BTN_27 = new javax.swing.JButton();
        BTN_28 = new javax.swing.JButton();
        BTN_29 = new javax.swing.JButton();
        BTN_30 = new javax.swing.JButton();
        BTN_31 = new javax.swing.JButton();
        BTN_32 = new javax.swing.JButton();
        BTN_33 = new javax.swing.JButton();
        BTN_34 = new javax.swing.JButton();
        BTN_35 = new javax.swing.JButton();
        BTN_36 = new javax.swing.JButton();
        BTN_37 = new javax.swing.JButton();
        BTN_38 = new javax.swing.JButton();
        BTN_39 = new javax.swing.JButton();
        BTN_40 = new javax.swing.JButton();
        BTN_41 = new javax.swing.JButton();
        BTN_42 = new javax.swing.JButton();
        BTN_43 = new javax.swing.JButton();
        BTN_44 = new javax.swing.JButton();
        BTN_45 = new javax.swing.JButton();
        BTN_46 = new javax.swing.JButton();
        BTN_47 = new javax.swing.JButton();
        BTN_48 = new javax.swing.JButton();
        BTN_49 = new javax.swing.JButton();
        BTN_50 = new javax.swing.JButton();
        BTN_51 = new javax.swing.JButton();
        BTN_52 = new javax.swing.JButton();
        BTN_53 = new javax.swing.JButton();
        BTN_54 = new javax.swing.JButton();
        BTN_55 = new javax.swing.JButton();
        BTN_56 = new javax.swing.JButton();
        BTN_57 = new javax.swing.JButton();
        BTN_58 = new javax.swing.JButton();
        BTN_59 = new javax.swing.JButton();
        BTN_60 = new javax.swing.JButton();
        BTN_61 = new javax.swing.JButton();
        BTN_62 = new javax.swing.JButton();
        BTN_63 = new javax.swing.JButton();
        BTN_64 = new javax.swing.JButton();
        BTN_65 = new javax.swing.JButton();
        BTN_66 = new javax.swing.JButton();
        BTN_67 = new javax.swing.JButton();
        BTN_68 = new javax.swing.JButton();
        BTN_69 = new javax.swing.JButton();
        BTN_70 = new javax.swing.JButton();
        BTN_71 = new javax.swing.JButton();
        BTN_72 = new javax.swing.JButton();
        BTN_73 = new javax.swing.JButton();
        BTN_74 = new javax.swing.JButton();
        BTN_75 = new javax.swing.JButton();
        BTN_76 = new javax.swing.JButton();
        BTN_77 = new javax.swing.JButton();
        BTN_78 = new javax.swing.JButton();
        BTN_79 = new javax.swing.JButton();
        BTN_80 = new javax.swing.JButton();
        BTN_81 = new javax.swing.JButton();
        BTN_82 = new javax.swing.JButton();
        BTN_83 = new javax.swing.JButton();
        BTN_84 = new javax.swing.JButton();
        BTN_85 = new javax.swing.JButton();
        BTN_86 = new javax.swing.JButton();
        BTN_87 = new javax.swing.JButton();
        BTN_88 = new javax.swing.JButton();
        BTN_89 = new javax.swing.JButton();
        BTN_90 = new javax.swing.JButton();
        BTN_91 = new javax.swing.JButton();
        BTN_92 = new javax.swing.JButton();
        BTN_93 = new javax.swing.JButton();
        BTN_94 = new javax.swing.JButton();
        BTN_95 = new javax.swing.JButton();
        BTN_96 = new javax.swing.JButton();
        BTN_97 = new javax.swing.JButton();
        BTN_98 = new javax.swing.JButton();
        BTN_99 = new javax.swing.JButton();
        BTN_100 = new javax.swing.JButton();
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

        BTN_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_12ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_12);
        BTN_12.setBounds(84, 68, 68, 55);

        BTN_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_13ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_13);
        BTN_13.setBounds(158, 68, 68, 55);

        BTN_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_14ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_14);
        BTN_14.setBounds(232, 68, 68, 55);

        BTN_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_15ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_15);
        BTN_15.setBounds(306, 68, 68, 55);

        BTN_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_16ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_16);
        BTN_16.setBounds(380, 68, 68, 55);

        BTN_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_17ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_17);
        BTN_17.setBounds(454, 68, 68, 55);

        BTN_18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_18ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_18);
        BTN_18.setBounds(528, 68, 68, 55);

        BTN_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_19ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_19);
        BTN_19.setBounds(602, 68, 68, 55);

        BTN_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_20ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_20);
        BTN_20.setBounds(676, 68, 68, 55);

        BTN_21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_21ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_21);
        BTN_21.setBounds(10, 129, 68, 55);

        BTN_22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_22ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_22);
        BTN_22.setBounds(84, 129, 68, 55);

        BTN_23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_23ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_23);
        BTN_23.setBounds(158, 129, 68, 55);

        BTN_24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_24ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_24);
        BTN_24.setBounds(232, 129, 68, 55);

        BTN_25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_25ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_25);
        BTN_25.setBounds(306, 129, 68, 55);

        BTN_26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_26ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_26);
        BTN_26.setBounds(380, 129, 68, 55);

        BTN_27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_27ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_27);
        BTN_27.setBounds(454, 129, 68, 55);

        BTN_28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_28ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_28);
        BTN_28.setBounds(528, 129, 68, 55);

        BTN_29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_29ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_29);
        BTN_29.setBounds(602, 129, 68, 55);

        BTN_30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_30ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_30);
        BTN_30.setBounds(676, 129, 68, 55);

        BTN_31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_31ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_31);
        BTN_31.setBounds(10, 190, 68, 55);

        BTN_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_32ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_32);
        BTN_32.setBounds(84, 190, 68, 55);

        BTN_33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_33ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_33);
        BTN_33.setBounds(158, 190, 68, 55);

        BTN_34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_34ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_34);
        BTN_34.setBounds(232, 190, 68, 55);

        BTN_35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_35ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_35);
        BTN_35.setBounds(306, 190, 68, 55);

        BTN_36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_36ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_36);
        BTN_36.setBounds(380, 190, 68, 55);

        BTN_37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_37ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_37);
        BTN_37.setBounds(454, 190, 68, 55);

        BTN_38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_38ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_38);
        BTN_38.setBounds(528, 190, 68, 55);

        BTN_39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_39ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_39);
        BTN_39.setBounds(602, 190, 68, 55);

        BTN_40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        BTN_40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_40ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_40);
        BTN_40.setBounds(676, 190, 68, 55);

        BTN_41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_41ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_41);
        BTN_41.setBounds(10, 251, 68, 55);

        BTN_42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_42ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_42);
        BTN_42.setBounds(84, 251, 68, 55);

        BTN_43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_43ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_43);
        BTN_43.setBounds(158, 251, 68, 55);

        BTN_44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_44ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_44);
        BTN_44.setBounds(232, 251, 68, 55);

        BTN_45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_45ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_45);
        BTN_45.setBounds(306, 251, 68, 55);

        BTN_46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_46ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_46);
        BTN_46.setBounds(380, 251, 68, 55);

        BTN_47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_47ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_47);
        BTN_47.setBounds(454, 251, 68, 55);

        BTN_48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_48ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_48);
        BTN_48.setBounds(528, 251, 68, 55);

        BTN_49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_49.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_49ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_49);
        BTN_49.setBounds(602, 251, 68, 55);

        BTN_50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_50ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_50);
        BTN_50.setBounds(676, 251, 68, 55);

        BTN_51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_51ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_51);
        BTN_51.setBounds(10, 312, 68, 55);

        BTN_52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_52ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_52);
        BTN_52.setBounds(84, 312, 68, 55);

        BTN_53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_53ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_53);
        BTN_53.setBounds(158, 312, 68, 55);

        BTN_54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_54ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_54);
        BTN_54.setBounds(232, 312, 68, 55);

        BTN_55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_55.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_55ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_55);
        BTN_55.setBounds(306, 312, 68, 55);

        BTN_56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_56ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_56);
        BTN_56.setBounds(380, 312, 68, 55);

        BTN_57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_57ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_57);
        BTN_57.setBounds(454, 312, 68, 55);

        BTN_58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_58.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_58ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_58);
        BTN_58.setBounds(528, 312, 68, 55);

        BTN_59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_59.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_59ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_59);
        BTN_59.setBounds(602, 312, 68, 55);

        BTN_60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_60.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_60ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_60);
        BTN_60.setBounds(676, 312, 68, 55);

        BTN_61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_61ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_61);
        BTN_61.setBounds(10, 373, 68, 55);

        BTN_62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_62.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_62ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_62);
        BTN_62.setBounds(84, 373, 68, 55);

        BTN_63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_63.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_63ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_63);
        BTN_63.setBounds(158, 373, 68, 55);

        BTN_64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_64.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_64ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_64);
        BTN_64.setBounds(232, 373, 68, 55);

        BTN_65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_65.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_65ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_65);
        BTN_65.setBounds(306, 373, 68, 55);

        BTN_66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_66.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_66ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_66);
        BTN_66.setBounds(380, 373, 68, 55);

        BTN_67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_67.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_67ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_67);
        BTN_67.setBounds(454, 373, 68, 55);

        BTN_68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_68.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_68ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_68);
        BTN_68.setBounds(528, 373, 68, 55);

        BTN_69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_69.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_69ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_69);
        BTN_69.setBounds(602, 373, 68, 55);

        BTN_70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_70.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_70ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_70);
        BTN_70.setBounds(676, 373, 68, 55);

        BTN_71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_71ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_71);
        BTN_71.setBounds(10, 434, 68, 55);

        BTN_72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_72.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_72ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_72);
        BTN_72.setBounds(84, 434, 68, 55);

        BTN_73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_73.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_73ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_73);
        BTN_73.setBounds(158, 434, 68, 55);

        BTN_74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_74.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_74ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_74);
        BTN_74.setBounds(232, 434, 68, 55);

        BTN_75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_75.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_75ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_75);
        BTN_75.setBounds(306, 434, 68, 55);

        BTN_76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_76.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_76ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_76);
        BTN_76.setBounds(380, 434, 68, 55);

        BTN_77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_77.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_77ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_77);
        BTN_77.setBounds(454, 434, 68, 55);

        BTN_78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_78.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_78ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_78);
        BTN_78.setBounds(528, 434, 68, 55);

        BTN_79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_79.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_79ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_79);
        BTN_79.setBounds(602, 434, 68, 55);

        BTN_80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_80.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_80ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_80);
        BTN_80.setBounds(676, 434, 68, 55);

        BTN_81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_81.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_81ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_81);
        BTN_81.setBounds(10, 495, 68, 55);

        BTN_82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_82ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_82);
        BTN_82.setBounds(84, 495, 68, 55);

        BTN_83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_83.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_83ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_83);
        BTN_83.setBounds(158, 495, 68, 55);

        BTN_84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_84.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_84ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_84);
        BTN_84.setBounds(232, 495, 68, 55);

        BTN_85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_85.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_85ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_85);
        BTN_85.setBounds(306, 495, 68, 55);

        BTN_86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_86.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_86ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_86);
        BTN_86.setBounds(380, 495, 68, 55);

        BTN_87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_87.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_87ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_87);
        BTN_87.setBounds(454, 495, 68, 55);

        BTN_88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_88.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_88ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_88);
        BTN_88.setBounds(528, 495, 68, 55);

        BTN_89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_89.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_89ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_89);
        BTN_89.setBounds(602, 495, 68, 55);

        BTN_90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_90.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        BTN_90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_90ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_90);
        BTN_90.setBounds(676, 495, 68, 55);

        BTN_91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        BTN_91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_91ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_91);
        BTN_91.setBounds(10, 556, 68, 55);

        BTN_92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_92.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        BTN_92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_92ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_92);
        BTN_92.setBounds(84, 556, 68, 55);

        BTN_93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_93.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        BTN_93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_93ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_93);
        BTN_93.setBounds(158, 556, 68, 55);

        BTN_94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_94.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        BTN_94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_94ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_94);
        BTN_94.setBounds(232, 556, 68, 55);

        BTN_95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        BTN_95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_95ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_95);
        BTN_95.setBounds(306, 556, 68, 55);

        BTN_96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        BTN_96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_96ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_96);
        BTN_96.setBounds(380, 556, 68, 55);

        BTN_97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        BTN_97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_97ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_97);
        BTN_97.setBounds(454, 556, 68, 55);

        BTN_98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        BTN_98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_98ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_98);
        BTN_98.setBounds(528, 556, 68, 55);

        BTN_99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        BTN_99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_99ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_99);
        BTN_99.setBounds(602, 556, 68, 55);

        BTN_100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oceano-gif-1 (1).gif"))); // NOI18N
        BTN_100.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 2));
        BTN_100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_100ActionPerformed(evt);
            }
        });
        jPanel2.add(BTN_100);
        BTN_100.setBounds(676, 556, 68, 55);

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
        control.submarinosEncontrados(BTN_01, 0, 0, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));

    }//GEN-LAST:event_BTN_01ActionPerformed

    private void BTN_07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_07ActionPerformed
        control.submarinosEncontrados(BTN_07, 0, 6, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_07ActionPerformed

    private void BTN_06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_06ActionPerformed
        control.submarinosEncontrados(BTN_06, 0, 5, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_06ActionPerformed

    private void BTN_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_02ActionPerformed
        control.submarinosEncontrados(BTN_02, 0, 1, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_02ActionPerformed

    private void BTN_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_10ActionPerformed
        control.submarinosEncontrados(BTN_10, 0, 9, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_10ActionPerformed

    private void BTN_03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_03ActionPerformed
        control.submarinosEncontrados(BTN_03, 0, 2, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_03ActionPerformed

    private void BTN_04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_04ActionPerformed
        control.submarinosEncontrados(BTN_04, 0, 3, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_04ActionPerformed

    private void BTN_05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_05ActionPerformed
        control.submarinosEncontrados(BTN_05, 0, 4, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_05ActionPerformed

    private void BTN_08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_08ActionPerformed
        control.submarinosEncontrados(BTN_08, 0, 7, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_08ActionPerformed

    private void BTN_09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_09ActionPerformed
        control.submarinosEncontrados(BTN_09, 0, 8, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_09ActionPerformed

    private void BTN_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_11ActionPerformed
        control.submarinosEncontrados(BTN_11, 1, 0, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_11ActionPerformed

    private void BTN_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_12ActionPerformed
        control.submarinosEncontrados(BTN_12, 1, 1, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_12ActionPerformed

    private void BTN_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_13ActionPerformed
        control.submarinosEncontrados(BTN_13, 1, 2, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_13ActionPerformed

    private void BTN_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_14ActionPerformed
        control.submarinosEncontrados(BTN_14, 1, 3, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_14ActionPerformed

    private void BTN_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_15ActionPerformed
        control.submarinosEncontrados(BTN_15, 1, 4, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_15ActionPerformed

    private void BTN_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_16ActionPerformed
        control.submarinosEncontrados(BTN_16, 1, 5, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_16ActionPerformed

    private void BTN_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_17ActionPerformed
        control.submarinosEncontrados(BTN_17, 1, 6, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_17ActionPerformed

    private void BTN_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_18ActionPerformed
        control.submarinosEncontrados(BTN_18, 1, 7, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_18ActionPerformed

    private void BTN_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_19ActionPerformed
        control.submarinosEncontrados(BTN_19, 1, 8, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_19ActionPerformed

    private void BTN_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_20ActionPerformed
        control.submarinosEncontrados(BTN_20, 1, 9, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_20ActionPerformed

    private void BTN_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_21ActionPerformed
        control.submarinosEncontrados(BTN_21, 2, 0, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_21ActionPerformed

    private void BTN_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_22ActionPerformed
        control.submarinosEncontrados(BTN_22, 2, 1, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_22ActionPerformed

    private void BTN_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_23ActionPerformed
        control.submarinosEncontrados(BTN_23, 2, 2, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_23ActionPerformed

    private void BTN_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_24ActionPerformed
        control.submarinosEncontrados(BTN_24, 2, 3, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_24ActionPerformed

    private void BTN_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_25ActionPerformed
        control.submarinosEncontrados(BTN_25, 2, 4, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_25ActionPerformed

    private void BTN_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_26ActionPerformed
        control.submarinosEncontrados(BTN_26, 2, 5, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_26ActionPerformed

    private void BTN_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_27ActionPerformed
        control.submarinosEncontrados(BTN_27, 2, 6, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_27ActionPerformed

    private void BTN_28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_28ActionPerformed
        control.submarinosEncontrados(BTN_28, 2, 7, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_28ActionPerformed

    private void BTN_29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_29ActionPerformed
        control.submarinosEncontrados(BTN_29, 2, 8, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_29ActionPerformed

    private void BTN_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_30ActionPerformed
        control.submarinosEncontrados(BTN_30, 2, 9, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_30ActionPerformed

    private void BTN_31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_31ActionPerformed
        control.submarinosEncontrados(BTN_31, 3, 0, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_31ActionPerformed

    private void BTN_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_32ActionPerformed
        control.submarinosEncontrados(BTN_32, 3, 1, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_32ActionPerformed

    private void BTN_33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_33ActionPerformed
        control.submarinosEncontrados(BTN_33, 3, 2, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_33ActionPerformed

    private void BTN_34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_34ActionPerformed
        control.submarinosEncontrados(BTN_34, 3, 3, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_34ActionPerformed

    private void BTN_35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_35ActionPerformed
        control.submarinosEncontrados(BTN_35, 3, 4, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_35ActionPerformed

    private void BTN_36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_36ActionPerformed
        control.submarinosEncontrados(BTN_36, 3, 5, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_36ActionPerformed

    private void BTN_37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_37ActionPerformed
        control.submarinosEncontrados(BTN_37, 3, 6, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_37ActionPerformed

    private void BTN_38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_38ActionPerformed
        control.submarinosEncontrados(BTN_38, 3, 7, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_38ActionPerformed

    private void BTN_39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_39ActionPerformed
        control.submarinosEncontrados(BTN_39, 3, 8, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_39ActionPerformed

    private void BTN_40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_40ActionPerformed
        control.submarinosEncontrados(BTN_40, 3, 9, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_40ActionPerformed

    private void BTN_41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_41ActionPerformed
        control.submarinosEncontrados(BTN_41, 4, 0, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_41ActionPerformed

    private void BTN_42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_42ActionPerformed
        control.submarinosEncontrados(BTN_42, 4, 1, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_42ActionPerformed

    private void BTN_43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_43ActionPerformed
        control.submarinosEncontrados(BTN_43, 4, 2, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_43ActionPerformed

    private void BTN_44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_44ActionPerformed
        control.submarinosEncontrados(BTN_44, 4, 3, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_44ActionPerformed

    private void BTN_45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_45ActionPerformed
        control.submarinosEncontrados(BTN_45, 4, 4, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_45ActionPerformed

    private void BTN_46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_46ActionPerformed
        control.submarinosEncontrados(BTN_46, 4, 5, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_46ActionPerformed

    private void BTN_47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_47ActionPerformed
        control.submarinosEncontrados(BTN_47, 4, 6, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_47ActionPerformed

    private void BTN_48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_48ActionPerformed
        control.submarinosEncontrados(BTN_48, 4, 7, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_48ActionPerformed

    private void BTN_49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_49ActionPerformed
        control.submarinosEncontrados(BTN_49, 4, 8, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_49ActionPerformed

    private void BTN_50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_50ActionPerformed
        control.submarinosEncontrados(BTN_50, 4, 9, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_50ActionPerformed

    private void BTN_51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_51ActionPerformed
        control.submarinosEncontrados(BTN_51, 5, 0, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_51ActionPerformed

    private void BTN_52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_52ActionPerformed
        control.submarinosEncontrados(BTN_52, 5, 1, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_52ActionPerformed

    private void BTN_53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_53ActionPerformed
        control.submarinosEncontrados(BTN_53, 5, 2, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_53ActionPerformed

    private void BTN_54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_54ActionPerformed
        control.submarinosEncontrados(BTN_54, 5, 3, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_54ActionPerformed

    private void BTN_55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_55ActionPerformed
        control.submarinosEncontrados(BTN_55, 5, 4, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_55ActionPerformed

    private void BTN_56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_56ActionPerformed
        control.submarinosEncontrados(BTN_56, 5, 5, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_56ActionPerformed

    private void BTN_57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_57ActionPerformed
        control.submarinosEncontrados(BTN_57, 5, 6, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_57ActionPerformed

    private void BTN_58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_58ActionPerformed
        control.submarinosEncontrados(BTN_58, 5, 7, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_58ActionPerformed

    private void BTN_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_59ActionPerformed
        control.submarinosEncontrados(BTN_59, 5, 8, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_59ActionPerformed

    private void BTN_60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_60ActionPerformed
        control.submarinosEncontrados(BTN_60, 5, 9, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_60ActionPerformed

    private void BTN_61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_61ActionPerformed
        control.submarinosEncontrados(BTN_61, 6, 0, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_61ActionPerformed

    private void BTN_62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_62ActionPerformed
        control.submarinosEncontrados(BTN_62, 6, 1, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_62ActionPerformed

    private void BTN_63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_63ActionPerformed
        control.submarinosEncontrados(BTN_63, 6, 2, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_63ActionPerformed

    private void BTN_64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_64ActionPerformed
        control.submarinosEncontrados(BTN_64, 6, 3, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_64ActionPerformed

    private void BTN_65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_65ActionPerformed
        control.submarinosEncontrados(BTN_65, 6, 4, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_65ActionPerformed

    private void BTN_66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_66ActionPerformed
        control.submarinosEncontrados(BTN_66, 6, 5, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_66ActionPerformed

    private void BTN_67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_67ActionPerformed
        control.submarinosEncontrados(BTN_67, 6, 6, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_67ActionPerformed

    private void BTN_68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_68ActionPerformed
        control.submarinosEncontrados(BTN_68, 6, 7, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_68ActionPerformed

    private void BTN_69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_69ActionPerformed
        control.submarinosEncontrados(BTN_69, 6, 8, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_69ActionPerformed

    private void BTN_70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_70ActionPerformed
        control.submarinosEncontrados(BTN_70, 6, 9, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_70ActionPerformed

    private void BTN_71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_71ActionPerformed
        control.submarinosEncontrados(BTN_71, 7, 0, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_71ActionPerformed

    private void BTN_72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_72ActionPerformed
        control.submarinosEncontrados(BTN_72, 7, 1, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_72ActionPerformed

    private void BTN_73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_73ActionPerformed
        control.submarinosEncontrados(BTN_73, 7, 2, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_73ActionPerformed

    private void BTN_74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_74ActionPerformed
        control.submarinosEncontrados(BTN_74, 7, 3, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_74ActionPerformed

    private void BTN_75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_75ActionPerformed
        control.submarinosEncontrados(BTN_75, 7, 4, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_75ActionPerformed

    private void BTN_76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_76ActionPerformed
        control.submarinosEncontrados(BTN_76, 7, 5, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_76ActionPerformed

    private void BTN_77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_77ActionPerformed
        control.submarinosEncontrados(BTN_77, 7, 6, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_77ActionPerformed

    private void BTN_78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_78ActionPerformed
        control.submarinosEncontrados(BTN_78, 7, 7, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_78ActionPerformed

    private void BTN_79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_79ActionPerformed
        control.submarinosEncontrados(BTN_79, 7, 8, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_79ActionPerformed

    private void BTN_80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_80ActionPerformed
        control.submarinosEncontrados(BTN_80, 7, 9, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_80ActionPerformed

    private void BTN_81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_81ActionPerformed
        control.submarinosEncontrados(BTN_81, 8, 0, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_81ActionPerformed

    private void BTN_82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_82ActionPerformed
        control.submarinosEncontrados(BTN_82, 8, 1, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_82ActionPerformed

    private void BTN_83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_83ActionPerformed
        control.submarinosEncontrados(BTN_83, 8, 2, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_83ActionPerformed

    private void BTN_84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_84ActionPerformed
        control.submarinosEncontrados(BTN_84, 8, 3, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_84ActionPerformed

    private void BTN_85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_85ActionPerformed
        control.submarinosEncontrados(BTN_85, 8, 4, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_85ActionPerformed

    private void BTN_86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_86ActionPerformed
        control.submarinosEncontrados(BTN_86, 8, 5, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_86ActionPerformed

    private void BTN_87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_87ActionPerformed
        control.submarinosEncontrados(BTN_87, 8, 6, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_87ActionPerformed

    private void BTN_88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_88ActionPerformed
        control.submarinosEncontrados(BTN_88, 8, 7, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_88ActionPerformed

    private void BTN_89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_89ActionPerformed
        control.submarinosEncontrados(BTN_89, 8, 8, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_89ActionPerformed

    private void BTN_90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_90ActionPerformed
        control.submarinosEncontrados(BTN_90, 8, 9, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_90ActionPerformed

    private void BTN_91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_91ActionPerformed
        control.submarinosEncontrados(BTN_91, 9, 0, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_91ActionPerformed

    private void BTN_92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_92ActionPerformed
        control.submarinosEncontrados(BTN_92, 9, 1, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_92ActionPerformed

    private void BTN_93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_93ActionPerformed
        control.submarinosEncontrados(BTN_93, 9, 2, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_93ActionPerformed

    private void BTN_94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_94ActionPerformed
        control.submarinosEncontrados(BTN_94, 9, 3, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_94ActionPerformed

    private void BTN_95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_95ActionPerformed
        control.submarinosEncontrados(BTN_95, 9, 4, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_95ActionPerformed

    private void BTN_96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_96ActionPerformed
        control.submarinosEncontrados(BTN_96, 9, 5, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_96ActionPerformed

    private void BTN_97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_97ActionPerformed
        control.submarinosEncontrados(BTN_97, 9, 6, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_97ActionPerformed

    private void BTN_98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_98ActionPerformed
        control.submarinosEncontrados(BTN_98, 9, 7, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_98ActionPerformed

    private void BTN_99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_99ActionPerformed
        control.submarinosEncontrados(BTN_99, 9, 8, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_99ActionPerformed

    private void BTN_100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_100ActionPerformed
        control.submarinosEncontrados(BTN_100, 9, 9, puntos, txt_Puntos);
        control.jugada(misiles, disparos, txt_Misiles_, txt_disparos_);
        control.comparar(Integer.parseInt(txt_Puntos.getText()), Integer.parseInt(txt_Misiles_.getText()));
    }//GEN-LAST:event_BTN_100ActionPerformed

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
    public javax.swing.JButton BTN_01;
    private javax.swing.JButton BTN_02;
    private javax.swing.JButton BTN_03;
    private javax.swing.JButton BTN_04;
    private javax.swing.JButton BTN_05;
    private javax.swing.JButton BTN_06;
    private javax.swing.JButton BTN_07;
    private javax.swing.JButton BTN_08;
    private javax.swing.JButton BTN_09;
    private javax.swing.JButton BTN_10;
    private javax.swing.JButton BTN_100;
    private javax.swing.JButton BTN_11;
    private javax.swing.JButton BTN_12;
    private javax.swing.JButton BTN_13;
    private javax.swing.JButton BTN_14;
    private javax.swing.JButton BTN_15;
    private javax.swing.JButton BTN_16;
    private javax.swing.JButton BTN_17;
    private javax.swing.JButton BTN_18;
    private javax.swing.JButton BTN_19;
    private javax.swing.JButton BTN_20;
    private javax.swing.JButton BTN_21;
    private javax.swing.JButton BTN_22;
    private javax.swing.JButton BTN_23;
    private javax.swing.JButton BTN_24;
    private javax.swing.JButton BTN_25;
    private javax.swing.JButton BTN_26;
    private javax.swing.JButton BTN_27;
    private javax.swing.JButton BTN_28;
    private javax.swing.JButton BTN_29;
    private javax.swing.JButton BTN_30;
    private javax.swing.JButton BTN_31;
    private javax.swing.JButton BTN_32;
    private javax.swing.JButton BTN_33;
    private javax.swing.JButton BTN_34;
    private javax.swing.JButton BTN_35;
    private javax.swing.JButton BTN_36;
    private javax.swing.JButton BTN_37;
    private javax.swing.JButton BTN_38;
    private javax.swing.JButton BTN_39;
    private javax.swing.JButton BTN_40;
    private javax.swing.JButton BTN_41;
    private javax.swing.JButton BTN_42;
    private javax.swing.JButton BTN_43;
    private javax.swing.JButton BTN_44;
    private javax.swing.JButton BTN_45;
    private javax.swing.JButton BTN_46;
    private javax.swing.JButton BTN_47;
    private javax.swing.JButton BTN_48;
    private javax.swing.JButton BTN_49;
    private javax.swing.JButton BTN_50;
    private javax.swing.JButton BTN_51;
    private javax.swing.JButton BTN_52;
    private javax.swing.JButton BTN_53;
    private javax.swing.JButton BTN_54;
    private javax.swing.JButton BTN_55;
    private javax.swing.JButton BTN_56;
    private javax.swing.JButton BTN_57;
    private javax.swing.JButton BTN_58;
    private javax.swing.JButton BTN_59;
    private javax.swing.JButton BTN_60;
    private javax.swing.JButton BTN_61;
    private javax.swing.JButton BTN_62;
    private javax.swing.JButton BTN_63;
    private javax.swing.JButton BTN_64;
    private javax.swing.JButton BTN_65;
    private javax.swing.JButton BTN_66;
    private javax.swing.JButton BTN_67;
    private javax.swing.JButton BTN_68;
    private javax.swing.JButton BTN_69;
    private javax.swing.JButton BTN_70;
    private javax.swing.JButton BTN_71;
    private javax.swing.JButton BTN_72;
    private javax.swing.JButton BTN_73;
    private javax.swing.JButton BTN_74;
    private javax.swing.JButton BTN_75;
    private javax.swing.JButton BTN_76;
    private javax.swing.JButton BTN_77;
    private javax.swing.JButton BTN_78;
    private javax.swing.JButton BTN_79;
    private javax.swing.JButton BTN_80;
    private javax.swing.JButton BTN_81;
    private javax.swing.JButton BTN_82;
    private javax.swing.JButton BTN_83;
    private javax.swing.JButton BTN_84;
    private javax.swing.JButton BTN_85;
    private javax.swing.JButton BTN_86;
    private javax.swing.JButton BTN_87;
    private javax.swing.JButton BTN_88;
    private javax.swing.JButton BTN_89;
    private javax.swing.JButton BTN_90;
    private javax.swing.JButton BTN_91;
    private javax.swing.JButton BTN_92;
    private javax.swing.JButton BTN_93;
    private javax.swing.JButton BTN_94;
    private javax.swing.JButton BTN_95;
    private javax.swing.JButton BTN_96;
    private javax.swing.JButton BTN_97;
    private javax.swing.JButton BTN_98;
    private javax.swing.JButton BTN_99;
    private javax.swing.JButton JB_nuevoJuego_;
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
