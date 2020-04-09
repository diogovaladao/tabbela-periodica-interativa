// Created on 16/10/2011, 14:29:45
package View;

import DAO.DAOUsuario;
import Utilitarios.Verificar;
import javax.swing.JOptionPane;

public class Jogo extends javax.swing.JDialog {

    /** Creates new form Jogo */
    public Jogo() {
        super(Telaprincipal.getInstance(), true);
        initComponents();
        paginaUm();
    }

    public void paginaUm() {
        jtfPergunta1.setText("1) Qual o símbolo químico do Chumbo?");
        jrbA.setText("Cr");
        jrbB.setText("Pb");//certo
        jrbC.setText("Bi");
        jrbD.setText("Pd");
        jtfPergunta2.setText("2) Qual desses elementos pertencem ao grupo 3A?");
        jrbA1.setText("Alumínio");//certo
        jrbB1.setText("Hidrogênio");
        jrbC1.setText("Urânio");
        jrbD1.setText("Frâncio");
        jtfPaginacao.setText(pergunta + " /10");
    }

    public void paginaDois() {
        jtfPergunta1.setText("3) O Radônio está no grupo dos...");
        jrbA.setText("Metais de transição");
        jrbB.setText("Metais alcalinos");
        jrbC.setText("Halogênios");
        jrbD.setText("Gases nobres");//certo
        jtfPergunta2.setText("4) Qual o número atômcio do Irídio?");
        jrbA1.setText("76");
        jrbB1.setText("78");
        jrbC1.setText("77");//certo
        jrbD1.setText("81");
        jtfPaginacao.setText(pergunta + " /10");

    }

    public void paginaTres() {
        jtfPergunta1.setText("5) Quantos elétrons o Iodo possui na camada M?");
        jrbA.setText("8");
        jrbB.setText("32");
        jrbC.setText("18");//certo
        jrbD.setText("2");
        jtfPergunta2.setText("6) Qual o maior e o menor número atômico dos elementos do grupo dos Lantanídeos?");
        jrbA1.setText("74 - 86");
        jrbB1.setText("89 - 103");
        jrbC1.setText("57 - 71");//certo
        jrbD1.setText("19 - 36");
        jtfPaginacao.setText(pergunta + " /10");
    }

    public void paginaQuatro() {
        jtfPergunta1.setText("7) Qual o gás tem a capacidade de deixar as pessoas com a voz fina?");
        jrbA.setText("Hélio");//certo
        jrbB.setText("Túlio");
        jrbC.setText("Oxigênio");
        jrbD.setText("Argônio");
        jtfPergunta2.setText("8) Qual a massa atômica do Rênio?");
        jrbA1.setText("183,84");
        jrbB1.setText("180,94788");
        jrbC1.setText("186,207");//certo
        jrbD1.setText("14,0067");
        jtfPaginacao.setText(pergunta + " /10");
    }

    public void paginaCinco() {
        jtfPergunta1.setText("9) Qual o nome do metal alcalino terroso localizado no 3º período?");
        jrbA.setText("Sódio");
        jrbB.setText("Alumínio");
        jrbC.setText("Magnésio");//certo
        jrbD.setText("Silício");
        jtfPergunta2.setText("10) Em que período está localizado o elemento Itérbio?");
        jrbA1.setText("4");
        jrbB1.setText("7");
        jrbC1.setText("6");//certo
        jrbD1.setText("1");
        jtfPaginacao.setText(pergunta + " /10");
    }

    public void paginaSeis() {
        jtfPergunta1.setText("11) Qual foi o elemento que causou o acidente radioativo em Goiânia em 1987?");
        jrbA.setText("Rádio");
        jrbB.setText("Césio");//certo
        jrbC.setText("Urânio");
        jrbD.setText("Tecnécio");
        jtfPergunta2.setText("12) Quem foi o criador da Tabela Periódica?");
        jrbA1.setText("Werner Heisenberg");
        jrbB1.setText("Isaac Newton");
        jrbC1.setText("Albert Einstein");
        jrbD1.setText("Dimitri Medeleiev");//certo
        jtfPaginacao.setText(pergunta + " /10");
    }

