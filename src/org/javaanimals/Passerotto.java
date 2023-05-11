package org.javaanimals;

public class Passerotto extends Animale implements Volare {

	
	public void verso() {
		System.out.println("Uhuuu");	
		
	}

	
	public void mangia() {
		System.out.println("Semi");	
	}


	public void vola() {
		System.out.println("Sto Volando!");	
	}
	public String toString() {
		return "[Passerotto]";
	}
}
