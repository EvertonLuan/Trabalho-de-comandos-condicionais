import java.util.Scanner;

public class Exercício6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		
		
		System.out.println("Digite a primeira nota: ");
		
		num1 = scan.nextInt(); 
	

		System.out.println("Digite a segunda nota: ");
		
		num2 = scan.nextInt(); 
	
		
		System.out.println("Digite a terceira nota: ");
		
		num3 = scan.nextInt(); 
	
		if ((num1 + num2 + num3)>= 7) {
			System.out.println("Aluno aprovado");
		}
		else {
			System.out.println("Aluno reprovado");
		}
		
		
		
		
		
		
	}

}
