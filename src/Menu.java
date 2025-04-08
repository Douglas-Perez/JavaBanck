public class Menu {
    static void ExibirInicial(Usuario cliente) {
        String mensagem = """
                ******************************
                Dodos iniciais do cliente:
                
                Nome:            %s
                Tipo conta:      Corrente
                Saldo inicial:   %d
                ******************************
                """;

        System.out.printf((mensagem) + "%n",cliente.nome,cliente.saldo);
    }

    static void ExibirEscolha() {
        String mensagem = """
                Operações
                
                1- Consultar dados
                2- Receber valor
                3- Transferir valor
                4- sair
                
                Digite a opção desejada:""";

        System.out.println(mensagem);
    }
}
