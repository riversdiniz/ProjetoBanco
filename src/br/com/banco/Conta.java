package br.com.banco;

public class Conta {
    
    private int numero;
    private double saldo;

    public double recuperarSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    Cliente cliente = new Cliente();
}