    public void paginaSete() {
        jtfPergunta1.setText("13) Qual o número atômico do elemento que está istuado no 4º período e na família 2A?");
        jrbA.setText("20");//certo
        jrbB.setText("11");
        jrbC.setText("32");
        jrbD.setText("57");
        jtfPergunta2.setText("14) Qual a porcentagem de Oxigênio no ar atmosférico?");
        jrbA1.setText("17,25%");
        jrbB1.setText("23,2%");//certo
        jrbC1.setText("50,3%");
        jrbD1.setText("95%");
        jtfPaginacao.setText(pergunta + "/10");
    }

    public void paginaOito() {
        jtfPergunta1.setText("15) Qual a distribuição eletrônica do Hélio");
        jrbA.setText("2-8-18-32-2");
        jrbB.setText("2-8-7");
        jrbC.setText("2-8");
        jrbD.setText("2");//certo
        jtfPergunta2.setText("16) Gás não tóxico usado na maioria dos refrigeradores domésticos.");
        jrbA1.setText("Hidrogênio");
        jrbB1.setText("Flúor");//certo
        jrbC1.setText("Argônio");
        jrbD1.setText("Cloro");
        jtfPaginacao.setText(pergunta + "/10");
    }

    public void paginaNove() {
        jtfPergunta1.setText("17) Quais desses elementos no grupo dos Halogênios?");
        jrbA.setText("Iodo e Bromo");//certo
        jrbB.setText("Astato e Irídio");
        jrbC.setText("Cloro e Enxofre");
        jrbD.setText("Flúor e Tálio");
        jtfPergunta2.setText("18) Elementos do mesmo grupo têm similares");
        jrbA1.setText("propriedades químicas");//certo
        jrbB1.setText("raios atômicos");
        jrbC1.setText("massas atômicas");
        jrbD1.setText("números atômicos");
        jtfPaginacao.setText(pergunta + "/10");
    }

    public void paginaDez() {
        jtfPergunta1.setText("19) Os elementos menos reativos da tabela periódica são?");
        jrbA.setText("Metais alcalinos-terrosos");
        jrbB.setText("Semimetais");
        jrbC.setText("Gases Nobres");//certo
        jrbD.setText("Actinídeos");
        jtfPergunta2.setText("20) As fileiras verticais da tabela periódica são chamadas");
        jrbA1.setText("Halogênios");
        jrbB1.setText("Períodos");
        jrbC1.setText("Metiais Alcalinos");
        jrbD1.setText("Grupo");//certo
        jtfPaginacao.setText(pergunta + "/10");
    }

    public void perguntaFacil() {
        pontuacao += 10;
    }

    public void perguntaDificil() {
        pontuacao += 15;
    }

