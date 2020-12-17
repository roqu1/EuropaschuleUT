package aufgabe;

import java.io.IOException;

import oop.IO;

public class Projekt {

	public static void main(String[] args) throws IOException {
		System.out.println("=================================================");
		System.out.println("Mathe Software: Made by Corneliu,Ali und Ehsan");
		System.out.println("=================================================");
		System.out.println("Es ist Zeit zu einem Auswahl zu kommen");
		System.out.println("=================================================");
		System.out.println("[1]-Für Wachstums- bzw. Zerfallsprozesse ");
		System.out.println("[2]-Für Lösung quadratischer Gleichungen der Form ax2+bx+c ");
		System.out.println("[3]-Für Vektorrechnung (1-dimensionale Arrays)");
		System.out.println("[4]-Für Matrizenrechnung (2-dimensionale Arrays)");
		System.out.println("[5]-Für Statistische Auswertungen");
		System.out.println("[80]-Für Um das Programm zu beenden");
		int eingabe = IO.readInteger();
		
		if(eingabe==1) { // Zellwachstum
			System.out.println();
			System.out.println("Bitte die aktuelle Zellmenge eingeben:" );
			double zellmenge = IO.readDouble();
			System.out.println("Bitte den Wachstumsfaktor eingeben:" );
			double wachstumsfaktor = IO.readDouble();
			System.out.println("Bitte die Laufzeit der Hochrechnung in Tagen eingeben:" );
			double laufzeit = IO.readDouble();
			System.out.println("Tage      Zellmenge");
			zellwachstum.main(zellmenge, wachstumsfaktor, laufzeit);
			System.out.println();
		}
		
		if(eingabe==2) { // quadratischer Gleichungen
			System.out.print("Geben sie a ein: ");
			double a = IO.readDouble();
			System.out.print("Geben sie b ein: ");
			double b = IO.readDouble();
			System.out.print("Geben sie c: ");
			double c = IO.readDouble();
			System.out.println("===================");
			System.out.println("Das Ergebnis lautet");
			System.out.println("===================");
			pqformel.main(a, b, c);
			System.out.println();
		}
		
		if (eingabe==3) {
			Vektor.Vectoren(eingabe);
		}
		
		if (eingabe==4)
		{
			Matrizen.Multiplizierung(eingabe);
		}
		if (eingabe == 5) {
			Statistik.Statistikrechn(eingabe);
		}
	}
}