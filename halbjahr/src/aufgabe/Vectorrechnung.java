package aufgabe;

import java.io.IOException;


public class Vectorrechnung {



	public static int[] Additionarray1D(int spalte1,int array1[],int [] array2,int summe[]) throws IOException {
		for (int i=0;i<array1.length;i++) {
			summe[i]=array1[i]+array2[i];
			System.out.println(summe[i]);
		}
	 return summe;
	}

	public static void Multiplikationarray1D( int mult[],int []array,int zahl) throws NumberFormatException, IOException {
		for(int i=0;i<array.length;i++) {
			mult[i]=array[i]*zahl;
			System.out.println(mult[i]);
		}
	}	
	public static void Multiplikatiozweivikarray1D( int [] mult1,int []array1,int []array2) throws NumberFormatException, IOException {
				for (int i=0;i<array1.length;i++) {
					mult1[i]=array1[i]*array2[i];
					System.out.println(mult1[i]);
				}
	}
}
