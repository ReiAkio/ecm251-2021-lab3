package Thiago.Akio;


import java.util.Scanner;

public class Sistema {
    private Usuarios usuario;
    private Scanner scanner;

    private boolean executarSistema;
    private Contas conta;
    private Transacoes transacoes;

    public void executar(){
        int opcao;
        while(executarSistema) {
            menu2();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);
        }
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){

            case 0:
                System.out.println("Obrigado por escolher nosso banco!");
                this.executarSistema = false;
                break;

            case 1:
                System.out.println("Saldo Atual: R$" + this.conta.getSaldo());
                break;

            case 2:
                System.out.println("Qual quantia de dinheiro?");
                double quantiaParaSacar = scanner.nextDouble();
                if (this.transacoes.sacar(quantiaParaSacar)){
                    System.out.println("Operação Realizada com Sucesso!");
                } else {
                    System.out.println("Não foi possível realizar a operação!");
                }
                break;

            case 3:
                System.out.println("Qual quantia de dinheiro?");
                double quantiaParaDepositar = scanner.nextDouble();
                this.transacoes.depositar(quantiaParaDepositar);
                System.out.println("Operação Realizada com Sucesso!");
                break;

            default:
                System.out.println("Essa funcionalidade ainda não foi implementada");
        }
    }

    public Sistema() {
        this.scanner = new Scanner(System.in);  //Deixa ele ler da entrada do sistema - teclado
        this.executarSistema = true;

    }

    protected void menu(){
        System.out.println("Bom dia, por favor, digite seu nome de usuário e senha");
    }
    private void menu2() {

        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Sacar Dinheiro");
        System.out.println("3 - Depositar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");;
        System.out.println("0 - Encerrar");
    }
}
