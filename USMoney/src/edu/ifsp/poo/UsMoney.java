package edu.ifsp.poo;

import java.util.Scanner;

public class UsMoney {
	int dollars; 
	int cents; 
	
	public UsMoney(int dollars, int cents) {
		if(cents > 99) {
			dollars += cents/100; 
			cents = cents % 100; 
			}
		System.out.printf("Dólares: %d\nCentavos: %d\n", dollars,cents); 
		}
	
	public static void plus() {
		int dol; 
		int cen; 
		int soma; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira quantia de dólares: "); 
		dol = input.nextInt(); 
		
		System.out.print("Insira quantia de dólares: "); 
		cen = input.nextInt(); 
		
		UsMoney saldo2 = new UsMoney(dol,cen); 
		
		soma = obj + saldo2; 
		
	}
}