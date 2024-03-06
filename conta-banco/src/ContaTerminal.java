import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        String NomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da sua conta !");
        int Numero = sc.nextInt();

        System.out.println("Por favor, digite o saldo da sua conta !");
        double Saldo = sc.nextDouble();

        System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo R$ "+Saldo+" já está disponivel para saque.");
    }
}
