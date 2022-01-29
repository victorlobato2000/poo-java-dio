public class Main {
    public static void main(String[] args) {
        Cliente victor = new Cliente();
        victor.setNome("Victor Lobato");

        Conta cc = new ContaCorrente(victor);
        Conta poupanca = new ContaPoupanca(victor);

        cc.depositar(1000);
        cc.transferir(250, poupanca);
        poupanca.depositar(200);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
        System.out.println();

        poupanca.sacar(100);
        poupanca.imprimirExtrato();
        System.out.println();

    }
}
