import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Random ge = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int tent = 1;
		int num2 = ge.nextInt(49);
		num2 = num2 + 1;
		System.out.println(num2);
		
		
		System.out.println("Escolha de 1 a 50 pra sortear");
		num = sc.nextInt();
		
		while (num != num2) {
				
			tent ++;	
			
			System.out.println("Numero não sorteado...");
			System.out.println("*************************");
			if (num > num2 ) {
				System.out.println("Numero digitado maior");
				System.out.println("**********************");
			}else {
				System.out.println("numero digitado menor");
			}
			System.out.println("*************************");
			System.out.println("Escolha de 1 a 50 pra sortear");
			num = sc.nextInt();

		}
		System.out.println("Parabens voce acertou o numero...");
		System.out.println("Numeros de tentativas:" + tent);

	}

}
