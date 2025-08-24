//classe base: classe "mãe" para todos os outros objetos

package src.objetos;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //métodos que podem ser sobreescritos

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

