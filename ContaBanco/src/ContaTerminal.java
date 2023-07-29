
import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário
        
        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem 'conta criada'

        //criando o objeto scanner

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, informe seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Agora informe o número da conta com dígito: ");
            String numeroConta = scanner.nextLine();
            System.out.println("Qual a agência? ");
            String agencia = scanner.nextLine();
            System.out.println( "Agora informe o saldo: ");
            float saldo = scanner.nextFloat();


            System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nossso banco, sua agência é " + agencia + ", conta " + numeroConta + ", e seu saldo de " + saldo + " já está disponível para saque.");
        }
        


    }
}
