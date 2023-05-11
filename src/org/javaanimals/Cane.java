package org.javaanimals;

public class Cane extends Animale implements Nuotare {

	
	public void verso() {
		System.out.println("Bau");	
	}

	
	public void mangia() {
		System.out.println("Croccantini");	
	}


	
	public void nuota() {
		System.out.println("Sto Nuotando!");		
	}
	
	public String toString() {
		return "[Cane]";
	}
	

}
