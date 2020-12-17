package aufgabe;

import java.util.Arrays;

public class Statistikrechnung {

	public static double ermittelnMinimum(double[] numbers) {
		double minimum = numbers[0];
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] < minimum){	
				minimum = numbers[i];
			}
		}
		return minimum;
	}

	public static double ermittelnMaximum(double[] numbers) {
		double maximum = numbers[0];
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] > maximum) {	
				maximum= numbers[i];
			}
		}
		return maximum;
	}

	public static double ermittelnSpannweite(double[] testdaten) {
		double span = ermittelnMaximum(testdaten) - ermittelnMinimum(testdaten);
		return span;
	}

	public static double ArithmetischesMittel(double[] testdaten) {
		double ergebnis = 0;
		double arthmittel = 0;
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < testdaten.length; j++) {
				ergebnis = ergebnis+testdaten[j];
			}
			arthmittel= ergebnis / testdaten.length;
		}
		return arthmittel;
	}

	public static double GeometrischesMittel(double[] numbers) {
		double ergebnis = 1;
		for (int i = 0; i < numbers.length; i++) {
			ergebnis = ergebnis * numbers[i];	
		}
		return Math.pow(ergebnis, 1 / (double) numbers.length);	
	}

	public static int maxabweichung(double[] test) {
		double ali[] = new double[test.length - 1];
		for (int i = 0; i < test.length - 1; i++)
			ali[i] = test[i + 1] - test[i];
		double selam = ali[0];
		for (int i = 1; i < test.length - 1; i++) {
			if (ali[i - 1] > 0)
				ali[i] += ali[i - 1];
			if (selam < ali[i])
				selam = ali[i];
		}
		return (int) selam;
	}

	public static int minabweichung(double[] numbers) {
		double ali = Integer.MAX_VALUE;
		for (int i = 0; i < numbers.length - 1; i++){
			for (int j = i + 1; j < numbers.length; j++){
				if (Math.abs((numbers[i] - numbers[j])) < ali){
					ali = Math.abs((numbers[i] - numbers[j]));
				}
			}
		}
		return (int) ali;
	}

	public static double median(double[] test){
		Arrays.sort(test);
		double ergebnis;
		if (test.length % 2 == 0){
			ergebnis = (test[test.length / 2] + test[test.length / 2 - 1]) / 2;
		} else {
			ergebnis = test[test.length / 2];
		}
		return ergebnis;
	}
	public static double modus(double[] numbers){
		double cornel = 0;
		double ehsan = 0, i, j;
		for (i = 0; i < numbers.length; i++) {
			int ka = 0;
			for (j = 0; j < numbers.length; j++) {
				if (numbers[(int) j] == numbers[(int) i])
					++ka;
			}
			if (ka > ehsan) {
				ehsan = ka;
				cornel = numbers[(int) i];
			}
		}
		return cornel;
	}

	public static double varianz(double[] test){
		double ali = 0;
		for(int i = 0; i < test.length; i++) {
			ali += test[i];
		}
		double durchschnitt = (ali / test.length);
		double ali2 = 0;
		for(int i = 0; i < test.length; i++) {
			ali2 += Math.pow((test[i] - durchschnitt), 2);
		}
		return (ali2 / test.length);
	}

	public static double standardabweichung(double[]test){
		double ali = 0;
		for (int i = 0; i < test.length; i++) {
			ali += test[i];
		}
		ali /= test.length;
		double standardabweichung = 0;
		for (int i = 0; i < test.length; i++) {
			standardabweichung += (test[i] - ali) * (test[i] - ali);
		}
		standardabweichung /= test.length;
		return Math.sqrt(standardabweichung);
	}



}