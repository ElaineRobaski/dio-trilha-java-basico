import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
      //TODO: conhecer e importar aclasse scanner      
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);
     
      //Exibir as mensagens para nosso usuario
      //Obter pelo scanner os valores digitados no terminal
		  System.out.println("Por favor, digite o número da conta: ");
      int numero = sc.nextInt();
            
      System.out.println("Digite o número da agência: ");
      String agencia = sc.next();
     
      System.out.println("Digite o seu nome: ");
      String nomeCliente = sc.next();

      System.out.println("Digite o saldo da conta: ");
      Double saldo = sc.nextDouble();
		
      //Obter pelo scanner os valores digitados no terminal
      
      System.out.println(" Numero da conta: " + numero);
      System.out.println("agencia nº " + agencia);
      System.out.println("cliente " + nomeCliente);
      System.out.println("saldo " + saldo);
     
      //Exibr mensagem da conta criada
      System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

      sc.close();
    }
}
