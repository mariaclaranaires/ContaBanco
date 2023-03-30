import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia, nomeCliente;
        Double saldo;

        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.next();

        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá, "+nomeCliente+". Obrigado por criar uma conta em nosso banco. Sua agência é "+agencia+", conta "+numero+" e seu saldo é de "+saldo+" reais.");

    }
}
