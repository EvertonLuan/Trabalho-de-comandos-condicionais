import java.util.Scanner;

public class Exercício9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		float dinheiro, d45, d30; 
		
		System.out.println("Digite o valor do produto: ");
		
		dinheiro = scan.nextInt();
		
		if (dinheiro < 20) {
			d45 = (45*dinheiro) /100;
			System.out.println(d45 + dinheiro);
		}
		
		else {
			d30 = (30*dinheiro) /100;
			System.out.println(d30 + dinheiro);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
