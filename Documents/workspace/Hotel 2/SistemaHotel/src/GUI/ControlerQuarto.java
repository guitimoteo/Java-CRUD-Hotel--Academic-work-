/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.QuartoDAO;
import VO.Quarto;
import banco.Banco;
import java.awt.Component;
import java.awt.HeadlessException;
import java.util.Iterator;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;



/**
 *
 * @author chris
 */
public class ControlerQuarto extends javax.swing.JFrame {

    /**
     * Creates new form Quarto
     */
     //Criação dos Atributos 
    Banco bc = new Banco ("root", "", "localhost", "hotel", 3306);
    private QuartoDAO quartoDao = new QuartoDAO(bc);
    
    private Quarto quartoVO;
   
    
    
    
    public ControlerQuarto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegQuarto = new javax.swing.JLabel();
        lblCodQuarto = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblTipoQuarto = new javax.swing.JLabel();
        comTipo = new javax.swing.JComboBox();
        lblLocalizacao = new javax.swing.JLabel();
        txtLocalizacao = new javax.swing.JTextField();
        txtFoto = new javax.swing.JTextField();
        lblCaracteristica = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblOcupado = new javax.swing.JLabel();
        txtOcupado = new javax.swing.JTextField();
        lblVago = new javax.swing.JLabel();
        txtVago = new javax.swing.JTextField();
        lblReservado = new javax.swing.JLabel();
        txtReservado = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        cxBArCondicionado = new javax.swing.JCheckBox();
        cxbTv = new javax.swing.JCheckBox();
        cxbCofre = new javax.swing.JCheckBox();
        cxbTelefone = new javax.swing.JCheckBox();
        cxbBanheira = new javax.swing.JCheckBox();
        cxbFrigobar = new javax.swing.JCheckBox();
        cxbPayPerView = new javax.swing.JCheckBox();
        cxbHidromassagem = new javax.swing.JCheckBox();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegQuarto.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblRegQuarto.setText("Registro de Quarto");

        lblCodQuarto.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblCodQuarto.setText("Código:");

        lblNumero.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblNumero.setText("Número:");

        lblTipoQuarto.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblTipoQuarto.setText("Tipo de Quarto:");

        comTipo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        comTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Standard", "Superior", "Deluxe", "Suíte", "Júnior Suíte", "Suíte Executiva", "Suíte Presidencial" }));

        lblLocalizacao.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblLocalizacao.setText("Localização:");

