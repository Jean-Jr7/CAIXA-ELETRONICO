import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.0; // Defina o saldo inicial da conta

        System.out.println("Bem-vindo ao Caixa Eletrônico!");
        System.out.printf("Seu saldo atual é R$%.2f%n", saldo);

        System.out.print("Digite o valor que você deseja sacar: ");
        double valorSaque = scanner.nextDouble();

        if(valorSaque > saldo){
             System.out.print("Saldo insuficiente");


            }else{

                saldo -= valorSaque;
                System.out.printf("Parabens voce sacou R$%.2f com sucesso %n", valorSaque);
                System.out.printf("Seu saldo atual é R$%.2f%n", saldo);
            }

       



        

        scanner.close();
    }
}
