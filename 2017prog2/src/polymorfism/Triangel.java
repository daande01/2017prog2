package polymorfism;

public class Triangel extends Figur {

	public Triangel(){
		
		
		
	}
	@Override
	public void area(int i, int k){
		
		
	System.out.println("triangel area"+i*k/2);	
	}
	
	/*
	 * 
	 * Polymorfism inom biologi inneb�r att det inom samma population
	 *  av en art finns tv� eller flera distinkta varianter, morfer.
	 * objektetets klass styr vilken metod som skall anropas inte 
	 * referensens typ.
	 *  Polymorphism just means that different objects can 
	 *  respond to the same message(method) in different ways.
	 * 
	 * en klass �r polymorfisk om om fr�gan "�r en" ger mer �n ett svar
	 *
	 * ex en jframe �r en container 
	 *    en jframe �r en component
	 *    en jframe �r en object
	 * 
	 * 
	 * 
	 */
	public static void main(String[] arg ){
		
		Figur[] a =new Figur[2];
		
		a[0] =new Triangel();
		
		a[1]=new Fyrkant();
		
		
		for (Figur figur : a) {
			
			 figur.area(1, 2);
			
		}
		
		
		
		
		
	}
}
