package aufgabe;

import java.io.IOException;

import oop.IO;

public class Matrizen {

	public static void Multiplizierung(int eingabe) throws IOException {
		
		if (eingabe==4) {
			System.err.println("----------------------------------------");
			System.err.println("[19] - Multiplikation zweier Matrizen  |");
			System.err.println("[20] - Multiplikation mit einer Zahl   |");
			System.err.println("[21] - Addition zweier Matrizen        |");
			System.err.println("----------------------------------------");
			eingabe=IO.readInteger();
		}

		// Matrix Multiplizieren
		if (eingabe==19) {
			boolean weiter = true;
			do {
				System.out.println("Geben sie die groЯe die Matrixe");

				System.out.print("Wie viele Zeile?: ");
				int zeile = IO.readInteger();
				System.out.print("Wie viele Spalte: ");
				int spalte = IO.readInteger();
				double erstematrix[][]= IO.readDoubleTable(zeile, spalte);

				System.out.println("Jetzt die Zweite Matrix");

				double zweitematrix[][]= IO.readDoubleTable(zeile, spalte);


				double [][] multipltikation = new double[zeile][spalte];


				IO.writeDoubleTable(erstematrix);
				System.out.println("_____________________________");
				IO.writeDoubleTable(zweitematrix);
				System.out.println();
				System.out.println();
				System.out.println("Das Ergebnis ist: ");
				System.out.println("----------------------");
				Matrizenrechnung.MultiplikationMatrixe2D(zweitematrix, erstematrix, multipltikation);
				IO.writeDoubleTable(multipltikation);
				System.out.println("Soll das Programm wiederholt werden?");
				weiter=IO.readBoolean();
			} while (weiter==true);
		}
		// Matrix mit einem Zahl multiplizieren
		if (eingabe==20) { 
			boolean weiter = true;
			do {
				System.out.print("Wie viele Zeile?: ");
				int zeile1= IO.readInteger();
				System.out.print("Wie viele Spalte?: ");
				int spalte1= IO.readInteger();
				double multiplikation2d[][]= IO.readDoubleTable(zeile1, spalte1);
				System.out.print("Mit Welchem Zahl mцchten sie Multiplizieren?: ");
				int eingabe2 = IO.readInteger();
				double multipliziert [][] = new double [zeile1][spalte1];
				Matrizenrechnung.multiplizierungin2D(multiplikation2d, eingabe2, multipliziert);
				IO.writeDoubleTable(multipliziert);
				System.out.println("Soll das Programm wiederholt werden?");
				weiter=IO.readBoolean();
			} while (weiter==true);
			
			
			
		}
		// Addition 2 Matrixe
		if (eingabe==21) {
			boolean weiter = true;
			do {
				System.out.print("Wie viele Zeile?: ");
				int zeile3= IO.readInteger();
				System.out.print("Wie viele Spalte?: ");
				int spalte3= IO.readInteger();
				double erstematrix[][]= IO.readDoubleTable(zeile3, spalte3);

				System.out.println("Jetzt die Zweite Matrix");

				double zweitematrix[][]= IO.readDoubleTable(zeile3, spalte3);


				double [][] summe = new double[zeile3][spalte3];

				IO.writeDoubleTable(erstematrix);
				System.out.println("_____________________________");
				IO.writeDoubleTable(zweitematrix);
				System.out.println();
				Matrizenrechnung.Addieren2D(erstematrix, zweitematrix, summe);
				IO.writeDoubleTable(summe);
				System.out.println("----------------------");
				System.out.println("Soll das Programm wiederholt werden?");
				weiter=IO.readBoolean();
			}	while (weiter==true);

		}
	}
}



