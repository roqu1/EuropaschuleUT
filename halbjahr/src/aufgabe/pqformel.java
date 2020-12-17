package aufgabe;

public class pqformel {

	public static void main(double a,double b,double c) {
		double formel1 =(Math.pow(b, 2)-4*a*c);
		if (formel1<0) {
			System.out.println("Ungültige Discriminante");
		} else if (formel1==0) {
			double ergebnis1=-b/(2*a);
			System.out.println("Doppelte nullstelle ist "+ ergebnis1);
		} else {
			double x1= (-b+Math.sqrt(formel1))/(2*a);
			double x2= (-b-Math.sqrt(formel1))/(2*a);
			System.out.println("x1 ist "+x1);
			System.out.println("x2 ist "+x2);
		}
	}
}
