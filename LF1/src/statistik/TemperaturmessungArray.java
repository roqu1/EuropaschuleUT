package statistik;

import java.io.IOException;

import oop.IO;

public class TemperaturmessungArray {

	public static void main(String[] args) throws IOException {

		double tage [] = new double[7];

		for (int i=0; i<tage.length;i++) {
			System.out.println("Schreiben Sie die Daten von "+(i+1)+" Tag");
			tage [i] = IO.readDouble();	
		}
		double mittelwert = (tage[0]+tage[1]+tage[2]+tage[3]+tage[4]+tage[5]+tage[6])/tage.length;
		System.out.println(mittelwert+"°C");

		double max = tage[0];
		for (int i=1; i<tage.length;i++) {
			if (max < tage[i]) {
				max = tage[i];
			}
		}
		System.out.println(max+"°C");

	}

}
