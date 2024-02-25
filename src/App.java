import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String account = scan.nextLine();
        // double balance = scan.nextDouble();
        // double value = scan.nextDouble();
        // double currentBalance = 0;

        System.out.println("***********************");
        System.out.println("Nome: "+ name);
        System.out.println("Tipo de conta: " + account);
        System.out.println("***********************");
        String menu = """
            Operações
            1- Consultar saldos
            2- Receber valor
            3- Transferir valor
            4- Sair

            Digite a opção desejada:
                """;
        // int opcao = 0;

        // switch (opcao) {
        //     case 1:
        //         System.out.println("O Saldo atual é de: " + balance);
        //         break;
        //     case 2:
        //     System.out.println("Digite o valor que deseja depositar: ");

        //         currentBalance = value + balance;
        //         System.out.println(currentBalance);
        //     break;
        //     default:
        //         break;
        // }

        System.out.println(menu);


       scan.close();
    }
}
