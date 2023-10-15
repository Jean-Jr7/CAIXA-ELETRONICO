import java.util.Scanner;
import java.text.DecimalFormat;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");


        double saldo = 1000.00; // Defina o saldo inicial da conta

        System.out.println("Bem-vindo ao Caixa Eletrônico!");
        System.out.println("Seu saldo atual é R$" + df.format(saldo));

        System.out.print("Digite o valor que você deseja sacar: ");
        double valorSaque = scanner.nextDouble();

        if(valorSaque > saldo){
             System.out.print("Saldo insuficiente");


            }else

                saldo -= valorSaque;

                    System.out.println("Parabéns, você sacou: R$" + df.format(valorSaque) + " com sucesso");
                    System.out.println("Seu saldo atual agora é: R$" + df.format(saldo));
            

       



        

        scanner.close();
    }
}

