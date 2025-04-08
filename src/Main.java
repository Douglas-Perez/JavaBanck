import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Usuario cliente = new Usuario("Douglas Perez", 800);

        Menu.ExibirInicial(cliente);
        while (true) {
            Menu.ExibirEscolha();
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    Menu.ExibirInicial(cliente);
                    break;
                case 2:
                    Menu.Receber();
                    break;
                case 3:
                    Menu.Transferir();
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