//TODO:"importe da classe Scanner"
import java.util.Scanner;

public class ContaTerminal {
	//Projeto Conta Banco desenvolvido pata trilha java básico
	
	public static void main(String[] args ) {
		//TODO:"declaração das variaveis "
		int numero ;
		String agencia;
		String nome;
		String sobrenome;
		double saldo;
		
		//TODO:"declaração e instanciação da classe Scanner"
		Scanner sc = new Scanner(System.in);
		
		//TODO:"Mensagens ao usuario e obtenção dos valores digitados"
		System.out.println("Digite o número da Agencia: ");
		agencia = sc.next();
		
		System.out.println("Digite o numero da conta: ");
		numero = sc.nextInt();
		
		System.out.println("Digite o nome: ");
		nome = sc.next();
		
		System.out.println("Digite o sobrenome: ");
		sobrenome = sc.next();
		
		System.out.println("Digite o saldo da conta: ");
		saldo = sc.nextDouble();
		
		//TODO:"Mensagem da conta Criada"
		System.out.println("Olá " + nome + " " + sobrenome + ", " + "obrigado por criar uma conta em nosso banco, "
				+ "sua agência é: " + agencia + ", "+ "conta: " + numero + 
				" e seu saldo " + saldo + " ja está disponível para saque!");
		
		
	}

}
