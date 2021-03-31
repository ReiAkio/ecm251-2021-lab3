package Thiago.Akio;


import java.util.Scanner;

public class Sistema {
    private static Usuarios usuarioLogado;
    private static Scanner scanner = new Scanner(System.in);


    public static void start(){
        new Usuarios("Vila", "casada", "vila@kkk",1000000,111);
        new Usuarios("Guta", "GutaMax", "Maxi@", 500,222);
        new Usuarios("Harry", "Henrique", "H@haha",0,333);
    }
    public static void logarUsuario(String nome, String senha){
        for (Usuarios usuario : Usuarios.usuariosListados) {
            Usuarios.usuariosListados[0] == nome;
        }
    }
    }
