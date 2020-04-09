// Created on 19/07/2011, 21:47:39
package View;

import Utilitarios.Verificar;
import javax.swing.*;

public class Telaprincipal extends javax.swing.JFrame {

    public Telaprincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jbLogoff.setEnabled(false);
    }

    public JDesktopPane getDesktop() {
        return jDesktop;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktop = new javax.swing.JDesktopPane();
        jbFrancio = new Button.MyButton();
        jbSodio = new Button.MyButton();
        jbPotassio = new Button.MyButton();
        jbRubidio = new Button.MyButton();
        jbCesio = new Button.MyButton();
        jbRadio = new Button.MyButton();
        jbBerilio = new Button.MyButton();
        jbMagnesio = new Button.MyButton();
        jbCalcio = new Button.MyButton();
        jbEstroncio = new Button.MyButton();
        jbBario = new Button.MyButton();
        jbItrio = new Button.MyButton();
        jbEscandio = new Button.MyButton();
        jbVanadio = new Button.MyButton();
        jbTitanio = new Button.MyButton();
        jbZirconio = new Button.MyButton();
        jbTantalo = new Button.MyButton();
        jbNiobio = new Button.MyButton();
        jbHafnio = new Button.MyButton();
        jbCromo = new Button.MyButton();
        jbRutherfordio = new Button.MyButton();
        jbPlatina = new Button.MyButton();
        jbDubnio = new Button.MyButton();
        jbMolibdenio = new Button.MyButton();
        jbTungstenio = new Button.MyButton();
        jbSeaborgio = new Button.MyButton();
        jbManganes = new Button.MyButton();
        jbTecnecio = new Button.MyButton();
        jbRenio = new Button.MyButton();
        jbBorio = new Button.MyButton();
        jbFerro = new Button.MyButton();
        jbRutenio = new Button.MyButton();
        jbOsmio = new Button.MyButton();
        jbHassio = new Button.MyButton();
        jbCobalto = new Button.MyButton();
        jbRodio = new Button.MyButton();
        jbNiquel = new Button.MyButton();
        jbCopernicio = new Button.MyButton();
        jbMeitnerio = new Button.MyButton();
        jlElemento = new javax.swing.JLabel();
        jbIridio = new Button.MyButton();
        jbPaladio = new Button.MyButton();
        jbDarmstadio = new Button.MyButton();
        jbCobre = new Button.MyButton();
        jbPrata = new Button.MyButton();
        jbOuro = new Button.MyButton();
        jbRoentgenio = new Button.MyButton();
        jbZinco = new Button.MyButton();
        jbCadmio = new Button.MyButton();
        jbMercurio = new Button.MyButton();
        jbUnunhexio = new Button.MyButton();
        jbUnuntrio = new Button.MyButton();
        jbAluminio = new Button.MyButton();
        jbUnunpentio = new Button.MyButton();
        jbFluor = new Button.MyButton();
        jbUnunseptio = new Button.MyButton();
        jbHelio = new Button.MyButton();
        jbUnunnoctio = new Button.MyButton();
        jbUnunquadio = new Button.MyButton();
        jbBoro = new Button.MyButton();
        jbPolonio = new Button.MyButton();
        jbChumbo = new Button.MyButton();
        jbBismuto = new Button.MyButton();
        jbTalio = new Button.MyButton();
        jbIndio = new Button.MyButton();
        jbGalio = new Button.MyButton();
        jbEstanho = new Button.MyButton();
        jbTelurio = new Button.MyButton();
        jbAntiomonio = new Button.MyButton();
        jbGermanio = new Button.MyButton();
        jbArsenio = new Button.MyButton();
        jbSilicio = new Button.MyButton();
        jbAstato = new Button.MyButton();
        jbIodo = new Button.MyButton();
        jbBromo = new Button.MyButton();
        jbCloro = new Button.MyButton();
        jbNitrogenio = new Button.MyButton();
        jbCarbono = new Button.MyButton();
        jbFosforo = new Button.MyButton();
        jbSelenio = new Button.MyButton();
        jbEnxofre = new Button.MyButton();
        jbOxigenio = new Button.MyButton();
        jbRadonio = new Button.MyButton();
        jbCriptonio = new Button.MyButton();
        jbArgonio = new Button.MyButton();
        jbNeonio = new Button.MyButton();
        jbXenonio = new Button.MyButton();
        jbLitio = new Button.MyButton();
        jbHidrogenio = new Button.MyButton();
        jbLutecio = new Button.MyButton();
        jbLaurencio = new Button.MyButton();
        jbLantanio = new Button.MyButton();
        jbCerio = new Button.MyButton();
        jbPraseodímio = new Button.MyButton();
        jbNeodimio = new Button.MyButton();
        jbPromecio = new Button.MyButton();
        jbSamario = new Button.MyButton();
        jbEuropio = new Button.MyButton();
        jbGadolinio = new Button.MyButton();
        jbTerbio = new Button.MyButton();
        jbDiprosio = new Button.MyButton();
        jbHolmio = new Button.MyButton();
        jbErbio = new Button.MyButton();
        jbTulio = new Button.MyButton();
        jbIterbio = new Button.MyButton();
        jbActinio = new Button.MyButton();
        jbTorio = new Button.MyButton();
        jbProtactinio = new Button.MyButton();
        jbUranio = new Button.MyButton();
        jbNeptunio = new Button.MyButton();
        jbPlutonio = new Button.MyButton();
        jbAmericio = new Button.MyButton();
        jbCurio = new Button.MyButton();
        jbBerquelio = new Button.MyButton();
        jbCalifornio = new Button.MyButton();
        jbEisntenio = new Button.MyButton();
        jbFermio = new Button.MyButton();
        jbMendelevio = new Button.MyButton();
        jbNobelio = new Button.MyButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jbGases = new javax.swing.JButton();
        jbSemimetais = new javax.swing.JButton();
        jbHalogenio = new javax.swing.JButton();
        jbMetais = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jbPos = new javax.swing.JButton();
        jbAlcalinos = new javax.swing.JButton();
        jbNaometais = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jbLantanideo = new javax.swing.JButton();
        jbActinideo = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JLabel();
        jbJogar = new javax.swing.JButton();
        jbLogoff = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jbTerroso = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiLogin = new javax.swing.JMenuItem();
        jmiJogar = new javax.swing.JMenuItem();
        jmiRanking = new javax.swing.JMenuItem();
        jmAjuda = new javax.swing.JMenu();
        jmSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabela Periódica Interativa");

        jDesktop.setBackground(new java.awt.Color(255, 255, 255));

        jbFrancio.setBackground(new java.awt.Color(239, 156, 0));
        jbFrancio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbFrancio.setForeground(new java.awt.Color(239, 156, 0));
        jbFrancio.setText("Fr");
        jbFrancio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbFrancio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbFrancioMouseEntered(evt);
            }
        });
        jbFrancio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFrancioActionPerformed(evt);
            }
        });
        jbFrancio.setBounds(140, 350, 40, 40);
        jDesktop.add(jbFrancio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbSodio.setBackground(new java.awt.Color(239, 156, 0));
        jbSodio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSodio.setForeground(new java.awt.Color(239, 156, 0));
        jbSodio.setText("Na");
        jbSodio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbSodio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSodioMouseEntered(evt);
            }
        });
        jbSodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSodioActionPerformed(evt);
            }
        });
        jbSodio.setBounds(140, 190, 40, 40);
        jDesktop.add(jbSodio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbPotassio.setBackground(new java.awt.Color(239, 156, 0));
        jbPotassio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPotassio.setForeground(new java.awt.Color(239, 156, 0));
        jbPotassio.setText("K");
        jbPotassio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbPotassio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPotassioMouseEntered(evt);
            }
        });
        jbPotassio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPotassioActionPerformed(evt);
            }
        });
        jbPotassio.setBounds(140, 230, 40, 40);
        jDesktop.add(jbPotassio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbRubidio.setBackground(new java.awt.Color(239, 156, 0));
        jbRubidio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRubidio.setForeground(new java.awt.Color(239, 156, 0));
        jbRubidio.setText("Rb");
        jbRubidio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbRubidio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRubidioMouseEntered(evt);
            }
        });
        jbRubidio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRubidioActionPerformed(evt);
            }
        });
        jbRubidio.setBounds(140, 270, 40, 40);
        jDesktop.add(jbRubidio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCesio.setBackground(new java.awt.Color(239, 156, 0));
        jbCesio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCesio.setForeground(new java.awt.Color(239, 156, 0));
        jbCesio.setText("Cs");
        jbCesio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCesio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCesioMouseEntered(evt);
            }
        });
        jbCesio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCesioActionPerformed(evt);
            }
        });
        jbCesio.setBounds(140, 310, 40, 40);
        jDesktop.add(jbCesio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbRadio.setBackground(new java.awt.Color(153, 153, 0));
        jbRadio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRadio.setForeground(new java.awt.Color(153, 153, 0));
        jbRadio.setText("Ra");
        jbRadio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRadioMouseEntered(evt);
            }
        });
        jbRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRadioActionPerformed(evt);
            }
        });
        jbRadio.setBounds(180, 350, 40, 40);
        jDesktop.add(jbRadio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbBerilio.setBackground(new java.awt.Color(153, 153, 0));
        jbBerilio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBerilio.setForeground(new java.awt.Color(153, 153, 0));
        jbBerilio.setText("Be");
        jbBerilio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbBerilio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBerilioMouseEntered(evt);
            }
        });
        jbBerilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBerilioActionPerformed(evt);
            }
        });
        jbBerilio.setBounds(180, 150, 40, 40);
        jDesktop.add(jbBerilio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbMagnesio.setBackground(new java.awt.Color(153, 153, 0));
        jbMagnesio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMagnesio.setForeground(new java.awt.Color(153, 153, 0));
        jbMagnesio.setText("Mg");
        jbMagnesio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbMagnesio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbMagnesioMouseEntered(evt);
            }
        });
        jbMagnesio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMagnesioActionPerformed(evt);
            }
        });
        jbMagnesio.setBounds(180, 190, 40, 40);
        jDesktop.add(jbMagnesio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCalcio.setBackground(new java.awt.Color(153, 153, 0));
        jbCalcio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCalcio.setForeground(new java.awt.Color(153, 153, 0));
        jbCalcio.setText("Ca");
        jbCalcio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCalcio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCalcioMouseEntered(evt);
            }
        });
        jbCalcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalcioActionPerformed(evt);
            }
        });
        jbCalcio.setBounds(180, 230, 40, 40);
        jDesktop.add(jbCalcio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbEstroncio.setBackground(new java.awt.Color(153, 153, 0));
        jbEstroncio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEstroncio.setForeground(new java.awt.Color(153, 153, 0));
        jbEstroncio.setText("Sr");
        jbEstroncio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbEstroncio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbEstroncioMouseEntered(evt);
            }
        });
        jbEstroncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstroncioActionPerformed(evt);
            }
        });
        jbEstroncio.setBounds(180, 270, 40, 40);
        jDesktop.add(jbEstroncio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbBario.setBackground(new java.awt.Color(153, 153, 0));
        jbBario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBario.setForeground(new java.awt.Color(153, 153, 0));
        jbBario.setText("Ba");
        jbBario.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbBario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBarioMouseEntered(evt);
            }
        });
        jbBario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBarioActionPerformed(evt);
            }
        });
        jbBario.setBounds(180, 310, 40, 40);
        jDesktop.add(jbBario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbItrio.setBackground(new java.awt.Color(255, 102, 102));
        jbItrio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbItrio.setForeground(new java.awt.Color(255, 102, 102));
        jbItrio.setText("Y");
        jbItrio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbItrio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbItrioMouseEntered(evt);
            }
        });
        jbItrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbItrioActionPerformed(evt);
            }
        });
        jbItrio.setBounds(220, 270, 40, 40);
        jDesktop.add(jbItrio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbEscandio.setBackground(new java.awt.Color(255, 102, 102));
        jbEscandio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEscandio.setForeground(new java.awt.Color(255, 102, 102));
        jbEscandio.setText("Sc");
        jbEscandio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbEscandio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbEscandioMouseEntered(evt);
            }
        });
        jbEscandio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEscandioActionPerformed(evt);
            }
        });
        jbEscandio.setBounds(220, 230, 40, 40);
        jDesktop.add(jbEscandio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbVanadio.setBackground(new java.awt.Color(255, 102, 102));
        jbVanadio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbVanadio.setForeground(new java.awt.Color(255, 102, 102));
        jbVanadio.setText("V");
        jbVanadio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbVanadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbVanadioMouseEntered(evt);
            }
        });
        jbVanadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVanadioActionPerformed(evt);
            }
        });
        jbVanadio.setBounds(300, 230, 40, 40);
        jDesktop.add(jbVanadio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbTitanio.setBackground(new java.awt.Color(255, 102, 102));
        jbTitanio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTitanio.setForeground(new java.awt.Color(255, 102, 102));
        jbTitanio.setText("Ti");
        jbTitanio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbTitanio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTitanioMouseEntered(evt);
            }
        });
        jbTitanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTitanioActionPerformed(evt);
            }
        });
        jbTitanio.setBounds(260, 230, 40, 40);
        jDesktop.add(jbTitanio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbZirconio.setBackground(new java.awt.Color(255, 102, 102));
        jbZirconio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbZirconio.setForeground(new java.awt.Color(255, 102, 102));
        jbZirconio.setText("Zr");
        jbZirconio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbZirconio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbZirconioMouseEntered(evt);
            }
        });
        jbZirconio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbZirconioActionPerformed(evt);
            }
        });
        jbZirconio.setBounds(260, 270, 40, 40);
        jDesktop.add(jbZirconio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbTantalo.setBackground(new java.awt.Color(255, 102, 102));
        jbTantalo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTantalo.setForeground(new java.awt.Color(255, 102, 102));
        jbTantalo.setText("Ta");
        jbTantalo.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbTantalo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTantaloMouseEntered(evt);
            }
        });
        jbTantalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTantaloActionPerformed(evt);
            }
        });
        jbTantalo.setBounds(300, 310, 40, 40);
        jDesktop.add(jbTantalo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbNiobio.setBackground(new java.awt.Color(255, 102, 102));
        jbNiobio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNiobio.setForeground(new java.awt.Color(255, 102, 102));
        jbNiobio.setText("Nb");
        jbNiobio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbNiobio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbNiobioMouseEntered(evt);
            }
        });
        jbNiobio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNiobioActionPerformed(evt);
            }
        });
        jbNiobio.setBounds(300, 270, 40, 40);
        jDesktop.add(jbNiobio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbHafnio.setBackground(new java.awt.Color(255, 102, 102));
        jbHafnio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbHafnio.setForeground(new java.awt.Color(255, 102, 102));
        jbHafnio.setText("Hf");
        jbHafnio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbHafnio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbHafnioMouseEntered(evt);
            }
        });
        jbHafnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHafnioActionPerformed(evt);
            }
        });
        jbHafnio.setBounds(260, 310, 40, 40);
        jDesktop.add(jbHafnio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCromo.setBackground(new java.awt.Color(255, 102, 102));
        jbCromo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCromo.setForeground(new java.awt.Color(255, 102, 102));
        jbCromo.setText("Cr");
        jbCromo.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCromoMouseEntered(evt);
            }
        });
        jbCromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCromoActionPerformed(evt);
            }
        });
        jbCromo.setBounds(340, 230, 40, 40);
        jDesktop.add(jbCromo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbRutherfordio.setBackground(new java.awt.Color(255, 102, 102));
        jbRutherfordio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRutherfordio.setForeground(new java.awt.Color(255, 102, 102));
        jbRutherfordio.setText("Rf");
        jbRutherfordio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbRutherfordio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRutherfordioMouseEntered(evt);
            }
        });
        jbRutherfordio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRutherfordioActionPerformed(evt);
            }
        });
        jbRutherfordio.setBounds(260, 350, 40, 40);
        jDesktop.add(jbRutherfordio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbPlatina.setBackground(new java.awt.Color(255, 102, 102));
        jbPlatina.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPlatina.setForeground(new java.awt.Color(255, 102, 102));
        jbPlatina.setText("Pt");
        jbPlatina.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbPlatina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPlatinaMouseEntered(evt);
            }
        });
        jbPlatina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlatinaActionPerformed(evt);
            }
        });
        jbPlatina.setBounds(500, 310, 40, 40);
        jDesktop.add(jbPlatina, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbDubnio.setBackground(new java.awt.Color(255, 102, 102));
        jbDubnio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbDubnio.setForeground(new java.awt.Color(255, 102, 102));
        jbDubnio.setText("Db");
        jbDubnio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbDubnio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbDubnioMouseEntered(evt);
            }
        });
        jbDubnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDubnioActionPerformed(evt);
            }
        });
        jbDubnio.setBounds(300, 350, 40, 40);
        jDesktop.add(jbDubnio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbMolibdenio.setBackground(new java.awt.Color(255, 102, 102));
        jbMolibdenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMolibdenio.setForeground(new java.awt.Color(255, 102, 102));
        jbMolibdenio.setText("Mo");
        jbMolibdenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbMolibdenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbMolibdenioMouseEntered(evt);
            }
        });
        jbMolibdenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMolibdenioActionPerformed(evt);
            }
        });
        jbMolibdenio.setBounds(340, 270, 40, 40);
        jDesktop.add(jbMolibdenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbTungstenio.setBackground(new java.awt.Color(255, 102, 102));
        jbTungstenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTungstenio.setForeground(new java.awt.Color(255, 102, 102));
        jbTungstenio.setText("W");
        jbTungstenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbTungstenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTungstenioMouseEntered(evt);
            }
        });
        jbTungstenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTungstenioActionPerformed(evt);
            }
        });
        jbTungstenio.setBounds(340, 310, 40, 40);
        jDesktop.add(jbTungstenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbSeaborgio.setBackground(new java.awt.Color(255, 102, 102));
        jbSeaborgio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSeaborgio.setForeground(new java.awt.Color(255, 102, 102));
        jbSeaborgio.setText("Sg");
        jbSeaborgio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbSeaborgio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSeaborgioMouseEntered(evt);
            }
        });
        jbSeaborgio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSeaborgioActionPerformed(evt);
            }
        });
        jbSeaborgio.setBounds(340, 350, 40, 40);
        jDesktop.add(jbSeaborgio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbManganes.setBackground(new java.awt.Color(255, 102, 102));
        jbManganes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbManganes.setForeground(new java.awt.Color(255, 102, 102));
        jbManganes.setText("Mn");
        jbManganes.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbManganes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbManganesMouseEntered(evt);
            }
        });
        jbManganes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbManganesActionPerformed(evt);
            }
        });
        jbManganes.setBounds(380, 230, 40, 40);
        jDesktop.add(jbManganes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbTecnecio.setBackground(new java.awt.Color(255, 102, 102));
        jbTecnecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTecnecio.setForeground(new java.awt.Color(255, 102, 102));
        jbTecnecio.setText("Tc");
        jbTecnecio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbTecnecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTecnecioMouseEntered(evt);
            }
        });
        jbTecnecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTecnecioActionPerformed(evt);
            }
        });
        jbTecnecio.setBounds(380, 270, 40, 40);
        jDesktop.add(jbTecnecio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbRenio.setBackground(new java.awt.Color(255, 102, 102));
        jbRenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRenio.setForeground(new java.awt.Color(255, 102, 102));
        jbRenio.setText("Re");
        jbRenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbRenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRenioMouseEntered(evt);
            }
        });
        jbRenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRenioActionPerformed(evt);
            }
        });
        jbRenio.setBounds(380, 310, 40, 40);
        jDesktop.add(jbRenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbBorio.setBackground(new java.awt.Color(255, 102, 102));
        jbBorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBorio.setForeground(new java.awt.Color(255, 102, 102));
        jbBorio.setText("Bh");
        jbBorio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbBorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBorioMouseEntered(evt);
            }
        });
        jbBorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorioActionPerformed(evt);
            }
        });
        jbBorio.setBounds(380, 350, 40, 40);
        jDesktop.add(jbBorio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbFerro.setBackground(new java.awt.Color(255, 102, 102));
        jbFerro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbFerro.setForeground(new java.awt.Color(255, 102, 102));
        jbFerro.setText("Fe");
        jbFerro.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbFerro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbFerroMouseEntered(evt);
            }
        });
        jbFerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFerroActionPerformed(evt);
            }
        });
        jbFerro.setBounds(420, 230, 40, 40);
        jDesktop.add(jbFerro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbRutenio.setBackground(new java.awt.Color(255, 102, 102));
        jbRutenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRutenio.setForeground(new java.awt.Color(255, 102, 102));
        jbRutenio.setText("Ru");
        jbRutenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbRutenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRutenioMouseEntered(evt);
            }
        });
        jbRutenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRutenioActionPerformed(evt);
            }
        });
        jbRutenio.setBounds(420, 270, 40, 40);
        jDesktop.add(jbRutenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbOsmio.setBackground(new java.awt.Color(255, 102, 102));
        jbOsmio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbOsmio.setForeground(new java.awt.Color(255, 102, 102));
        jbOsmio.setText("Os");
        jbOsmio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbOsmio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbOsmioMouseEntered(evt);
            }
        });
        jbOsmio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOsmioActionPerformed(evt);
            }
        });
        jbOsmio.setBounds(420, 310, 40, 40);
        jDesktop.add(jbOsmio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbHassio.setBackground(new java.awt.Color(255, 102, 102));
        jbHassio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbHassio.setForeground(new java.awt.Color(255, 102, 102));
        jbHassio.setText("Hs");
        jbHassio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbHassio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbHassioMouseEntered(evt);
            }
        });
        jbHassio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHassioActionPerformed(evt);
            }
        });
        jbHassio.setBounds(420, 350, 40, 40);
        jDesktop.add(jbHassio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCobalto.setBackground(new java.awt.Color(255, 102, 102));
        jbCobalto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCobalto.setForeground(new java.awt.Color(255, 102, 102));
        jbCobalto.setText("Co");
        jbCobalto.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCobalto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCobaltoMouseEntered(evt);
            }
        });
        jbCobalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobaltoActionPerformed(evt);
            }
        });
        jbCobalto.setBounds(460, 230, 40, 40);
        jDesktop.add(jbCobalto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbRodio.setBackground(new java.awt.Color(255, 102, 102));
        jbRodio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRodio.setForeground(new java.awt.Color(255, 102, 102));
        jbRodio.setText("Rh");
        jbRodio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbRodio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRodioMouseEntered(evt);
            }
        });
        jbRodio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRodioActionPerformed(evt);
            }
        });
        jbRodio.setBounds(460, 270, 40, 40);
        jDesktop.add(jbRodio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbNiquel.setBackground(new java.awt.Color(255, 102, 102));
        jbNiquel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNiquel.setForeground(new java.awt.Color(255, 102, 102));
        jbNiquel.setText("Ni");
        jbNiquel.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbNiquel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbNiquelMouseEntered(evt);
            }
        });
        jbNiquel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNiquelActionPerformed(evt);
            }
        });
        jbNiquel.setBounds(500, 230, 40, 40);
        jDesktop.add(jbNiquel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCopernicio.setBackground(new java.awt.Color(255, 102, 102));
        jbCopernicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCopernicio.setForeground(new java.awt.Color(255, 102, 102));
        jbCopernicio.setText("Cn");
        jbCopernicio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCopernicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCopernicioMouseEntered(evt);
            }
        });
        jbCopernicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCopernicioActionPerformed(evt);
            }
        });
        jbCopernicio.setBounds(580, 350, 40, 40);
        jDesktop.add(jbCopernicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbMeitnerio.setBackground(new java.awt.Color(255, 102, 102));
        jbMeitnerio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMeitnerio.setForeground(new java.awt.Color(255, 102, 102));
        jbMeitnerio.setText("Mt");
        jbMeitnerio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbMeitnerio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbMeitnerioMouseEntered(evt);
            }
        });
        jbMeitnerio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMeitnerioActionPerformed(evt);
            }
        });
        jbMeitnerio.setBounds(460, 350, 40, 40);
        jDesktop.add(jbMeitnerio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlElemento.setBounds(230, 20, 160, 150);
        jDesktop.add(jlElemento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbIridio.setBackground(new java.awt.Color(255, 102, 102));
        jbIridio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbIridio.setForeground(new java.awt.Color(255, 102, 102));
        jbIridio.setText("Ir");
        jbIridio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbIridio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbIridioMouseEntered(evt);
            }
        });
        jbIridio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIridioActionPerformed(evt);
            }
        });
        jbIridio.setBounds(460, 310, 40, 40);
        jDesktop.add(jbIridio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbPaladio.setBackground(new java.awt.Color(255, 102, 102));
        jbPaladio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPaladio.setForeground(new java.awt.Color(255, 102, 102));
        jbPaladio.setText("Pd");
        jbPaladio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbPaladio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPaladioMouseEntered(evt);
            }
        });
        jbPaladio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPaladioActionPerformed(evt);
            }
        });
        jbPaladio.setBounds(500, 270, 40, 40);
        jDesktop.add(jbPaladio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbDarmstadio.setBackground(new java.awt.Color(255, 102, 102));
        jbDarmstadio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbDarmstadio.setForeground(new java.awt.Color(255, 102, 102));
        jbDarmstadio.setText("Ds");
        jbDarmstadio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbDarmstadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbDarmstadioMouseEntered(evt);
            }
        });
        jbDarmstadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarmstadioActionPerformed(evt);
            }
        });
        jbDarmstadio.setBounds(500, 350, 40, 40);
        jDesktop.add(jbDarmstadio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCobre.setBackground(new java.awt.Color(255, 102, 102));
        jbCobre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCobre.setForeground(new java.awt.Color(255, 102, 102));
        jbCobre.setText("Cu");
        jbCobre.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCobreMouseEntered(evt);
            }
        });
        jbCobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobreActionPerformed(evt);
            }
        });
        jbCobre.setBounds(540, 230, 40, 40);
        jDesktop.add(jbCobre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbPrata.setBackground(new java.awt.Color(255, 102, 102));
        jbPrata.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPrata.setForeground(new java.awt.Color(255, 102, 102));
        jbPrata.setText("Ag");
        jbPrata.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbPrata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPrataMouseEntered(evt);
            }
        });
        jbPrata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrataActionPerformed(evt);
            }
        });
        jbPrata.setBounds(540, 270, 40, 40);
        jDesktop.add(jbPrata, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbOuro.setBackground(new java.awt.Color(255, 102, 102));
        jbOuro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbOuro.setForeground(new java.awt.Color(255, 102, 102));
        jbOuro.setText("Au");
        jbOuro.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbOuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbOuroMouseEntered(evt);
            }
        });
        jbOuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOuroActionPerformed(evt);
            }
        });
        jbOuro.setBounds(540, 310, 40, 40);
        jDesktop.add(jbOuro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbRoentgenio.setBackground(new java.awt.Color(255, 102, 102));
        jbRoentgenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRoentgenio.setForeground(new java.awt.Color(255, 102, 102));
        jbRoentgenio.setText("Rg");
        jbRoentgenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbRoentgenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRoentgenioMouseEntered(evt);
            }
        });
        jbRoentgenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRoentgenioActionPerformed(evt);
            }
        });
        jbRoentgenio.setBounds(540, 350, 40, 40);
        jDesktop.add(jbRoentgenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbZinco.setBackground(new java.awt.Color(255, 102, 102));
        jbZinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbZinco.setForeground(new java.awt.Color(255, 102, 102));
        jbZinco.setText("Zn");
        jbZinco.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbZinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbZincoMouseEntered(evt);
            }
        });
        jbZinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbZincoActionPerformed(evt);
            }
        });
        jbZinco.setBounds(580, 230, 40, 40);
        jDesktop.add(jbZinco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCadmio.setBackground(new java.awt.Color(255, 102, 102));
        jbCadmio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCadmio.setForeground(new java.awt.Color(255, 102, 102));
        jbCadmio.setText("Cd");
        jbCadmio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCadmio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCadmioMouseEntered(evt);
            }
        });
        jbCadmio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadmioActionPerformed(evt);
            }
        });
        jbCadmio.setBounds(580, 270, 40, 40);
        jDesktop.add(jbCadmio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbMercurio.setBackground(new java.awt.Color(255, 102, 102));
        jbMercurio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMercurio.setForeground(new java.awt.Color(255, 102, 102));
        jbMercurio.setText("Hg");
        jbMercurio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbMercurio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbMercurioMouseEntered(evt);
            }
        });
        jbMercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMercurioActionPerformed(evt);
            }
        });
        jbMercurio.setBounds(580, 310, 40, 40);
        jDesktop.add(jbMercurio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbUnunhexio.setBackground(new java.awt.Color(153, 153, 153));
        jbUnunhexio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbUnunhexio.setForeground(new java.awt.Color(153, 153, 153));
        jbUnunhexio.setText("Uuh");
        jbUnunhexio.setFont(new java.awt.Font("Tahoma", 1, 14));
        jbUnunhexio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbUnunhexioMouseEntered(evt);
            }
        });
        jbUnunhexio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUnunhexioActionPerformed(evt);
            }
        });
        jbUnunhexio.setBounds(740, 350, 40, 40);
        jDesktop.add(jbUnunhexio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbUnuntrio.setBackground(new java.awt.Color(153, 153, 153));
        jbUnuntrio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbUnuntrio.setForeground(new java.awt.Color(153, 153, 153));
        jbUnuntrio.setText("Uut");
        jbUnuntrio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbUnuntrio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbUnuntrioMouseEntered(evt);
            }
        });
        jbUnuntrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUnuntrioActionPerformed(evt);
            }
        });
        jbUnuntrio.setBounds(620, 350, 40, 40);
        jDesktop.add(jbUnuntrio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbAluminio.setBackground(new java.awt.Color(153, 153, 153));
        jbAluminio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAluminio.setForeground(new java.awt.Color(153, 153, 153));
        jbAluminio.setText("Al");
        jbAluminio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbAluminio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAluminioMouseEntered(evt);
            }
        });
        jbAluminio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAluminioActionPerformed(evt);
            }
        });
        jbAluminio.setBounds(620, 190, 40, 40);
        jDesktop.add(jbAluminio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbUnunpentio.setBackground(new java.awt.Color(153, 153, 153));
        jbUnunpentio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbUnunpentio.setForeground(new java.awt.Color(153, 153, 153));
        jbUnunpentio.setText("Uup");
        jbUnunpentio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbUnunpentio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbUnunpentioMouseEntered(evt);
            }
        });
        jbUnunpentio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUnunpentioActionPerformed(evt);
            }
        });
        jbUnunpentio.setBounds(700, 350, 40, 40);
        jDesktop.add(jbUnunpentio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbFluor.setBackground(new java.awt.Color(0, 153, 153));
        jbFluor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbFluor.setForeground(new java.awt.Color(0, 153, 153));
        jbFluor.setText("F");
        jbFluor.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbFluor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbFluorMouseEntered(evt);
            }
        });
        jbFluor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFluorActionPerformed(evt);
            }
        });
        jbFluor.setBounds(780, 150, 40, 40);
        jDesktop.add(jbFluor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbUnunseptio.setBackground(new java.awt.Color(0, 153, 153));
        jbUnunseptio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbUnunseptio.setForeground(new java.awt.Color(0, 153, 153));
        jbUnunseptio.setText("Uus");
        jbUnunseptio.setFont(new java.awt.Font("Tahoma", 1, 14));
        jbUnunseptio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbUnunseptioMouseEntered(evt);
            }
        });
        jbUnunseptio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUnunseptioActionPerformed(evt);
            }
        });
        jbUnunseptio.setBounds(780, 350, 40, 40);
        jDesktop.add(jbUnunseptio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbHelio.setBackground(new java.awt.Color(0, 51, 204));
        jbHelio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbHelio.setForeground(new java.awt.Color(0, 51, 204));
        jbHelio.setText("He");
        jbHelio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbHelio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbHelioMouseEntered(evt);
            }
        });
        jbHelio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHelioActionPerformed(evt);
            }
        });
        jbHelio.setBounds(820, 110, 40, 40);
        jDesktop.add(jbHelio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbUnunnoctio.setBackground(new java.awt.Color(0, 51, 204));
        jbUnunnoctio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbUnunnoctio.setForeground(new java.awt.Color(0, 51, 204));
        jbUnunnoctio.setText("Uuo");
        jbUnunnoctio.setFont(new java.awt.Font("Tahoma", 1, 14));
        jbUnunnoctio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbUnunnoctioMouseEntered(evt);
            }
        });
        jbUnunnoctio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUnunnoctioActionPerformed(evt);
            }
        });
        jbUnunnoctio.setBounds(820, 350, 40, 40);
        jDesktop.add(jbUnunnoctio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbUnunquadio.setBackground(new java.awt.Color(153, 153, 153));
        jbUnunquadio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbUnunquadio.setForeground(new java.awt.Color(153, 153, 153));
        jbUnunquadio.setText("Uuq");
        jbUnunquadio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbUnunquadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbUnunquadioMouseEntered(evt);
            }
        });
        jbUnunquadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUnunquadioActionPerformed(evt);
            }
        });
        jbUnunquadio.setBounds(660, 350, 40, 40);
        jDesktop.add(jbUnunquadio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbBoro.setBackground(new java.awt.Color(97, 162, 74));
        jbBoro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBoro.setForeground(new java.awt.Color(97, 162, 74));
        jbBoro.setText("B");
        jbBoro.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbBoro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBoroMouseEntered(evt);
            }
        });
        jbBoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBoroActionPerformed(evt);
            }
        });
        jbBoro.setBounds(620, 150, 40, 40);
        jDesktop.add(jbBoro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbPolonio.setBackground(new java.awt.Color(97, 162, 74));
        jbPolonio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPolonio.setForeground(new java.awt.Color(97, 162, 74));
        jbPolonio.setText("Po");
        jbPolonio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbPolonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPolonioMouseEntered(evt);
            }
        });
        jbPolonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPolonioActionPerformed(evt);
            }
        });
        jbPolonio.setBounds(740, 310, 40, 40);
        jDesktop.add(jbPolonio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbChumbo.setBackground(new java.awt.Color(153, 153, 153));
        jbChumbo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbChumbo.setForeground(new java.awt.Color(153, 153, 153));
        jbChumbo.setText("Pb");
        jbChumbo.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbChumbo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbChumboMouseEntered(evt);
            }
        });
        jbChumbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChumboActionPerformed(evt);
            }
        });
        jbChumbo.setBounds(660, 310, 40, 40);
        jDesktop.add(jbChumbo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbBismuto.setBackground(new java.awt.Color(153, 153, 153));
        jbBismuto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBismuto.setForeground(new java.awt.Color(153, 153, 153));
        jbBismuto.setText("Bi");
        jbBismuto.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbBismuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBismutoMouseEntered(evt);
            }
        });
        jbBismuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBismutoActionPerformed(evt);
            }
        });
        jbBismuto.setBounds(700, 310, 40, 40);
        jDesktop.add(jbBismuto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbTalio.setBackground(new java.awt.Color(153, 153, 153));
        jbTalio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTalio.setForeground(new java.awt.Color(153, 153, 153));
        jbTalio.setText("Tl");
        jbTalio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbTalio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTalioMouseEntered(evt);
            }
        });
        jbTalio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTalioActionPerformed(evt);
            }
        });
        jbTalio.setBounds(620, 310, 40, 40);
        jDesktop.add(jbTalio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbIndio.setBackground(new java.awt.Color(153, 153, 153));
        jbIndio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbIndio.setForeground(new java.awt.Color(153, 153, 153));
        jbIndio.setText("In");
        jbIndio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbIndio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbIndioMouseEntered(evt);
            }
        });
        jbIndio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIndioActionPerformed(evt);
            }
        });
        jbIndio.setBounds(620, 270, 40, 40);
        jDesktop.add(jbIndio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbGalio.setBackground(new java.awt.Color(153, 153, 153));
        jbGalio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGalio.setForeground(new java.awt.Color(153, 153, 153));
        jbGalio.setText("Ga");
        jbGalio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbGalio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbGalioMouseEntered(evt);
            }
        });
        jbGalio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGalioActionPerformed(evt);
            }
        });
        jbGalio.setBounds(620, 230, 40, 40);
        jDesktop.add(jbGalio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbEstanho.setBackground(new java.awt.Color(153, 153, 153));
        jbEstanho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEstanho.setForeground(new java.awt.Color(153, 153, 153));
        jbEstanho.setText("Sn");
        jbEstanho.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbEstanho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbEstanhoMouseEntered(evt);
            }
        });
        jbEstanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEstanhoActionPerformed(evt);
            }
        });
        jbEstanho.setBounds(660, 270, 40, 40);
        jDesktop.add(jbEstanho, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbTelurio.setBackground(new java.awt.Color(97, 162, 74));
        jbTelurio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTelurio.setForeground(new java.awt.Color(97, 162, 74));
        jbTelurio.setText("Te");
        jbTelurio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbTelurio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTelurioMouseEntered(evt);
            }
        });
        jbTelurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTelurioActionPerformed(evt);
            }
        });
        jbTelurio.setBounds(740, 270, 40, 40);
        jDesktop.add(jbTelurio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbAntiomonio.setBackground(new java.awt.Color(97, 162, 74));
        jbAntiomonio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAntiomonio.setForeground(new java.awt.Color(97, 162, 74));
        jbAntiomonio.setText("Sb");
        jbAntiomonio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbAntiomonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAntiomonioMouseEntered(evt);
            }
        });
        jbAntiomonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAntiomonioActionPerformed(evt);
            }
        });
        jbAntiomonio.setBounds(700, 270, 40, 40);
        jDesktop.add(jbAntiomonio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbGermanio.setBackground(new java.awt.Color(97, 162, 74));
        jbGermanio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGermanio.setForeground(new java.awt.Color(97, 162, 74));
        jbGermanio.setText("Ge");
        jbGermanio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbGermanio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbGermanioMouseEntered(evt);
            }
        });
        jbGermanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGermanioActionPerformed(evt);
            }
        });
        jbGermanio.setBounds(660, 230, 40, 40);
        jDesktop.add(jbGermanio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbArsenio.setBackground(new java.awt.Color(97, 162, 74));
        jbArsenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbArsenio.setForeground(new java.awt.Color(97, 162, 74));
        jbArsenio.setText("As");
        jbArsenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbArsenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbArsenioMouseEntered(evt);
            }
        });
        jbArsenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArsenioActionPerformed(evt);
            }
        });
        jbArsenio.setBounds(700, 230, 40, 40);
        jDesktop.add(jbArsenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbSilicio.setBackground(new java.awt.Color(97, 162, 74));
        jbSilicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSilicio.setForeground(new java.awt.Color(97, 162, 74));
        jbSilicio.setText("Si");
        jbSilicio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbSilicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSilicioMouseEntered(evt);
            }
        });
        jbSilicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSilicioActionPerformed(evt);
            }
        });
        jbSilicio.setBounds(660, 190, 40, 40);
        jDesktop.add(jbSilicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbAstato.setBackground(new java.awt.Color(0, 153, 153));
        jbAstato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAstato.setForeground(new java.awt.Color(0, 153, 153));
        jbAstato.setText("At");
        jbAstato.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbAstato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAstatoMouseEntered(evt);
            }
        });
        jbAstato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAstatoActionPerformed(evt);
            }
        });
        jbAstato.setBounds(780, 310, 40, 40);
        jDesktop.add(jbAstato, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbIodo.setBackground(new java.awt.Color(0, 153, 153));
        jbIodo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbIodo.setForeground(new java.awt.Color(0, 153, 153));
        jbIodo.setText("I");
        jbIodo.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbIodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbIodoMouseEntered(evt);
            }
        });
        jbIodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIodoActionPerformed(evt);
            }
        });
        jbIodo.setBounds(780, 270, 40, 40);
        jDesktop.add(jbIodo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbBromo.setBackground(new java.awt.Color(0, 153, 153));
        jbBromo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBromo.setForeground(new java.awt.Color(0, 153, 153));
        jbBromo.setText("Br");
        jbBromo.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbBromo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBromoMouseEntered(evt);
            }
        });
        jbBromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBromoActionPerformed(evt);
            }
        });
        jbBromo.setBounds(780, 230, 40, 40);
        jDesktop.add(jbBromo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCloro.setBackground(new java.awt.Color(0, 153, 153));
        jbCloro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCloro.setForeground(new java.awt.Color(0, 153, 153));
        jbCloro.setText("Cl");
        jbCloro.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCloro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCloroMouseEntered(evt);
            }
        });
        jbCloro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCloroActionPerformed(evt);
            }
        });
        jbCloro.setBounds(780, 190, 40, 40);
        jDesktop.add(jbCloro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbNitrogenio.setBackground(new java.awt.Color(0, 255, 0));
        jbNitrogenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNitrogenio.setForeground(new java.awt.Color(0, 255, 0));
        jbNitrogenio.setText("N");
        jbNitrogenio.setToolTipText("Hidrogênio");
        jbNitrogenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbNitrogenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbNitrogenioMouseEntered(evt);
            }
        });
        jbNitrogenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNitrogenioActionPerformed(evt);
            }
        });
        jbNitrogenio.setBounds(700, 150, 40, 40);
        jDesktop.add(jbNitrogenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCarbono.setBackground(new java.awt.Color(0, 255, 0));
        jbCarbono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCarbono.setForeground(new java.awt.Color(0, 255, 0));
        jbCarbono.setText("C");
        jbCarbono.setToolTipText("Hidrogênio");
        jbCarbono.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCarbono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCarbonoMouseEntered(evt);
            }
        });
        jbCarbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCarbonoActionPerformed(evt);
            }
        });
        jbCarbono.setBounds(660, 150, 40, 40);
        jDesktop.add(jbCarbono, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbFosforo.setBackground(new java.awt.Color(0, 255, 0));
        jbFosforo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbFosforo.setForeground(new java.awt.Color(0, 255, 0));
        jbFosforo.setText("P");
        jbFosforo.setToolTipText("Hidrogênio");
        jbFosforo.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbFosforo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbFosforoMouseEntered(evt);
            }
        });
        jbFosforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFosforoActionPerformed(evt);
            }
        });
        jbFosforo.setBounds(700, 190, 40, 40);
        jDesktop.add(jbFosforo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbSelenio.setBackground(new java.awt.Color(0, 255, 0));
        jbSelenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSelenio.setForeground(new java.awt.Color(0, 255, 0));
        jbSelenio.setText("Se");
        jbSelenio.setToolTipText("Hidrogênio");
        jbSelenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbSelenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSelenioMouseEntered(evt);
            }
        });
        jbSelenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelenioActionPerformed(evt);
            }
        });
        jbSelenio.setBounds(740, 230, 40, 40);
        jDesktop.add(jbSelenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbEnxofre.setBackground(new java.awt.Color(0, 255, 0));
        jbEnxofre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEnxofre.setForeground(new java.awt.Color(0, 255, 0));
        jbEnxofre.setText("S");
        jbEnxofre.setToolTipText("Hidrogênio");
        jbEnxofre.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbEnxofre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbEnxofreMouseEntered(evt);
            }
        });
        jbEnxofre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnxofreActionPerformed(evt);
            }
        });
        jbEnxofre.setBounds(740, 190, 40, 40);
        jDesktop.add(jbEnxofre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbOxigenio.setBackground(new java.awt.Color(0, 255, 0));
        jbOxigenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbOxigenio.setForeground(new java.awt.Color(0, 255, 0));
        jbOxigenio.setText("O");
        jbOxigenio.setToolTipText("Hidrogênio");
        jbOxigenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbOxigenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbOxigenioMouseEntered(evt);
            }
        });
        jbOxigenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOxigenioActionPerformed(evt);
            }
        });
        jbOxigenio.setBounds(740, 150, 40, 40);
        jDesktop.add(jbOxigenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbRadonio.setBackground(new java.awt.Color(0, 51, 204));
        jbRadonio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbRadonio.setForeground(new java.awt.Color(0, 51, 204));
        jbRadonio.setText("Rn");
        jbRadonio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbRadonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRadonioMouseEntered(evt);
            }
        });
        jbRadonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRadonioActionPerformed(evt);
            }
        });
        jbRadonio.setBounds(820, 310, 40, 40);
        jDesktop.add(jbRadonio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCriptonio.setBackground(new java.awt.Color(0, 51, 204));
        jbCriptonio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCriptonio.setForeground(new java.awt.Color(0, 51, 204));
        jbCriptonio.setText("Kr");
        jbCriptonio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCriptonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCriptonioMouseEntered(evt);
            }
        });
        jbCriptonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriptonioActionPerformed(evt);
            }
        });
        jbCriptonio.setBounds(820, 230, 40, 40);
        jDesktop.add(jbCriptonio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbArgonio.setBackground(new java.awt.Color(0, 51, 204));
        jbArgonio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbArgonio.setForeground(new java.awt.Color(0, 51, 204));
        jbArgonio.setText("Ar");
        jbArgonio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbArgonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbArgonioMouseEntered(evt);
            }
        });
        jbArgonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArgonioActionPerformed(evt);
            }
        });
        jbArgonio.setBounds(820, 190, 40, 40);
        jDesktop.add(jbArgonio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbNeonio.setBackground(new java.awt.Color(0, 51, 204));
        jbNeonio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNeonio.setForeground(new java.awt.Color(0, 51, 204));
        jbNeonio.setText("Ne");
        jbNeonio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbNeonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbNeonioMouseEntered(evt);
            }
        });
        jbNeonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNeonioActionPerformed(evt);
            }
        });
        jbNeonio.setBounds(820, 150, 40, 40);
        jDesktop.add(jbNeonio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbXenonio.setBackground(new java.awt.Color(0, 51, 204));
        jbXenonio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbXenonio.setForeground(new java.awt.Color(0, 51, 204));
        jbXenonio.setText("Xe");
        jbXenonio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbXenonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbXenonioMouseEntered(evt);
            }
        });
        jbXenonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbXenonioActionPerformed(evt);
            }
        });
        jbXenonio.setBounds(820, 270, 40, 40);
        jDesktop.add(jbXenonio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbLitio.setBackground(new java.awt.Color(239, 156, 0));
        jbLitio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLitio.setForeground(new java.awt.Color(239, 156, 0));
        jbLitio.setText("Li");
        jbLitio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbLitio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLitioMouseEntered(evt);
            }
        });
        jbLitio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLitioActionPerformed(evt);
            }
        });
        jbLitio.setBounds(140, 150, 40, 40);
        jDesktop.add(jbLitio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbHidrogenio.setBackground(new java.awt.Color(0, 255, 0));
        jbHidrogenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbHidrogenio.setForeground(new java.awt.Color(0, 255, 0));
        jbHidrogenio.setText("H");
        jbHidrogenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbHidrogenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbHidrogenioMouseEntered(evt);
            }
        });
        jbHidrogenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHidrogenioActionPerformed(evt);
            }
        });
        jbHidrogenio.setBounds(140, 110, 40, 40);
        jDesktop.add(jbHidrogenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbLutecio.setBackground(new java.awt.Color(255, 0, 0));
        jbLutecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLutecio.setForeground(new java.awt.Color(255, 0, 0));
        jbLutecio.setText("Lu");
        jbLutecio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbLutecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLutecioMouseEntered(evt);
            }
        });
        jbLutecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLutecioActionPerformed(evt);
            }
        });
        jbLutecio.setBounds(820, 420, 40, 40);
        jDesktop.add(jbLutecio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbLaurencio.setBackground(new java.awt.Color(204, 0, 102));
        jbLaurencio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLaurencio.setForeground(new java.awt.Color(204, 0, 102));
        jbLaurencio.setText("Lr");
        jbLaurencio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbLaurencio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLaurencioMouseEntered(evt);
            }
        });
        jbLaurencio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLaurencioActionPerformed(evt);
            }
        });
        jbLaurencio.setBounds(820, 460, 40, 40);
        jDesktop.add(jbLaurencio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbLantanio.setBackground(new java.awt.Color(255, 0, 0));
        jbLantanio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLantanio.setForeground(new java.awt.Color(255, 0, 0));
        jbLantanio.setText("La");
        jbLantanio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbLantanio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLantanioMouseEntered(evt);
            }
        });
        jbLantanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLantanioActionPerformed(evt);
            }
        });
        jbLantanio.setBounds(260, 420, 40, 40);
        jDesktop.add(jbLantanio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCerio.setBackground(new java.awt.Color(255, 0, 0));
        jbCerio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCerio.setForeground(new java.awt.Color(255, 0, 0));
        jbCerio.setText("Ce");
        jbCerio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCerio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCerioMouseEntered(evt);
            }
        });
        jbCerio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerioActionPerformed(evt);
            }
        });
        jbCerio.setBounds(300, 420, 40, 40);
        jDesktop.add(jbCerio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbPraseodímio.setBackground(new java.awt.Color(255, 0, 0));
        jbPraseodímio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPraseodímio.setForeground(new java.awt.Color(255, 0, 0));
        jbPraseodímio.setText("Pr");
        jbPraseodímio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbPraseodímio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPraseodímioMouseEntered(evt);
            }
        });
        jbPraseodímio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPraseodímioActionPerformed(evt);
            }
        });
        jbPraseodímio.setBounds(340, 420, 40, 40);
        jDesktop.add(jbPraseodímio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbNeodimio.setBackground(new java.awt.Color(255, 0, 0));
        jbNeodimio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNeodimio.setForeground(new java.awt.Color(255, 0, 0));
        jbNeodimio.setText("Nd");
        jbNeodimio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbNeodimio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbNeodimioMouseEntered(evt);
            }
        });
        jbNeodimio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNeodimioActionPerformed(evt);
            }
        });
        jbNeodimio.setBounds(380, 420, 40, 40);
        jDesktop.add(jbNeodimio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbPromecio.setBackground(new java.awt.Color(255, 0, 0));
        jbPromecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPromecio.setForeground(new java.awt.Color(255, 0, 0));
        jbPromecio.setText("Pm");
        jbPromecio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbPromecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPromecioMouseEntered(evt);
            }
        });
        jbPromecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPromecioActionPerformed(evt);
            }
        });
        jbPromecio.setBounds(420, 420, 40, 40);
        jDesktop.add(jbPromecio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbSamario.setBackground(new java.awt.Color(255, 0, 0));
        jbSamario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSamario.setForeground(new java.awt.Color(255, 0, 0));
        jbSamario.setText("Sm");
        jbSamario.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbSamario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSamarioMouseEntered(evt);
            }
        });
        jbSamario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSamarioActionPerformed(evt);
            }
        });
        jbSamario.setBounds(460, 420, 40, 40);
        jDesktop.add(jbSamario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbEuropio.setBackground(new java.awt.Color(255, 0, 0));
        jbEuropio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEuropio.setForeground(new java.awt.Color(255, 0, 0));
        jbEuropio.setText("Eu");
        jbEuropio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbEuropio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbEuropioMouseEntered(evt);
            }
        });
        jbEuropio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEuropioActionPerformed(evt);
            }
        });
        jbEuropio.setBounds(500, 420, 40, 40);
        jDesktop.add(jbEuropio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbGadolinio.setBackground(new java.awt.Color(255, 0, 0));
        jbGadolinio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGadolinio.setForeground(new java.awt.Color(255, 0, 0));
        jbGadolinio.setText("Gd");
        jbGadolinio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbGadolinio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbGadolinioMouseEntered(evt);
            }
        });
        jbGadolinio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGadolinioActionPerformed(evt);
            }
        });
        jbGadolinio.setBounds(540, 420, 40, 40);
        jDesktop.add(jbGadolinio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbTerbio.setBackground(new java.awt.Color(255, 0, 0));
        jbTerbio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTerbio.setForeground(new java.awt.Color(255, 0, 0));
        jbTerbio.setText("Tb");
        jbTerbio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbTerbio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTerbioMouseEntered(evt);
            }
        });
        jbTerbio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTerbioActionPerformed(evt);
            }
        });
        jbTerbio.setBounds(580, 420, 40, 40);
        jDesktop.add(jbTerbio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbDiprosio.setBackground(new java.awt.Color(255, 0, 0));
        jbDiprosio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbDiprosio.setForeground(new java.awt.Color(255, 0, 0));
        jbDiprosio.setText("Dy");
        jbDiprosio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbDiprosio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbDiprosioMouseEntered(evt);
            }
        });
        jbDiprosio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDiprosioActionPerformed(evt);
            }
        });
        jbDiprosio.setBounds(620, 420, 40, 40);
        jDesktop.add(jbDiprosio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbHolmio.setBackground(new java.awt.Color(255, 0, 0));
        jbHolmio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbHolmio.setForeground(new java.awt.Color(255, 0, 0));
        jbHolmio.setText("Ho");
        jbHolmio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbHolmio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbHolmioMouseEntered(evt);
            }
        });
        jbHolmio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHolmioActionPerformed(evt);
            }
        });
        jbHolmio.setBounds(660, 420, 40, 40);
        jDesktop.add(jbHolmio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbErbio.setBackground(new java.awt.Color(255, 0, 0));
        jbErbio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbErbio.setForeground(new java.awt.Color(255, 0, 0));
        jbErbio.setText("Er");
        jbErbio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbErbio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbErbioMouseEntered(evt);
            }
        });
        jbErbio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbErbioActionPerformed(evt);
            }
        });
        jbErbio.setBounds(700, 420, 40, 40);
        jDesktop.add(jbErbio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbTulio.setBackground(new java.awt.Color(255, 0, 0));
        jbTulio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTulio.setForeground(new java.awt.Color(255, 0, 0));
        jbTulio.setText("Tm");
        jbTulio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbTulio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTulioMouseEntered(evt);
            }
        });
        jbTulio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTulioActionPerformed(evt);
            }
        });
        jbTulio.setBounds(740, 420, 40, 40);
        jDesktop.add(jbTulio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbIterbio.setBackground(new java.awt.Color(255, 0, 0));
        jbIterbio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbIterbio.setForeground(new java.awt.Color(255, 0, 0));
        jbIterbio.setText("Yb");
        jbIterbio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbIterbio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbIterbioMouseEntered(evt);
            }
        });
        jbIterbio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIterbioActionPerformed(evt);
            }
        });
        jbIterbio.setBounds(780, 420, 40, 40);
        jDesktop.add(jbIterbio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbActinio.setBackground(new java.awt.Color(204, 0, 102));
        jbActinio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbActinio.setForeground(new java.awt.Color(204, 0, 102));
        jbActinio.setText("Ac");
        jbActinio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbActinio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbActinioMouseEntered(evt);
            }
        });
        jbActinio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActinioActionPerformed(evt);
            }
        });
        jbActinio.setBounds(260, 460, 40, 40);
        jDesktop.add(jbActinio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbTorio.setBackground(new java.awt.Color(204, 0, 102));
        jbTorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTorio.setForeground(new java.awt.Color(204, 0, 102));
        jbTorio.setText("Th");
        jbTorio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbTorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbTorioMouseEntered(evt);
            }
        });
        jbTorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTorioActionPerformed(evt);
            }
        });
        jbTorio.setBounds(300, 460, 40, 40);
        jDesktop.add(jbTorio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbProtactinio.setBackground(new java.awt.Color(204, 0, 102));
        jbProtactinio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbProtactinio.setForeground(new java.awt.Color(204, 0, 102));
        jbProtactinio.setText("Pa");
        jbProtactinio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbProtactinio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbProtactinioMouseEntered(evt);
            }
        });
        jbProtactinio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProtactinioActionPerformed(evt);
            }
        });
        jbProtactinio.setBounds(340, 460, 40, 40);
        jDesktop.add(jbProtactinio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbUranio.setBackground(new java.awt.Color(204, 0, 102));
        jbUranio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbUranio.setForeground(new java.awt.Color(204, 0, 102));
        jbUranio.setText("U");
        jbUranio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbUranio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbUranioMouseEntered(evt);
            }
        });
        jbUranio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUranioActionPerformed(evt);
            }
        });
        jbUranio.setBounds(380, 460, 40, 40);
        jDesktop.add(jbUranio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbNeptunio.setBackground(new java.awt.Color(204, 0, 102));
        jbNeptunio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNeptunio.setForeground(new java.awt.Color(204, 0, 102));
        jbNeptunio.setText("Np");
        jbNeptunio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbNeptunio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbNeptunioMouseEntered(evt);
            }
        });
        jbNeptunio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNeptunioActionPerformed(evt);
            }
        });
        jbNeptunio.setBounds(420, 460, 40, 40);
        jDesktop.add(jbNeptunio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbPlutonio.setBackground(new java.awt.Color(204, 0, 102));
        jbPlutonio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPlutonio.setForeground(new java.awt.Color(204, 0, 102));
        jbPlutonio.setText("Pu");
        jbPlutonio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbPlutonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbPlutonioMouseEntered(evt);
            }
        });
        jbPlutonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlutonioActionPerformed(evt);
            }
        });
        jbPlutonio.setBounds(460, 460, 40, 40);
        jDesktop.add(jbPlutonio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbAmericio.setBackground(new java.awt.Color(204, 0, 102));
        jbAmericio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAmericio.setForeground(new java.awt.Color(204, 0, 102));
        jbAmericio.setText("Am");
        jbAmericio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbAmericio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbAmericioMouseEntered(evt);
            }
        });
        jbAmericio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAmericioActionPerformed(evt);
            }
        });
        jbAmericio.setBounds(500, 460, 40, 40);
        jDesktop.add(jbAmericio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCurio.setBackground(new java.awt.Color(204, 0, 102));
        jbCurio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCurio.setForeground(new java.awt.Color(204, 0, 102));
        jbCurio.setText("Cm");
        jbCurio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCurio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCurioMouseEntered(evt);
            }
        });
        jbCurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCurioActionPerformed(evt);
            }
        });
        jbCurio.setBounds(540, 460, 40, 40);
        jDesktop.add(jbCurio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbBerquelio.setBackground(new java.awt.Color(204, 0, 102));
        jbBerquelio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbBerquelio.setForeground(new java.awt.Color(204, 0, 102));
        jbBerquelio.setText("Bk");
        jbBerquelio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbBerquelio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBerquelioMouseEntered(evt);
            }
        });
        jbBerquelio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBerquelioActionPerformed(evt);
            }
        });
        jbBerquelio.setBounds(580, 460, 40, 40);
        jDesktop.add(jbBerquelio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbCalifornio.setBackground(new java.awt.Color(204, 0, 102));
        jbCalifornio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbCalifornio.setForeground(new java.awt.Color(204, 0, 102));
        jbCalifornio.setText("Cf");
        jbCalifornio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbCalifornio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCalifornioMouseEntered(evt);
            }
        });
        jbCalifornio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalifornioActionPerformed(evt);
            }
        });
        jbCalifornio.setBounds(620, 460, 40, 40);
        jDesktop.add(jbCalifornio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbEisntenio.setBackground(new java.awt.Color(204, 0, 102));
        jbEisntenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbEisntenio.setForeground(new java.awt.Color(204, 0, 102));
        jbEisntenio.setText("Es");
        jbEisntenio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbEisntenio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbEisntenioMouseEntered(evt);
            }
        });
        jbEisntenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEisntenioActionPerformed(evt);
            }
        });
        jbEisntenio.setBounds(660, 460, 40, 40);
        jDesktop.add(jbEisntenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbFermio.setBackground(new java.awt.Color(204, 0, 102));
        jbFermio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbFermio.setForeground(new java.awt.Color(204, 0, 102));
        jbFermio.setText("Fm");
        jbFermio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbFermio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbFermioMouseEntered(evt);
            }
        });
        jbFermio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFermioActionPerformed(evt);
            }
        });
        jbFermio.setBounds(700, 460, 40, 40);
        jDesktop.add(jbFermio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbMendelevio.setBackground(new java.awt.Color(204, 0, 102));
        jbMendelevio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMendelevio.setForeground(new java.awt.Color(204, 0, 102));
        jbMendelevio.setText("Md");
        jbMendelevio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbMendelevio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbMendelevioMouseEntered(evt);
            }
        });
        jbMendelevio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMendelevioActionPerformed(evt);
            }
        });
        jbMendelevio.setBounds(740, 460, 40, 40);
        jDesktop.add(jbMendelevio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbNobelio.setBackground(new java.awt.Color(204, 0, 102));
        jbNobelio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNobelio.setForeground(new java.awt.Color(204, 0, 102));
        jbNobelio.setText("No");
        jbNobelio.setFont(new java.awt.Font("Tahoma", 1, 18));
        jbNobelio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbNobelioMouseEntered(evt);
            }
        });
        jbNobelio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNobelioActionPerformed(evt);
            }
        });
        jbNobelio.setBounds(780, 460, 40, 40);
        jDesktop.add(jbNobelio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(204, 0, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 8));
        jLabel1.setForeground(new java.awt.Color(204, 0, 102));
        jLabel1.setText("89 - 103");
        jLabel1.setBounds(220, 350, 40, 40);
        jDesktop.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("57 - 71");
        jLabel2.setBounds(220, 310, 40, 40);
        jDesktop.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jLabel3.setBounds(0, 10, 110, 500);
        jDesktop.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("|-----8B-----|");
        jLabel4.setBounds(430, 200, 100, 30);
        jDesktop.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel5.setText("8A");
        jLabel5.setBounds(830, 90, 20, 20);
        jDesktop.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setText("4B");
        jLabel6.setBounds(270, 200, 20, 30);
        jDesktop.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("5B");
        jLabel7.setBounds(310, 200, 20, 30);
        jDesktop.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel8.setText("6B");
        jLabel8.setBounds(350, 200, 20, 30);
        jDesktop.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("2B");
        jLabel9.setBounds(590, 200, 20, 30);
        jDesktop.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel10.setText("|-----8B-----|");
        jLabel10.setBounds(430, 200, 100, 30);
        jDesktop.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel11.setText("7B");
        jLabel11.setBounds(390, 200, 20, 30);
        jDesktop.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel12.setText("1B");
        jLabel12.setBounds(550, 200, 20, 30);
        jDesktop.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel13.setText("3B");
        jLabel13.setBounds(230, 200, 20, 30);
        jDesktop.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel15.setText("1A");
        jLabel15.setBounds(150, 80, 20, 30);
        jDesktop.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel16.setText("3A");
        jLabel16.setBounds(630, 120, 20, 30);
        jDesktop.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel17.setText("4A");
        jLabel17.setBounds(670, 120, 20, 30);
        jDesktop.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel18.setText("5A");
        jLabel18.setBounds(710, 120, 20, 30);
        jDesktop.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel19.setText("6A");
        jLabel19.setBounds(750, 120, 20, 30);
        jDesktop.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel20.setText("7A");
        jLabel20.setBounds(790, 120, 20, 30);
        jDesktop.add(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel21.setText("2A");
        jLabel21.setBounds(190, 120, 20, 30);
        jDesktop.add(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbGases.setBackground(new java.awt.Color(0, 51, 204));
        jbGases.setFont(new java.awt.Font("Tahoma", 1, 14));
        jbGases.setForeground(new java.awt.Color(0, 51, 204));
        jbGases.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbGases.setEnabled(false);
        jbGases.setBounds(460, 110, 30, 30);
        jDesktop.add(jbGases, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbSemimetais.setBackground(new java.awt.Color(97, 162, 74));
        jbSemimetais.setFont(new java.awt.Font("Tahoma", 1, 14));
        jbSemimetais.setForeground(new java.awt.Color(97, 162, 74));
        jbSemimetais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbSemimetais.setEnabled(false);
        jbSemimetais.setMargin(new java.awt.Insets(97, 162, 74, 74));
        jbSemimetais.setBounds(460, 20, 30, 30);
        jDesktop.add(jbSemimetais, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbHalogenio.setBackground(new java.awt.Color(0, 153, 153));
        jbHalogenio.setFont(new java.awt.Font("Tahoma", 1, 14));
        jbHalogenio.setForeground(new java.awt.Color(0, 153, 153));
        jbHalogenio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbHalogenio.setEnabled(false);
        jbHalogenio.setBounds(460, 50, 30, 30);
        jDesktop.add(jbHalogenio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbMetais.setBackground(new java.awt.Color(255, 102, 102));
        jbMetais.setFont(new java.awt.Font("Tahoma", 1, 14));
        jbMetais.setForeground(new java.awt.Color(255, 102, 102));
        jbMetais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbMetais.setEnabled(false);
        jbMetais.setBounds(460, 80, 30, 30);
        jDesktop.add(jbMetais, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel23.setText("Halogênios");
        jLabel23.setBounds(500, 60, 80, 14);
        jDesktop.add(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbPos.setBackground(new java.awt.Color(153, 153, 153));
        jbPos.setForeground(new java.awt.Color(153, 153, 153));
        jbPos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbPos.setEnabled(false);
        jbPos.setBounds(640, 20, 30, 30);
        jDesktop.add(jbPos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbAlcalinos.setBackground(new java.awt.Color(239, 156, 0));
        jbAlcalinos.setForeground(new java.awt.Color(239, 156, 0));
        jbAlcalinos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbAlcalinos.setEnabled(false);
        jbAlcalinos.setBounds(640, 50, 30, 30);
        jDesktop.add(jbAlcalinos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbNaometais.setBackground(new java.awt.Color(0, 255, 0));
        jbNaometais.setForeground(new java.awt.Color(0, 255, 0));
        jbNaometais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbNaometais.setEnabled(false);
        jbNaometais.setBounds(640, 80, 30, 30);
        jDesktop.add(jbNaometais, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel25.setText("Metais pós transição");
        jLabel25.setBounds(680, 30, 110, 14);
        jDesktop.add(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel26.setText("Metais Alcalinos");
        jLabel26.setBounds(680, 60, 90, 14);
        jDesktop.add(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel27.setText("Outros não metais");
        jLabel27.setBounds(680, 90, 100, 14);
        jDesktop.add(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbLantanideo.setBackground(new java.awt.Color(255, 0, 0));
        jbLantanideo.setForeground(new java.awt.Color(255, 0, 0));
        jbLantanideo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLantanideo.setEnabled(false);
        jbLantanideo.setBounds(810, 20, 30, 30);
        jDesktop.add(jbLantanideo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbActinideo.setBackground(new java.awt.Color(204, 0, 102));
        jbActinideo.setForeground(new java.awt.Color(204, 0, 102));
        jbActinideo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbActinideo.setEnabled(false);
        jbActinideo.setBounds(810, 50, 30, 30);
        jDesktop.add(jbActinideo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel28.setText("Actinídeos");
        jLabel28.setBounds(850, 30, 60, 14);
        jDesktop.add(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel29.setText("Lantanídeos");
        jLabel29.setBounds(850, 60, 70, 14);
        jDesktop.add(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jtfUsuario.setFont(new java.awt.Font("Tahoma", 1, 11));
        jtfUsuario.setBounds(940, 30, 140, 20);
        jDesktop.add(jtfUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbJogar.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbJogar.setText("Jogar");
        jbJogar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJogarActionPerformed(evt);
            }
        });
        jbJogar.setBounds(870, 490, 73, 40);
        jDesktop.add(jbJogar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbLogoff.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbLogoff.setText("Logoff");
        jbLogoff.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbLogoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLogoffActionPerformed(evt);
            }
        });
        jbLogoff.setBounds(950, 490, 73, 40);
        jDesktop.add(jbLogoff, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setText("Semimetais");
        jLabel14.setBounds(500, 30, 60, 14);
        jDesktop.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel30.setText("7");
        jLabel30.setBounds(120, 360, 10, 14);
        jDesktop.add(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel31.setText("1");
        jLabel31.setBounds(120, 120, 10, 17);
        jDesktop.add(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel32.setText("2");
        jLabel32.setBounds(120, 160, 10, 14);
        jDesktop.add(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel33.setText("3");
        jLabel33.setBounds(120, 200, 10, 14);
        jDesktop.add(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel34.setText("4");
        jLabel34.setBounds(120, 240, 10, 14);
        jDesktop.add(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel35.setText("5");
        jLabel35.setBounds(120, 280, 10, 14);
        jDesktop.add(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel36.setText("6");
        jLabel36.setBounds(120, 320, 10, 14);
        jDesktop.add(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel37.setText("6");
        jLabel37.setBounds(120, 320, 10, 14);
        jDesktop.add(jLabel37, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jbTerroso.setBackground(new java.awt.Color(153, 153, 0));
        jbTerroso.setForeground(new java.awt.Color(153, 153, 0));
        jbTerroso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbTerroso.setEnabled(false);
        jbTerroso.setBounds(460, 140, 30, 30);
        jDesktop.add(jbTerroso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel38.setText("Metais Alcalinos Terrosos");
        jLabel38.setBounds(500, 150, 120, 14);
        jDesktop.add(jLabel38, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel24.setText("Metais de Transição");
        jLabel24.setBounds(500, 90, 110, 14);
        jDesktop.add(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel22.setText("Gases Nobres");
        jLabel22.setBounds(500, 120, 100, 14);
        jDesktop.add(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Cadastro");

        jmiUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jmiUsuario.setText("Usuário");
        jmiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmiUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Interação");

        jmiLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmiLogin.setText("Login");
        jmiLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLoginActionPerformed(evt);
            }
        });
        jMenu2.add(jmiLogin);

        jmiJogar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jmiJogar.setText("Jogar");
        jmiJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiJogarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiJogar);

        jmiRanking.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmiRanking.setText("Ranking");
        jmiRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRankingActionPerformed(evt);
            }
        });
        jMenu2.add(jmiRanking);

        jMenuBar1.add(jMenu2);

        jmAjuda.setText(" Ajuda");

        jmSobre.setText("Sobre");
        jmSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSobreActionPerformed(evt);
            }
        });
        jmAjuda.add(jmSobre);

        jMenuBar1.add(jmAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1073, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jmSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSobreActionPerformed
    JOptionPane.showMessageDialog(null, "Todas as informações deste software foram tiradas de livros \n"
            + "da enciclopédia Barsa e nos site http://www.infoescola.com/elementos-quimicos/\n"
            + "e http://www.tabela.oxigenio.com/index.htm", "Sobre", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_jmSobreActionPerformed

private void jbNobelioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNobelioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/nobelio.jpg")));
}//GEN-LAST:event_jbNobelioMouseEntered

private void jbMendelevioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMendelevioActionPerformed
    Verificar.verificaElemento(101);
    Descricao.showInstance();
}//GEN-LAST:event_jbMendelevioActionPerformed

private void jbMendelevioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMendelevioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/mendelevio.jpg")));
}//GEN-LAST:event_jbMendelevioMouseEntered

private void jbFermioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFermioActionPerformed
    Verificar.verificaElemento(100);
    Descricao.showInstance();
}//GEN-LAST:event_jbFermioActionPerformed

private void jbFermioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFermioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fermio.jpg")));
}//GEN-LAST:event_jbFermioMouseEntered

private void jbEisntenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEisntenioActionPerformed
    Verificar.verificaElemento(99);
    Descricao.showInstance();
}//GEN-LAST:event_jbEisntenioActionPerformed

private void jbEisntenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEisntenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/einstenio.jpg")));
}//GEN-LAST:event_jbEisntenioMouseEntered

private void jbCalifornioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalifornioActionPerformed
    Verificar.verificaElemento(98);
    Descricao.showInstance();
}//GEN-LAST:event_jbCalifornioActionPerformed

private void jbCalifornioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCalifornioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/californio.jpg")));
}//GEN-LAST:event_jbCalifornioMouseEntered

private void jbBerquelioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBerquelioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/berquelio.jpg")));
}//GEN-LAST:event_jbBerquelioMouseEntered

private void jbCurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCurioActionPerformed
    Verificar.verificaElemento(96);
    Descricao.showInstance();
}//GEN-LAST:event_jbCurioActionPerformed

private void jbCurioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCurioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/curio.jpg")));
}//GEN-LAST:event_jbCurioMouseEntered

private void jbAmericioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAmericioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/americio.jpg")));
}//GEN-LAST:event_jbAmericioMouseEntered

private void jbPlutonioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPlutonioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/plutonio.jpg")));
}//GEN-LAST:event_jbPlutonioMouseEntered

private void jbNeptunioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNeptunioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/neptunio.jpg")));
}//GEN-LAST:event_jbNeptunioMouseEntered

private void jbUranioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbUranioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/uranio.jpg")));
}//GEN-LAST:event_jbUranioMouseEntered

private void jbProtactinioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProtactinioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/protactinio.jpg")));
}//GEN-LAST:event_jbProtactinioMouseEntered

private void jbTorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTorioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/torio.jpg")));
}//GEN-LAST:event_jbTorioMouseEntered

