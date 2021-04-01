package Thiago.Akio;


import java.util.Scanner;

public class Sistema {
    private boolean continuarExecucao;
    private Contas conta;
    private static Usuarios usuarioLogado;
    private static Scanner scanner = new Scanner(System.in);


    public void start(){
        new Usuarios("Joao", "Joao123", "Joao@",200,111);
        new Usuarios("Guilherme", "Guilherme123", "Guilherme@", 300,222);
        new Usuarios("Maria", "Maria123", "Maria@",500,333);
        logarUsuario();
    }
    public void logarUsuario(){
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Qual a sua senha?");
        String senha = scanner.nextLine();
        for (Usuarios usuario : Usuarios.usuariosListados) {

            if (nome.equals(usuario.nome)) {

                if (senha.equals(usuario.senha)) {
                    this.conta = usuario.conta;
                    System.out.println("Vc foi logado");
                    executar();
                }

            }
        }
    }

    public void executar(){
        this.continuarExecucao = true;
        while(continuarExecucao) {
            exibirMenu();
            int opcao = Integer.parseInt(scanner.nextLine());
            Menu(opcao);
        }
    }

    private void Menu (int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Obrigado pela preferencia");
                this.continuarExecucao = false;
                break;

            case 1:
                System.out.println("saldo:"+ conta.getSaldo());
//                this.continuarExecucao = false;
                break;

            case 2:
                System.out.println("Digite o valor:");
                double valordepositado = Double.parseDouble(scanner.nextLine());
                conta.depositar(valordepositado);
//                this.continuarExecucao = false;
                break;

            case 3:
                System.out.println("Digite o valor:");
                double valorsacado = Double.parseDouble(scanner.nextLine());
                conta.sacar(valorsacado);
//                this.continuarExecucao = false;
                break;

            case 4:
                boolean isRegistered = false;
                Contas destino = null;
                while(!isRegistered){
                    System.out.println("Digite o nome do destinatário:");
                    String nome = scanner.nextLine();

                    for (Usuarios usuario : Usuarios.usuariosListados) {
                        if (nome.equals(usuario.nome)) {
                            destino = usuario.conta;
                            isRegistered = true;
                            System.out.println("Usuário Encontrado!");
                        }
                    }
                    System.out.println("Usuário não Encontrado!");
                }

                System.out.println("Digite o valor transferido:");
                double valortransferido = Double.parseDouble(scanner.nextLine());
                Transacoes.transferirDinheiro(destino, this.conta, valortransferido);

            default:
                System.out.println("Funcionalidade ainda não implementada");
                break;
        }
    }

    private void exibirMenu() {
        System.out.println("Bem vindo ao banco");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("4 - Transferir dinheiro");
        System.out.println("0 - Sair do sistema");

    }

}