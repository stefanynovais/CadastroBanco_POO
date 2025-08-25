//classe base: classe "mãe" para todos os outros objetos

package src.objetos;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    public Pessoa(String nome, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    //métodos getters e setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //métodos para sobreescrever
    public void gravar() {
        System.out.println("Gravando pessoa no sistema...");
    }

    public void editar() {
        System.out.println("Editando dados da pessoa...");
    }

    public void excluir() {
        System.out.println("Excluindo pessoa...");
    }

    public void cancelar() {
        System.out.println("Operação cancelada!");
    }
}