private void jbActinioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActinioActionPerformed
    Verificar.verificaElemento(89);
    Descricao.showInstance();
}//GEN-LAST:event_jbActinioActionPerformed

private void jbActinioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbActinioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/actinio.jpg")));
}//GEN-LAST:event_jbActinioMouseEntered

private void jbIterbioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIterbioActionPerformed
    Verificar.verificaElemento(70);
    Descricao.showInstance();
}//GEN-LAST:event_jbIterbioActionPerformed

private void jbIterbioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIterbioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/iterbio.jpg")));
}//GEN-LAST:event_jbIterbioMouseEntered

private void jbTulioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTulioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tulio.jpg")));
}//GEN-LAST:event_jbTulioMouseEntered

private void jbErbioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbErbioActionPerformed
    Verificar.verificaElemento(68);
    Descricao.showInstance();
}//GEN-LAST:event_jbErbioActionPerformed

private void jbErbioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbErbioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/erbio.jpg")));
}//GEN-LAST:event_jbErbioMouseEntered

private void jbHolmioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHolmioActionPerformed
    Verificar.verificaElemento(67);
    Descricao.showInstance();
}//GEN-LAST:event_jbHolmioActionPerformed

private void jbHolmioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbHolmioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/holmio.jpg")));
}//GEN-LAST:event_jbHolmioMouseEntered

