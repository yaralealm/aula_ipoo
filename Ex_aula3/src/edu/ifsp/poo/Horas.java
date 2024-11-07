package edu.ifsp.poo;

public class Horas {
	private static final int dayInSeconds = 86399; 
	private static final int hoursInSeconds = 3600; 
	private static final int minutesInSeconds = 60; 
	private int segundos; 
	
	public static void foo() {
		System.out.println("Sou um método estático!");
		// toString(); > não acessa pq eh um método de instância; 
	}
	
	
	public Horas(){
		this.segundos = 0; 
	}
	
	private Horas(int horas){
		this(); //esse construtor esta delegando a função de zerar os segundos para o metodo de cima. 
		if(horas >= 0 && horas <= 23) {
			this.segundos += horas * hoursInSeconds; //3600s == 1hora. 
		}
	}
	
	
	private Horas(int horas, int minutos){
		this(horas); 
		if(minutos >= 0 && minutos <= 59) {
			this.segundos += minutos * minutesInSeconds; //60s == 1min
		}else {
			this.segundos = 0; 
		}
	}
	
	public Horas(int horas, int minutos, int segundos){
		this(horas,minutos); 
		if(segundos >= 0 && segundos <= 59) {
			this.segundos += segundos; 
		}else {
			this.segundos = 0; 
		}
	}
	
	//metodos publicos
	
	public int getHoras() {
		return this.segundos / 3600; 
	}
	
	public int getMinutos() {
		return (this.segundos - getHorasemSegundos()) / 60; 
	}
	
	public int getSegundos() {
		return this.segundos - getHorasemSegundos() - getMinutosemSegundos(); 
	}
	
	public Horas addHoras(Horas horas) {
		Horas resultado = new Horas(); 
		resultado.segundos = this.segundos + horas.segundos; 
		if(resultado.segundos > 86399) {
			resultado.segundos -= 86399 * (resultado.segundos / 86399); 
		}
		return resultado; 
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d",
			getHoras(),
			getMinutos(),
			getSegundos()); 
		
	}
	
	private int getHorasemSegundos() {
		return getHoras() * 3600; 
	} 
	
	private int getMinutosemSegundos() {
		return getMinutos() * 60; 
	}

}
