package edu.ifsp.poo;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		int lado1;
		int lado2; 
		int lado3;
		
		for(int i=0; i<5; i++) {
			
			
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insira Lado 1: ");
		lado1 = input.nextInt(); 
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Insira Lado 2: ");
		lado2 = input2.nextInt(); 

		Scanner input3 = new Scanner(System.in);
		System.out.print("Insira Lado 3: ");
		lado3 = input3.nextInt(); 
		
		if((lado1 + lado2 > lado3) && (lado2 + lado3 > lado1) && (lado1 + lado3 > lado2)) {
		
		if((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
			if((lado1 == lado2) && (lado2 == lado3)) {
				System.out.println("TRIANGULO EQUILÁTERO");
			}else {
				System.out.println("TRIANGULO ISÓSCELES");
			}
		}else {
			System.out.println("TRIÂNGULO ESCALENO");
				}

		
			}else {
				System.out.println("NÃO É UM TRIÂNGULO!");
			}
		}
	}
}