        txtLocalizacao.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        txtFoto.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txtFoto.setText("                      Foto");
        txtFoto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));

        lblCaracteristica.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblCaracteristica.setText("Característica");

        lblPreco.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblPreco.setText("Preço:");

        txtPreco.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txtPreco.setText(" R$");
        txtPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        lblOcupado.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblOcupado.setText("Ocupado :");

        lblVago.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblVago.setText("Vago :");

        lblReservado.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblReservado.setText("Reservado :");

        btnCadastrar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cadastrar.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/atualizar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/deletar.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/menu.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        cxBArCondicionado.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cxBArCondicionado.setText("Ar condicionado");

        cxbTv.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cxbTv.setText("Tv a cabo");

        cxbCofre.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cxbCofre.setText("Cofre");

        cxbTelefone.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cxbTelefone.setText("Telefone");

        cxbBanheira.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cxbBanheira.setText("Banheira");

        cxbFrigobar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cxbFrigobar.setText("Frigobar");

        cxbPayPerView.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cxbPayPerView.setText("Pay-per-view");

        cxbHidromassagem.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cxbHidromassagem.setText("Hidromassagem");

        lblTotal.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblTotal.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addComponent(lblCaracteristica))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxBArCondicionado)
                                            .addComponent(cxbTv)
                                            .addComponent(cxbTelefone)
                                            .addComponent(cxbCofre))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cxbFrigobar)
                                            .addComponent(cxbBanheira)
                                            .addComponent(cxbPayPerView)
                                            .addComponent(cxbHidromassagem)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(210, 210, 210)
                                                .addComponent(lblVago))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(lblOcupado)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtVago, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(lblReservado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtReservado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(lblPreco))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblTotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(lblTipoQuarto))
                                    .addComponent(lblRegQuarto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCodQuarto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblLocalizacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(68, 68, 68)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRegQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(lblCodQuarto)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(lblCaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxBArCondicionado)
                            .addComponent(cxbFrigobar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxbPayPerView)
                                    .addComponent(cxbTv))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cxbTelefone)
                                    .addComponent(cxbBanheira))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cxbCofre)
                                    .addComponent(cxbHidromassagem))
                                .addGap(18, 18, 18)))
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVago, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVago, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblReservado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtReservado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotal)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //QuartoDAO quartoDAO= new QuartoDAO();
        Quarto quarto1 = new Quarto();
        String txtCaracteristica  = new String();

        if (txtNumero.getText().isEmpty() ||  txtLocalizacao.getText().isEmpty()
                || txtOcupado.getText().isEmpty()
                || txtReservado.getText().isEmpty() || txtVago.getText().isEmpty()
                || txtTotal.getText().isEmpty() || txtPreco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Erro!! Por favor preencha os campos corretamente!!!");
        } else {
           
            /* txtCaracteristica = cxBArCondicionado.getText()  +","; 
                               cxbBanheira. +","+
                                cxbCofre.toString() +","+
                                cxbFrigobar.toString() +","+
                                cxbHidromassagem.toString() +","+
                                cxbPayPerView.toString() +","+
                                cxbTelefone.toString() +","+
                                cxbTv.toString();*/
            /**
             * Inclui todas as checkboxs dentro do txtCaracter[stocas e
             * Deseleciona as checkboxs
             */
            for(Component c : this.getContentPane().getComponents() ){
                 if ( c instanceof JCheckBox && ((JCheckBox)c).isSelected() ){
                     //System.out.println(((JCheckBox)c).getText() );
                     txtCaracteristica += ((JCheckBox)c).getText()+",";
                     
                     //deseleciona
                     ((JCheckBox)c).setSelected(false);
                 }
            }
            
            quarto1.setNumero(Integer.parseInt(txtNumero.getText()));
            quarto1.setTipo((String)comTipo.getSelectedItem());
            quarto1.setLocalizacao(txtLocalizacao.getText());
            quarto1.setCaracteristica(txtCaracteristica);
            quarto1.setQtdOcupado(Integer.parseInt(txtOcupado.getText()));
            quarto1.setQtdReservado(Integer.parseInt(txtReservado.getText()));
            quarto1.setQtdVago(Integer.parseInt(txtVago.getText()));
            quarto1.setQtdTotal(Integer.parseInt(txtTotal.getText()));
            quarto1.setPreco(Double.parseDouble(txtPreco.getText().replace(',', '.')
                                                                  .replace('R', ' ').replace('$', ' ')  ));
            
            
            quartoDao.cadastrar(quarto1);
            JOptionPane.showMessageDialog(this, "Quarto cadastrado com sucesso");
            //Limpa toda os campos da tela
            txtNumero.setText("");
            comTipo.setSelectedIndex(0);
            txtLocalizacao.setText("");
            txtCaracteristica = "";
            txtOcupado.setText("");
            txtReservado.setText("");
            txtVago.setText("");
            txtTotal.setText("");
            txtPreco.setText("");
            
            //Volta o focus do mouse para o nome.
            txtNumero.requestFocus();
        }                                         
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
                Quarto quarto1 = new Quarto();
        String txtCaracteristica  = new String();

        if (txtNumero.getText().isEmpty() ||  txtLocalizacao.getText().isEmpty()
                || txtOcupado.getText().isEmpty()
                || txtReservado.getText().isEmpty() || txtVago.getText().isEmpty()
                || txtTotal.getText().isEmpty() || txtPreco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Erro!! Por favor preencha os campos corretamente!!!");
        } else {
           
            /* txtCaracteristica = cxBArCondicionado.getText()  +","; 
                               cxbBanheira. +","+
                                cxbCofre.toString() +","+
                                cxbFrigobar.toString() +","+
                                cxbHidromassagem.toString() +","+
                                cxbPayPerView.toString() +","+
                                cxbTelefone.toString() +","+
                                cxbTv.toString();*/
            /**
             * Inclui todas as checkboxs dentro do txtCaracter[stocas e
             * Deseleciona as checkboxs
             */
            for(Component c : this.getContentPane().getComponents() ){
                 if ( c instanceof JCheckBox && ((JCheckBox)c).isSelected() ){
                     //System.out.println(((JCheckBox)c).getText() );
                     txtCaracteristica += ((JCheckBox)c).getText()+",";
                     
                     //deseleciona
                     ((JCheckBox)c).setSelected(false);
                 }
            }
            
            quarto1.setNumero(Integer.parseInt(txtNumero.getText()));
            quarto1.setTipo((String)comTipo.getSelectedItem());
            quarto1.setLocalizacao(txtLocalizacao.getText());
            quarto1.setCaracteristica(txtCaracteristica);
            quarto1.setQtdOcupado(Integer.parseInt(txtOcupado.getText()));
            quarto1.setQtdReservado(Integer.parseInt(txtReservado.getText()));
            quarto1.setQtdVago(Integer.parseInt(txtVago.getText()));
            quarto1.setQtdTotal(Integer.parseInt(txtTotal.getText()));
            quarto1.setPreco(Double.parseDouble(txtPreco.getText().replace(',', '.')
                                                                  .replace('R', ' ').replace('$', ' ')  ));

            quartoDao.atualizar(quarto1);
            JOptionPane.showMessageDialog(this, "Quarto atualizado com sucesso");
            //Limpa toda os campos da tela
            txtNumero.setText("");
            comTipo.setSelectedIndex(0);
            txtLocalizacao.setText("");
            txtCaracteristica = "";
            txtOcupado.setText("");
            txtReservado.setText("");
            txtVago.setText("");
            txtTotal.setText("");
            txtPreco.setText("");
            
            //Volta o focus do mouse para o nome.
            txtNumero.requestFocus();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
              String txtCaracteristica ;
              String[] txtCaracteristicaVetor;
              int i;
              try{
              if (txtNumero.getText().isEmpty()){
                  JOptionPane.showMessageDialog (rootPane, "Por favor, insira o número do quarto para buscar os dados");
              }else{
                    quartoVO = new Quarto ();
                    quartoVO = (Quarto)quartoDao.buscar(Integer.parseInt(txtNumero.getText()));     
            if (quartoVO == null)
                JOptionPane.showMessageDialog (rootPane, "Quarto não encontrado!!!");
            else{       
                comTipo.setSelectedItem(quartoVO.getTipo());
                txtLocalizacao.setText(quartoVO.getLocalizacao());
                txtCaracteristica = quartoVO.getCaracteristica();
                txtReservado.setText(String.format("%d", quartoVO.getQtdReservado()));
                txtOcupado.setText(String.format("%d", quartoVO.getQtdOcupado()));
                txtVago.setText(String.format("%d", quartoVO.getQtdVago()));
                txtTotal.setText(String.format("%d", quartoVO.getQtdTotal()));
                txtPreco.setText("R$ " + String.format("%10.2f",quartoVO.getPreco()));
                
                txtCaracteristicaVetor = txtCaracteristica.split(",");
                
                
                for(Component c : this.getContentPane().getComponents()){
                    if(c instanceof JCheckBox){
                        //São de 0 à 7 por conta de 8 JCheckBox.
                        for(i = 0; i <=txtCaracteristicaVetor.length -1; i++ ){
                        if(txtCaracteristicaVetor[i].equals(((JCheckBox)c).getText()) ){
                            System.out.println("Selecionado");
                            ((JCheckBox)c).setSelected(true);
                        }
                        }
                    }
                }
                
            }
    
        }
   

     }catch(HeadlessException | NumberFormatException e){
          

  JOptionPane.showMessageDialog (rootPane, "ERRO: " + e.getMessage());
       

 }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
 try{
            if (txtNumero.getText().isEmpty()){
                JOptionPane.showMessageDialog (rootPane, "Por favor, insira o número do quarto!!!");
            }else{
                 quartoVO = new Quarto ();
                 quartoVO = (Quarto)quartoDao.buscar(Integer.parseInt(txtNumero.getText()));    
            if (quartoVO == null)         
                 JOptionPane.showMessageDialog (rootPane, "Registro não encontrado");
            else{
                 //Pergunta ao usuário se ele deseja deletar o registro.
            if(JOptionPane.showConfirmDialog(rootPane, "Deseja deletar o registro de " + quartoVO.getNumero() + " "
                 , null, JOptionPane.YES_NO_OPTION)==0)
                {
           if(quartoDao.deletar(quartoVO)) //Verifica a existência de erros
                  JOptionPane.showMessageDialog (rootPane, "Registro deletado com êxito");
           else
                    JOptionPane.showMessageDialog (rootPane, "Não foi possível deletar o registro");
           }

  }
       
     }
     
   }catch(HeadlessException | NumberFormatException e){
          JOptionPane.showMessageDialog (rootPane, "ERRO: " + e.getMessage());

 }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
       // Volta para a tela de Menu do Sistema
        Menu menu = new Menu();
        menu.show();
        this.setVisible(false);    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(ControlerQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlerQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlerQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlerQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlerQuarto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox comTipo;
    private javax.swing.JCheckBox cxBArCondicionado;
    private javax.swing.JCheckBox cxbBanheira;
    private javax.swing.JCheckBox cxbCofre;
    private javax.swing.JCheckBox cxbFrigobar;
    private javax.swing.JCheckBox cxbHidromassagem;
    private javax.swing.JCheckBox cxbPayPerView;
    private javax.swing.JCheckBox cxbTelefone;
    private javax.swing.JCheckBox cxbTv;
    private javax.swing.JLabel lblCaracteristica;
    private javax.swing.JLabel lblCodQuarto;
    private javax.swing.JLabel lblLocalizacao;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblOcupado;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblRegQuarto;
    private javax.swing.JLabel lblReservado;
    private javax.swing.JLabel lblTipoQuarto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVago;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFoto;
    private javax.swing.JTextField txtLocalizacao;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtOcupado;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtReservado;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVago;
    // End of variables declaration//GEN-END:variables
}