private void jbDiprosioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDiprosioActionPerformed
    Verificar.verificaElemento(66);
    Descricao.showInstance();
}//GEN-LAST:event_jbDiprosioActionPerformed

private void jbDiprosioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbDiprosioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/diprosio.jpg")));
}//GEN-LAST:event_jbDiprosioMouseEntered

private void jbTerbioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTerbioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/terbio.jpg")));
}//GEN-LAST:event_jbTerbioMouseEntered

private void jbGadolinioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGadolinioActionPerformed
    Verificar.verificaElemento(64);
    Descricao.showInstance();
}//GEN-LAST:event_jbGadolinioActionPerformed

private void jbGadolinioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbGadolinioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/gadolinio.jpg")));
}//GEN-LAST:event_jbGadolinioMouseEntered

private void jbEuropioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEuropioActionPerformed
    Verificar.verificaElemento(63);
    Descricao.showInstance();
}//GEN-LAST:event_jbEuropioActionPerformed

private void jbEuropioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEuropioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/europio.jpg")));
}//GEN-LAST:event_jbEuropioMouseEntered

private void jbSamarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSamarioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/samario.jpg")));
}//GEN-LAST:event_jbSamarioMouseEntered

private void jbPromecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPromecioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/promecio.jpg")));
}//GEN-LAST:event_jbPromecioMouseEntered

