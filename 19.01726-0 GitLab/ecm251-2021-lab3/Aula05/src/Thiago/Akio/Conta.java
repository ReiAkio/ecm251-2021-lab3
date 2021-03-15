package Thiago.Akio;

public class Conta {
    int numero;
    double saldo;
    private Cliente cliente;

    public Conta(int numero, double saldo, String cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = new Cliente(cliente);
    }

    public double getSaldo(){
        return this.saldo;
    }

    void depositar(double valor){
        this.saldo += valor;
    }

    boolean sacar(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    boolean transferirPara(double valor, Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente.toString() +
                '}';
    }
}
