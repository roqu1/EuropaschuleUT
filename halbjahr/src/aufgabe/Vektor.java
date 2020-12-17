package aufgabe;

import java.io.IOException;

import oop.IO;

public class Vektor {

	public static void Vectoren(int eingabe) throws IOException {
		System.out.println("[16] für Multiplikation mit einer Zahl");
		System.out.println();
		System.out.println("[17] für Addition zweier Vektoren");
		System.out.println();
		System.out.println("[18] für Multiplikation zweier Vektoren");
		System.out.print("Welche Operation wollen sie ausführen?: ");
		eingabe = IO.readInteger();
		
		if (eingabe==16) {
			System.out.println("Wie viele Werte wollen Sie haben: ");
			int spalte=IO.readInteger();
			int [] array = new int[spalte];
			IO.readIntegerArray1D(array);
			System.out.println("Mit welche Zahl soll Ihr Array multipliziert werden: ");
			int zahl=IO.readInteger();
			int formell[]=new int [spalte]; 
			int []mult=new int[spalte];
			System.out.println("===================");
			System.out.println("Das Ergebnis lautet");
			System.out.println("===================");
			Vectorrechnung.Multiplikationarray1D(mult, array, zahl);
			System.out.println();
		}

		if (eingabe==17) {
			System.out.println("Wie viele Werte wollen Sie haben: ");
			int spalte1=IO.readInteger();
			int [] array1 = new int[spalte1];
			IO.readIntegerArray1D(array1);
			int [] array2= new int[spalte1];
			IO.readIntegerArray1D(array2);
			int [] summe= new int[spalte1];
			System.out.println("================");
			System.out.println("Die summe lautet");
			System.out.println("================");
			Vectorrechnung.Additionarray1D(spalte1, array1, array2, summe);
			System.out.println();
		}

		if(eingabe==18) {
			System.out.println("Wie viele Werte wollen Sie haben: ");
			int zeile =IO.readInteger();
			int []array1=new int [zeile];
			IO.readIntegerArray1D(array1);
			int []array2=new int [zeile];
			IO.readIntegerArray1D(array2);
			int [] mult1=new int[zeile];
			System.out.println("===================");
			System.out.println("Das Ergebnis lautet");
			System.out.println("===================");
			Vectorrechnung.Multiplikatiozweivikarray1D(mult1, array1, array2);
			System.out.println();
		}
		
		
	}

}
