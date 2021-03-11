package Thiago.Akio;

public class Cliente {
    String titular;
    String cpf;
    String nome;

    public Cliente(String nomeCliente){
        this.nome = nomeCliente;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "titular='" + titular + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
