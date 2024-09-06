import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);        
        System.out.println("Por favor, digite o número da agência com o dígito: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o seu primeiro nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo: "); 
        double saldo = scanner.nextDouble();
        scanner.close();
        System.out.println("Olá "+nomeCliente+" "+sobrenomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}

