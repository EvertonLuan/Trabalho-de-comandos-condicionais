import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Digite um número inteiro: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1+", "+num2);	
		}
		
		else if (num1 < num2) {
			System.out.println(num2+", "+num1 );
		}
		
		else  {
			System.out.println(num1+", "+num2);
		}
		
		
		
		
	}

}
