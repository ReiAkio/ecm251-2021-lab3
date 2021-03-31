package Thiago.Akio;

import java.util.Random;

public  class Transacoes {

    private static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    public static boolean transferirDinheiro (Contas destino ,Contas origem, double valor){

        if( origem.sacar(valor)){
            destino.depositar(valor);

            return true;
        }
        return false;
    }


}


