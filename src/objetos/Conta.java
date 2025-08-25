package objetos;

public abstract class Conta {
    private String agencia;
    private String numero;
    protected double saldo;

    public Conta(String agencia, String numero, double saldoInicial) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    //getters e setters
    public String getAgencia() {
        return this.agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos principais
    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor);

    //métodos para sobreescrever
    public void gravar() {
        System.out.println("Gravando conta genérica...");
    }

    public void editar() {
        System.out.println("Editando conta...");
    }

    public void excluir() {
        System.out.println("Excluindo conta...");
    }

    public void cancelar() {
        System.out.println("Cancelando operação da conta...");
    }
}