private void jbNeodimioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNeodimioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/neodimio.jpg")));
}//GEN-LAST:event_jbNeodimioMouseEntered

private void jbPraseodímioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPraseodímioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/praseodimio.jpg")));
}//GEN-LAST:event_jbPraseodímioMouseEntered

private void jbCerioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerioActionPerformed
    Verificar.verificaElemento(58);
    Descricao.showInstance();
}//GEN-LAST:event_jbCerioActionPerformed

private void jbCerioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCerioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cerio.jpg")));
}//GEN-LAST:event_jbCerioMouseEntered

private void jbLantanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLantanioActionPerformed
    Verificar.verificaElemento(57);
    Descricao.showInstance();
}//GEN-LAST:event_jbLantanioActionPerformed

private void jbLantanioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLantanioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/lantanio.jpg")));
}//GEN-LAST:event_jbLantanioMouseEntered

private void jbLaurencioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLaurencioActionPerformed
    Verificar.verificaElemento(103);
    Descricao.showInstance();
}//GEN-LAST:event_jbLaurencioActionPerformed

private void jbLaurencioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLaurencioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/laurencio.jpg")));
}//GEN-LAST:event_jbLaurencioMouseEntered

private void jbLutecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLutecioActionPerformed
    Verificar.verificaElemento(71);
    Descricao.showInstance();
}//GEN-LAST:event_jbLutecioActionPerformed

