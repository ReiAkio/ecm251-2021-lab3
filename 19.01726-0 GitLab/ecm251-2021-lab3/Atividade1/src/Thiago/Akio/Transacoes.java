package Thiago.Akio;

import java.util.Random;

public class Transacoes {

    private Contas conta;

    private static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public boolean sacar(double valor){

        if(valor <= this.conta.saldo){
            conta.setSaldo(valor);
            return true;
        }
        return false;
    }

    public void depositar(double valor){

        this.conta.saldo += valor;

}

    public boolean transferirDinheiro (Contas conta, double valor){

        if(this.sacar(valor)){
            conta.depositar(valor);
            conta.setSaldo(valor);

            return true;
        }
        return false;
    }


    }



