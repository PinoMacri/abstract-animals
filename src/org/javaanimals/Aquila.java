package org.javaanimals;

public class Aquila extends Animale implements Volare{

	
	public void verso() {
		System.out.println("Fiuu");	
	}

	
	public void mangia() {
		System.out.println("Carne");	
	}


	
	public void vola() {
		System.out.println("Sto Volando!");	
	}
	public String toString() {
		return "[Aquila]";
	}
}
