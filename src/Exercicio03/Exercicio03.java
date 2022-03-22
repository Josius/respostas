package Exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {

        Conta brunoAlves = new ContaCorrente(45809, "Bruno Alves", 1500.00);
        System.out.println(brunoAlves);
        System.out.println();
        Conta julianoAlmeida = new ContaPoupanca(8596, "Juliano Almeida", 50.00);
        System.out.println(julianoAlmeida);
    }
}
