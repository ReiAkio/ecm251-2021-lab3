package Thiago.Akio;

public class Conta {

   private int numero;
   private double saldo;
   private Cliente cliente;

    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }

    public Cliente getCliente() {

        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public Conta(String nomeCliente, double saldoInicial){
        this.saldo = saldoInicial;
        this.cliente = new Cliente(nomeCliente);
        this.numero = 1234;
    }

    public Conta(String nomeCliente, String cpf){
        this.cliente = new Cliente(nomeCliente);

    }

  public void depositar(double valor){
        this.saldo += valor;
    }

    public boolean sacar(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

   public boolean transferirPara(double valor, Conta destino){
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
