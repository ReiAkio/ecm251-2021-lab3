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

    public double getSaldo() {     // Retorna o saldo da conta
        return saldo;
    }

    public void tirarSaldo(double saldo){   // Retira o valor saldo da conta
        this.saldo -= saldo;
    }

    public int getIdConta() {  // Retorna o idConta da Conta
        return idConta;
    }

    public boolean sacar(double valor){   //Retira um valor do saldo da conta apenas se o valor do saldo da conta for maior ou igual ao valor que o usuario deseja retirar

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
