package aufgabe;

import java.io.IOException;

import oop.IO;

public class Statistik {

	public static void Statistikrechn (int eingabe) throws NumberFormatException, IOException {

		System.out.println("Welche Operation wollen sie ausführen?");
		System.out.println("[22] - Minimum");
		System.out.println("[23] - Maximum");
		System.out.println("[24] - Spannweite");
		System.out.println("[25] - Maximale Abweichung zweier benachbarter Messwerte");
		System.out.println("[26] - Minimale Abweichung zweier benachbarter Messwerte");
		System.out.println("[27] - Arithmetisches Mittel");
		System.out.println("[28] - Geometrisches Mittel");
		System.out.println("[29] - Maximum");
		System.out.println("[30] - Median");
		System.out.println("[31] - Modalwert");
		System.out.println("[32] - Varianz");
		System.out.println("[33] - Standardabweichung");
		eingabe = IO.readInteger();

		if(eingabe == 22) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double minumum = Statistikrechnung.ermittelnMinimum(numbers);
				System.out.println("Minimum: " + minumum);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		if(eingabe == 23) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double maximum = Statistikrechnung.ermittelnMaximum(numbers);
				System.out.println("Maximum: " + maximum);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		if(eingabe == 24) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double span = Statistikrechnung.ermittelnSpannweite(numbers);
				System.out.println("Spannweite: " + span);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		if(eingabe == 27) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double ArithmetischesMittel = Statistikrechnung.ArithmetischesMittel(numbers);
				System.out.println("ArithmetischesMittel: " + ArithmetischesMittel);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		if(eingabe == 28) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double GeometrischesMittel = Statistikrechnung.GeometrischesMittel(numbers);
				System.out.println("GeometrischesMittel: " + GeometrischesMittel);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		if(eingabe == 25) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double maxabweichung = Statistikrechnung.maxabweichung(numbers);
				System.out.println("maxabweichung: " + maxabweichung);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		if(eingabe == 26) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double minabweichung = Statistikrechnung.minabweichung(numbers);
				System.out.println("minabweichung: " + minabweichung);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		if(eingabe == 30) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double median = Statistikrechnung.median(numbers);
				System.out.println("median: " + median);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		if(eingabe == 31) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double modus = Statistikrechnung.modus(numbers);
				System.out.println("modus: " + modus);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		if(eingabe == 32) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double varianz = Statistikrechnung.varianz(numbers);
				System.out.println("varianz: " + varianz);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		if(eingabe == 33) {
			boolean weiter = true;
			do {
				System.out.println("Wie viele werte haben sie: ");
				double anzahl = IO.readInteger();
				double[] numbers = IO.readDoubleArray1D(anzahl);
				double standardabweichung = Statistikrechnung.standardabweichung(numbers);
				System.out.println("standardabweichung " + standardabweichung);
				System.out.println("Wollen sie das Program wiederholen?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
	}
}