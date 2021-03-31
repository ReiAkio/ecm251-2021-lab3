package Thiago.Akio;

public class Contas {
    protected double saldo;
    private int idConta;
    private Usuarios usuario;


    public Contas(int idConta, double saldo, Usuarios usuario) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void tirarSaldo(double saldo){
        this.saldo -= saldo;
    }

    public int getIdConta() {
        return idConta;
    }

    public boolean sacar(double valor){

        if(valor <= this.saldo){
            tirarSaldo(valor);
            return true;
        }
        return false;
    }

    public void depositar(double valor){

        this.saldo += valor;

    }

    @Override
    public String toString() {
        return "Contas{" +
                "saldo=" + saldo +
                ", idConta=" + idConta +
                '}';
    }
}
