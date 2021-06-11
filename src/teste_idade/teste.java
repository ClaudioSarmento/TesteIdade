package teste_idade;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0;
		
		System.out.print("Insira uma idade: ");
		idade = sc.nextInt();
		
		if(idade <= 12) {
			System.out.println("Criança");
		}else if(idade > 12 && idade <= 17){
			System.out.println("Adolescente");
		}else {
			System.out.println("Adulto");
		}
		sc.close();
	}

}
