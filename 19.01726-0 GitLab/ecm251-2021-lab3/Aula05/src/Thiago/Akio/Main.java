package Thiago.Akio;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quase 5 temporada ai");
        //criar uma referencia para Conta
        Conta c1;

        //Instanciar um objeto Conta
        c1 = new Conta();
        c1.cliente = new Cliente();

        c1.cliente.titular = "Inuyasha";
        c1.saldo = 199.99;

        c1.visualizarSaldo();
        c1.visualizarSaldo();

        Conta c2 = new Conta();
        c2.cliente = new Cliente();
        c2.cliente.titular = "Seichomaru";
        c2.saldo = 100;
        c2.visualizarSaldo();

        c1.depositar(20);
        c2.depositar(35.99);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        if(c1.sacar(1000)){
            System.out.println("Deu bom");
        } else{
            System.out.println("deu ruim");
        }
        c1.visualizarSaldo();

        if(c1.transferirPara(100,c2)){
            System.out.println("Deu bom, tranferiu");

        }else{
            System.out.printf("Deu ruim não foi");
        }
        c1.visualizarSaldo();
        c2.visualizarSaldo();

        System.out.println("C1" + c1.toString());
        System.out.println("C2:" + c2.toString());
    }
}
