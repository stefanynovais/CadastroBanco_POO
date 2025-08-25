//essa classe vai receber informações da tela do usuário, criar e manipular os objetos do projeto e retornar informações para mostrar na tela.
//também vai fazer a ponte entre a tela e o objeto

package src.funções;

import src.objetos.*; //importa os objetos para poder manipulá-los

public class CadastroController {
      private Cliente cliente; //aqui a gente guarda um cliente que está sendo manipulado

    public void criarCliente(String nome, String endereco, String telefone, String cpf,
                             String agencia, String numero, boolean ehCorrente) { //método chamado quando o usuário cadastra um cliente pela tela

        Conta conta; //armazena a conta que o usuário criou
        if (ehCorrente) {
            conta = new ContaCorrente(agencia, numero, 0, 500); //se for true para conta corrente, cria o objeto Corrente
        } else {
            conta = new ContaPoupanca(agencia, numero, 0); //cria um objeto do tipo Poupança
        }

        cliente = new Cliente(nome, endereco, telefone, cpf, conta); //cria um objeto com os dados da pessoa e a conta criada, depois chama o método gravar, indicando que o cliente foi cadastrado
        cliente.gravar();
    }

    //método para atualizar os dados do cliente 
    public void atualizarCliente(String novoEndereco, String novoTelefone) {
        if (cliente != null) { //só funciona se já estiver um cliente cadastrado 
            cliente.setEndereco(novoEndereco);
            cliente.setTelefone(novoTelefone);
            cliente.editar(); //chama o método que indica atualizar os dados do cliente 
        }
    }

    //método para excluir o cliente 
    public void excluirCliente() {
        if (cliente != null) { //só funciona se já estiver um cliente cadastrado
            cliente.excluir(); //chama método que indica que o cliente foi excluído
            cliente = null; //tira o cliente da memória
        }
    }

    //método para acessar o cliente fora do controller 
    public Cliente getCliente() {
        return cliente;
    }
}
