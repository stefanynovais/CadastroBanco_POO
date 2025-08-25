package objetos;

public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(String agencia, String numero, double saldoInicial) {
        super(agencia, numero, saldoInicial);
        this.rendimento = 0.05; //rendimento de 5% no mês
    }

    //métodos getters e setters
    public double getRendimento() {
        return this.rendimento;
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    //métodos sobreescritos
    @Override
    public void sacar(double valor) {
        if (saldo >= valor) { //não gastar mais do que se tem
            saldo -= valor; //o saldo vai ser: saldo - valor
            System.out.println("Saque realizado da conta poupança!");
        } else {
            System.out.println("Saldo insuficiente na conta poupança.");
        }
    }

    @Override
    public void gravar() {
        System.out.println("Gravando Conta Poupança número " + getNumero() + " com rendimento de " + rendimento);
    }
}