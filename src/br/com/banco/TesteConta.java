package br.com.banco;

public class TesteConta {
    public static void main(String[] args) {
        
        Conta cc = new Conta(50.0);

        // cc.setNumero(1000);

        System.out.println(cc.recuperarSaldo());
    }
}
