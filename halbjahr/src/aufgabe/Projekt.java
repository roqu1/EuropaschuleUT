package aufgabe;

import java.io.IOException;

import oop.IO;

public class Projekt {

	public static void main(String[] args) throws IOException {
		System.err.println("\r\n" + 
				"   ▄▄▄▄███▄▄▄▄      ▄████████     ███        ▄█    █▄            ▄████████  ▄█  ███▄▄▄▄      ▄████████  ▄█       \r\n" + 
				" ▄██▀▀▀███▀▀▀██▄   ███    ███ ▀█████████▄   ███    ███          ███    ███ ███  ███▀▀▀██▄   ███    ███ ███       \r\n" + 
				" ███   ███   ███   ███    ███    ▀███▀▀██   ███    ███          ███    █▀  ███▌ ███   ███   ███    ███ ███       \r\n" + 
				" ███   ███   ███   ███    ███     ███   ▀  ▄███▄▄▄▄███▄▄       ▄███▄▄▄     ███▌ ███   ███   ███    ███ ███       \r\n" + 
				" ███   ███   ███ ▀███████████     ███     ▀▀███▀▀▀▀███▀       ▀▀███▀▀▀     ███▌ ███   ███ ▀███████████ ███       \r\n" + 
				" ███   ███   ███   ███    ███     ███       ███    ███          ███        ███  ███   ███   ███    ███ ███       \r\n" + 
				" ███   ███   ███   ███    ███     ███       ███    ███          ███        ███  ███   ███   ███    ███ ███▌    ▄ \r\n" + 
				"  ▀█   ███   █▀    ███    █▀     ▄████▀     ███    █▀           ███        █▀    ▀█   █▀    ███    █▀  █████▄▄██ \r\n" + 
				"                                                                                                       ▀         \r\n" + 
				"");
		
		System.out.println("[4] - Matrizenrechnung (2-dimensionale Arrays)");

		int eingabe = IO.readInteger();
		Projektauftrag.Multiplizierung(eingabe);

	}

}
