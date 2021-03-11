package Thiago.Akio;

public class Main {

    public static void main(String[] args) {
      Conta c1;
      c1 = new Conta("Saitama", 999.99);

      Conta c2 = new Conta("Goku", "12345678-9");
      c1.depositar (300);
      c1.sacar (250);
        System.out.println("Conta 1:" + c1.toString());
        System.out.println("Conta 2:" + c2.toString());
    }
}