    public void proximaPagina() {
        testaPergunta(pergunta);
        pagina++;
        Verificar.verificaPagina(pergunta);
        if (pagina == 10) {
            int a = JOptionPane.showConfirmDialog(null, "Deseja salvar o seu jogo?");
            if (a == 0) {
                DAOUsuario.alterarUsuario(Login.getInstance().idusuariologado, pontuacao);
                this.dispose();
                JOptionPane.showMessageDialog(null, "Você fez " + pontuacao + " pontos!!");
            } else {
                JOptionPane.showMessageDialog(null, "Você fez " + pontuacao + " pontos!!");
                this.dispose();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jtfPergunta1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtfPergunta2 = new javax.swing.JLabel();
        jrbB1 = new javax.swing.JRadioButton();
        jrbA1 = new javax.swing.JRadioButton();
        jrbC1 = new javax.swing.JRadioButton();
        jrbD1 = new javax.swing.JRadioButton();
        jbProxima = new javax.swing.JButton();
        jrbA = new javax.swing.JRadioButton();
        jrbB = new javax.swing.JRadioButton();
        jrbC = new javax.swing.JRadioButton();
        jrbD = new javax.swing.JRadioButton();
        jtfPaginacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(Login.getInstance().usuariologado);

        jtfPergunta1.setFont(new java.awt.Font("Tahoma", 1, 12));

        jtfPergunta2.setFont(new java.awt.Font("Tahoma", 1, 12));

        buttonGroup2.add(jrbB1);
        jrbB1.setFont(new java.awt.Font("Tahoma", 1, 12));

        buttonGroup2.add(jrbA1);
        jrbA1.setFont(new java.awt.Font("Tahoma", 1, 12));

        buttonGroup2.add(jrbC1);
        jrbC1.setFont(new java.awt.Font("Tahoma", 1, 12));

        buttonGroup2.add(jrbD1);
        jrbD1.setFont(new java.awt.Font("Tahoma", 1, 12));

        jbProxima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/proxima.png"))); // NOI18N
        jbProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProximaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbA);
        jrbA.setFont(new java.awt.Font("Tahoma", 1, 12));

        buttonGroup1.add(jrbB);
        jrbB.setFont(new java.awt.Font("Tahoma", 1, 12));

        buttonGroup1.add(jrbC);
        jrbC.setFont(new java.awt.Font("Tahoma", 1, 12));

        buttonGroup1.add(jrbD);
        jrbD.setFont(new java.awt.Font("Tahoma", 1, 12));

        jtfPaginacao.setFont(new java.awt.Font("Tahoma", 1, 11));
        jtfPaginacao.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtfPergunta2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtfPergunta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbB)
                    .addComponent(jrbD)
                    .addComponent(jrbC)
                    .addComponent(jrbA))
                .addContainerGap(575, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(173, Short.MAX_VALUE)
                        .addComponent(jbProxima)
                        .addGap(299, 299, 299))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbC1)
                            .addComponent(jrbD1)
                            .addComponent(jrbB1)
                            .addComponent(jrbA1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jtfPaginacao, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfPergunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbD)
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPergunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbA1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbB1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbC1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbD1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbProxima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfPaginacao, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-643)/2, (screenSize.height-382)/2, 643, 382);
    }// </editor-fold>//GEN-END:initComponents

    private void jbProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProximaActionPerformed
        proximaPagina();
    }//GEN-LAST:event_jbProximaActionPerformed
    int pontuacao = 0, pergunta = 1, pagina = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbProxima;
    private javax.swing.JRadioButton jrbA;
    private javax.swing.JRadioButton jrbA1;
    private javax.swing.JRadioButton jrbB;
    private javax.swing.JRadioButton jrbB1;
    private javax.swing.JRadioButton jrbC;
    private javax.swing.JRadioButton jrbC1;
    private javax.swing.JRadioButton jrbD;
    private javax.swing.JRadioButton jrbD1;
    private javax.swing.JLabel jtfPaginacao;
    private javax.swing.JLabel jtfPergunta1;
    private javax.swing.JLabel jtfPergunta2;
    // End of variables declaration//GEN-END:variables

    public void testaPergunta(int opcao) {
        switch (opcao) {
            case 1:
                if (jrbB.isSelected()) {
                    perguntaFacil();
                }
                if (jrbA1.isSelected()) {
                    perguntaFacil();
                }
                pergunta += 1;
                break;
            case 2:
                if (jrbD.isSelected()) {
                    perguntaFacil();
                }
                if (jrbC1.isSelected()) {
                    perguntaFacil();
                }
                pergunta += 1;
                break;
            case 3:
                if (jrbC.isSelected()) {
                    perguntaFacil();
                }
                if (jrbC1.isSelected()) {
                    perguntaFacil();
                }
                pergunta += 1;
                break;
            case 4:
                if (jrbA.isSelected()) {
                    perguntaFacil();
                }
                if (jrbC1.isSelected()) {
                    perguntaDificil();
                }
                pergunta += 1;
                break;
            case 5:
                if (jrbC.isSelected()) {
                    perguntaDificil();
                }
                if (jrbC1.isSelected()) {
                    perguntaFacil();
                }
                pergunta += 1;
                break;
            case 6:
                if (jrbB.isSelected()) {
                    perguntaFacil();
                }
                if (jrbD1.isSelected()) {
                    perguntaFacil();
                }
                pergunta += 1;
                break;
            case 7:
                if (jrbA.isSelected()) {
                    perguntaFacil();
                }
                if (jrbB1.isSelected()) {
                    perguntaDificil();
                }
                pergunta += 1;
                break;
            case 8:
                if (jrbD.isSelected()) {
                    perguntaFacil();
                }
                if (jrbB1.isSelected()) {
                    perguntaDificil();
                }
                pergunta += 1;
                break;
            case 9:
                if (jrbA.isSelected()) {
                    perguntaFacil();
                }
                if (jrbA1.isSelected()) {
                    perguntaFacil();
                }
                pergunta += 1;
                break;
            case 10:
                if (jrbC.isSelected()) {
                    perguntaDificil();
                }
                if (jrbD1.isSelected()) {
                    perguntaFacil();
                }
                pergunta += 1;
                break;
        }
    }
}
