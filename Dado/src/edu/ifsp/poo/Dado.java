package edu.ifsp.poo;

import java.util.Random;

public class Dado {

	public static int jogandoDado (String[] args){
		int d; 
		Random dado = new Random();
		d = dado.nextInt(6) + 1; 
		
		return d; 
	}
}
