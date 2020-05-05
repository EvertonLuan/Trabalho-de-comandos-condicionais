import java.util.Scanner;

public class Exercíciodez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Scanner sexy = new Scanner(System.in);
		
		float altura;
		String sexo;
		
		System.out.println("Digite sua altura: ");
		altura = scan.nextFloat();
		
		System.out.println("Digite seu sexo: ");
		sexo = sexy.nextLine();
		
		if ("masculino".equals (sexo)) {
			System.out.println("Seu peso ideal é: "+((71.5*altura)-58));
		}
		
		else if ("femenino".equals (sexo)) {
			System.out.println("Seu peso ideal é: "+((62.1*altura)-44.7));
		}
		
		
		
		
		
		
		
		
	}

}
