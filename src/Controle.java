public class Controle {
    static boolean ValidarDeposito(int valor) {
        return valor >= 0;
    }
    static boolean ValidarTransferencia(Usuario cliente, int valor) {
        return cliente.saldo <= valor;
    }
}
