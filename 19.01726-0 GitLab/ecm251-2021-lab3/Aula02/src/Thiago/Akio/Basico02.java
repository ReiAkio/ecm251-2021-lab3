package Thiago.Akio;

public class Basico02 {
    public static void main(String[] args) {
        int ano = 2020;

        //Estrutura de decisão simples
        if(ano % 2 == 0){
            System.out.println("Ano par!");
        }
        if (ano % 2 == 1){
            System.out.println("Ano impar!");
        }

        //Varias decisões
        switch (ano){
            case 2020:
                System.out.println("Vixi!!");
                break;
            case 1996:
                System.out.println("pokemon red!");
                break;
            default:
                System.out.println("Quase boku no hero saindo!");
                break;
        }
    }
}
