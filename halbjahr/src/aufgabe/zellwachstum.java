package aufgabe;



import java.io.IOException;



import oop.IO;



public class zellwachstum {



	public static void main(double zellmenge,double wachstumsfaktor,double laufzeit) throws IOException {

		

		//Eingabe in der Console

		
		for (int i=0 ; i <= laufzeit ; i++) {
		double formel = zellmenge* Math.pow(wachstumsfaktor, i);
		System.out.println(i+ "         " + formel);
		}
	}
}
