public class Usuario {
    String nome;
    int saldo;

    public Usuario(String Nome, int saldo) {
        this.nome = Nome;
        this.saldo = saldo;
    }

    public void Sacar(int valor) {
        this.saldo -= valor;
    }
    public void Depositar(int valor) {
        this.saldo += valor;
    }
}
