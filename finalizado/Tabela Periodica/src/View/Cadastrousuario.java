// Created on 09/10/2011, 14:07:40
package View;

// @author Diogo
import Bean.Usuario;
import DAO.DAOUsuario;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Cadastrousuario extends javax.swing.JDialog {

    public Cadastrousuario() {
        super(Telaprincipal.getInstance(), true);
        initComponents();
    }

    public void salvar() {
        Usuario usu = new Usuario();
        usu.setNome(jtfNome.getText());
        usu.setSenha(jtfSenha.getText());
        usu.setLogin(jtfLogin.getText());
        usu.setPontuacao(0);
        DAOUsuario.saveUsuario(usu);
        jtfNome.requestFocus();
    }

    private boolean validar() {
        boolean val = true;
        if (jtfNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o nome", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            val = false;
        } else if (jtfSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite uma senha", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            val = false;
        } else if (!jtfConfirma.getText().equals(jtfSenha.getText())) {
            JOptionPane.showMessageDialog(this, "As senhas não correspondem", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            val = false;
        } else if (jtfLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o login", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            val = false;
        }
        return val;
    }

    public boolean testaLogin() {
        boolean val = true;
        listausuario = DAOUsuario.buscarUsuario("");
        for (Usuario usu : listausuario) {
            if (usu.getLogin().equals(jtfLogin.getText())) {
                JOptionPane.showMessageDialog(null, "Login já cadastrado!!!");
                jtfLogin.requestFocus();
                val = false;
                break;
            }
            if (jtfLogin.getText().length() > 10) {
                JOptionPane.showMessageDialog(null, "Login deve ter no máximo 10 caracteres!!!");
                jtfLogin.requestFocus();
                jtfLogin.selectAll();
                val = false;
                break;
            }
        }
        return val;
    }

    public void limpar() {
        jtfNome.setText("");
        jtfSenha.setText("");
        jtfConfirma.setText("");
        jtfLogin.setText("");
    }

    public void cadastrar() {
        if (validar()) {
            if (testaLogin()) {
                salvar();
                JOptionPane.showMessageDialog(null, "Cadastrado efetuado com sucesso!");
                limpar();
                this.dispose();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JPasswordField();
        jtfLogin = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfConfirma = new javax.swing.JPasswordField();

        setTitle("Cadastro de Usuário");

        jLabel1.setText("Nome");

        jLabel2.setText("Senha");

        jLabel3.setText("Login");

        jtfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLoginActionPerformed(evt);
            }
        });

        jbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Salvar.png"))); // NOI18N
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Confirmar senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCadastrar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jtfConfirma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jtfNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(jtfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-315)/2, (screenSize.height-216)/2, 315, 216);
    }// </editor-fold>//GEN-END:initComponents

private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
    cadastrar();
}//GEN-LAST:event_jbCadastrarActionPerformed

private void jtfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLoginActionPerformed
    cadastrar();
}//GEN-LAST:event_jtfLoginActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JPasswordField jtfConfirma;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
    private Vector<Usuario> listausuario;
    public static Cadastrousuario instance = null;

    public static Cadastrousuario getInstance() {
        if (instance == null) {
            instance = new Cadastrousuario();
        }
        return instance;
    }

    public static void showInstance() {
        getInstance().setVisible(true);
    }
}
