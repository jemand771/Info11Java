package quaderberechnungen;

import java.util.Scanner;

public class Main {

	private static Scanner sc;
	
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		System.out.println("Laenge?");
		double len = sc.nextDouble();
		System.out.println("Breite?");
		double br = sc.nextDouble();
		System.out.println("Hoehe?");
		double h = sc.nextDouble();
		
		QuaderRechner quad = new QuaderRechner(len, br, h);
		System.out.println("Volumen: " + quad.getVolume());
		System.out.println("Oberflaecheninhalt: " + quad.getSurfaceArea());
		System.out.println("Umfang: " + quad.getBorderLength());
	}

}