private void jbLutecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLutecioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/lutecio.jpg")));
}//GEN-LAST:event_jbLutecioMouseEntered

private void jbHidrogenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHidrogenioActionPerformed
    Verificar.verificaElemento(1);
    Descricao.showInstance();
}//GEN-LAST:event_jbHidrogenioActionPerformed

private void jbHidrogenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbHidrogenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/gas.jpg")));
}//GEN-LAST:event_jbHidrogenioMouseEntered

private void jbLitioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLitioActionPerformed
    Verificar.verificaElemento(3);
    Descricao.showInstance();
}//GEN-LAST:event_jbLitioActionPerformed

private void jbLitioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLitioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ll.jpg")));
}//GEN-LAST:event_jbLitioMouseEntered

private void jbXenonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbXenonioActionPerformed
    Verificar.verificaElemento(54);
    Descricao.showInstance();
}//GEN-LAST:event_jbXenonioActionPerformed

private void jbXenonioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbXenonioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/xenonio.jpg")));
}//GEN-LAST:event_jbXenonioMouseEntered

private void jbNeonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNeonioActionPerformed
    Verificar.verificaElemento(10);
    Descricao.showInstance();
}//GEN-LAST:event_jbNeonioActionPerformed

private void jbNeonioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNeonioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/neonio.jpg")));
}//GEN-LAST:event_jbNeonioMouseEntered

