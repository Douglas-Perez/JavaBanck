import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Usuario cliente = new Usuario("Douglas Perez", 800);
        double valor;

        Menu.ExibirInicial(cliente);
        while (true) {
            Menu.ExibirEscolha();
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    Menu.ExibirInicial(cliente);
                    break;
                case 2:
                    Menu.Depositar();
                    valor = input.nextDouble();
                    if (Controle.ValidarDeposito(valor)){
                        cliente.Depositar(valor);
                        System.out.println("Valor recebido!");
                        break;
                    }
                    System.out.println("Valor inválido!");
                    break;
                case 3:
                    Menu.Transferir();
                    valor = input.nextDouble();
                    if (Controle.ValidarTransferencia(cliente,valor)){
                        cliente.Transferir(valor);
                        System.out.println("Valor enviado!");
                        break;
                    }
                    System.out.println("Valor inválido!");
                    break;
                case 4:
                    Menu.Sair();
                    return;
                default:
                    System.out.println("Valor inválido, tente novamente!");
                    break;
            }
        }
    }
}