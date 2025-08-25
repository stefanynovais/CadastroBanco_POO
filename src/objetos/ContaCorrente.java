package objetos;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String agencia, String numero, double saldoInicial, double limite) {
        super(agencia, numero, saldoInicial);
        this.limite = limite;
    }

    //métodos getters e setters 
    public double getLimite() {
        return this.limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }

    //métodos sobreescritos
    @Override
    public void sacar(double valor) {
        if (saldo + limite >= valor) { //não gastar mais do que se tem
            saldo -= valor; //o saldo vai ser: saldo - valor
            System.out.println("Saque realizado da conta corrente!");
        } else {
            System.out.println("Saldo insuficiente na conta corrente.");
        }
    }

    @Override
    public void gravar() {
        System.out.println("Gravando Conta Corrente número " + getNumero() + " com limite " + limite);
    }
}