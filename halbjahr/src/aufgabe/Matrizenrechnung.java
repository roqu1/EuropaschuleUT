package aufgabe;

import java.io.IOException;

import oop.IO;

public class Matrizenrechnung {
		
		

	public static double[][] multiplizierungin2D(double[][] multiplikation2d, int eingabe2, double[][] multipliziert) {
		for (int i = 0; i < multiplikation2d.length; i++) {
			for (int j = 0; j < multiplikation2d[i].length; j++) {
				multipliziert[i][j] = multiplikation2d[i][j]*eingabe2;
			}
		}
		return multipliziert;
	}
	
	public static double [][] Addieren2D(double erstematrix[][],double zweitematrix[][], double summe[][])throws IOException{  //Addition zwei Matrizen
		for (int i = 0; i < erstematrix.length; i++) {
			for (int j = 0; j < erstematrix[i].length; j++) {
				summe[i][j] = (zweitematrix[i][j]+erstematrix[i][j]);
			}
		}
		
		return summe;
		
	}
	
	public static double[][] MultiplikationMatrixe2D(double[][]zweitematrix,double [][] erstematrix,double [][] multipltikation) throws IOException{ // Multiplikation zweier Matrizen
		
		
		for (int i = 0; i < erstematrix.length; i++) {
			for (int j = 0; j < erstematrix[i].length; j++) {
				multipltikation[i][j] = zweitematrix[i][j]*erstematrix[i][j];
			}
		}
		return multipltikation;
	}

}
