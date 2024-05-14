import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Informe o seu nome completo: ");
        String nome = scanner.next();

        System.out.println("Informe o seu saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numeroConta + ", e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}


