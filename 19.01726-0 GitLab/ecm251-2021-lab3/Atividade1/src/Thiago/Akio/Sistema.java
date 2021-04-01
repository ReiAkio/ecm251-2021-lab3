package Thiago.Akio;


import java.util.Scanner;

public class Sistema {
    private static Usuarios usuarioLogado;
    private static Scanner scanner = new Scanner(System.in);


    public static void start(){
        new Usuarios("Joao", "Joao", "Joao@",200,111);
        new Usuarios("Guilherme", "Guilherme123", "Guilherme@", 300,222);
        new Usuarios("Maria", "Maria123", "Maria@",500,333);
    }
    public static void logarUsuario(String nome, String senha){

            for (Usuarios usuario : Usuarios.usuariosListados) {

                if (nome.equals(usuario.nome)){
                    System.out.println("Encontrei !");

                        if (senha.equals(usuario.senha)){

                            System.out.println("Vc foi logado");
                        }

                }
                else{
                    System.out.println("Não foi possivel encontrar um nome em nosso banco de dados");
                }


            }
        }

    }

