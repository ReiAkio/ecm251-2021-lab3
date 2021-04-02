package Thiago.Akio;


import java.util.ArrayList;

public class Usuarios {
    public static ArrayList<Usuarios> usuariosListados = new ArrayList<>(); // Ajuda do aluno Bruno Vilard
    public String nome;
    public String senha;
    public String email;
    public Contas conta;

    public Usuarios(String nome, String senha, String email,double saldo, int idConta) {     //Construtor Usuarios com os atributos: nome, senha, email e conta
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
