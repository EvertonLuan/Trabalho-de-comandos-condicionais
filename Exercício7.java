import java.util.Scanner;

public class Exercício7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		Scanner scan_nome = new Scanner(System.in);
		
		int num1, num2;
		String nome1, nome2;
		
		System.out.println("Digite seu nome: ");
		nome1 = scan_nome.nextLine();
		
		System.out.println("Digite sua idade: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite outro nome: ");
		nome2 = scan_nome.nextLine();
		

		System.out.println("Digite outra idade: ");
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println(nome1 +", "+num1);
			
		}
		else {
			System.out.println(nome2 +", "+num2);
		}
		
		
		
	}

}
