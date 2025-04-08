public class Controle {
    static boolean ValidarDeposito(double valor) {
        return valor >= 0;
    }
    static boolean ValidarTransferencia(Usuario cliente, double valor) {
        return cliente.saldo <= valor && valor >= 0;
    }
}
