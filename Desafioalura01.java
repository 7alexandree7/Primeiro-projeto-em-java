import java.util.Scanner;
public class Desafioalura01 {

    public static void main(String[] args) {


        String nome = "Alexandre Oliveira";
        String tipoConta = "Infinite";
        double saldo = 2599.99;
        int opcao = 0;


        System.out.println("*****************************************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***************************************************************");


        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Exit

                """;



        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();


            if (opcao == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            }
//---------------------------------------------------------------------------------------------------------------------

            else if (opcao == 2) {

                System.out.println("Informe o valor que deseja Transferir");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("O valor que Deseja transferir, é maior que o saldo da sua conta");
                }

                else  {
                    saldo -= valor;
                    System.out.println("Seu saldo atualizado é: " + saldo);
                }
            }
//---------------------------------------------------------------------------------------------------------------------

            else if (opcao == 3) {
                System.out.println("Receber Valor: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado: " + saldo);
            }
//---------------------------------------------------------------------------------------------------------------------

            else if (opcao == 4 || opcao != 4) {
                System.out.println("Progama Encerrado");
            }
//----------------------------------------------------------------------------------------------------------------------

            else {
                System.out.println("Opção Invalida");
            }
//----------------------------------------------------------------------------------------------------------------------
        }

    }


}

