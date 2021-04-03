package Thiago.Akio;

import java.util.Random;

public  class Transacoes {

    public static int getRandomNumberInRange(int min, int max) { // Gera um numero aleaório entra os valores minimos e maximos digitados

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }



    public static boolean transferirDinheiro (Contas destino ,Contas origem, String QRcode){ // função responsavel por transferir dinheiro de uma conta origem para uma conta destino a partir de um QRcode gerado pelo metodo transformarQRcode


        String[] dados = QRcode.split(";");

        if( origem.sacar(Double.parseDouble(dados[2]))){
            destino.depositar(Double.parseDouble(dados[2]));

            return true;
        }
        return false;
    }


}


