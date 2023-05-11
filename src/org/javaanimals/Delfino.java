package org.javaanimals;

public class Delfino extends Animale implements Nuotare {

	
	public void verso() {
		System.out.println("iiii");	
	}

	
	public void mangia() {
		System.out.println("Plancton");	
	}


	
	public void nuota() {
		System.out.println("Sto Nuotando!");		
	}
	public String toString() {
		return "[Delfino]";
	}
}
