import java.util.Scanner;

import static java.lang.Thread.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
        informações do usuário
        ************************
        Dados iniciais do cliente:
        Nome: Jacqueline Oliveira
        Tipo conta: Corrente
        Saldo inicial: R$ 2500,00
        ***********************
        *  */

        String nomeUsuario = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        Double saldoInicial = 2500.00;
        Scanner scanner = new Scanner(System.in);
        int tipoOperacao = 0;
        double valorReceber = 0;
        double valorTransferir = 0;

        System.out.println("************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldoInicial);
        System.out.println("************************");






        while (tipoOperacao != 4){

            System.out.println();
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println();

            System.out.println("Digite a operação: ");
            tipoOperacao = scanner.nextInt();
            switch (tipoOperacao){
                case 1:
                    System.out.println();
                    System.out.println("!!!!!!!!!!!!!!");
                    System.out.println("Saldo da conta: " + saldoInicial);
                    System.out.println("!!!!!!!!!!!!!!");
                    break;
                case 2:
                    System.out.println("Digite o valor a receber:");
                    valorReceber = scanner.nextDouble();
                    saldoInicial += valorReceber;
                    System.out.println();
                    System.out.println("Valor recebido com sucesso!!!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir:");
                    valorTransferir = scanner.nextDouble();

                    if (valorTransferir < saldoInicial){
                        System.out.println();
                        saldoInicial -= valorTransferir;
                        System.out.println("Transferencia feita com sucesso!!!");
                        System.out.println();
                    }else{
                        System.out.println();
                        System.out.println("!!!Saldo insuficiente!!!");
                        System.out.println("Tente um valor menor");
                        System.out.println();
                    }


                    break;
                case 4:
                    System.out.println();
                    System.out.println("Aplicativo Fechado");
                    System.out.println();
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println();
                    System.out.println("Operação invalida");
                    System.out.println("Digite um valor valido!");
                    System.out.println();



            }


        }



    }
}