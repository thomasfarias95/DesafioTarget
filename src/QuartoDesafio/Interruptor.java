package QuartoDesafio;

import java.util.Scanner;

public class Interruptor {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean [] interruptores = new boolean [3];
		
		System.out.println("Visita incial às lâmpadas");
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Lâmpada" + (i + 1) + ": está ligada? (true/false)");
			boolean estado = scanner.nextBoolean();
			interruptores[i] = estado;
		}
		
		System.out.println("Descobrindo qual interruptor controla qual lâmpada...");
		for(int i =0 ; i< 3; i++) {
			boolean[] copiaInterruptor = interruptores.clone();
			System.out.println("Visita aos interruptores...");
			for( int j = 0; j < 3; j++) {
				System.out.println("Interruptor " + (j + 1)+ " está ligado? " + copiaInterruptor[j]);
			}
			System.out.println("Confirma? Se sim, qual lâmpada está acesa? (1/2/3)");
			int resposta = scanner.nextInt();
			if(resposta == i + 1) {
				System.out.println("Correto! O interruptor " + (i + 1) + " controla a lâmpada " + resposta);
			}else {
				System.out.println("Incorreto!");
			}
		}
		scanner.close();
	}
}
