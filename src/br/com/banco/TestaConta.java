package br.com.banco;

public class TestaConta {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta();
        Conta contaPoupanca =  new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.20;
        contaCorrente.cliente.nome = "River Diniz";
        contaCorrente.cliente.idade = 35;

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30;
        contaPoupanca.cliente.nome = "Fulano";
        contaPoupanca.cliente.idade = 40;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente.nome = "Ciclano";
        contaInvestimento.cliente.idade = 45;

        System.out.println("Número da Conta C/C: " + contaCorrente.numero);
        System.out.println("Saldo da Conta R$: " + contaCorrente.saldo);
        System.out.println("Nome completo do Cliente: " + contaCorrente.cliente.nome);
        System.out.println("Idade do Cliente: " + contaCorrente.cliente.idade);
    }
}
