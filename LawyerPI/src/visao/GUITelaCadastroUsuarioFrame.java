/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.CadastroUsuarioVO;
import modelo.LimitadorLetras;
import modelo.PreCadastroVO;
import modelo.LimitadorNumeros;

/**
 *
 * @author Camila_Camera
 */
public class GUITelaCadastroUsuarioFrame extends javax.swing.JFrame {
    GUIPerfilUsuarioFrame guiperfil;
    
    //Método para enviar dados de email para a classe/tela de perfil
    public void enviarDados() {
        if (guiperfil == null) {
           guiperfil = new GUIPerfilUsuarioFrame();
           guiperfil.setVisible(true);
           guiperfil.receberDadosCadastro(jtfNome.getText());
        } else {
            guiperfil.setVisible(true);
            guiperfil.setState(GUIPerfilUsuarioFrame.NORMAL);
            guiperfil.receberDadosCadastro(jtfNome.getText());
        }
    }
    
    //Método para cadastrar usuário no sistema
    public void cadastrarUsuario () {
        try{
            modelo.CadastroUsuarioVO cad = new CadastroUsuarioVO();
            cad.setNome(jtfNome.getText());
            cad.setTelefone1(jftfTelefone1.getText());
            cad.setTelefone2(jftfTelefone2.getText());
            cad.setGenero(jtfGenero.getText());
            cad.setEndereco(jtfEndereco.getText());
            cad.setCidade(jtfCidade.getText());
            cad.setEstado(jtfEstado.getText());
            cad.setBairro(jtfBairro.getText());
            cad.setDataNascimento(jftfDataNascimento.getText());
            cad.setRgUsuario(jtfRG.getText());
            cad.setCnpj(jtfCNPJ.getText());
            cad.setCpf(jtfCPF.getText());
            cad.setCep(Integer.parseInt(jtfCEP.getText()));
            cad.setComplemento(Integer.parseInt(jtfComplemento.getText()));
            cad.setNumeroEndereco(Integer.parseInt(jtfNumero.getText()));
            //cad.setTrabalho(Boolean.parseBoolean(jcomboResidenciaTrabalho.getActionCommand()));
            //cad.setResidencia(Boolean.parseBoolean(jcomboResidenciaTrabalho.getActionCommand()));
            //cad.setPessoaFisica(Boolean.parseBoolean(jcomboPessoa.getActionCommand()));
            //cad.setPessoaJuridica(Boolean.parseBoolean(jcomboPessoa.getActionCommand()));
           
        
            //Chama a classe CadastroUsuarioServicos em servicos, que fará a inserção dos dados da classe dentro do banco
            servicos.CadastroUsuarioServicos pcad = servicos.ServicosFactory.getCadastroUsuarioServicos();
            pcad.cadastrarUsuario(cad);
            JOptionPane.showMessageDialog(null, "Você foi pré cadastrado(a) com sucesos!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Ops, algo deu errado!" +e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método para cancelar as ações do usuário, setando-as para nulo
    public void cancelarCadastro() {
            jtfNome.setText(null);
            jftfTelefone1.setText(null);
            jftfTelefone2.setText(null);
            jtfGenero.setText(null);
            jtfEndereco.setText(null);
            jtfCidade.setText(null);
            jtfEstado.setText(null);
            jtfBairro.setText(null);
            jftfDataNascimento.setText(null);
            jtfRG.setText(null);
            jtfCNPJ.setText(null);
            jtfCPF.setText(null);
            jtfCEP.setText(null);
            jtfComplemento.setText(null);
            jtfNumero.setText(null);
            jcomboResidenciaTrabalho.setActionCommand(null);
            jcomboResidenciaTrabalho.setActionCommand(null);
            jcomboPessoa.setActionCommand(null);
            jcomboPessoa.setActionCommand(null);
    }

    /**
     * Creates new form GUITelaCadastroUsuarioFrame
     */
    public GUITelaCadastroUsuarioFrame() {
        initComponents();
        //indica que o jTextField está recebendo os comandos especificados dentro das classes LimitadorLetras ou LimitadorNumeros
        jtfGenero.setDocument(new LimitadorLetras(30));
        jtfNome.setDocument(new LimitadorLetras(100));
        jtfCNPJ.setDocument(new LimitadorLetras(14));
        jtfCPF.setDocument(new LimitadorLetras(11));
        jtfRG.setDocument(new LimitadorLetras(10));
        jftfDataNascimento.setDocument(new LimitadorLetras(10));
        jftfTelefone1.setDocument(new LimitadorLetras(12));
        jftfTelefone2.setDocument(new LimitadorLetras(12));
        jtfCEP.setDocument(new LimitadorNumeros(11));
        jtfCidade.setDocument(new LimitadorLetras(50));
        jtfEstado.setDocument(new LimitadorLetras(2));
        jtfEndereco.setDocument(new LimitadorLetras(255));
        jtfBairro.setDocument(new LimitadorLetras(50));
        jtfNumero.setDocument(new LimitadorNumeros(11));
        jtfComplemento.setDocument(new LimitadorNumeros(11));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCidade = new javax.swing.JLabel();
        jlDatadeNascimento = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlNumero = new javax.swing.JLabel();
        jlPessoa = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlIdentificacaodoEndereco = new javax.swing.JLabel();
        jtfRG = new javax.swing.JTextField();
        jlEstado = new javax.swing.JLabel();
        jlRG = new javax.swing.JLabel();
        jlBairro = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlCEP = new javax.swing.JLabel();
        jlDadosdeLogin = new javax.swing.JLabel();
        jlDadosdeCorrespondencia = new javax.swing.JLabel();
        jcomboPessoa = new javax.swing.JComboBox<>();
        jtfCEP = new javax.swing.JTextField();
        jlCNPJ = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jtfCNPJ = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jtfBairro = new javax.swing.JTextField();
        jtfNumero = new javax.swing.JTextField();
        jtfComplemento = new javax.swing.JTextField();
        jlComplemento = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        button1 = new java.awt.Button();
        jbCancelar = new javax.swing.JButton();
        jlLogo = new javax.swing.JLabel();
        jtfGenero = new javax.swing.JTextField();
        jtfEstado = new javax.swing.JTextField();
        jcomboResidenciaTrabalho = new javax.swing.JComboBox<>();
        jlSalvar = new javax.swing.JLabel();
        jlCancelar = new javax.swing.JLabel();
        jftfDataNascimento = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter dataNascimento= new javax.swing.text.MaskFormatter("##/##/####");
            jftfDataNascimento = new javax.swing.JFormattedTextField(dataNascimento);
        }
        catch (Exception e){
        }
        jftfTelefone1 = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter telefone1= new javax.swing.text.MaskFormatter("(##)#####-####");
            jftfTelefone1 = new javax.swing.JFormattedTextField(telefone1);
        }
        catch (Exception e){
        }
        jftfTelefone2 = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter telefone2= new javax.swing.text.MaskFormatter("(##)#####-####");
            jftfTelefone2 = new javax.swing.JFormattedTextField(telefone2);
        }
        catch (Exception e){
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlCidade.setText("Cidade");

        jlDatadeNascimento.setText("Data de Nascimento");

        jlEndereco.setText("Endereço");

        jLabel6.setText("Genêro");

        jlNumero.setText("Número");

        jlPessoa.setText(" Pessoa");

        jtfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCPFActionPerformed(evt);
            }
        });

        jLabel16.setText("Celular/Telefone");

        jlNome.setText("Nome Completo");

        jlIdentificacaodoEndereco.setText("Identificação do Endereço (Residência/Trabalho)");

        jlEstado.setText("Estado");

        jlRG.setText("RG");

        jlBairro.setText("Bairro");

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setText("                                                 FAÇA SEU CADASTRO");

        jLabel10.setText("CPF");

        jlCEP.setText("CEP");

        jlDadosdeLogin.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jlDadosdeLogin.setText("Dados de Login");

        jlDadosdeCorrespondencia.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jlDadosdeCorrespondencia.setText("Dados de Correspondência");

        jcomboPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Jurídica", " " }));

        jtfCEP.setText("     -   ");
        jtfCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCEPActionPerformed(evt);
            }
        });

        jlCNPJ.setText("CNPJ");

        jtfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroActionPerformed(evt);
            }
        });

        jtfComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfComplementoActionPerformed(evt);
            }
        });

        jlComplemento.setText("Complemento");

        jLabel17.setText("Celular/Telefone 2");

        jbSalvar.setText("Salvar ");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        button1.setLabel("button1");

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo64px.png"))); // NOI18N

        jtfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEstadoActionPerformed(evt);
            }
        });

        jcomboResidenciaTrabalho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residência", "Trabalho" }));

        jlSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N

        jlCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDadosdeLogin)
                            .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlRG)
                                    .addComponent(jlCNPJ)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jtfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jlPessoa)
                            .addComponent(jcomboPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEndereco)
                            .addComponent(jlNumero)
                            .addComponent(jlBairro))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfEndereco)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(59, 59, 59)
                                            .addComponent(jlComplemento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jlSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlCancelar)
                                .addGap(183, 183, 183))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlDadosdeCorrespondencia)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlIdentificacaodoEndereco)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlCidade)
                                        .addComponent(jlCEP))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtfCidade)
                                        .addComponent(jtfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcomboResidenciaTrabalho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(209, 222, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlLogo)
                                .addGap(108, 108, 108))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(30, 30, 30)
                        .addComponent(jftfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jftfTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDatadeNascimento)
                        .addGap(31, 31, 31)
                        .addComponent(jftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jlLogo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlDadosdeLogin)))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlIdentificacaodoEndereco)
                                .addComponent(jcomboResidenciaTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(43, Short.MAX_VALUE)
                        .addComponent(jlDadosdeCorrespondencia)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlEstado)
                                .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlCEP)
                                    .addComponent(jtfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlCidade)
                                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jtfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(77, 77, 77)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEndereco)
                            .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNumero)
                            .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlComplemento)
                            .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCNPJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jtfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel10)
                                .addGap(37, 37, 37)
                                .addComponent(jlRG))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jtfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlDatadeNascimento)
                            .addComponent(jftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jftfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jftfTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlBairro)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlSalvar)
                            .addComponent(jlCancelar))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbSalvar)
                            .addComponent(jbCancelar))))
                .addGap(147, 147, 147))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCPFActionPerformed

    private void jtfCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCEPActionPerformed

    private void jtfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumeroActionPerformed

    private void jtfComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfComplementoActionPerformed

    private void jtfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEstadoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        //Chama o método de cadastrar
        cadastrarUsuario();
        
        //Quando o user clica em salvar, é redirecionado pra tela de perfil
        GUIPerfilUsuarioFrame guiperfil = new GUIPerfilUsuarioFrame();
        guiperfil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        //Chama o método de cancelar
        cancelarCadastro();
        
        //Quando o user clica em cancelar, é redirecionado pra tela de menu
        GUIMenuFrame guimenu = new GUIMenuFrame();
        guimenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(GUITelaCadastroUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUITelaCadastroUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUITelaCadastroUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUITelaCadastroUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUITelaCadastroUsuarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcomboPessoa;
    private javax.swing.JComboBox<String> jcomboResidenciaTrabalho;
    private javax.swing.JFormattedTextField jftfDataNascimento;
    private javax.swing.JFormattedTextField jftfTelefone1;
    private javax.swing.JFormattedTextField jftfTelefone2;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCEP;
    private javax.swing.JLabel jlCNPJ;
    private javax.swing.JLabel jlCancelar;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlDadosdeCorrespondencia;
    private javax.swing.JLabel jlDadosdeLogin;
    private javax.swing.JLabel jlDatadeNascimento;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlIdentificacaodoEndereco;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlPessoa;
    private javax.swing.JLabel jlRG;
    private javax.swing.JLabel jlSalvar;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCEP;
    private javax.swing.JTextField jtfCNPJ;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfComplemento;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfGenero;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    private javax.swing.JTextField jtfRG;
    // End of variables declaration//GEN-END:variables
}
