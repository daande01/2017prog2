package polymorfism;

public class Triangel extends Figur {

	public Triangel(){
		
		
		
	}
	@Override
	public void area(int i, int k){
		
		
	System.out.println("triangel area"+i*k/2);	
	}
	
	/**
	 * @param arg
	 * Polymorfism inom biologi innebär att det inom samma population
	 *  av en art finns två eller flera distinkta varianter, morfer.
	 * objektetets klass styr vilken metod som skall anropas inte 
	 * referensens typ.
	 *  Polymorphism just means that different objects can 
	 *  respond to the same message(method) in different ways.
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
