package edu.ifsp.poo;

public class ClientCode {
	
	public static void main(String[] args) {
		
		Horas obj1 = new Horas(); 
		Horas obj2 = new Horas(19,57,20); //os argumentos q estiverem errados serão zerados. 
		Horas obj3 = new Horas(1,90,117); 
		
		Horas.foo(); //metodo estatico, ou seja, da classe Horas; 
		
		System.out.println("Obj1: " + obj1.toString());
		System.out.println("Obj2: " + obj2.toString());
		System.out.println("Obj3: " + obj3);
		
	Horas obj4 = obj3.addHoras(obj2);
	System.out.println("Obj4: " + obj4);

	}
}
