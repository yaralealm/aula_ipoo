package edu.ifsp.poo;



public class Main {
	 
	public static void main(String[] args) {
		int d1; 
		int d2; 
		int soma=0; 
		
		for(int i=1; i<=3; i++) {
			
			soma = 0; 
			
			d1 = Dado.jogandoDado(args); 
			d2 =  Dado.jogandoDado(args); 
			
			soma += d1 + d2; 
			
			System.out.printf("DADO 1: %d\n", d1);
			System.out.printf("DADO 2: %d\n", d2);
			System.out.printf("SOMA: %d\n", soma);
		}
	}
}
