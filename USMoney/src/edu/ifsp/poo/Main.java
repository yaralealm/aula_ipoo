package edu.ifsp.poo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	int dol; 
	int cen; 
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Insira quantia de dólares: "); 
	dol = input.nextInt(); 
	
	System.out.print("Insira quantia de dólares: "); 
	cen = input.nextInt(); 
	
	UsMoney saldo = new UsMoney(dol,cen); 
	
	 
	UsMoney.plus(UsMoney.saldo.dol, UsMoney.saldo.cen);

	}
}
