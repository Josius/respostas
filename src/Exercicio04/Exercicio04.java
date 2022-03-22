package Exercicio04;

import Exercicio03.Conta;
import Exercicio03.ContaCorrente;
import Exercicio03.ContaPoupanca;

public class Exercicio04 {
    public static void main(String[] args) {
        ContaCorrente brunoAlves = new ContaCorrente(45809, "Bruno Alves", 2500.00);
        System.out.println(brunoAlves);
        System.out.println(brunoAlves.calcularImposto());
        System.out.println();
        ContaPoupanca julianoAlmeida = new ContaPoupanca(8596, "Juliano Almeida", 150.00);
        System.out.println(julianoAlmeida);
        System.out.println(julianoAlmeida.calcularImposto());
    }
}
