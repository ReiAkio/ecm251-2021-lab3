package Thiago.Akio;


import java.util.Scanner;

public class Sistema {
    private boolean continuarExecucao;
    private Contas conta;
    private static Usuarios usuarioLogado;
    private static Scanner scanner = new Scanner(System.in);


    public void start(){       // Cria 3 usuários e inicia o metodo logarUsuario()
        new Usuarios("Joao", "Joao123", "Joao@",1000,111);
        new Usuarios("Guilherme", "Guilherme123", "Guilherme@", 250,222);
        new Usuarios("Maria", "Maria123", "Maria@",3000,333);
        logarUsuario();
    }
    public void logarUsuario() { // Checa se o nome digitado e sua senha fazem parte de algum usuario ja cadastrado
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Qual a sua senha?");
        String senha = scanner.nextLine();
        if (EncontrarUsuarioeSenha(nome, senha) == true) {
            EncontrarUsuarioeSenha(nome, senha);
            System.out.println("Vc foi logado");
            executar();
        } else {
            System.out.println("Usuario não encontrado!");
        }
    }

    public boolean EncontrarUsuarioeSenha(String nome, String senha){ // Retorna verdadeiro se o nome e senha digitados forem encontrados no usuariosListadoos como um usuario.
        for (Usuarios usuario : Usuarios.usuariosListados) {

            if (nome.equals(usuario.nome)) {

                if (senha.equals(usuario.senha)) {
                    this.conta = usuario.conta;
                    return true;
                }

            }
        }return false;
    }



    public void executar(){     // Executa o Menu e le os valores de entrada para que o usuario possa escolher qual opção do menu ele quer acessar
        this.continuarExecucao = true;
        while(continuarExecucao) {
            exibirMenu();
            int opcao = Integer.parseInt(scanner.nextLine());
            Menu(opcao);
        }
    }

    private void Menu (int opcao) {// Apresenta as opções que tem no menu da função exibirMenu()
        switch (opcao){
            case 0:// O usuário logado sai da sua conta e termina o programa.
                System.out.println("Obrigado pela preferencia");
                this.continuarExecucao = false;
                break;

            case 1:// mostra para o usuário logado o saldo da sua conta
                System.out.println("saldo:"+ conta.getSaldo());
                break;

            case 2:// Deposita uma quantia de dinheiro na conta do usuário logado
                System.out.println("Digite o valor:");
                double valordepositado = Double.parseDouble(scanner.nextLine());
                conta.depositar(valordepositado);
                break;

            case 3:// Saca uma quantia de dinheiro da conta do usuário logado
                System.out.println("Digite o valor:");
                double valorsacado = Double.parseDouble(scanner.nextLine());
                conta.sacar(valorsacado);
                break;

            case 4:
                System.out.println("Digite o valor que deseja trasnferir: ");   // O usuário logado digita um valor que deseja transferir para outro usuário

                String QRcode = this.conta.transformarQRcode(Double.parseDouble(scanner.nextLine()));   // Cria um QRcode para transferência usando a função transformarQRcode() da classe Contas
                System.out.println(QRcode);// Mostra o QRcode gerado para a transferêcia
                break;
            case 5:
                boolean isRegistered = false;
                Contas destino = null;

                while(!isRegistered){
                    System.out.println("Digite o nome do destinatário:");
                    String nome = scanner.nextLine();

                    for (Usuarios usuario : Usuarios.usuariosListados) {//O usuário logado digita um nome e procura esse nome no arraylist usuariosListados

                        if (nome.equals(usuario.nome)) {
                            destino = usuario.conta;
                            isRegistered = true;
                            System.out.println("Usuário Encontrado!");
                        }

                    }
                    if(!isRegistered){
                        System.out.println("Usuário não Encontrado! Tente novamente.");
                    }

                }

                System.out.println("Cole o QRcode gerado:"); //Colar o Qrcode do caso 4
                String QRcodeString = scanner.nextLine();
                if(Transacoes.transferirDinheiro(destino, this.conta, QRcodeString) == true){// Se o usuário logado possuir o valor que deseja transferir, realiza essa ação

                    Transacoes.transferirDinheiro(destino, this.conta, QRcodeString);
                    System.out.println("Valor transferido");
                }else{
                    System.out.println("Não foi possível transferir o valor");
                }
                break;


            default:
                System.out.println("Funcionalidade ainda não implementada"); //Caso o usuário logado digite um número diferente de 0,1,2,3,4; o switch case não reconhece a ação

                break;
        }
    }

    private void exibirMenu() {    // cria um menu e exibe ele
        System.out.println("Bem vindo ao banco");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar dinheiro");
        System.out.println("3 - Sacar dinheiro");
        System.out.println("4 - Gerar QRcode (Necessário para transferir dinheiro)");
        System.out.println("5 - Transferir dinheiro");
        System.out.println("0 - Sair do sistema");

    }

}