private void jbArgonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArgonioActionPerformed
    Verificar.verificaElemento(18);
    Descricao.showInstance();
}//GEN-LAST:event_jbArgonioActionPerformed

private void jbArgonioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbArgonioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/argonio.jpg")));
}//GEN-LAST:event_jbArgonioMouseEntered

private void jbCriptonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriptonioActionPerformed
    Verificar.verificaElemento(36);
    Descricao.showInstance();
}//GEN-LAST:event_jbCriptonioActionPerformed

private void jbCriptonioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCriptonioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/criptonio.jpg")));
}//GEN-LAST:event_jbCriptonioMouseEntered

private void jbRadonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRadonioActionPerformed
    Verificar.verificaElemento(86);
    Descricao.showInstance();
}//GEN-LAST:event_jbRadonioActionPerformed

private void jbRadonioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRadonioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/radonio.jpg")));
}//GEN-LAST:event_jbRadonioMouseEntered

private void jbOxigenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOxigenioActionPerformed
    Verificar.verificaElemento(8);
    Descricao.showInstance();
}//GEN-LAST:event_jbOxigenioActionPerformed

private void jbOxigenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbOxigenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/oxigenio.jpg")));
}//GEN-LAST:event_jbOxigenioMouseEntered

private void jbEnxofreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnxofreActionPerformed
    Verificar.verificaElemento(16);
    Descricao.showInstance();
}//GEN-LAST:event_jbEnxofreActionPerformed

private void jbEnxofreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEnxofreMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/enxofre.jpg")));
}//GEN-LAST:event_jbEnxofreMouseEntered

private void jbSelenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSelenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/selenio.jpg")));
}//GEN-LAST:event_jbSelenioMouseEntered

private void jbFosforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFosforoActionPerformed
    Verificar.verificaElemento(15);
    Descricao.showInstance();
}//GEN-LAST:event_jbFosforoActionPerformed

private void jbFosforoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFosforoMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fosforo.jpg")));
}//GEN-LAST:event_jbFosforoMouseEntered

private void jbCarbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCarbonoActionPerformed
    Verificar.verificaElemento(6);
    Descricao.showInstance();
}//GEN-LAST:event_jbCarbonoActionPerformed

private void jbCarbonoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCarbonoMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/carbono.jpg")));
}//GEN-LAST:event_jbCarbonoMouseEntered

private void jbNitrogenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNitrogenioActionPerformed
    Verificar.verificaElemento(7);
    Descricao.showInstance();
}//GEN-LAST:event_jbNitrogenioActionPerformed

private void jbNitrogenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNitrogenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/nitrogenio.jpg")));
}//GEN-LAST:event_jbNitrogenioMouseEntered

private void jbCloroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCloroActionPerformed
    Verificar.verificaElemento(17);
    Descricao.showInstance();
}//GEN-LAST:event_jbCloroActionPerformed

private void jbCloroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCloroMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cloro.jpg")));
}//GEN-LAST:event_jbCloroMouseEntered

private void jbBromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBromoActionPerformed
    Verificar.verificaElemento(35);
    Descricao.showInstance();
}//GEN-LAST:event_jbBromoActionPerformed

private void jbBromoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBromoMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bromo.jpg")));
}//GEN-LAST:event_jbBromoMouseEntered

private void jbIodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIodoActionPerformed
    Verificar.verificaElemento(53);
    Descricao.showInstance();
}//GEN-LAST:event_jbIodoActionPerformed

private void jbIodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIodoMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/iodo.jpg")));
}//GEN-LAST:event_jbIodoMouseEntered

private void jbAstatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAstatoActionPerformed
    Verificar.verificaElemento(85);
    Descricao.showInstance();
}//GEN-LAST:event_jbAstatoActionPerformed

private void jbAstatoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAstatoMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/astato.jpg")));
}//GEN-LAST:event_jbAstatoMouseEntered

private void jbSilicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSilicioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/silicio.jpg")));
}//GEN-LAST:event_jbSilicioMouseEntered

private void jbArsenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArsenioActionPerformed
    Verificar.verificaElemento(33);
    Descricao.showInstance();
}//GEN-LAST:event_jbArsenioActionPerformed

private void jbArsenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbArsenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/arsenio.jpg")));
}//GEN-LAST:event_jbArsenioMouseEntered

private void jbGermanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGermanioActionPerformed
    Verificar.verificaElemento(32);
    Descricao.showInstance();
}//GEN-LAST:event_jbGermanioActionPerformed

private void jbGermanioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbGermanioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/germanio.jpg")));
}//GEN-LAST:event_jbGermanioMouseEntered

private void jbAntiomonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAntiomonioActionPerformed
    Verificar.verificaElemento(51);
    Descricao.showInstance();
}//GEN-LAST:event_jbAntiomonioActionPerformed

private void jbAntiomonioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAntiomonioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/antimonio.jpg")));
}//GEN-LAST:event_jbAntiomonioMouseEntered

private void jbTelurioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTelurioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/telurio.jpg")));
}//GEN-LAST:event_jbTelurioMouseEntered

private void jbEstanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstanhoActionPerformed
    Verificar.verificaElemento(50);
    Descricao.showInstance();
}//GEN-LAST:event_jbEstanhoActionPerformed

private void jbEstanhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEstanhoMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/estanho.jpg")));
}//GEN-LAST:event_jbEstanhoMouseEntered

private void jbGalioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGalioActionPerformed
    Verificar.verificaElemento(31);
    Descricao.showInstance();
}//GEN-LAST:event_jbGalioActionPerformed

private void jbGalioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbGalioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/galio.jpg")));
}//GEN-LAST:event_jbGalioMouseEntered

private void jbIndioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIndioActionPerformed
    Verificar.verificaElemento(49);
    Descricao.showInstance();
}//GEN-LAST:event_jbIndioActionPerformed

private void jbIndioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIndioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/indio.jpg")));
}//GEN-LAST:event_jbIndioMouseEntered

private void jbTalioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTalioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/talio.jpg")));
}//GEN-LAST:event_jbTalioMouseEntered

private void jbBismutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBismutoActionPerformed
    Verificar.verificaElemento(83);
    Descricao.showInstance();
}//GEN-LAST:event_jbBismutoActionPerformed

private void jbBismutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBismutoMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bismuto.jpg")));
}//GEN-LAST:event_jbBismutoMouseEntered

private void jbChumboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChumboActionPerformed
    Verificar.verificaElemento(82);
    Descricao.showInstance();
}//GEN-LAST:event_jbChumboActionPerformed

private void jbChumboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbChumboMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/chumbo.jpg")));
}//GEN-LAST:event_jbChumboMouseEntered

private void jbPolonioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPolonioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/polonio.jpg")));
}//GEN-LAST:event_jbPolonioMouseEntered

private void jbBoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBoroActionPerformed
    Verificar.verificaElemento(5);
    Descricao.showInstance();
}//GEN-LAST:event_jbBoroActionPerformed

private void jbBoroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBoroMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/boro.jpg")));
}//GEN-LAST:event_jbBoroMouseEntered

private void jbUnunquadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbUnunquadioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununquadio.jpg")));
}//GEN-LAST:event_jbUnunquadioMouseEntered

private void jbUnunnoctioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbUnunnoctioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununnoctio.jpg")));
}//GEN-LAST:event_jbUnunnoctioMouseEntered

private void jbHelioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHelioActionPerformed
    Verificar.verificaElemento(2);
    Descricao.showInstance();
}//GEN-LAST:event_jbHelioActionPerformed

