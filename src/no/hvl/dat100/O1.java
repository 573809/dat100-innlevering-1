package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("No skriv student nummer " + (i + 1) + " inn talkarakteren sin.");
			String karTxt = showInputDialog("Skriv talkarakteren din her: ");
			int talkarakter = parseInt(karTxt);

			String karakter = "";

			// Hoppar forbi while-loopen når talkarakter er 0-100.
			while (talkarakter < 0 || talkarakter > 100) {
				System.out.println("Student har skrive feil.");
				karakter = "Ikkje gyldig, prøv på nytt for å gå vidare.";
				showMessageDialog(null, karakter);
				karTxt = showInputDialog("Sidan du har skrive feil må du skrive på nytt.");
				talkarakter = parseInt(karTxt);

				// ctrl + shift + F for å gjere oppsettet finare.
			}

			if (talkarakter >= 90) {
				karakter = "A";
			} else if (talkarakter >= 80 && talkarakter < 90) {
				karakter = "B";
			} else if (talkarakter >= 60 && talkarakter < 80) {
				karakter = "C";
			} else if (talkarakter >= 50 && talkarakter < 60) {
				karakter = "D";
			} else if (talkarakter >= 40 && talkarakter < 50) {
				karakter = "E";
			} else {
				karakter = "F";
			}

			showMessageDialog(null, karakter);

		}

	}

}
