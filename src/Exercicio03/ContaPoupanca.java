package Exercicio03;

import Exercicio04.Imposto;

public class ContaPoupanca extends Conta implements Imposto {

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double rendimento() {
        double rendimento = this.getSaldo()*0.05;
        return this.getSaldo()+rendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca " + super.toString() + rendimento();
    }

    @Override
    public double calcularImposto() {
        return (this.getSaldo()*0.05) * 0.1;
    }
}