private void jbHelioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbHelioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Helio.jpg")));
}//GEN-LAST:event_jbHelioMouseEntered

private void jbUnunseptioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbUnunseptioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununseptio.jpg")));
}//GEN-LAST:event_jbUnunseptioMouseEntered

private void jbFluorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFluorActionPerformed
    Verificar.verificaElemento(9);
    Descricao.showInstance();
}//GEN-LAST:event_jbFluorActionPerformed

private void jbFluorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFluorMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/fluor.jpg")));
}//GEN-LAST:event_jbFluorMouseEntered

private void jbUnunpentioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbUnunpentioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununpentio.jpg")));
}//GEN-LAST:event_jbUnunpentioMouseEntered

private void jbAluminioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAluminioActionPerformed
    Verificar.verificaElemento(13);
    Descricao.showInstance();
}//GEN-LAST:event_jbAluminioActionPerformed

private void jbAluminioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbAluminioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/aluminio.jpg")));
}//GEN-LAST:event_jbAluminioMouseEntered

private void jbUnuntrioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbUnuntrioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununtrio.jpg")));
}//GEN-LAST:event_jbUnuntrioMouseEntered

private void jbUnunhexioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbUnunhexioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ununhexio.jpg")));
}//GEN-LAST:event_jbUnunhexioMouseEntered

private void jbMercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMercurioActionPerformed
    Verificar.verificaElemento(80);
    Descricao.showInstance();
}//GEN-LAST:event_jbMercurioActionPerformed

private void jbMercurioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMercurioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/mercurio.jpg")));
}//GEN-LAST:event_jbMercurioMouseEntered

private void jbCadmioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadmioActionPerformed
    Verificar.verificaElemento(48);
    Descricao.showInstance();
}//GEN-LAST:event_jbCadmioActionPerformed

private void jbCadmioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCadmioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cadmio.jpg")));
}//GEN-LAST:event_jbCadmioMouseEntered

private void jbZincoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbZincoMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/zinco.jpg")));
}//GEN-LAST:event_jbZincoMouseEntered

private void jbRoentgenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRoentgenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/roentgenio.jpg")));
}//GEN-LAST:event_jbRoentgenioMouseEntered

private void jbOuroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbOuroMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ouro.jpg")));
}//GEN-LAST:event_jbOuroMouseEntered

private void jbPrataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPrataMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/prata.jpg")));
}//GEN-LAST:event_jbPrataMouseEntered

private void jbCobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobreActionPerformed
    Verificar.verificaElemento(29);
    Descricao.showInstance();
}//GEN-LAST:event_jbCobreActionPerformed

private void jbCobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCobreMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cobre.jpg")));
}//GEN-LAST:event_jbCobreMouseEntered

private void jbDarmstadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarmstadioActionPerformed
    Verificar.verificaElemento(110);
    Descricao.showInstance();
}//GEN-LAST:event_jbDarmstadioActionPerformed

private void jbDarmstadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbDarmstadioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/darmstadio.jpg")));
}//GEN-LAST:event_jbDarmstadioMouseEntered

private void jbPaladioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPaladioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/paladio.jpg")));
}//GEN-LAST:event_jbPaladioMouseEntered

private void jbIridioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIridioActionPerformed
    Verificar.verificaElemento(77);
    Descricao.showInstance();
}//GEN-LAST:event_jbIridioActionPerformed

private void jbIridioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIridioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/iridio.jpg")));
}//GEN-LAST:event_jbIridioMouseEntered

private void jbMeitnerioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMeitnerioActionPerformed
    Verificar.verificaElemento(109);
    Descricao.showInstance();
}//GEN-LAST:event_jbMeitnerioActionPerformed

private void jbMeitnerioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMeitnerioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/meitnerio.jpg")));
}//GEN-LAST:event_jbMeitnerioMouseEntered

private void jbCopernicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCopernicioActionPerformed
    Verificar.verificaElemento(112);
    Descricao.showInstance();
}//GEN-LAST:event_jbCopernicioActionPerformed

private void jbCopernicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCopernicioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/copernicio.jpg")));
}//GEN-LAST:event_jbCopernicioMouseEntered

private void jbNiquelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNiquelMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/niquel.jpg")));
}//GEN-LAST:event_jbNiquelMouseEntered

private void jbRodioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRodioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/rodio.jpg")));
}//GEN-LAST:event_jbRodioMouseEntered

private void jbCobaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobaltoActionPerformed
    Verificar.verificaElemento(27);
    Descricao.showInstance();
}//GEN-LAST:event_jbCobaltoActionPerformed

private void jbCobaltoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCobaltoMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cobalto.jpg")));
}//GEN-LAST:event_jbCobaltoMouseEntered

private void jbHassioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHassioActionPerformed
    Verificar.verificaElemento(108);
    Descricao.showInstance();
}//GEN-LAST:event_jbHassioActionPerformed

private void jbHassioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbHassioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/hassio.jpg")));
}//GEN-LAST:event_jbHassioMouseEntered

private void jbOsmioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbOsmioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/osmio.jpg")));
}//GEN-LAST:event_jbOsmioMouseEntered

private void jbRutenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRutenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/rutenio.jpg")));
}//GEN-LAST:event_jbRutenioMouseEntered

private void jbFerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFerroActionPerformed
    Verificar.verificaElemento(26);
    Descricao.showInstance();
}//GEN-LAST:event_jbFerroActionPerformed

private void jbFerroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFerroMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/ferro.jpg")));
}//GEN-LAST:event_jbFerroMouseEntered

private void jbBorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBorioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/borio.jpg")));
}//GEN-LAST:event_jbBorioMouseEntered

private void jbRenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/renio.jpg")));
}//GEN-LAST:event_jbRenioMouseEntered

private void jbTecnecioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTecnecioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tecnecio.jpg")));
}//GEN-LAST:event_jbTecnecioMouseEntered

private void jbManganesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbManganesActionPerformed
    Verificar.verificaElemento(25);
    Descricao.showInstance();
}//GEN-LAST:event_jbManganesActionPerformed

private void jbManganesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbManganesMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/manganes.jpg")));
}//GEN-LAST:event_jbManganesMouseEntered

private void jbSeaborgioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSeaborgioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/seaborgio.jpg")));
}//GEN-LAST:event_jbSeaborgioMouseEntered

private void jbTungstenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTungstenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tungstenio.jpg")));
}//GEN-LAST:event_jbTungstenioMouseEntered

private void jbMolibdenioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMolibdenioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/molibdenio.jpg")));
}//GEN-LAST:event_jbMolibdenioMouseEntered

private void jbDubnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDubnioActionPerformed
    Verificar.verificaElemento(105);
    Descricao.showInstance();
}//GEN-LAST:event_jbDubnioActionPerformed

private void jbDubnioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbDubnioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dubnio.jpg")));
}//GEN-LAST:event_jbDubnioMouseEntered

private void jbPlatinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPlatinaMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/platina.jpg")));
}//GEN-LAST:event_jbPlatinaMouseEntered

private void jbRutherfordioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRutherfordioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/rutherfordio.jpg")));
}//GEN-LAST:event_jbRutherfordioMouseEntered

private void jbCromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCromoActionPerformed
    Verificar.verificaElemento(24);
    Descricao.showInstance();
}//GEN-LAST:event_jbCromoActionPerformed

private void jbCromoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCromoMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cromo.jpg")));
}//GEN-LAST:event_jbCromoMouseEntered

private void jbHafnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHafnioActionPerformed
    Verificar.verificaElemento(72);
    Descricao.showInstance();
}//GEN-LAST:event_jbHafnioActionPerformed

private void jbHafnioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbHafnioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/hafnio.jpg")));
}//GEN-LAST:event_jbHafnioMouseEntered

private void jbNiobioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbNiobioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/niobio.jpg")));
}//GEN-LAST:event_jbNiobioMouseEntered

private void jbTantaloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTantaloMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/tantalo.jpg")));
}//GEN-LAST:event_jbTantaloMouseEntered

private void jbZirconioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbZirconioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/zirconio.jpg")));
}//GEN-LAST:event_jbZirconioMouseEntered

private void jbTitanioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbTitanioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/titanio.jpg")));
}//GEN-LAST:event_jbTitanioMouseEntered

private void jbVanadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbVanadioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/vanadio.jpg")));
}//GEN-LAST:event_jbVanadioMouseEntered

private void jbEscandioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEscandioActionPerformed
    Verificar.verificaElemento(21);
    Descricao.showInstance();
}//GEN-LAST:event_jbEscandioActionPerformed

private void jbEscandioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEscandioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/escandio.jpg")));
}//GEN-LAST:event_jbEscandioMouseEntered

private void jbItrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbItrioActionPerformed
    Verificar.verificaElemento(39);
    Descricao.showInstance();
}//GEN-LAST:event_jbItrioActionPerformed

private void jbItrioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbItrioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/itrio.jpg")));
}//GEN-LAST:event_jbItrioMouseEntered

private void jbBarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBarioActionPerformed
    Verificar.verificaElemento(56);
    Descricao.showInstance();
}//GEN-LAST:event_jbBarioActionPerformed

private void jbBarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBarioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/bario.jpg")));
}//GEN-LAST:event_jbBarioMouseEntered

private void jbEstroncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEstroncioActionPerformed
    Verificar.verificaElemento(38);
    Descricao.showInstance();
}//GEN-LAST:event_jbEstroncioActionPerformed

private void jbEstroncioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEstroncioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/estroncio.jpg")));
}//GEN-LAST:event_jbEstroncioMouseEntered

private void jbCalcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalcioActionPerformed
    Verificar.verificaElemento(20);
    Descricao.showInstance();
}//GEN-LAST:event_jbCalcioActionPerformed

private void jbCalcioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCalcioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/calcio.jpg")));
}//GEN-LAST:event_jbCalcioMouseEntered

private void jbMagnesioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMagnesioActionPerformed
    Verificar.verificaElemento(12);
    Descricao.showInstance();
}//GEN-LAST:event_jbMagnesioActionPerformed

private void jbMagnesioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMagnesioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/magnesio.jpg")));
}//GEN-LAST:event_jbMagnesioMouseEntered

private void jbBerilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBerilioActionPerformed
    Verificar.verificaElemento(4);
    Descricao.showInstance();
}//GEN-LAST:event_jbBerilioActionPerformed

private void jbBerilioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBerilioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/berilio.jpg")));
}//GEN-LAST:event_jbBerilioMouseEntered

private void jbRadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRadioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/radio.jpg")));
}//GEN-LAST:event_jbRadioMouseEntered

private void jbCesioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCesioActionPerformed
    Verificar.verificaElemento(55);
    Descricao.showInstance();
}//GEN-LAST:event_jbCesioActionPerformed

private void jbCesioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCesioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/cesio.jpg")));
}//GEN-LAST:event_jbCesioMouseEntered

private void jbRubidioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRubidioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/rubidio.jpg")));
}//GEN-LAST:event_jbRubidioMouseEntered

private void jbPotassioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPotassioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/potassio.jpg")));
}//GEN-LAST:event_jbPotassioMouseEntered

private void jbSodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSodioActionPerformed
    Verificar.verificaElemento(11);
    Descricao.showInstance();
}//GEN-LAST:event_jbSodioActionPerformed

private void jbSodioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSodioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/sodio.jpg")));
}//GEN-LAST:event_jbSodioMouseEntered

private void jbFrancioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFrancioActionPerformed
    Verificar.verificaElemento(87);
    Descricao.showInstance();
}//GEN-LAST:event_jbFrancioActionPerformed

private void jbFrancioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFrancioMouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/francio.jpg")));
}//GEN-LAST:event_jbFrancioMouseEntered

private void jbMolibdenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMolibdenioActionPerformed
    Verificar.verificaElemento(42);
    Descricao.showInstance();
}//GEN-LAST:event_jbMolibdenioActionPerformed

private void jbNeodimioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNeodimioActionPerformed
    Verificar.verificaElemento(60);
    Descricao.showInstance();
}//GEN-LAST:event_jbNeodimioActionPerformed

private void jbNeptunioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNeptunioActionPerformed
    Verificar.verificaElemento(93);
    Descricao.showInstance();
}//GEN-LAST:event_jbNeptunioActionPerformed

private void jbNiobioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNiobioActionPerformed
    Verificar.verificaElemento(41);
    Descricao.showInstance();
}//GEN-LAST:event_jbNiobioActionPerformed

private void jbNiquelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNiquelActionPerformed
    Verificar.verificaElemento(28);
    Descricao.showInstance();
}//GEN-LAST:event_jbNiquelActionPerformed

private void jbAmericioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAmericioActionPerformed
    Verificar.verificaElemento(95);
    Descricao.showInstance();
}//GEN-LAST:event_jbAmericioActionPerformed

private void jbBerquelioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBerquelioActionPerformed
    Verificar.verificaElemento(97);
    Descricao.showInstance();
}//GEN-LAST:event_jbBerquelioActionPerformed

private void jbNobelioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNobelioActionPerformed
    Verificar.verificaElemento(102);
    Descricao.showInstance();
}//GEN-LAST:event_jbNobelioActionPerformed

private void jbOsmioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOsmioActionPerformed
    Verificar.verificaElemento(76);
    Descricao.showInstance();
}//GEN-LAST:event_jbOsmioActionPerformed

private void jbOuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOuroActionPerformed
    Verificar.verificaElemento(79);
    Descricao.showInstance();
}//GEN-LAST:event_jbOuroActionPerformed

private void jbPaladioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPaladioActionPerformed
    Verificar.verificaElemento(46);
    Descricao.showInstance();
}//GEN-LAST:event_jbPaladioActionPerformed

private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
    jlElemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
}//GEN-LAST:event_jLabel3MouseEntered

private void jbProtactinioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProtactinioActionPerformed
    Verificar.verificaElemento(91);
    Descricao.showInstance();
}//GEN-LAST:event_jbProtactinioActionPerformed

private void jbPlatinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlatinaActionPerformed
    Verificar.verificaElemento(78);
    Descricao.showInstance();
}//GEN-LAST:event_jbPlatinaActionPerformed

private void jbPlutonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlutonioActionPerformed
    Verificar.verificaElemento(94);
    Descricao.showInstance();
}//GEN-LAST:event_jbPlutonioActionPerformed

private void jbPolonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPolonioActionPerformed
    Verificar.verificaElemento(84);
    Descricao.showInstance();
}//GEN-LAST:event_jbPolonioActionPerformed

