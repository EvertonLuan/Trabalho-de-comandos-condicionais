import java.util.Scanner;
public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leitor = new Scanner (System.in);
		
		
		int x;
		
		System.out.println("Digite um número e descubra se ele é maior que 20: ");
		x = leitor.nextInt();
		
		
		if (x > 20)
		System.out.println("O número "+x+" é maior que 20: ");	
		if (x==20)
		System.out.println("O número 20 é igual a 20");	
		if (x < 20)
		System.out.println("O número "+x+" é menor que 20");
	
		
		
		
		
		
		
		
	}

}
