package Thiago.Akio;

public class Contas {
    protected double saldo;
    private int idConta;
    private Usuarios usuario;


    public Contas(int idConta, double saldo, Usuarios usuario) {   // Construtor Contas, com os atributos: idConta, saldo e usuario
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public double getSaldo() {     //retorna o saldo da conta
        return saldo;
    }

    public void tirarSaldo(double saldo){   // retira o valor saldo da conta
        this.saldo -= saldo;
    }

    public int getIdConta() {
        return idConta;
    }

    public boolean sacar(double valor){   //Retira um valor do saldo da conta

        if(valor <= this.saldo){
            tirarSaldo(valor);
            return true;
        }
        return false;
    }

    public void depositar(double valor){  // Deposita um valor no saldo da conta

        this.saldo += valor;

    }

    public String transformarQRcode(double valorDesejado){     // transforma os valores necessários para uma transferencia em uma String QRcode
        return idConta +";"+ usuario.nome + ";" + valorDesejado +";" + Transacoes.getRandomNumberInRange(1000, 9999);
    }

    @Override
    public String toString() {
        return "Contas{" +
                "saldo=" + saldo +
                ", idConta=" + idConta +
                '}';
    }
}
