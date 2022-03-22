package Exercicio03;

import Exercicio04.Imposto;

public class ContaCorrente extends Conta implements Imposto {

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        double rendimento = this.getSaldo()*0.03;
        return this.getSaldo()+rendimento;
    }

    @Override
    public String toString() {
        return "ContaCorrente " + super.toString() + "rendimento = " + rendimento();
    }

    @Override
    public double calcularImposto() {
        return (this.getSaldo()*0.03) * 0.25;
    }
}
