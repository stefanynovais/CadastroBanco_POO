package telas;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;

public class Janela extends JFrame {
    // Componentes
    private JLabel jlAgencia;
    private JTextField jtfAgencia;
    private JLabel jlConta;
    private JTextField jtfConta;
    private JSeparator jSeparator01;
    private JLabel jlNome;
    private JTextField jtfNome;
    private JLabel jlEndereco;
    private JTextField jtfEndereco;
    private JLabel jlTelefone;
    private JTextField jtfTelefone;
    private JLabel jlCpf;
    private JTextField jtfCpf;
    private JRadioButton jrbCorrente;
    private JRadioButton jrbPoupanca;
    private ButtonGroup bgContas;
    private JSeparator jSeparator02;
    private JButton jbConsultar;
    private JButton jbAtualizar;
    private JButton jbFechar;

    // Construtor
    public Janela() {
        setTitle("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar();

        inicializarComponentes();
    }

    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();

        if (janela.height > screen.height)
            setSize(janela.width, screen.height);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);

        setLocation((screen.width - janela.width) / 2,
                (screen.height - janela.height) / 2);
    }

    private void inicializarComponentes() {
        // Agência
        jlAgencia = new JLabel("Código da Agência");
        jlAgencia.setBounds(10, 10, 110, 18);
        getContentPane().add(jlAgencia);

        try { 
            MaskFormatter formato = new MaskFormatter("####");
            formato.setPlaceholderCharacter('_'); 

            JFormattedTextField jtfAgencia = new JFormattedTextField(formato);
            jtfAgencia.setBounds(125, 10, 50, 20);
            getContentPane().add(jtfAgencia);

        } catch (ParseException e) { 
            e.printStackTrace(); 
        }

        // Conta
        jlConta = new JLabel("Número da Conta");
        jlConta.setBounds(205, 10, 105, 18);
        getContentPane().add(jlConta);

        try { 
            MaskFormatter formato = new MaskFormatter("######-#");
            formato.setPlaceholderCharacter('_'); 

            JFormattedTextField jtfConta = new JFormattedTextField(formato);
            jtfConta.setBounds(315, 10, 60, 20);
            getContentPane().add(jtfConta);

        } catch (ParseException e) { 
            e.printStackTrace(); 
        }


        // Separador 1
        jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        getContentPane().add(jSeparator01);

        // Nome
        jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlNome);

        jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
        getContentPane().add(jtfNome);

        // Endereço
        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlEndereco);

        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        getContentPane().add(jtfEndereco);

        // Telefone
        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlTelefone);
        try { 
            MaskFormatter formato = new MaskFormatter("(##) #####-####");
            formato.setPlaceholderCharacter('_'); 

            JFormattedTextField jtfTelefone = new JFormattedTextField(formato);
            jtfTelefone.setBounds(75, 100, 300, 20);
            getContentPane().add(jtfTelefone);

            add(jtfTelefone);

        } catch (ParseException e) { 
            e.printStackTrace(); 
        }


        // CPF
        jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 125, 60, 18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(jlCpf);
        try { 
            MaskFormatter formato = new MaskFormatter("###.###.###-##");
            formato.setPlaceholderCharacter('_'); 

            JFormattedTextField jtfCpf = new JFormattedTextField(formato);
            jtfCpf.setBounds(75, 125, 300, 20);
            getContentPane().add(jtfCpf);

        } catch (ParseException e) { 
            e.printStackTrace(); 
        }


        // Radio Buttons
        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic('C');
        jrbCorrente.setSelected(true);
        jrbCorrente.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Conta Corrente selecionada!");
        });

        getContentPane().add(jrbCorrente);

        jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic('P');
        jrbPoupanca.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Conta Poupança selecionada!");
        });
        getContentPane().add(jrbPoupanca);

        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        // Separador 2
        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        
        // Botões

HEAD
      //Consultar
jbConsultar = new JButton("Consultar");
jbConsultar.setBounds(35, 190, 100, 23);
jbConsultar.setMnemonic('S');
jbConsultar.addActionListener(e -> {
    JOptionPane.showMessageDialog(this, "Consultando dados...");
});
getContentPane().add(jbConsultar);

//Atualizar
jbAtualizar = new JButton("Atualizar");
jbAtualizar.setBounds(145, 190, 100, 23);
jbAtualizar.setMnemonic('A');
jbAtualizar.setEnabled(false);
getContentPane().add(jbAtualizar);

jbAtualizar.addActionListener(e -> {
    String agencia = jtfAgencia.getText();
    String conta = jtfConta.getText();
    String nome = jtfNome.getText();
    String endereco = jtfEndereco.getText();
    String telefone = jtfTelefone.getText();
    String cpf = jtfCpf.getText();
    String tipoConta = jrbCorrente.isSelected() ? "Conta Corrente" : "Conta Poupança";

    JOptionPane.showMessageDialog(this,
            "Agência: " + agencia +
                    "\nConta: " + conta +
                    "\nNome: " + nome +
                    "\nEndereço: " + endereco +
                    "\nTelefone: " + telefone +
                    "\nCPF: " + cpf +
                    "\nTipo: " + tipoConta,
                     "Atualização", JOptionPane.INFORMATION_MESSAGE);

    jbAtualizar.setEnabled(true);
});

        //Consultar
        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic('S');
        jbConsultar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Consultando dados...");
            String agencia = jtfAgencia.getText();
            String conta = jtfConta.getText();
            String nome = jtfNome.getText();
            String endereco = jtfEndereco.getText();
            String telefone = jtfTelefone.getText();
            String cpf = jtfCpf.getText();
            String tipoConta = jrbCorrente.isSelected() ? "Conta Corrente" : "Conta Poupança";

            JOptionPane.showMessageDialog(this,
                    "Agência: " + agencia +
                            "\nConta: " + conta +
                            "\nNome: " + nome +
                            "\nEndereço: " + endereco +
                            "\nTelefone: " + telefone +
                            "\nCPF: " + cpf +
                            "\nTipo: " + tipoConta);
        });
        getContentPane().add(jbConsultar);

        //Atualizar
        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic('A');
        jbAtualizar.setEnabled(false);
        jbAtualizar.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Atualizando os dados...");
        });
        getContentPane().add(jbAtualizar);


        //Fechar
        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic('F');
        jbFechar.addActionListener(e -> {
            System.exit(0);
        });
        getContentPane().add(jbFechar);
    }

    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.setVisible(true);
    }
}