private void jbPotassioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPotassioActionPerformed
    Verificar.verificaElemento(19);
    Descricao.showInstance();
}//GEN-LAST:event_jbPotassioActionPerformed

private void jbPraseodímioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPraseodímioActionPerformed
    Verificar.verificaElemento(59);
    Descricao.showInstance();
}//GEN-LAST:event_jbPraseodímioActionPerformed

private void jbPrataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrataActionPerformed
    Verificar.verificaElemento(47);
    Descricao.showInstance();
}//GEN-LAST:event_jbPrataActionPerformed

private void jbPromecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPromecioActionPerformed
    Verificar.verificaElemento(61);
    Descricao.showInstance();
}//GEN-LAST:event_jbPromecioActionPerformed

private void jbRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRadioActionPerformed
    Verificar.verificaElemento(88);
    Descricao.showInstance();
}//GEN-LAST:event_jbRadioActionPerformed

private void jbRenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRenioActionPerformed
    Verificar.verificaElemento(75);
    Descricao.showInstance();
}//GEN-LAST:event_jbRenioActionPerformed

private void jbRodioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRodioActionPerformed
    Verificar.verificaElemento(45);
    Descricao.showInstance();
}//GEN-LAST:event_jbRodioActionPerformed

private void jbRoentgenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRoentgenioActionPerformed
    Verificar.verificaElemento(111);
    Descricao.showInstance();
}//GEN-LAST:event_jbRoentgenioActionPerformed

private void jbRubidioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRubidioActionPerformed
    Verificar.verificaElemento(37);
    Descricao.showInstance();
}//GEN-LAST:event_jbRubidioActionPerformed

private void jbRutenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRutenioActionPerformed
    Verificar.verificaElemento(44);
    Descricao.showInstance();
}//GEN-LAST:event_jbRutenioActionPerformed

private void jbRutherfordioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRutherfordioActionPerformed
    Verificar.verificaElemento(104);
    Descricao.showInstance();
}//GEN-LAST:event_jbRutherfordioActionPerformed

private void jbSamarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSamarioActionPerformed
    Verificar.verificaElemento(62);
    Descricao.showInstance();
}//GEN-LAST:event_jbSamarioActionPerformed

private void jbSeaborgioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSeaborgioActionPerformed
    Verificar.verificaElemento(106);
    Descricao.showInstance();
}//GEN-LAST:event_jbSeaborgioActionPerformed

private void jbSelenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelenioActionPerformed
    Verificar.verificaElemento(34);
    Descricao.showInstance();
}//GEN-LAST:event_jbSelenioActionPerformed

private void jbSilicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSilicioActionPerformed
    Verificar.verificaElemento(14);
    Descricao.showInstance();
}//GEN-LAST:event_jbSilicioActionPerformed

private void jbTalioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTalioActionPerformed
    Verificar.verificaElemento(81);
    Descricao.showInstance();
}//GEN-LAST:event_jbTalioActionPerformed

private void jbBorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorioActionPerformed
    Verificar.verificaElemento(107);
    Descricao.showInstance();
}//GEN-LAST:event_jbBorioActionPerformed

private void jbTantaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTantaloActionPerformed
    Verificar.verificaElemento(73);
    Descricao.showInstance();
}//GEN-LAST:event_jbTantaloActionPerformed

private void jbTecnecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTecnecioActionPerformed
    Verificar.verificaElemento(43);
    Descricao.showInstance();
}//GEN-LAST:event_jbTecnecioActionPerformed

private void jbTelurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTelurioActionPerformed
    Verificar.verificaElemento(52);
    Descricao.showInstance();
}//GEN-LAST:event_jbTelurioActionPerformed

private void jbTerbioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTerbioActionPerformed
    Verificar.verificaElemento(65);
    Descricao.showInstance();
}//GEN-LAST:event_jbTerbioActionPerformed

private void jbTitanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTitanioActionPerformed
    Verificar.verificaElemento(22);
    Descricao.showInstance();
}//GEN-LAST:event_jbTitanioActionPerformed

private void jbTorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTorioActionPerformed
    Verificar.verificaElemento(90);
    Descricao.showInstance();
}//GEN-LAST:event_jbTorioActionPerformed

private void jbTulioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTulioActionPerformed
    Verificar.verificaElemento(69);
    Descricao.showInstance();
}//GEN-LAST:event_jbTulioActionPerformed

private void jbTungstenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTungstenioActionPerformed
    Verificar.verificaElemento(74);
    Descricao.showInstance();
}//GEN-LAST:event_jbTungstenioActionPerformed

private void jbUnunhexioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUnunhexioActionPerformed
    Verificar.verificaElemento(116);
    Descricao.showInstance();
}//GEN-LAST:event_jbUnunhexioActionPerformed

private void jbUranioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUranioActionPerformed
    Verificar.verificaElemento(92);
    Descricao.showInstance();
}//GEN-LAST:event_jbUranioActionPerformed

private void jbZincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZincoActionPerformed
    Verificar.verificaElemento(30);
    Descricao.showInstance();
}//GEN-LAST:event_jbZincoActionPerformed

private void jbZirconioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbZirconioActionPerformed
    Verificar.verificaElemento(40);
    Descricao.showInstance();
}//GEN-LAST:event_jbZirconioActionPerformed

private void jbVanadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVanadioActionPerformed
    Verificar.verificaElemento(23);
    Descricao.showInstance();
}//GEN-LAST:event_jbVanadioActionPerformed

private void jbUnunnoctioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUnunnoctioActionPerformed
    Verificar.verificaElemento(118);
    Descricao.showInstance();
}//GEN-LAST:event_jbUnunnoctioActionPerformed

private void jbUnunpentioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUnunpentioActionPerformed
    Verificar.verificaElemento(115);
    Descricao.showInstance();
}//GEN-LAST:event_jbUnunpentioActionPerformed

private void jbUnunquadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUnunquadioActionPerformed
    Verificar.verificaElemento(114);
    Descricao.showInstance();
}//GEN-LAST:event_jbUnunquadioActionPerformed

private void jbUnunseptioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUnunseptioActionPerformed
    Verificar.verificaElemento(117);
    Descricao.showInstance();
}//GEN-LAST:event_jbUnunseptioActionPerformed

private void jbUnuntrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUnuntrioActionPerformed
    Verificar.verificaElemento(113);
    Descricao.showInstance();
}//GEN-LAST:event_jbUnuntrioActionPerformed

private void jmiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioActionPerformed
    Cadastrousuario.showInstance();
}//GEN-LAST:event_jmiUsuarioActionPerformed

private void jmiLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLoginActionPerformed
    Login.showInstance();
    setaUsuario();
}//GEN-LAST:event_jmiLoginActionPerformed

private void jbLogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLogoffActionPerformed
    JOptionPane.showMessageDialog(null, "Obrigado por participar!!");
    jtfUsuario.setText("");
    jbLogoff.setEnabled(false);
    jmiLogin.setEnabled(true);
    jmiUsuario.setEnabled(true);
    Login.getInstance().logoff();
}//GEN-LAST:event_jbLogoffActionPerformed

private void jbJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJogarActionPerformed
    jogar();
}//GEN-LAST:event_jbJogarActionPerformed

private void jmiJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiJogarActionPerformed
    jogar();
}//GEN-LAST:event_jmiJogarActionPerformed

private void jmiRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRankingActionPerformed
    r = new Ranking();
    r.setVisible(true);
}//GEN-LAST:event_jmiRankingActionPerformed
 
    public boolean setaUsuario() {
        boolean val = false;
        if (!Login.getInstance().usuariologado.equals("")) {
            jtfUsuario.setText(Login.getInstance().usuariologado);
            jmiLogin.setEnabled(false);
            jbLogoff.setEnabled(true);
            jmiUsuario.setEnabled(false);
            val = true;
        }
        return val;
    }

    public void jogar(){
        if (jtfUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Para jogar faça seu login");
            Login.showInstance();
        }
        if (setaUsuario()) {
            j = new Jogo();
            j.setVisible(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbActinideo;
    private Button.MyButton jbActinio;
    private javax.swing.JButton jbAlcalinos;
    private Button.MyButton jbAluminio;
    private Button.MyButton jbAmericio;
    private Button.MyButton jbAntiomonio;
    private Button.MyButton jbArgonio;
    private Button.MyButton jbArsenio;
    private Button.MyButton jbAstato;
    private Button.MyButton jbBario;
    private Button.MyButton jbBerilio;
    private Button.MyButton jbBerquelio;
    private Button.MyButton jbBismuto;
    private Button.MyButton jbBorio;
    private Button.MyButton jbBoro;
    private Button.MyButton jbBromo;
    private Button.MyButton jbCadmio;
    private Button.MyButton jbCalcio;
    private Button.MyButton jbCalifornio;
    private Button.MyButton jbCarbono;
    private Button.MyButton jbCerio;
    private Button.MyButton jbCesio;
    private Button.MyButton jbChumbo;
    private Button.MyButton jbCloro;
    private Button.MyButton jbCobalto;
    private Button.MyButton jbCobre;
    private Button.MyButton jbCopernicio;
    private Button.MyButton jbCriptonio;
    private Button.MyButton jbCromo;
    private Button.MyButton jbCurio;
    private Button.MyButton jbDarmstadio;
    private Button.MyButton jbDiprosio;
    private Button.MyButton jbDubnio;
    private Button.MyButton jbEisntenio;
    private Button.MyButton jbEnxofre;
    private Button.MyButton jbErbio;
    private Button.MyButton jbEscandio;
    private Button.MyButton jbEstanho;
    private Button.MyButton jbEstroncio;
    private Button.MyButton jbEuropio;
    private Button.MyButton jbFermio;
    private Button.MyButton jbFerro;
    private Button.MyButton jbFluor;
    private Button.MyButton jbFosforo;
    private Button.MyButton jbFrancio;
    private Button.MyButton jbGadolinio;
    private Button.MyButton jbGalio;
    private javax.swing.JButton jbGases;
    private Button.MyButton jbGermanio;
    private Button.MyButton jbHafnio;
    private javax.swing.JButton jbHalogenio;
    private Button.MyButton jbHassio;
    private Button.MyButton jbHelio;
    private Button.MyButton jbHidrogenio;
    private Button.MyButton jbHolmio;
    private Button.MyButton jbIndio;
    private Button.MyButton jbIodo;
    private Button.MyButton jbIridio;
    private Button.MyButton jbIterbio;
    private Button.MyButton jbItrio;
    private javax.swing.JButton jbJogar;
    private javax.swing.JButton jbLantanideo;
    private Button.MyButton jbLantanio;
    private Button.MyButton jbLaurencio;
    private Button.MyButton jbLitio;
    private javax.swing.JButton jbLogoff;
    private Button.MyButton jbLutecio;
    private Button.MyButton jbMagnesio;
    private Button.MyButton jbManganes;
    private Button.MyButton jbMeitnerio;
    private Button.MyButton jbMendelevio;
    private Button.MyButton jbMercurio;
    private javax.swing.JButton jbMetais;
    private Button.MyButton jbMolibdenio;
    private javax.swing.JButton jbNaometais;
    private Button.MyButton jbNeodimio;
    private Button.MyButton jbNeonio;
    private Button.MyButton jbNeptunio;
    private Button.MyButton jbNiobio;
    private Button.MyButton jbNiquel;
    private Button.MyButton jbNitrogenio;
    private Button.MyButton jbNobelio;
    private Button.MyButton jbOsmio;
    private Button.MyButton jbOuro;
    private Button.MyButton jbOxigenio;
    private Button.MyButton jbPaladio;
    private Button.MyButton jbPlatina;
    private Button.MyButton jbPlutonio;
    private Button.MyButton jbPolonio;
    private javax.swing.JButton jbPos;
    private Button.MyButton jbPotassio;
    private Button.MyButton jbPraseodímio;
    private Button.MyButton jbPrata;
    private Button.MyButton jbPromecio;
    private Button.MyButton jbProtactinio;
    private Button.MyButton jbRadio;
    private Button.MyButton jbRadonio;
    private Button.MyButton jbRenio;
    private Button.MyButton jbRodio;
    private Button.MyButton jbRoentgenio;
    private Button.MyButton jbRubidio;
    private Button.MyButton jbRutenio;
    private Button.MyButton jbRutherfordio;
    private Button.MyButton jbSamario;
    private Button.MyButton jbSeaborgio;
    private Button.MyButton jbSelenio;
    private javax.swing.JButton jbSemimetais;
    private Button.MyButton jbSilicio;
    private Button.MyButton jbSodio;
    private Button.MyButton jbTalio;
    private Button.MyButton jbTantalo;
    private Button.MyButton jbTecnecio;
    private Button.MyButton jbTelurio;
    private Button.MyButton jbTerbio;
    private javax.swing.JButton jbTerroso;
    private Button.MyButton jbTitanio;
    private Button.MyButton jbTorio;
    private Button.MyButton jbTulio;
    private Button.MyButton jbTungstenio;
    private Button.MyButton jbUnunhexio;
    private Button.MyButton jbUnunnoctio;
    private Button.MyButton jbUnunpentio;
    private Button.MyButton jbUnunquadio;
    private Button.MyButton jbUnunseptio;
    private Button.MyButton jbUnuntrio;
    private Button.MyButton jbUranio;
    private Button.MyButton jbVanadio;
    private Button.MyButton jbXenonio;
    private Button.MyButton jbZinco;
    private Button.MyButton jbZirconio;
    private javax.swing.JLabel jlElemento;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenuItem jmSobre;
    private javax.swing.JMenuItem jmiJogar;
    private javax.swing.JMenuItem jmiLogin;
    private javax.swing.JMenuItem jmiRanking;
    private javax.swing.JMenuItem jmiUsuario;
    private javax.swing.JLabel jtfUsuario;
    // End of variables declaration//GEN-END:variables
    private Jogo j;
    private Ranking r;
    private static Telaprincipal instance = null;

    /**
     * Método para se ter acesso a tudo que foi feitos por mim nesta classe
     * @return Todos os métodos existentes nesta classe
     */
    public static Telaprincipal getInstance() {
        if (instance == null) {
            instance = new Telaprincipal();
        }
        return instance;
    }

    public Jogo getJ() {
        return j;
    }

    public void setJ(Jogo j) {
        this.j = j;
    }
}
