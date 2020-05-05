import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in);
		
		String senha;
		String AEDB = "AEDB";	
		
		System.out.println("Digite a senha: "); 
		senha = leitor.nextLine();
		
		if (senha.equals (AEDB)) {
			System.out.println("Senha correta");
		}
		
		else {
			System.out.println("Senha incorreta");
		}
		
		
		
		
		
		
	}

}
