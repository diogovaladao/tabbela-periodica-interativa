// Created on 09/10/2011, 22:48:37
package View;

// @author Diogo
import Bean.Usuario;
import DAO.DAOUsuario;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JDialog {

    /** Creates new form Login */
    public Login() {
        super(Telaprincipal.getInstance(), true);
        initComponents();
    }

    public boolean validar() {
        boolean val = true;
        if (jtfLogin.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o login", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            val = false;
        } else if (jtfSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite a senha", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            val = false;
            jtfSenha.requestFocus();
        }
        return val;
    }

    public boolean testaLogin() {
        boolean val = true;
        listausuario = DAOUsuario.buscarUsuario("");
        for (Usuario usu : listausuario) {
            if (usu.getLogin().equals(jtfLogin.getText()) && (usu.getSenha().equals(jtfSenha.getText()))) {
                idusuariologado = usu.getIdusuario();
                usuariologado = usu.getNome();
                pontos = usu.getPontuacao();
                val = true;
                break;
            } else {
                val = false;
            }
        }
        return val;
    }

    public void entrar() {
        if (validar()) {
            if (testaLogin()) {
                limpar();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha não correspondem", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                jtfSenha.selectAll();
            }
        }
    }

    public void limpar() {
        jtfLogin.setText("");
        jtfSenha.setText("");
    }

    public String usuarioLogado() {
        return usuariologado;
    }

    public int getCodigo() {
        return idusuariologado;
    }

    public void logoff() {
        idusuariologado = 0;
        usuariologado = "";
        pontos = 0;
        listausuario.clear();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbNovo = new javax.swing.JButton();
        jtfSenha = new javax.swing.JPasswordField();
        jbEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jLabel2.setText("Senha");

        jLabel1.setText("Login");

        jbNovo.setText("Novo Cadastro");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaActionPerformed(evt);
            }
        });

        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbNovo)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEntrar)
                    .addComponent(jbNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-303)/2, (screenSize.height-168)/2, 303, 168);
    }// </editor-fold>//GEN-END:initComponents

private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
    this.dispose();
    Cadastrousuario.showInstance();
}//GEN-LAST:event_jbNovoActionPerformed

private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
    entrar();
}//GEN-LAST:event_jbEntrarActionPerformed

private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaActionPerformed
    entrar();
}//GEN-LAST:event_jtfSenhaActionPerformed
    private Vector<Usuario> listausuario;
    String usuariologado = "";
    int idusuariologado, pontos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JPasswordField jtfSenha;
    // End of variables declaration//GEN-END:variables
    public static Login instance = null;

    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }

    public static void showInstance() {
        getInstance().setVisible(true);
    }
}
