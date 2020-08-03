import java.util.Random;
import java.util.Scanner;

Scanner in = new Scanner(System.in);
		String nome;
		Random rand = new Random();
	
public class Main {
	public static void main(String [] args)
	{
		@SuppressWarnings("resource")
		
		
		String nome, idade, cidade, estado, pais;
		float peso, altura;
		System.out.println("Digite seu nome:");
		nome = in.nextLine();
		System.out.println("Digite sua idade:");
		idade = in.nextLine();
		System.out.println("Digite seu peso:");
		peso = in.nextFloat();
		System.out.println("Digite sua altura: ");
		altura = in.nextFloat();
		System.out.println("Digite sua cidade:");
		cidade = in.nextLine();
		System.out.println("Digite seu Estado:");
		estado = in.nextLine();
		System.out.println("Digite seu País:");
		pais = in.nextLine();
				
		Gerar resultado final
		System.out.println("-------------------------");
		System.out.println("Aqui está o resultado do teste:");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Cidade: "+cidade);
		System.out.println("Estado: "+estado);
		System.out.println("País: "+pais);
		System.out.println("Peso: "+peso);
		System.out.println("Altura: "+altura);
		System.out.println("------------IMC------------");
		
		float imc=(peso/(altura*altura));
		System.out.println(imc);
		
		if (imc<18.5) {
			System.out.println("Você está abaixo do peso!");
			
		}else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Parabéns! Seu peso está ótimo!");
			
		} else if (imc>= 25 && imc <= 29.9) {
			System.out.println("Você está com sobrepeso mas não se preocupe! É apenas excesso de gostosura!");
			
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Talvez esteja na hora de começar a perder uns quilinhos...");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Acho bom maneirar nas comidas gordurosas e fazer exercícios...");
			
		} else if (imc <= 40) {
			System.out.println("Procure um médico e uma nutricionista urgentemente se não quiser ficar mórbido!");
			
		}
	}	