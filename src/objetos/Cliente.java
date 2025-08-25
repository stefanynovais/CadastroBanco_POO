package src.objetos;

    public class Cliente extends Pessoa {
      private Conta conta;

    public Cliente(String nome, String endereco, String telefone, String cpf, Conta conta) {
        super(nome, endereco, telefone, cpf);
        this.conta = conta;
    }

    //métodos getters e setters
    public Conta getConta() {
        return this.conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }

    //métodos sobreescritos
    @Override
    public void gravar() {
        System.out.println("Gravando cliente: " + getNome() + " com CPF " + getCpf());
    }

    @Override
    public void editar() {
        System.out.println("Atualizando cliente: " + getNome());
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo cliente de CPF: " + getCpf());
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelando operação do cliente.");
    }
}

