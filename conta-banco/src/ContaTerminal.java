import java.util.Scanner;

public class ContaTerminal {
    
    
    

    public static void main(String[] args) throws Exception {
       
        Scanner numero_Conta = new Scanner(System.in);
        Scanner numero_Agencia = new Scanner(System.in);
        Scanner nome_Cliente = new Scanner(System.in);
        Scanner saldo_Conta = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
            int conta = numero_Conta.nextInt();
           
        System.out.println("Digite o número da agência:");
            String agencia = numero_Agencia.nextLine();

        System.out.println("Digite o nome do cliente:");
            String nome = nome_Cliente.nextLine();

        System.out.println("Digite o saldo da conta:");
            double saldo = saldo_Conta.nextDouble();
            

         


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + ", e seu saldo de " + saldo + " já está disponível para saque.");

    }
}
