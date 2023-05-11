package org.javaanimals;

public class Main {
	public static void main(String[] args) {
		Cane c = new Cane();

		Passerotto p = new Passerotto();

		Aquila a = new Aquila();

		Delfino d = new Delfino();

		Animale[] animale = { c, p, a, d };
		Nuotare[] nuotoArr = { c, d };
		Volare[] voloArr = { a, p };
		System.out.println("Versi degli animali:");
		for (int i = 0; i < animale.length; i++) {
		    Animale an = animale[i];
		    System.out.println(an.toString() + ":");
		    an.verso();
		}
		System.out.println("-----------------------------------");
		System.out.println("Animali che Nuotano:");
		for (int i = 0; i < nuotoArr.length; i++) {
		    Nuotare n = nuotoArr[i];
		    System.out.println(n.toString() + ":");
		    n.nuota();
		}
		System.out.println("-----------------------------------");
		System.out.println("Animali che Volano:");
		for (int i = 0; i < voloArr.length; i++) {
		    Volare v = voloArr[i];
		    System.out.println(v.toString() + ":");
		    v.vola();
		}

	}
}
