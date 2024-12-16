/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VccCliente;
import dao.VccClienteDAO;
import java.sql.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tools.Util;

/**
 *
 * @author Viviane
 */
public class JDlgCliente extends javax.swing.JDialog {

    private Object cad;
    boolean incluir;
    boolean pesquisar;

    /**
     * Creates new form JDlgCliente
     */
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cliente");
        setLocationRelativeTo(null);
        habilitar(false);
        limpar();
    }

    private void habilitar(boolean status) {
        if (status) {
            Util.habilitar(true, jTxtCodigo, jTxtNome, jTxtEmail, jTxtDataDeNasc, jCboSexo, jTxtCPF, jTxtRG, jTxtTelefone, jTxtEndereco,
                    jTxtCidade, jTxtCEP, jTxtEstado, jTxtDataDeCadastro, jTxtDataUltimaCompra, jTxtStatusCliente,
                    jBtnCancelar, jBtnConfirmar);
            Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnPesquisar, jBtnExcluir);
        } else {
            Util.habilitar(false, jTxtCodigo, jTxtNome, jTxtEmail, jTxtDataDeNasc, jCboSexo, jTxtCPF, jTxtRG, jTxtTelefone, jTxtEndereco,
                    jTxtCidade, jTxtCEP, jTxtEstado, jTxtDataDeCadastro, jTxtDataUltimaCompra, jTxtStatusCliente,
                    jBtnCancelar, jBtnConfirmar);
            Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnPesquisar, jBtnExcluir);
        }

    }

    private void limpar() {
        jCboSexo.setSelectedIndex(0);
        Util.limpar(jTxtCodigo, jTxtNome, jTxtEmail, jTxtDataDeNasc, jCboSexo, jTxtCPF, jTxtRG, jTxtTelefone, jTxtEndereco,
                jTxtCidade, jTxtCEP, jTxtEstado, jTxtDataDeCadastro, jTxtDataUltimaCompra, jTxtStatusCliente);
    }

    private VccCliente viewbean() {
        VccCliente vcc_cliente = new VccCliente();
        try {

            int cod = Util.strToInt(jTxtCodigo.getText());

            vcc_cliente.setVccIdCliente(cod);
            vcc_cliente.setVccNome(jTxtNome.getText());
            vcc_cliente.setVccEmail(jTxtEmail.getText());
            vcc_cliente.setVccDataNasc(Util.strToDate(jTxtDataDeNasc.getText()));
            vcc_cliente.setVccCpf(jTxtCPF.getText());
            vcc_cliente.setVccRg(jTxtRG.getText());
            vcc_cliente.setVccNumeroTelefone(jTxtTelefone.getText());
            vcc_cliente.setVccEndereco(jTxtEndereco.getText());
            vcc_cliente.setVccCidade(jTxtCidade.getText());
            vcc_cliente.setVccCep(jTxtCEP.getText());
            vcc_cliente.setVccEstados(jTxtEstado.getText());
            vcc_cliente.setVccDataCadastro(Util.strToDate(jTxtDataDeCadastro.getText()));
            vcc_cliente.setVccDataUltimaCompra(Util.strToDate(jTxtDataUltimaCompra.getText()));
            vcc_cliente.setVccStatusCliente(jTxtStatusCliente.getText());

            if (jCboSexo.getSelectedIndex() == 0) {
                vcc_cliente.setVccSexo("M");
            } else if (jCboSexo.getSelectedIndex() == 1) {
                vcc_cliente.setVccSexo("F");
            } else if (jCboSexo.getSelectedIndex() == 2) {
                vcc_cliente.setVccSexo("N");
            }
            return vcc_cliente;
        } catch (ParseException ex) {
            System.err.println("Erro na conversão das data");
        }
        return vcc_cliente;
    }

    public void beanview(VccCliente cliente) {

        jTxtCodigo.setText(Util.intToStr(cliente.getVccIdCliente()));

        jTxtNome.setText(cliente.getVccNome());
        jTxtEmail.setText(cliente.getVccEmail());
        jTxtDataDeNasc.setText(Util.dateToStr((Date) cliente.getVccDataNasc()));
        jTxtCPF.setText(cliente.getVccCpf());
        jTxtRG.setText(cliente.getVccRg());
        jTxtTelefone.setText(cliente.getVccNumeroTelefone());
        jTxtEndereco.setText(cliente.getVccEndereco());
        jTxtCidade.setText(cliente.getVccCidade());
        jTxtCEP.setText(cliente.getVccCpf());
        jTxtEstado.setText(cliente.getVccEstados());
        jTxtDataDeCadastro.setText(Util.dateToStr((Date) cliente.getVccDataCadastro()));
        jTxtDataUltimaCompra.setText(Util.dateToStr((Date) cliente.getVccDataUltimaCompra()));
        jTxtStatusCliente.setText(cliente.getVccStatusCliente());

        if (cliente.getVccSexo() == "M") {
            jCboSexo.setSelectedIndex(0);
        } else if (cliente.getVccSexo() == "F") {
            jCboSexo.setSelectedIndex(1);
        } else if (cliente.getVccSexo() == "N") {
            jCboSexo.setSelectedIndex(2);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtDataDeNasc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCboSexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtCPF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtRG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtEstado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jTxtCEP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxtDataDeCadastro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTxtDataUltimaCompra = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTxtStatusCliente = new javax.swing.JTextField();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jTxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de Nascimento");

        jTxtDataDeNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDataDeNascActionPerformed(evt);
            }
        });

        jLabel4.setText("Sexo");

        jCboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino ", "Neutro" }));
        jCboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboSexoActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        jLabel6.setText("Telefone");

        jLabel7.setText("CPF");

        jLabel8.setText("CEP");

        jLabel9.setText("RG");

        jLabel10.setText("Estado");

        jLabel11.setText("Cidade");

        jLabel12.setText("Endereço");

        jLabel13.setText("Data de Cadastro");

        jLabel14.setText("Data da Ultima Compra");

        jLabel15.setText("Status do Cliente");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTxtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTxtDataDeNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTxtDataDeCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtCidade, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel13))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTxtDataUltimaCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtCEP, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel14))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTxtStatusCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBtnIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBtnPesquisar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDataDeNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTxtDataUltimaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTxtStatusCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTxtDataDeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboSexoActionPerformed

    private void jTxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNomeActionPerformed

    private void jTxtDataDeNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDataDeNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtDataDeNascActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        limpar();
        habilitar(true);
        incluir = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        if (pesquisar == false) {
            JDlgClientePesquisar telaPesquisa = new JDlgClientePesquisar(null, true);
            telaPesquisa.setTelaAnterior(this);
            telaPesquisa.setVisible(true);
        }
        habilitar(true);
        Util.habilitar(false, jTxtCodigo);
        incluir = false;
        pesquisar = false;

    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
        if (pesquisar == false) {
            JDlgClientePesquisar telaPesquisa = new JDlgClientePesquisar(null, true);
            telaPesquisa.setTelaAnterior(this);
            telaPesquisa.setVisible(true);
        }
        if (Util.perguntar("Confirme exclusão!", "Deletar registro")) {
            VccCliente cliente = viewbean();
            VccClienteDAO dao = new VccClienteDAO();
            dao.delete(cliente);
            JOptionPane.showMessageDialog(null, "Exclusão realizada");
            limpar();

        } else {
            JOptionPane.showMessageDialog(null, "Exclusão cancelada");
            habilitar(false);
        }
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        VccCliente cliente = viewbean();
        VccClienteDAO dao = new VccClienteDAO();
        if (incluir == true) {
            dao.insert(cliente);
        } else {
            dao.update(cliente);
        }
        habilitar(false);

        limpar();
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        incluir = false;
        habilitar(false);
        limpar();

    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgClientePesquisar telaPesquisa = new JDlgClientePesquisar(null, true);
        telaPesquisa.setTelaAnterior(this);
        telaPesquisa.setVisible(true);
        pesquisar=true;
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JComboBox<String> jCboSexo;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTxtCEP;
    private javax.swing.JTextField jTxtCPF;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtDataDeCadastro;
    private javax.swing.JTextField jTxtDataDeNasc;
    private javax.swing.JTextField jTxtDataUltimaCompra;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtEstado;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtRG;
    private javax.swing.JTextField jTxtStatusCliente;
    private javax.swing.JTextField jTxtTelefone;
    // End of variables declaration//GEN-END:variables

}
