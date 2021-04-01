package Thiago.Akio;

import java.util.Random;

public  class Transacoes {

    public static int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }



    public static boolean transferirDinheiro (Contas destino ,Contas origem, String QRcode){


        String[] dados = QRcode.split(";");

        if( origem.sacar(Double.parseDouble(dados[2]))){
            destino.depositar(Double.parseDouble(dados[2]));

            return true;
        }
        return false;
    }


}


