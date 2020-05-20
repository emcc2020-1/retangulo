
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float largura = 0  , altura ;
		System.out.println("Digite a largura do retangulo: ");
		largura = sc.nextFloat();
		if (largura <= 0) {
	
		while (largura <= 0 ) {
			System.out.println("O valor deve ser positivo. Tente novamente: " );
			largura = sc.nextFloat();
			}
		}
		
		System.out.println("Digite a altura do retangulo: ");
		altura = sc.nextFloat();
		if (altura <= 0) {
	
		while (altura <= 0 ) {
			System.out.println("O valor deve ser positivo. Tente novamente: " );
			altura = sc.nextFloat();
			}
		}
		
	}

}
