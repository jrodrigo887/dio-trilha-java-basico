import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Porfavor, digite o número da Agência:\n");
        String agencia = scan.next();

        System.out.println("Por favor, digite o número da Conta:\n");
        int numeroConta = Integer.parseInt(scan.next());

        System.out.println("Por favor, digite o nome do Cliente:\n");
        String nomeCliente = scan.next();

        System.out.println("Por favor, digite o Saldo:\n");
        Double saldo = Double.parseDouble(scan.next());
        scan.close();
        
        System.out.println("Olá " + nomeCliente 
        + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia 
        + ", conta " + numeroConta + " e seu saldo " 
        + saldo + " já está disponível para saque.");
    }
}