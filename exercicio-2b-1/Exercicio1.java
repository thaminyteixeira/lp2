
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunos
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        nome = new javax.swing.JLabel();
        dataNasc = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputDataNasc = new javax.swing.JTextField();
        inputTel = new javax.swing.JTextField();
        inputEndereco = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome.setText("Nome: ");

        dataNasc.setText("Data Nascimento: ");

        telefone.setText("Telefone: ");

        endereco.setText("Endereço: ");

        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}
            },
            new String [] {
                "Nome", "Data Nascimento", "Telefone", "Endereço"
            }
        ));
        tableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionar)
                .addGap(18, 18, 18)
                .addComponent(botaoSalvar)
                .addGap(18, 18, 18)
                .addComponent(botaoRemover)
                .addGap(244, 244, 244))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dataNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome)
                                    .addComponent(telefone)
                                    .addComponent(endereco))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputNome, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                                    .addComponent(inputTel)
                                    .addComponent(inputEndereco)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNasc)
                    .addComponent(inputDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefone)
                    .addComponent(inputTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endereco)
                    .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdicionar)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoRemover))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void tableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {                                           

        int row = tableUsuarios.rowAtPoint(evt.getPoint());
        
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();

        inputNome.setText(dtm.getValueAt(row, 0).toString());
        inputDataNasc.setText(dtm.getValueAt(row, 1).toString());
        inputTel.setText(dtm.getValueAt(row, 2).toString());
        inputEndereco.setText(dtm.getValueAt(row, 3).toString());
            
    }                                          

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {                                               

        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        
        String verNome = inputNome.getText();
        String verData = inputDataNasc.getText();
        String verTel = inputTel.getText();
        String verEnd = inputEndereco.getText();
        
        if (verNome.equals("") || verData.equals("") || verTel.equals("") || verEnd.equals("")){
            JOptionPane.showMessageDialog(this, "Todos os campos são de preenchimento obrigatório.");
        }
        else{
            String a [] = new String [] {verNome, verData, verTel, verEnd};
            dtm.addRow(a);
        }
    }                                              

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {                                            

        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        int rowSelected = tableUsuarios.getSelectedRow();
        
        String verNome = inputNome.getText();
        String verData = inputDataNasc.getText();
        String verTel = inputTel.getText();
        String verEnd = inputEndereco.getText();
        
        if (rowSelected == -1){
           if (verNome.equals("") || verData.equals("") || verTel.equals("") || verEnd.equals("")){
                JOptionPane.showMessageDialog(this, "Todos os campos são de preenchimento obrigatório.");
           }
           else{
               String a [] = new String [] {verNome, verData, verTel, verEnd};
               dtm.addRow(a);
           }
        }
        else{
            dtm.setValueAt(verNome,rowSelected, 0); //coloca o valor de verNome na linha selecionada e na coluna 0
            dtm.setValueAt(verData, rowSelected, 1);
            dtm.setValueAt(verTel,rowSelected, 2);
            dtm.setValueAt(verEnd, rowSelected, 3);
        }
    }                                           

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {                                             
 
        DefaultTableModel dtm = (DefaultTableModel) tableUsuarios.getModel();
        int rowSelected = tableUsuarios.getSelectedRow();
        
        if (rowSelected == -1){
                JOptionPane.showMessageDialog(this, "É preciso selecionar uma linha para remover! ");
           }
        else{
            int opcao = JOptionPane.showConfirmDialog(this, "Você tem certeza que deseja excluir essa linha?", 
                    "Confirme sua opção: ", JOptionPane.YES_NO_OPTION);
            if(opcao==JOptionPane.YES_OPTION){
                dtm.removeRow(rowSelected);
            }
        }
    }                                            

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

    // Variables declaration - do not modify                     
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel dataNasc;
    private javax.swing.JLabel endereco;
    private javax.swing.JTextField inputDataNasc;
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nome;
    private javax.swing.JTable tableUsuarios;
    private javax.swing.JLabel telefone;
    // End of variables declaration                   
}
