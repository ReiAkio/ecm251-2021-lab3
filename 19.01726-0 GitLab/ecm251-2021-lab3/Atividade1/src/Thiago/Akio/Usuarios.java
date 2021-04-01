package Thiago.Akio;


import java.util.ArrayList;

public class Usuarios {
    public static ArrayList<Usuarios> usuariosListados = new ArrayList<>();
    public String nome;
    public String senha;
    public String email;
    public Contas conta;

    public Usuarios(String nome, String senha, String email,double saldo, int idConta) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.conta = new Contas(idConta, saldo,this);

        Usuarios.usuariosListados.add(this);
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", conta='" + conta + '\'' +
                '}';
    }
}
