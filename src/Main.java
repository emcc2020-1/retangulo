
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float largura = 0  , altura , area , perimetro;
		int opcao ;
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
		
		System.out.println("MENU");
		System.out.println("1 - Mostrar Area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		System.out.print("Digite uma opção: ");
		opcao = sc.nextInt();
		
		if (opcao < 1||  opcao > 3) {
			
			while (opcao < 1 ||  opcao > 3) {
				System.out.println();
				System.out.println("OPÇÃO INVALIDA" );
				opcao = sc.nextInt();
				System.out.println("MENU");
				System.out.println("1 - Mostrar Area");
				System.out.println("2 - Mostrar perimetro");
				System.out.println("3 - Sair");
				}
			}
			
			while (opcao != 3) {
				System.out.println();
				System.out.println("MENU");				
				System.out.println("1 - Mostrar Area");
				System.out.println("2 - Mostrar perimetro");
				System.out.println("3 - Sair");
				
				if(opcao == 1) {
					area = altura *largura;
					System.out.println();
					System.out.println("AREA : " + area);
					opcao = sc.nextInt();
				}
				else if(opcao == 2) {
						perimetro =( altura * 2) + (largura * 2);
						System.out.println();
						System.out.println("PERIMETRO : " + perimetro);
						opcao = sc.nextInt();
				}
					else {
							System.out.println();
							System.out.println("OPÇÃO INVÁLIDA");
							opcao = sc.nextInt();
							}							     
				
				}
			if(opcao == 3) {
				System.out.println();
				System.out.println("FIM DO PROGRAMA!");
				sc.close();
				}
			sc.close();
			
			}
			
		}		

	

