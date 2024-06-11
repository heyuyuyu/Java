package NewEx.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(double saldo, double limite) {
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso na Conta Corrente.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso na Conta Corrente.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
}
