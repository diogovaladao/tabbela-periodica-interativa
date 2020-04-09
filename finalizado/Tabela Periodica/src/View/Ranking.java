// Created on 17/10/2011, 22:28:07
package View;

import Bean.Usuario;
import DAO.DAOUsuario;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Ranking extends javax.swing.JDialog {

    /** Creates new form Ranking */
    public Ranking() {
        super(Telaprincipal.getInstance(), true);
        initComponents();
        buscar();
    }

    private void buscar() {
        DefaultTableModel model = new DefaultTableModel(
                new Object[]{"Login", "Pontos"}, 0) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        listausuario = DAOUsuario.buscarUsuario("");
        for (Usuario usu : listausuario) {
            model.addRow(new Object[]{usu.getLogin(), usu.getPontuacao()});
        }
        jtPontuacao.setModel(model);
    }
    
    private Vector<Usuario> listausuario = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtPontuacao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Colocação");

        jtPontuacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Login", "Pontuação"
            }
        ));
        jScrollPane1.setViewportView(jtPontuacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-298)/2, (screenSize.height-277)/2, 298, 277);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPontuacao;
    // End of variables declaration//GEN-END:variables
}