package telas;

import funções.CadastroController; //importando a classe que vai manipular os dados
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;

public class Janela extends JFrame {
    private CadastroController controller; // controlador que está gerenciando a lógica de cadastro dos clientes

    // Componentes
    private JLabel jlAgencia;
    private JTextField jtfAgencia; // Campo de texto para o código da agência
    private JLabel jlConta;
    private JTextField jtfConta; // Campo de texto para o número da conta
    private JSeparator jSeparator01; // Linha separadora visual
    private JLabel jlNome;
    private JTextField jtfNome; // Campo de texto para o nome do cliente
    private JLabel jlEndereco;
    private JTextField jtfEndereco; // Campo de texto para o endereço
    private JLabel jlTelefone;
    private JTextField jtfTelefone; // Campo de texto para o telefone
    private JLabel jlCpf;
    private JTextField jtfCpf; // Campo de texto para o CPF
    private JRadioButton jrbCorrente;
    private JRadioButton jrbPoupanca; // Botões de seleção para tipo de conta
    private ButtonGroup bgContas; // Agrupa os radio buttons para permitir apenas uma seleção
    private JSeparator jSeparator02; // Linha separadora visual
    private JButton jbConsultar;
    private JButton jbAtualizar;
    private JButton jbFechar; // Botões de ação

    // Construtor
    public Janela() {
        this.controller = new CadastroController(); // inicializa o controller
        setTitle("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar(); // centralizando a janela na tela

        inicializarComponentes(); // esse método vai criar e adicionar todos os componentes
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
            MaskFormatter formato = new MaskFormatter("####"); // mascara de quatro dígitos
            formato.setPlaceholderCharacter('_');

            jtfAgencia = new JFormattedTextField(formato);// inicializa o campo de texto já com a máscara
            jtfAgencia.setBounds(125, 10, 50, 20);
            getContentPane().add(jtfAgencia); // adiciona à janela

        } catch (ParseException e) { // trata os erros das máscaras
            e.printStackTrace();
        }

        // Conta
        jlConta = new JLabel("Número da Conta");
        jlConta.setBounds(205, 10, 105, 18);
        getContentPane().add(jlConta);

        try {
            MaskFormatter formato = new MaskFormatter("######-#");
            formato.setPlaceholderCharacter('_');

            jtfConta = new JFormattedTextField(formato);
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
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT); // alinha o texto à direita
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

            jtfTelefone = new JFormattedTextField(formato);
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

            jtfCpf = new JFormattedTextField(formato);
            jtfCpf.setBounds(75, 125, 300, 20);
            getContentPane().add(jtfCpf);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Radio Buttons
        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic('C'); // cria o atalho da tecla
        jrbCorrente.setSelected(true); // seleciona por padrão
        jrbCorrente.addActionListener(e -> { // indica uma ação ao selecionar o botão
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

        // agrupando os radios buttons para permitir a seleção
        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        // Separador 2
        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        getContentPane().add(jSeparator02);

        // Botões

        // Consultar
        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic('S');// atalho S
        getContentPane().add(jbConsultar);
        jbConsultar.addActionListener(e -> {
            // lê os valores digitados
            String agencia = jtfAgencia.getText();
            String conta = jtfConta.getText();
            String nome = jtfNome.getText();
            String endereco = jtfEndereco.getText();
            String telefone = jtfTelefone.getText();
            String cpf = jtfCpf.getText();
            boolean ehCorrente = jrbCorrente.isSelected();

            // chama o controller
            controller.criarCliente(nome, endereco, telefone, cpf, agencia, conta, ehCorrente);

            // exibe os dados do cliente cadastrado
            JOptionPane.showMessageDialog(this,
                    "Agência: " + agencia +
                            "\nConta: " + conta +
                            "\nNome: " + nome +
                            "\nEndereço: " + endereco +
                            "\nTelefone: " + telefone +
                            "\nCPF: " + cpf +
                            "\nTipo: " + (ehCorrente ? "Conta Corrente" : "Conta Poupança"),
                    "Cliente Cadastrado", JOptionPane.INFORMATION_MESSAGE);

            jbAtualizar.setEnabled(true); // libera atualização
        });

        // Atualizar
        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic('A');// atalho A
        jbAtualizar.setEnabled(false); // começa desabilitado, e só é habilitado quando se há um cliente existente
        getContentPane().add(jbAtualizar);

        jbAtualizar.addActionListener(e -> {
            // atualiza endereço e telefone no controller
            String novoEndereco = jtfEndereco.getText();
            String novoTelefone = jtfTelefone.getText();

            controller.atualizarCliente(novoEndereco, novoTelefone);

            JOptionPane.showMessageDialog(this,
                    "Dados atualizados com sucesso!",
                    "Atualizar", JOptionPane.INFORMATION_MESSAGE);
        });

        // Fechar
        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic('F');// atalho F
        jbFechar.addActionListener(e -> {
            System.exit(0); // encerrando a aplicação
        });
        getContentPane().add(jbFechar);
    }

    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.setVisible(true);
    }
}
