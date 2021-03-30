package Thiago.Akio;

public class Contas {
    protected double saldo;
    private int idConta;
    private Usuarios usuario;


    public Contas(int idConta, double saldo, String nome) {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = new Usuarios(nome);
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo -= saldo;
    }

    public int getIdConta() {
        return idConta;
    }
}
