public class Usuario {
    String nome;
    double saldo;

    public Usuario(String Nome, int saldo) {
        this.nome = Nome;
        this.saldo = saldo;
    }

    public void Transferir(double valor) {
        this.saldo -= valor;
    }
    public void Depositar(double valor) {
        this.saldo += valor;
    }
}
