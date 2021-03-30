package Thiago.Akio;


public class Usuarios {

    public String nome;
    private String senha;
    private String email;

    public Usuarios(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
