package aufgabe;

import java.io.IOException;

import oop.IO;

public class Projekt {

	public static void main(String[] args) throws IOException {
		boolean beenden=true;

		do {
			System.out.println("\r\n"
					+ "   ▄▄▄▄███▄▄▄▄      ▄████████     ███        ▄█    █▄            ▄██████▄   ▄██████▄  ████████▄     ▄████████ \r\n"
					+ " ▄██▀▀▀███▀▀▀██▄   ███    ███ ▀█████████▄   ███    ███          ███    ███ ███    ███ ███   ▀███   ███    ███ \r\n"
					+ " ███   ███   ███   ███    ███    ▀███▀▀██   ███    ███          ███    █▀  ███    ███ ███    ███   ███    █▀  \r\n"
					+ " ███   ███   ███   ███    ███     ███   ▀  ▄███▄▄▄▄███▄▄       ▄███        ███    ███ ███    ███   ███        \r\n"
					+ " ███   ███   ███ ▀███████████     ███     ▀▀███▀▀▀▀███▀       ▀▀███ ████▄  ███    ███ ███    ███ ▀███████████ \r\n"
					+ " ███   ███   ███   ███    ███     ███       ███    ███          ███    ███ ███    ███ ███    ███          ███ \r\n"
					+ " ███   ███   ███   ███    ███     ███       ███    ███          ███    ███ ███    ███ ███   ▄███    ▄█    ███ \r\n"
					+ "  ▀█   ███   █▀    ███    █▀     ▄████▀     ███    █▀           ████████▀   ▀██████▀  ████████▀   ▄████████▀  \r\n"
					+ "                                                                                                              \r\n"
					+ "");
			System.out.println("Made by Corneliu,Ali und Ehsan");
			System.out.println("=================================================");
			System.out.println("Es ist Zeit zu einem Auswahl zu kommen");
			System.out.println("=================================================");
			System.out.println("[1]-Für Wachstums- bzw. Zerfallsprozesse ");
			System.out.println("[2]-Für Lösung quadratischer Gleichungen der Form ax2+bx+c ");
			System.out.println("[3]-Für Vektorrechnung (1-dimensionale Arrays)");
			System.out.println("[4]-Für Matrizenrechnung (2-dimensionale Arrays)");
			System.out.println("[5]-Für Statistische Auswertungen");
			System.out.println("[6]-Für Um das Programm zu beenden");
			int eingabe = IO.readInteger();

			if(eingabe==1) { // Zellwachstum
				System.out.println("\r\n"
						+ " __          __        _         _                                                       \r\n"
						+ " \\ \\        / /       | |       | |                                                      \r\n"
						+ "  \\ \\  /\\  / /_ _  ___| |__  ___| |_ _   _ _ __ ___  ___ _ __  _ __ ___ _______  ___ ___ \r\n"
						+ "   \\ \\/  \\/ / _` |/ __| '_ \\/ __| __| | | | '_ ` _ \\/ __| '_ \\| '__/ _ \\_  / _ \\/ __/ __|\r\n"
						+ "    \\  /\\  / (_| | (__| | | \\__ \\ |_| |_| | | | | | \\__ \\ |_) | | | (_) / /  __/\\__ \\__ \\\r\n"
						+ "     \\/  \\/ \\__,_|\\___|_| |_|___/\\__|\\__,_|_| |_| |_|___/ .__/|_|  \\___/___\\___||___/___/\r\n"
						+ "                                                        | |                              \r\n"
						+ "                                                        |_|                              \r\n"
						+ "");
				System.out.println();
				boolean weiter=true;
				do {
				
				
				System.out.println("Bitte die aktuelle Zellmenge eingeben:" );
				double zellmenge = IO.readDouble();
				System.out.println("Bitte den Wachstumsfaktor eingeben:" );
				double wachstumsfaktor = IO.readDouble();
				System.out.println("Bitte die Laufzeit der Hochrechnung in Tagen eingeben:" );
				double laufzeit = IO.readDouble();
				System.out.println("Tage      Zellmenge");
				zellwachstum.main(zellmenge, wachstumsfaktor, laufzeit);
				System.out.println();
				System.out.println("Soll das Programm wiederholt werden? ");
				weiter=IO.readBoolean();
				
			}
			while (weiter==true);
			}

			if(eingabe==2)// quadratischer Gleichungen
			{
				System.out.println("\r\n"
						+ "                        _           _   _          _              _____ _      _      _                                  \r\n"
						+ "                       | |         | | (_)        | |            / ____| |    (_)    | |                                 \r\n"
						+ "   __ _ _   _  __ _  __| |_ __ __ _| |_ _ ___  ___| |__   ___   | |  __| | ___ _  ___| |__  _   _ _ __   __ _  ___ _ __  \r\n"
						+ "  / _` | | | |/ _` |/ _` | '__/ _` | __| / __|/ __| '_ \\ / _ \\  | | |_ | |/ _ \\ |/ __| '_ \\| | | | '_ \\ / _` |/ _ \\ '_ \\ \r\n"
						+ " | (_| | |_| | (_| | (_| | | | (_| | |_| \\__ \\ (__| | | |  __/  | |__| | |  __/ | (__| | | | |_| | | | | (_| |  __/ | | |\r\n"
						+ "  \\__, |\\__,_|\\__,_|\\__,_|_|  \\__,_|\\__|_|___/\\___|_| |_|\\___|   \\_____|_|\\___|_|\\___|_| |_|\\__,_|_| |_|\\__, |\\___|_| |_|\r\n"
						+ "     | |                                                                                                 __/ |           \r\n"
						+ "     |_|                                                                                                |___/            \r\n"
						+ "");
				boolean weiter=true;
				do {
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
				System.out.println("Soll das Programm wiederholt werden? ");
				weiter=IO.readBoolean();
				
			}
			while (weiter==true);
			}
			

			if (eingabe==3) {
				System.out.println("\r\n"
						+ " __      __  _    _                           _                             \r\n"
						+ " \\ \\    / / | |  | |                         | |                            \r\n"
						+ "  \\ \\  / /__| | _| |_ ___  _ __ _ __ ___  ___| |__  _ __  _   _ _ __   __ _ \r\n"
						+ "   \\ \\/ / _ \\ |/ / __/ _ \\| '__| '__/ _ \\/ __| '_ \\| '_ \\| | | | '_ \\ / _` |\r\n"
						+ "    \\  /  __/   <| || (_) | |  | | |  __/ (__| | | | | | | |_| | | | | (_| |\r\n"
						+ "     \\/ \\___|_|\\_\\\\__\\___/|_|  |_|  \\___|\\___|_| |_|_| |_|\\__,_|_| |_|\\__, |\r\n"
						+ "                                                                       __/ |\r\n"
						+ "                                                                      |___/ \r\n"
						+ "");
				Vektor.Vectoren(eingabe);
			}

			if (eingabe==4)
				System.out.println("\r\n"
						+ "  __  __       _        _               \r\n"
						+ " |  \\/  |     | |      (_)              \r\n"
						+ " | \\  / | __ _| |_ _ __ _ _______ _ __  \r\n"
						+ " | |\\/| |/ _` | __| '__| |_  / _ \\ '_ \\ \r\n"
						+ " | |  | | (_| | |_| |  | |/ /  __/ | | |\r\n"
						+ " |_|  |_|\\__,_|\\__|_|  |_/___\\___|_| |_|\r\n"
						+ "                                        \r\n"
						+ "                                        \r\n"
						+ "");
			{
				Matrizen.Multiplizierung(eingabe);
			}
			if (eingabe == 5) {
				System.out.println("\r\n"
						+ "   _____ _        _   _     _   _ _    \r\n"
						+ "  / ____| |      | | (_)   | | (_) |   \r\n"
						+ " | (___ | |_ __ _| |_ _ ___| |_ _| | __\r\n"
						+ "  \\___ \\| __/ _` | __| / __| __| | |/ /\r\n"
						+ "  ____) | || (_| | |_| \\__ \\ |_| |   < \r\n"
						+ " |_____/ \\__\\__,_|\\__|_|___/\\__|_|_|\\_\\\r\n"
						+ "                                       \r\n"
						+ "                                       \r\n"
						+ "");
				Statistik.Statistikrechn(eingabe);
			}
			if (eingabe==6) {	

				beenden=false;
			}
		}
		while(beenden==true);
		System.err.println("\r\n"
				+ "▀█████████▄     ▄████████    ▄████████ ███▄▄▄▄   ████████▄     ▄████████     ███     \r\n"
				+ "  ███    ███   ███    ███   ███    ███ ███▀▀▀██▄ ███   ▀███   ███    ███ ▀█████████▄ \r\n"
				+ "  ███    ███   ███    █▀    ███    █▀  ███   ███ ███    ███   ███    █▀     ▀███▀▀██ \r\n"
				+ " ▄███▄▄▄██▀   ▄███▄▄▄      ▄███▄▄▄     ███   ███ ███    ███  ▄███▄▄▄         ███   ▀ \r\n"
				+ "▀▀███▀▀▀██▄  ▀▀███▀▀▀     ▀▀███▀▀▀     ███   ███ ███    ███ ▀▀███▀▀▀         ███     \r\n"
				+ "  ███    ██▄   ███    █▄    ███    █▄  ███   ███ ███    ███   ███    █▄      ███     \r\n"
				+ "  ███    ███   ███    ███   ███    ███ ███   ███ ███   ▄███   ███    ███     ███     \r\n"
				+ "▄█████████▀    ██████████   ██████████  ▀█   █▀  ████████▀    ██████████    ▄████▀   \r\n"
				+ "                                                                                     \r\n"
				+ "");
		System.err.println("============================================================");
		System.err.println("Das Team Math Gods bedankt sich bei Ihnen recht herzlich");
		System.err.println("============================================================");
	}
}




